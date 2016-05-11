
package main;

import grab.grabGame;
import pick.pickGame;
import javax.microedition.lcdui.*;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.GameCanvas;
import java.io.IOException;
import spin.spinGame;

public class GMCanvas extends GameCanvas  implements Runnable, CommandListener  {
	GMMidlet myHost;	
    private Thread thread;
	private Graphics g;	
	final Command exit = new Command("Exit", Command.EXIT, 1);
		
	grabGame grabgame;
	pickGame pickgame;
	spinGame spingame;
		
	int gameNo;
	public int delay = 10;
	public boolean buttonhit;
	private boolean buttonreleased;
    private boolean interrupted;
	
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
		
		grabgame.loadgrabScene();
		grabgame.start();
		
		addCommand(exit);
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
			switch(gameNo){
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
			case 2 :
				try {
					grabgame.loadgrabScene();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
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
		}
	}
	
	public void commandAction(Command command, Displayable displayable) {
		if(command == exit){
			myHost.exit();
		}
	}
}

