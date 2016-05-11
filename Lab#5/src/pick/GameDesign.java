/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pick;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import javax.microedition.lcdui.game.*;
import java.io.IOException;

/**
 * @author Admin
 */
public class GameDesign {

//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
	private Image middle;
	private Image nose_left;
	private Sprite middle_finger;
	public int middle_fingerseq001Delay = 200;
	public int[] middle_fingerseq001 = {0};
	private Sprite nostril_left;
	public int nostril_leftseq001Delay = 200;
	public int[] nostril_leftseq001 = {0, 1, 1, 2, 2};
	private Image nose_right;
	private Sprite nostril_right;
	public int nostril_rightseq001Delay = 200;
	public int[] nostril_rightseq001 = {0, 1, 1, 2, 2};
	private Image hand1;
	private Sprite hand;
	public int handseq001Delay = 200;
	public int[] handseq001 = {0};
	private Image pinkie;
	private Sprite finger_pinkie;
	public int finger_pinkieseq001Delay = 200;
	public int[] finger_pinkieseq001 = {0};
	private Image nose_top;
	private Sprite nose_top_sprite;
	public int nose_top_spriteseq001Delay = 200;
	public int[] nose_top_spriteseq001 = {0};
	private Sprite nose_back_sprite;
	public int nose_back_spriteseq002Delay = 200;
	public int[] nose_back_spriteseq002 = {0, 0, 0, 0, 0};
	private Image background;
	private Image bckg;
	private Image topview_tiles;
	private TiledLayer bckg_tiled;
	private Image nose_back;
	private Image bckgB;
	private TiledLayer bkgBT;
	private Image nose_middle;
	private Sprite nose_mid;
	public int nose_midseq001Delay = 200;
	public int[] nose_midseq001 = {1, 1, 0, 0};
	private Image index;
	private Sprite index_finger;
	public int index_fingerseq001Delay = 200;
	public int[] index_fingerseq001 = {0};
//</editor-fold>//GEN-END:|fields|0|

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|

	public Image getNose_left() throws java.io.IOException {//GEN-BEGIN:|1-getter|0|1-preInit
		if (nose_left == null) {//GEN-END:|1-getter|0|1-preInit
			// write pre-init user code here
nose_left = Image.createImage("/pick/graphics/nose_left.png");//GEN-BEGIN:|1-getter|1|1-postInit
		}//GEN-END:|1-getter|1|1-postInit
		// write post-init user code here
return this.nose_left;//GEN-BEGIN:|1-getter|2|
	}//GEN-END:|1-getter|2|

	public Sprite getNostril_left() throws java.io.IOException {//GEN-BEGIN:|2-getter|0|2-preInit
		if (nostril_left == null) {//GEN-END:|2-getter|0|2-preInit
			// write pre-init user code here
nostril_left = new Sprite(getNose_left(), 32, 32);//GEN-BEGIN:|2-getter|1|2-postInit
			nostril_left.setFrameSequence(nostril_leftseq001);//GEN-END:|2-getter|1|2-postInit
			// write post-init user code here
}//GEN-BEGIN:|2-getter|2|
		return nostril_left;
	}//GEN-END:|2-getter|2|

	public Image getNose_right() throws java.io.IOException {//GEN-BEGIN:|4-getter|0|4-preInit
		if (nose_right == null) {//GEN-END:|4-getter|0|4-preInit
			// write pre-init user code here
nose_right = Image.createImage("/pick/graphics/nose_right.png");//GEN-BEGIN:|4-getter|1|4-postInit
		}//GEN-END:|4-getter|1|4-postInit
		// write post-init user code here
return this.nose_right;//GEN-BEGIN:|4-getter|2|
	}//GEN-END:|4-getter|2|

	public Sprite getNostril_right() throws java.io.IOException {//GEN-BEGIN:|5-getter|0|5-preInit
		if (nostril_right == null) {//GEN-END:|5-getter|0|5-preInit
			// write pre-init user code here
nostril_right = new Sprite(getNose_right(), 32, 32);//GEN-BEGIN:|5-getter|1|5-postInit
			nostril_right.setFrameSequence(nostril_rightseq001);//GEN-END:|5-getter|1|5-postInit
			// write post-init user code here
}//GEN-BEGIN:|5-getter|2|
		return nostril_right;
	}//GEN-END:|5-getter|2|

	public Image getHand1() throws java.io.IOException {//GEN-BEGIN:|7-getter|0|7-preInit
		if (hand1 == null) {//GEN-END:|7-getter|0|7-preInit
			// write pre-init user code here
hand1 = Image.createImage("/pick/graphics/hand1.png");//GEN-BEGIN:|7-getter|1|7-postInit
		}//GEN-END:|7-getter|1|7-postInit
		// write post-init user code here
return this.hand1;//GEN-BEGIN:|7-getter|2|
	}//GEN-END:|7-getter|2|

	public Sprite getHand() throws java.io.IOException {//GEN-BEGIN:|8-getter|0|8-preInit
		if (hand == null) {//GEN-END:|8-getter|0|8-preInit
			// write pre-init user code here
hand = new Sprite(getHand1(), 64, 64);//GEN-BEGIN:|8-getter|1|8-postInit
			hand.setFrameSequence(handseq001);//GEN-END:|8-getter|1|8-postInit
			// write post-init user code here
}//GEN-BEGIN:|8-getter|2|
		return hand;
	}//GEN-END:|8-getter|2|

	public Image getPinkie() throws java.io.IOException {//GEN-BEGIN:|10-getter|0|10-preInit
		if (pinkie == null) {//GEN-END:|10-getter|0|10-preInit
			// write pre-init user code here
pinkie = Image.createImage("/pick/graphics/pinkie.png");//GEN-BEGIN:|10-getter|1|10-postInit
		}//GEN-END:|10-getter|1|10-postInit
		// write post-init user code here
return this.pinkie;//GEN-BEGIN:|10-getter|2|
	}//GEN-END:|10-getter|2|

	public Sprite getFinger_pinkie() throws java.io.IOException {//GEN-BEGIN:|11-getter|0|11-preInit
		if (finger_pinkie == null) {//GEN-END:|11-getter|0|11-preInit
			// write pre-init user code here
finger_pinkie = new Sprite(getPinkie(), 16, 56);//GEN-BEGIN:|11-getter|1|11-postInit
			finger_pinkie.setFrameSequence(finger_pinkieseq001);//GEN-END:|11-getter|1|11-postInit
			// write post-init user code here
}//GEN-BEGIN:|11-getter|2|
		return finger_pinkie;
	}//GEN-END:|11-getter|2|

	public Image getNose_top() throws java.io.IOException {//GEN-BEGIN:|13-getter|0|13-preInit
		if (nose_top == null) {//GEN-END:|13-getter|0|13-preInit
			// write pre-init user code here
nose_top = Image.createImage("/pick/graphics/nose_top.png");//GEN-BEGIN:|13-getter|1|13-postInit
		}//GEN-END:|13-getter|1|13-postInit
		// write post-init user code here
return this.nose_top;//GEN-BEGIN:|13-getter|2|
	}//GEN-END:|13-getter|2|

	public Sprite getNose_top_sprite() throws java.io.IOException {//GEN-BEGIN:|14-getter|0|14-preInit
		if (nose_top_sprite == null) {//GEN-END:|14-getter|0|14-preInit
			// write pre-init user code here
nose_top_sprite = new Sprite(getNose_top(), 32, 24);//GEN-BEGIN:|14-getter|1|14-postInit
			nose_top_sprite.setFrameSequence(nose_top_spriteseq001);//GEN-END:|14-getter|1|14-postInit
			// write post-init user code here
}//GEN-BEGIN:|14-getter|2|
		return nose_top_sprite;
	}//GEN-END:|14-getter|2|

	public void updateLayerManagerForPick_scene(LayerManager lm) throws java.io.IOException {//GEN-LINE:|16-updateLayerManager|0|16-preUpdate
		// write pre-update user code here
getNose_mid().setPosition(108, 141);//GEN-BEGIN:|16-updateLayerManager|1|16-postUpdate
		getNose_mid().setVisible(false);
		lm.append(getNose_mid());
		getNostril_right().setPosition(120, 140);
		getNostril_right().setVisible(true);
		lm.append(getNostril_right());
		getNostril_left().setPosition(88, 140);
		getNostril_left().setVisible(true);
		lm.append(getNostril_left());
		getNose_top_sprite().setPosition(104, 117);
		getNose_top_sprite().setVisible(true);
		lm.append(getNose_top_sprite());
		getFinger_pinkie().setPosition(133, 181);
		getFinger_pinkie().setVisible(true);
		lm.append(getFinger_pinkie());
		getHand().setPosition(81, 219);
		getHand().setVisible(true);
		lm.append(getHand());
		getNose_back_sprite().setPosition(103, 153);
		getNose_back_sprite().setVisible(true);
		lm.append(getNose_back_sprite());
		getBckg_tiled().setPosition(0, 0);
		getBckg_tiled().setVisible(true);
		lm.append(getBckg_tiled());//GEN-END:|16-updateLayerManager|1|16-postUpdate
		// write post-update user code here		
		getNostril_right().setFrame(0);
		getNostril_left().setFrame(0);
		//getNose_mid().setVisible(false);
		getNose_mid().setFrame(0);
		lm.remove(getIndex_finger());
		lm.remove(getMiddle_finger());
	}//GEN-LINE:|16-updateLayerManager|2|

	public Image getBackground() throws java.io.IOException {//GEN-BEGIN:|17-getter|0|17-preInit
		if (background == null) {//GEN-END:|17-getter|0|17-preInit
			// write pre-init user code here
background = Image.createImage("/grab/graphics/bckg.png");//GEN-BEGIN:|17-getter|1|17-postInit
		}//GEN-END:|17-getter|1|17-postInit
		// write post-init user code here
return this.background;//GEN-BEGIN:|17-getter|2|
	}//GEN-END:|17-getter|2|

	public Image getBckg() throws java.io.IOException {//GEN-BEGIN:|21-getter|0|21-preInit
		if (bckg == null) {//GEN-END:|21-getter|0|21-preInit
			// write pre-init user code here
bckg = Image.createImage("/grab/graphics/bckg.png");//GEN-BEGIN:|21-getter|1|21-postInit
		}//GEN-END:|21-getter|1|21-postInit
		// write post-init user code here
return this.bckg;//GEN-BEGIN:|21-getter|2|
	}//GEN-END:|21-getter|2|

	public TiledLayer getBckg_tiled() throws java.io.IOException {//GEN-BEGIN:|22-getter|0|22-preInit
		if (bckg_tiled == null) {//GEN-END:|22-getter|0|22-preInit
			// write pre-init user code here
bckg_tiled = new TiledLayer(3, 4, getBckg(), 80, 80);//GEN-BEGIN:|22-getter|1|22-midInit
			int[][] tiles = {
				{1, 1, 1},
				{1, 1, 1},
				{1, 1, 1},
				{1, 1, 1}
			};//GEN-END:|22-getter|1|22-midInit
			// write mid-init user code here
for (int row = 0; row < 4; row++) {//GEN-BEGIN:|22-getter|2|22-postInit
				for (int col = 0; col < 3; col++) {
					bckg_tiled.setCell(col, row, tiles[row][col]);
				}
			}
		}//GEN-END:|22-getter|2|22-postInit
		// write post-init user code here
	return bckg_tiled;//GEN-BEGIN:|22-getter|3|
	}//GEN-END:|22-getter|3|

	public Image getNose_back() throws java.io.IOException {//GEN-BEGIN:|200-getter|0|200-preInit
		if (nose_back == null) {//GEN-END:|200-getter|0|200-preInit
			// write pre-init user code here
nose_back = Image.createImage("/pick/graphics/nose_back.png");//GEN-BEGIN:|200-getter|1|200-postInit
		}//GEN-END:|200-getter|1|200-postInit
		// write post-init user code here
return this.nose_back;//GEN-BEGIN:|200-getter|2|
	}//GEN-END:|200-getter|2|

	public Sprite getNose_back_sprite() throws java.io.IOException {//GEN-BEGIN:|272-getter|0|272-preInit
		if (nose_back_sprite == null) {//GEN-END:|272-getter|0|272-preInit
			// write pre-init user code here
nose_back_sprite = new Sprite(getNose_back(), 34, 16);//GEN-BEGIN:|272-getter|1|272-postInit
			nose_back_sprite.setFrameSequence(nose_back_spriteseq002);//GEN-END:|272-getter|1|272-postInit
			// write post-init user code here
}//GEN-BEGIN:|272-getter|2|
		return nose_back_sprite;
	}//GEN-END:|272-getter|2|



	public Image getTopview_tiles() throws java.io.IOException {//GEN-BEGIN:|405-getter|0|405-preInit
		if (topview_tiles == null) {//GEN-END:|405-getter|0|405-preInit
			// write pre-init user code here
topview_tiles = Image.createImage("/grab/graphics/bckg.png");//GEN-BEGIN:|405-getter|1|405-postInit
		}//GEN-END:|405-getter|1|405-postInit
		// write post-init user code here
return this.topview_tiles;//GEN-BEGIN:|405-getter|2|
	}//GEN-END:|405-getter|2|

	public Image getNose_middle() throws java.io.IOException {//GEN-BEGIN:|586-getter|0|586-preInit
		if (nose_middle == null) {//GEN-END:|586-getter|0|586-preInit
			// write pre-init user code here
nose_middle = Image.createImage("/pick/graphics/nose_middle.png");//GEN-BEGIN:|586-getter|1|586-postInit
		}//GEN-END:|586-getter|1|586-postInit
		// write post-init user code here
return this.nose_middle;//GEN-BEGIN:|586-getter|2|
	}//GEN-END:|586-getter|2|

	public Sprite getNose_mid() throws java.io.IOException {//GEN-BEGIN:|587-getter|0|587-preInit
		if (nose_mid == null) {//GEN-END:|587-getter|0|587-preInit
			// write pre-init user code here
nose_mid = new Sprite(getNose_middle(), 24, 8);//GEN-BEGIN:|587-getter|1|587-postInit
			nose_mid.setFrameSequence(nose_midseq001);//GEN-END:|587-getter|1|587-postInit
			// write post-init user code here
}//GEN-BEGIN:|587-getter|2|
		return nose_mid;
	}//GEN-END:|587-getter|2|

	public Image getIndex() throws java.io.IOException {//GEN-BEGIN:|637-getter|0|637-preInit
		if (index == null) {//GEN-END:|637-getter|0|637-preInit
			// write pre-init user code here
index = Image.createImage("/pick/graphics/index.png");//GEN-BEGIN:|637-getter|1|637-postInit
		}//GEN-END:|637-getter|1|637-postInit
		// write post-init user code here
return this.index;//GEN-BEGIN:|637-getter|2|
	}//GEN-END:|637-getter|2|

	public Sprite getIndex_finger() throws java.io.IOException {//GEN-BEGIN:|638-getter|0|638-preInit
		if (index_finger == null) {//GEN-END:|638-getter|0|638-preInit
			// write pre-init user code here
index_finger = new Sprite(getIndex(), 16, 72);//GEN-BEGIN:|638-getter|1|638-postInit
			index_finger.setFrameSequence(index_fingerseq001);//GEN-END:|638-getter|1|638-postInit
			// write post-init user code here
}//GEN-BEGIN:|638-getter|2|
		return index_finger;
	}//GEN-END:|638-getter|2|

	public Image getMiddle() throws java.io.IOException {//GEN-BEGIN:|640-getter|0|640-preInit
		if (middle == null) {//GEN-END:|640-getter|0|640-preInit
			// write pre-init user code here
middle = Image.createImage("/pick/graphics/middle.png");//GEN-BEGIN:|640-getter|1|640-postInit
		}//GEN-END:|640-getter|1|640-postInit
		// write post-init user code here
return this.middle;//GEN-BEGIN:|640-getter|2|
	}//GEN-END:|640-getter|2|

	public Sprite getMiddle_finger() throws java.io.IOException {//GEN-BEGIN:|641-getter|0|641-preInit
		if (middle_finger == null) {//GEN-END:|641-getter|0|641-preInit
			// write pre-init user code here
middle_finger = new Sprite(getMiddle(), 16, 72);//GEN-BEGIN:|641-getter|1|641-postInit
			middle_finger.setFrameSequence(middle_fingerseq001);//GEN-END:|641-getter|1|641-postInit
			// write post-init user code here
}//GEN-BEGIN:|641-getter|2|
		return middle_finger;
	}//GEN-END:|641-getter|2|

	public void updateLayerManagerForIndex_scene(LayerManager lm) throws java.io.IOException {//GEN-LINE:|818-updateLayerManager|0|818-preUpdate
		// write pre-update user code here
getNose_mid().setPosition(108, 141);//GEN-BEGIN:|818-updateLayerManager|1|818-postUpdate
		getNose_mid().setVisible(false);
		lm.append(getNose_mid());
		getNostril_right().setPosition(120, 140);
		getNostril_right().setVisible(true);
		lm.append(getNostril_right());
		getNostril_left().setPosition(88, 140);
		getNostril_left().setVisible(true);
		lm.append(getNostril_left());
		getNose_top_sprite().setPosition(104, 117);
		getNose_top_sprite().setVisible(true);
		lm.append(getNose_top_sprite());
		getIndex_finger().setPosition(94, 188);
		getIndex_finger().setVisible(true);
		lm.append(getIndex_finger());
		getHand().setPosition(81, 248);
		getHand().setVisible(true);
		lm.append(getHand());
		getNose_back_sprite().setPosition(103, 153);
		getNose_back_sprite().setVisible(true);
		lm.append(getNose_back_sprite());
		getBckg_tiled().setPosition(0, 0);
		getBckg_tiled().setVisible(true);
		lm.append(getBckg_tiled());//GEN-END:|818-updateLayerManager|1|818-postUpdate
		// write post-update user code here	
		getNostril_right().setFrame(0);
		getNostril_left().setFrame(0);
		//getNose_mid().setVisible(false);
		getNose_mid().setFrame(0);
		lm.remove(getFinger_pinkie());
		lm.remove(getMiddle_finger());
	}//GEN-LINE:|818-updateLayerManager|2|

	public void updateLayerManagerForMiddle_scene(LayerManager lm) throws java.io.IOException {//GEN-LINE:|1106-updateLayerManager|0|1106-preUpdate
		// write pre-update user code here
getNose_mid().setPosition(108, 141);//GEN-BEGIN:|1106-updateLayerManager|1|1106-postUpdate
		getNose_mid().setVisible(false);
		lm.append(getNose_mid());
		getNostril_right().setPosition(120, 140);
		getNostril_right().setVisible(true);
		lm.append(getNostril_right());
		getNostril_left().setPosition(88, 140);
		getNostril_left().setVisible(true);
		lm.append(getNostril_left());
		getNose_top_sprite().setPosition(104, 117);
		getNose_top_sprite().setVisible(true);
		lm.append(getNose_top_sprite());
		getIndex_finger().setPosition(133, 199);
		getIndex_finger().setVisible(true);
		lm.append(getIndex_finger());
		getMiddle_finger().setPosition(155, 196);
		getMiddle_finger().setVisible(true);
		lm.append(getMiddle_finger());
		getHand().setPosition(121, 257);
		getHand().setVisible(true);
		lm.append(getHand());
		getNose_back_sprite().setPosition(103, 153);
		getNose_back_sprite().setVisible(true);
		lm.append(getNose_back_sprite());
		getBckg_tiled().setPosition(0, 0);
		getBckg_tiled().setVisible(true);
		lm.append(getBckg_tiled());//GEN-END:|1106-updateLayerManager|1|1106-postUpdate
		// write post-update user code here
		getNostril_right().setFrame(0);
		getNostril_left().setFrame(0);
		getNose_mid().setFrame(0);
		lm.remove(getFinger_pinkie());
	}//GEN-LINE:|1106-updateLayerManager|2|



	public Image getBckgB() throws java.io.IOException {//GEN-BEGIN:|1480-getter|0|1480-preInit
		if (bckgB == null) {//GEN-END:|1480-getter|0|1480-preInit
			// write pre-init user code here
bckgB = Image.createImage("/pick/graphics/bckgB.png");//GEN-BEGIN:|1480-getter|1|1480-postInit
		}//GEN-END:|1480-getter|1|1480-postInit
		// write post-init user code here
return this.bckgB;//GEN-BEGIN:|1480-getter|2|
	}//GEN-END:|1480-getter|2|

	public TiledLayer getBkgBT() throws java.io.IOException {//GEN-BEGIN:|1481-getter|0|1481-preInit
		if (bkgBT == null) {//GEN-END:|1481-getter|0|1481-preInit
			// write pre-init user code here
bkgBT = new TiledLayer(1, 4, getBckgB(), 10, 80);//GEN-BEGIN:|1481-getter|1|1481-midInit
			int[][] tiles = {
				{1},
				{1},
				{1},
				{1}
			};//GEN-END:|1481-getter|1|1481-midInit
			// write mid-init user code here
for (int row = 0; row < 4; row++) {//GEN-BEGIN:|1481-getter|2|1481-postInit
				for (int col = 0; col < 1; col++) {
					bkgBT.setCell(col, row, tiles[row][col]);
				}
			}
		}//GEN-END:|1481-getter|2|1481-postInit
		// write post-init user code here
	return bkgBT;//GEN-BEGIN:|1481-getter|3|
	}//GEN-END:|1481-getter|3|





}
