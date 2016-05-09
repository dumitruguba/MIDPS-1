
package main;

import javax.microedition.lcdui.Display;
import javax.microedition.midlet.*;


public class GMMidlet extends MIDlet {

	final public GMCanvas gcanvas;

	public GMMidlet() {
		this.gcanvas = new GMCanvas(this);
	}
	
	
    public void startApp() {
		Display.getDisplay(this).setCurrent(gcanvas);
	}
	
	
    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }
	
	public void exit(){		
		destroyApp(true);
		notifyDestroyed();
	}
}

