
package jump;

import java.io.IOException;
import javax.microedition.lcdui.game.LayerManager;
import javax.microedition.lcdui.game.Sprite;
import main.GMCanvas;


public class jumpGame {

	GameDesign gamedesign;
	public LayerManager lm;
	Sprite lineS;
	Sprite leftmanS;
	Sprite rightmanS;
	Sprite jumpmanS;
	
	boolean jumping;
	
	int jumpseq[] = {0, -8, -5, -2, 0, 3, 6, 6};
	int jumpindex;
	
	GMCanvas host;
	public boolean ready;
	
	public jumpGame(GMCanvas myHost) throws IOException{
		host = myHost;
		gamedesign = new GameDesign();
		lm = new LayerManager();
		gamedesign.updateLayerManagerForJumpscene(lm);
		lineS = gamedesign.getLine1sprite();
		leftmanS = gamedesign.getLeftmanSprite();
		rightmanS = gamedesign.getRightmanSprite();
		jumpmanS = gamedesign.getJumpmanSprite();
		
	}
	
	public void loadScene(){
		lineS.setFrame(0);
		leftmanS.setFrame(0);
		rightmanS.setFrame(0);
		jumpmanS.setFrame(0);
		jumpmanS.setPosition(108, 143);
		jumpindex = 0;
		jumping = false;
	}
	
	public void jumpGameRun(){
		lineS.nextFrame();
		leftmanS.nextFrame();
		rightmanS.nextFrame();

		if(jumping){
			if(jumpindex > 7){
				jumpindex = 0;
				jumping = false;
				jumpmanS.setFrame(2);
				return;
			}
			jumpmanS.move(0, jumpseq[jumpindex++]);
		}
		else {
			if(lineS.getFrame() > 16){
				host.nextGame();
				ready = false;			
				jumpmanS.setFrame(3);
				host.delay = 10;
				host.buttonhit = false;
				return;
			}

			jumpmanS.setFrame(0);
		}
	}
	
	public void buttonhit (){
		if(!jumping && ready){
			jumping = true;
			jumpmanS.setFrame(1);
		}
		else host.buttonhit = false;	
	}

	public void start() {
		ready = true;
	}
}