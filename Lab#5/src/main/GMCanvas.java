
package main;

import javax.microedition.lcdui.*;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.game.GameCanvas;
import java.io.IOException;


public class GMCanvas extends GameCanvas  implements Runnable, CommandListener  {
	GMMidlet myHost;	
    private Thread thread;
	private Graphics g;	
	final Command exit = new Command("Exit", Command.EXIT, 1);
	
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
		addCommand(exit);
		setCommandListener(this);
		
		g = getGraphics();
		
		thread = new Thread(this);
		thread.start();
	}
		
	public void run(){
		while(!this.interrupted){
			g.drawString("Hello", 0, 0, 0);
			
			flushGraphics(0, 0, getWidth(), getHeight());
			
		}
	}
	
	public void commandAction(Command command, Displayable displayable) {
		if(command == exit){
			myHost.exit();
		}
	}
}

