
package main;

import grab.grabGame;
import pick.pickGame;
import javax.microedition.lcdui.*;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.GameCanvas;
import java.io.IOException;
import jump.jumpGame;
import spin.spinGame;

public class GMCanvas extends GameCanvas  implements Runnable, CommandListener  {
	GMMidlet myHost;	
    private Thread thread;
	private Graphics g;	
	final Command exit = new Command("Exit", Command.EXIT, 1);
	final Command newgame = new Command("New Game", Command.SCREEN, 1);
		
	grabGame grabgame;
	pickGame pickgame;
	spinGame spingame;
	jumpGame jumpgame;
		
	int gameNo;
	public int gameNo2;
	public int delay = 10;
	public boolean buttonhit;
	private boolean buttonreleased;
    private boolean interrupted;
	
	int tx = getWidth()-10;
	int width = 10;
	int height = getHeight();
	private int score;
	private int countup;
	private int lives = 4;
	private boolean gmover;
	private boolean newgm;
	
	
	public GMCanvas(GMMidlet host) {		
		super(true);
		myHost = host;
        try {
            setFullScreenMode(true);
            init();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
	}
	
	private void init() throws IOException {	
		
		grabgame = new grabGame(this);
		pickgame = new pickGame(this);
		spingame = new spinGame(getWidth(), getHeight(), this);
		jumpgame = new jumpGame(this);
		
		grabgame.loadgrabScene();
		grabgame.start();
		
		addCommand(exit);
		addCommand(newgame);
		setCommandListener(this);
		
		g = getGraphics();
		
		interrupted = false;
				
		thread = new Thread(this);
		thread.start();
	}
		
	public void run(){
		while(!interrupted){
			
			int keyState = getKeyStates();
			if ((keyState & FIRE_PRESSED) != 0 && !buttonhit && buttonreleased){
				buttonhit = true;
				buttonreleased = false;
			}							
			else if (!((keyState & FIRE_PRESSED) != 0) && !buttonreleased){
				buttonreleased = true;
			}
			switch(gameNo2){
				default :
				case 0 :
					grabgame.grabGameRun();						
					if (buttonhit){
						buttonhit = false;
						grabgame.buttonhit();
					}
					grabgame.lm.paint(g, 0, 0);	
					break;
				case 1 :
					pickgame.lm.paint(g, 0, 0);
					pickgame.pickGameRun();		
					if (buttonhit){
						buttonhit = false;
						pickgame.buttonhit();
					}
					break;
				case 2 :
					spingame.paint(g);
					if (buttonhit){
						buttonhit = false;
						spingame.fire();
					}	
					spingame.spinGameRun();
					break;
				case 3 :
					jumpgame.lm.paint(g, 0, 0);
					if (buttonhit){
						buttonhit = false;
						jumpgame.buttonhit();
					}
					jumpgame.jumpGameRun();
					break;
				case 4 :
					
					if(tx == 0 && width == getWidth()){
						if(gmover)
							gameNo = 5;
						else if(newgm)
							gameNo = 3;
						nextGame();
					}
					
					switch(gameNo){
						default :
						case 0 :
							grabgame.lm.paint(g, 0, 0);	
							break;
						case 1 :
							pickgame.lm.paint(g, 0, 0);	
							break;
						case 2 :		
							spingame.paint(g);
							break;
						case 3 :
							jumpgame.lm.paint(g, 0, 0);	
							break;
						case 5 :
							gameover();
							break;							
					}
					
					for(int i = tx; i < width; i += 10){
						pickgame.transitionS.setPosition(i, 0);
						pickgame.transitionS.paint(g);
					}
					
					if (tx > 0) {
						tx -= 10;
						width += 10;
					} else {
						width -= 10;
					}
					
					if (buttonhit){
						buttonhit = false;
					}
					
					if(tx == 0 && width == 0){
						tx = getWidth()-10;			
						width = 10;
						if(gameNo == 3) delay = jumpgame.delay;
						if(newgm) {
							score = 0;
							newgm = false;
						}
						gameNo2 = gameNo;
					}
					break;
				case 5 :
					gameover();
					break;
			}
			
			if(gameNo != 5){
				g.setColor(0);
				g.drawString("Score: "+Integer.toString(score), 0, 0, 0);
				g.drawString(Integer.toString(delay), getWidth()/2, 0, Graphics.TOP|Graphics.HCENTER);
				g.drawString(Integer.toString(lives), getWidth()-1, 0, Graphics.TOP|Graphics.RIGHT);
			}
			
			if(!gmover){
				countup++;
				if(countup>190){
					if (gameNo != 3)
						lost();
					else {
						won();
						delay = 10;
					}
					countup = 0;
				}
			}
			
			flushGraphics(0, 0, getWidth(), getHeight());
			
			try {
				Thread.sleep(delay);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}	
			
		}
	}
	
	public void nextGame(){		
		switch(gameNo){
			default:
			case 3 :
				grabgame.loadgrabScene();
				grabgame.start();
				gameNo = 0;
				break;
			case 0 :
				pickgame.loadScene();
				pickgame.start();
				gameNo = 1;
				break;
			case 1 :
				spingame.LoadScene();
				spingame.start();
				gameNo = 2;
				break;
			case 2 :		
				jumpgame.loadScene();
				jumpgame.start();
				gameNo = 3;
				break;
		}
	}
	
	public void won() {
		score++;
		countup = 0;
		gameNo2 = 4;
	}
	
	public void lost() {
		if(lives == 0){
			gmover = true;
		}
		else{
			lives--;
		}
		gameNo2 = 4;
		countup = 0;
	}
	
	private void gameover() {
		g.setColor(0xFFFFFF);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		g.setColor(0);
		g.drawString("Game Over", getWidth()/2, getHeight()/2-30, Graphics.BASELINE|Graphics.HCENTER);
		g.drawString("Score: "+Integer.toString(score), getWidth()/2, getHeight()/2+10, Graphics.BASELINE|Graphics.HCENTER);
	}	
	
	public void commandAction(Command command, Displayable displayable) {
		if(command == newgame){
			gmover = false;
			newgm = true;
			lives = 4;
			gameNo2 = 4;
			grabgame.init();
			pickgame.init();
			spingame.init();
			jumpgame.init();
		}
		else if(command == exit){
			myHost.exit();
		}
	}
}

