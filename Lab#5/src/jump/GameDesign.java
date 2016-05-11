/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jump;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import javax.microedition.lcdui.game.*;
import java.io.IOException;

/**
 * @author Admin
 */
public class GameDesign {

//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
	private Image line;
	private Sprite line1sprite;
	public int line1spriteseq001Delay = 200;
	public int[] line1spriteseq001 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0};
	private Image bckg;
	private TiledLayer bckgtile;
	private Image ground;
	private Sprite groundS;
	public int groundSseq001Delay = 200;
	public int[] groundSseq001 = {0};
	private Image leftman;
	private Sprite leftmanSprite;
	public int leftmansSpriteseq001Delay = 200;
	public int[] leftmansSpriteseq001 = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
	private Image rightman;
	private Sprite rightmanSprite;
	public int rightmanSpriteseq001Delay = 200;
	public int[] rightmanSpriteseq001 = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};
	private Image jumpman;
	private Sprite jumpmanSprite;
	public int jumpmanSpriteseq001Delay = 200;
	public int[] jumpmanSpriteseq001 = {0, 1, 2, 3};
//</editor-fold>//GEN-END:|fields|0|

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|

	public Image getLine() throws java.io.IOException {//GEN-BEGIN:|1-getter|0|1-preInit
		if (line == null) {//GEN-END:|1-getter|0|1-preInit
			// write pre-init user code here
line = Image.createImage("/jump/graphics/line.png");//GEN-BEGIN:|1-getter|1|1-postInit
		}//GEN-END:|1-getter|1|1-postInit
		// write post-init user code here
return this.line;//GEN-BEGIN:|1-getter|2|
	}//GEN-END:|1-getter|2|

	public Sprite getLine1sprite() throws java.io.IOException {//GEN-BEGIN:|2-getter|0|2-preInit
		if (line1sprite == null) {//GEN-END:|2-getter|0|2-preInit
			// write pre-init user code here
line1sprite = new Sprite(getLine(), 96, 42);//GEN-BEGIN:|2-getter|1|2-postInit
			line1sprite.setFrameSequence(line1spriteseq001);//GEN-END:|2-getter|1|2-postInit
			// write post-init user code here
}//GEN-BEGIN:|2-getter|2|
		return line1sprite;
	}//GEN-END:|2-getter|2|

	public Image getBckg() throws java.io.IOException {//GEN-BEGIN:|5-getter|0|5-preInit
		if (bckg == null) {//GEN-END:|5-getter|0|5-preInit
			// write pre-init user code here
bckg = Image.createImage("/grab/graphics/bckg.png");//GEN-BEGIN:|5-getter|1|5-postInit
		}//GEN-END:|5-getter|1|5-postInit
		// write post-init user code here
return this.bckg;//GEN-BEGIN:|5-getter|2|
	}//GEN-END:|5-getter|2|

	public TiledLayer getBckgtile() throws java.io.IOException {//GEN-BEGIN:|6-getter|0|6-preInit
		if (bckgtile == null) {//GEN-END:|6-getter|0|6-preInit
			// write pre-init user code here
bckgtile = new TiledLayer(3, 4, getBckg(), 80, 80);//GEN-BEGIN:|6-getter|1|6-midInit
			int[][] tiles = {
				{1, 1, 1},
				{1, 1, 1},
				{1, 1, 1},
				{1, 1, 1}
			};//GEN-END:|6-getter|1|6-midInit
			// write mid-init user code here
for (int row = 0; row < 4; row++) {//GEN-BEGIN:|6-getter|2|6-postInit
				for (int col = 0; col < 3; col++) {
					bckgtile.setCell(col, row, tiles[row][col]);
				}
			}
		}//GEN-END:|6-getter|2|6-postInit
		// write post-init user code here
	return bckgtile;//GEN-BEGIN:|6-getter|3|
	}//GEN-END:|6-getter|3|

	public void updateLayerManagerForJumpscene(LayerManager lm) throws java.io.IOException {//GEN-LINE:|7-updateLayerManager|0|7-preUpdate
		// write pre-update user code here
getJumpmanSprite().setPosition(108, 143);//GEN-BEGIN:|7-updateLayerManager|1|7-postUpdate
		getJumpmanSprite().setVisible(true);
		lm.append(getJumpmanSprite());
		getRightmanSprite().setPosition(168, 138);
		getRightmanSprite().setVisible(true);
		lm.append(getRightmanSprite());
		getLeftmanSprite().setPosition(54, 138);
		getLeftmanSprite().setVisible(true);
		lm.append(getLeftmanSprite());
		getGroundS().setPosition(49, 170);
		getGroundS().setVisible(true);
		lm.append(getGroundS());
		getLine1sprite().setPosition(72, 128);
		getLine1sprite().setVisible(true);
		lm.append(getLine1sprite());
		getBckgtile().setPosition(0, 0);
		getBckgtile().setVisible(true);
		lm.append(getBckgtile());//GEN-END:|7-updateLayerManager|1|7-postUpdate
		// write post-update user code here
}//GEN-LINE:|7-updateLayerManager|2|

	public Image getGround() throws java.io.IOException {//GEN-BEGIN:|21-getter|0|21-preInit
		if (ground == null) {//GEN-END:|21-getter|0|21-preInit
			// write pre-init user code here
ground = Image.createImage("/jump/graphics/ground.png");//GEN-BEGIN:|21-getter|1|21-postInit
		}//GEN-END:|21-getter|1|21-postInit
		// write post-init user code here
return this.ground;//GEN-BEGIN:|21-getter|2|
	}//GEN-END:|21-getter|2|

	public Sprite getGroundS() throws java.io.IOException {//GEN-BEGIN:|22-getter|0|22-preInit
		if (groundS == null) {//GEN-END:|22-getter|0|22-preInit
			// write pre-init user code here
groundS = new Sprite(getGround(), 144, 1);//GEN-BEGIN:|22-getter|1|22-postInit
			groundS.setFrameSequence(groundSseq001);//GEN-END:|22-getter|1|22-postInit
			// write post-init user code here
}//GEN-BEGIN:|22-getter|2|
		return groundS;
	}//GEN-END:|22-getter|2|

	public Image getLeftman() throws java.io.IOException {//GEN-BEGIN:|24-getter|0|24-preInit
		if (leftman == null) {//GEN-END:|24-getter|0|24-preInit
			// write pre-init user code here
leftman = Image.createImage("/jump/graphics/leftman.png");//GEN-BEGIN:|24-getter|1|24-postInit
		}//GEN-END:|24-getter|1|24-postInit
		// write post-init user code here
return this.leftman;//GEN-BEGIN:|24-getter|2|
	}//GEN-END:|24-getter|2|

	public Sprite getLeftmanSprite() throws java.io.IOException {//GEN-BEGIN:|25-getter|0|25-preInit
		if (leftmanSprite == null) {//GEN-END:|25-getter|0|25-preInit
			// write pre-init user code here
leftmanSprite = new Sprite(getLeftman(), 18, 32);//GEN-BEGIN:|25-getter|1|25-postInit
			leftmanSprite.setFrameSequence(leftmansSpriteseq001);//GEN-END:|25-getter|1|25-postInit
			// write post-init user code here
}//GEN-BEGIN:|25-getter|2|
		return leftmanSprite;
	}//GEN-END:|25-getter|2|

	public Image getRightman() throws java.io.IOException {//GEN-BEGIN:|27-getter|0|27-preInit
		if (rightman == null) {//GEN-END:|27-getter|0|27-preInit
			// write pre-init user code here
rightman = Image.createImage("/jump/graphics/rightman.png");//GEN-BEGIN:|27-getter|1|27-postInit
		}//GEN-END:|27-getter|1|27-postInit
		// write post-init user code here
return this.rightman;//GEN-BEGIN:|27-getter|2|
	}//GEN-END:|27-getter|2|

	public Sprite getRightmanSprite() throws java.io.IOException {//GEN-BEGIN:|28-getter|0|28-preInit
		if (rightmanSprite == null) {//GEN-END:|28-getter|0|28-preInit
			// write pre-init user code here
rightmanSprite = new Sprite(getRightman(), 18, 32);//GEN-BEGIN:|28-getter|1|28-postInit
			rightmanSprite.setFrameSequence(rightmanSpriteseq001);//GEN-END:|28-getter|1|28-postInit
			// write post-init user code here
}//GEN-BEGIN:|28-getter|2|
		return rightmanSprite;
	}//GEN-END:|28-getter|2|

	public Image getJumpman() throws java.io.IOException {//GEN-BEGIN:|158-getter|0|158-preInit
		if (jumpman == null) {//GEN-END:|158-getter|0|158-preInit
			// write pre-init user code here
jumpman = Image.createImage("/jump/graphics/jumpman.png");//GEN-BEGIN:|158-getter|1|158-postInit
		}//GEN-END:|158-getter|1|158-postInit
		// write post-init user code here
return this.jumpman;//GEN-BEGIN:|158-getter|2|
	}//GEN-END:|158-getter|2|

	public Sprite getJumpmanSprite() throws java.io.IOException {//GEN-BEGIN:|159-getter|0|159-preInit
		if (jumpmanSprite == null) {//GEN-END:|159-getter|0|159-preInit
			// write pre-init user code here
jumpmanSprite = new Sprite(getJumpman(), 25, 27);//GEN-BEGIN:|159-getter|1|159-postInit
			jumpmanSprite.setFrameSequence(jumpmanSpriteseq001);//GEN-END:|159-getter|1|159-postInit
			// write post-init user code here
}//GEN-BEGIN:|159-getter|2|
		return jumpmanSprite;
	}//GEN-END:|159-getter|2|

}
