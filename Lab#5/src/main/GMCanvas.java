
package main;

import grab.grabGame;
import javax.microedition.lcdui.*;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.GameCanvas;
import java.io.IOException;

public class GMCanvas extends GameCanvas  implements Runnable, CommandListener  {
	GMMidlet myHost;	
    private Thread thread;
	private Graphics g;	
	final Command exit = new Command("Exit", Command.EXIT, 1);
		
	grabGame grabgame;
		
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

			grabgame.grabGameRun();						
			if (buttonhit){
				buttonhit = false;
				grabgame.buttonhit();
			}
			grabgame.lm.paint(g, 0, 0);	
			
			flushGraphics(0, 0, getWidth(), getHeight());
			
			try {
				Thread.sleep(delay);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}		
		}
	}
	
	public void commandAction(Command command, Displayable displayable) {
		if(command == exit){
			myHost.exit();
		}
	}
}

