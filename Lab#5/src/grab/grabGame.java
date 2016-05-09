
package grab;

import java.io.IOException;
import java.util.Random;
import javax.microedition.lcdui.game.LayerManager;
import javax.microedition.lcdui.game.Sprite;
import main.GMCanvas;

public class grabGame {
	
	grab.GameDesign gd;
	public LayerManager lm;
	Sprite hand1S;
	Sprite hand2S;
	Sprite hand1hS;
	Sprite hand2hS;
	Sprite bar;
	Random r;
	private boolean grabed;
	private boolean ready;
	private boolean glide;
	private int[] delta;
	int wait;
	int delay = 10;
	private int speed = 1;
	private int sceneNo;
	private final GMCanvas host;
	public boolean started;
	
	public grabGame(GMCanvas myHost) throws IOException{
		gd = new grab.GameDesign();
		lm = new LayerManager();
		r  = new Random();
		
		host = myHost;
		
		delta = new int[2];
		delta[0] = 0;
		delta[1] = speed;		
		
		hand1S  = gd.getHand1_sprite();
		hand1hS = gd.getHand1h_sprite();
		hand2S  = gd.getHand2_sprite();
		hand2hS = gd.getHand2h_sprite();
		bar		= gd.getBar1_sprite();
	}
	
	public void grabGameRun(){
		if(ready){
			hand1S.setFrame(1);
			hand1hS.setVisible(false);
			if(!glide && grabed){
				if(hand2S.getY()+4>bar.getY()+bar.getHeight() && hand2S.getY()-4<bar.getY()+bar.getHeight()){
					bar.move(-3, 4);
					delta[0] = -1;
					delta[1] = 4;
					glide = true;
				}
			}
			bar.move(delta[0], delta[1]);
			if(bar.getY() > 320){		
				host.buttonhit = false;
				started = false;
				host.nextGame();
			}
			else if(grabed && delta[1]==0){		
				host.buttonhit = false;
				started = false;
				host.nextGame();
			}
		}
		else{		
			if(wait == 0)
			{
				ready = true;
			}
			else wait--;
		}
	}
	
	public void loadgrabScene() throws IOException{
		
		if(speed < 6) speed+=2;
		
		gd.updateLayerManagerForGrabScene(lm);
		switch (sceneNo) {
			case 0:
			case 3:
				sceneNo = 1;
				bar = gd.getBar1_sprite();				
				break;
			case 1:
				sceneNo = 2;
				bar = gd.getBar2_sprite();
				break;
			case 2:
				sceneNo = 3;
				bar = gd.getBar3_sprite();
				break;
			default:
				break;
		}
		bar.setVisible(true);
		ready = false;
		glide = false;
		grabed = false;

		delta[0] = 0;
		delta[1] = speed;
		wait = 20 + r.nextInt(60);
	}
	
	public void buttonhit (){
		if(!grabed && started){
			if(hand2S.getY()+4<bar.getY()+bar.getHeight() && hand2S.getY()+hand2S.getHeight()>bar.getY()){
				hand2S.setFrame(1);
				hand2hS.setVisible(true);
				
				delta[0] = 0;
				delta[1] = 0;
			}
			else{
				hand2S.setFrame(2);
			}
			grabed = true;
		}
		else host.buttonhit = false;
	}

	public void start() {
		started = true;
	}
	
}
