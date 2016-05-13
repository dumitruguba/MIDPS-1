
package pick;

import java.io.IOException;
import javax.microedition.lcdui.game.LayerManager;
import javax.microedition.lcdui.game.Sprite;
import javax.microedition.lcdui.game.TiledLayer;
import main.GMCanvas;

public class pickGame {
	GameDesign gamedesign;
	public LayerManager lm;
	Sprite handSprite;
	Sprite pinkieSprite;
	Sprite indexSprite;
	Sprite middleSprite;
	Sprite leftnoseSprite;
	Sprite midnoseSprite;
	Sprite rightnoseSprite;
	public TiledLayer transitionS;
		
	int[] distance = {1, 0};
	int[] refer;
	int[] borders = {78, 146};
	int speed;
	int delay = 10;
	int sceneNo;
	int gameNo;
	boolean movingup = false;
	boolean lcol = false;
	boolean rcol = false;
	boolean mcol = false;
	boolean layerupdated = false;
	
	
	private final GMCanvas host;
	public boolean ready;
	
	public pickGame(GMCanvas myHost) throws IOException{
		
		host = myHost;
		
		gamedesign = new GameDesign();
		lm = new LayerManager();
		refer = new int[2];
		
		handSprite = gamedesign.getHand();
		leftnoseSprite = gamedesign.getNostril_left();
		rightnoseSprite = gamedesign.getNostril_right();
		midnoseSprite = gamedesign.getNose_mid();
		pinkieSprite = gamedesign.getFinger_pinkie();
		indexSprite = gamedesign.getIndex_finger();
		middleSprite = gamedesign.getMiddle_finger();
		
		transitionS = gamedesign.getBkgBT();
		transitionS.setVisible(true);
		
		movingup = false;
		lcol = false;
		rcol = false;
		mcol = false;
		layerupdated = false;	
		
		init();
	}
	
	public final void init(){
		sceneNo = 0;
		speed = 1;
		distance[0] = speed;
		distance[1] = 0;
	}	
	
	public void pickGameRun(){
		moveHand();
		if(!movingup){
			if(refer[0]>borders[1] || refer[0]<borders[0]){
				distance[0] = -distance[0];
			}
		}
		else{
			if(!layerupdated){
				if(lcol || rcol || mcol){
					lm.insert(lm.getLayerAt(4), 0);
					if(sceneNo == 3){
						lm.insert(lm.getLayerAt(5), 0);
					}
				}
				layerupdated = true;
			}
			if(refer[1]<153){
				if(lcol){
					if(leftnoseSprite.getFrame()!=4){
						leftnoseSprite.nextFrame();
					}
				}
				if(mcol){
					if(!midnoseSprite.isVisible()){
						midnoseSprite.setVisible(true);
					}
					else if(midnoseSprite.getFrame()!=3){
						midnoseSprite.nextFrame();
					}
				}
				if(rcol){
					if(rightnoseSprite.getFrame()!=4){
						rightnoseSprite.nextFrame();
					}
				}
			}				
			if(refer[1]<150){
				ready = false;		
				host.buttonhit = false;
				distance[1] = 0;					
				if(lcol || rcol || mcol || refer[0]<84 || refer[0]>141){
					
					host.lost();
				}
				else if(sceneNo == 3 && refer[0]>97){						
					host.lost();
				}
				else host.won();
			}
		}
	}
	
	public void loadScene(){
		switch (sceneNo) {
			case 0:
			case 3:
				sceneNo = 1;
				try {
					gamedesign.updateLayerManagerForPick_scene(lm);
					refer[0] = pinkieSprite.getX();
					refer[1] = pinkieSprite.getY();
					borders[0] = 78;
				} catch (IOException ex) {
					ex.printStackTrace();
				}	break;
			case 1:
				sceneNo = 2;
				try {
					gamedesign.updateLayerManagerForIndex_scene(lm);
					refer[0] = indexSprite.getX();
					refer[1] = indexSprite.getY();
				} catch (IOException ex) {
					ex.printStackTrace();
				}	break;
			case 2:
				sceneNo = 3;
				try {
					gamedesign.updateLayerManagerForMiddle_scene(lm);
					refer[0] = indexSprite.getX();
					refer[1] = indexSprite.getY();
					borders[0]-=22;
				} catch (IOException ex) {
					ex.printStackTrace();
				}	break;
			default:
				break;
		}
		
		if(speed < 5) speed++;
		distance[0] = speed;
		distance[1] = 0;
		movingup = false;
		lcol = false;
		rcol = false;
		mcol = false;
		layerupdated = false;
	}
	
	void moveHand(){
		handSprite.move(distance[0], distance[1]);
		if(sceneNo == 1){
			pinkieSprite.move(distance[0], distance[1]);
		}
		else {
			if(sceneNo == 3){
				middleSprite.move(distance[0], distance[1]);
			}
			indexSprite.move(distance[0], distance[1]);
		}
		refer[0] += distance[0];
		refer[1] += distance[1];
	}

	public void buttonhit() {
		if(!movingup && ready){
			movingup = true;
			distance[1] = -speed;
			distance[0] = 0;

			if(refer[0]>104 && refer[0]<121){
				lcol = true;
				mcol = true;
				rcol = true;
			}
			else if(refer[0]>83 && refer[0]<98){
				lcol = true;
				if(sceneNo == 3){
					mcol = true;
					rcol = true;
				}
			}
			else if(refer[0]>126 && refer[0]<142){
				rcol = true;
			}
			else if(middleSprite.isVisible()){
				if(middleSprite.getX()>84 && middleSprite.getX()<98){
					lcol = true;
				}
			}
		}
		else host.buttonhit = false;
	}

	public void start() {
		ready = true;
	}

}
