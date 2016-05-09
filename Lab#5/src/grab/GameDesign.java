/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grab;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import javax.microedition.lcdui.game.*;
import java.io.IOException;

/**
 * @author Admin
 */
public class GameDesign {

//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
	private Image bar1;
	private Sprite bar1_sprite;
	public int bar1_spriteseq001Delay = 200;
	public int[] bar1_spriteseq001 = {0};
	private Image bar2;
	private Sprite bar2_sprite;
	public int bar2_spriteseq001Delay = 200;
	public int[] bar2_spriteseq001 = {0};
	private Image bar3;
	private Sprite bar3_sprite;
	public int bar3_spriteseq001Delay = 200;
	public int[] bar3_spriteseq001 = {0};
	private Image hand1;
	private Sprite hand1_sprite;
	public int hand1_spriteseq001Delay = 200;
	public int[] hand1_spriteseq001 = {0, 1};
	private Image hand1_holding;
	private Sprite hand1h_sprite;
	public int hand1h_spriteseq001Delay = 200;
	public int[] hand1h_spriteseq001 = {0};
	private Image hand2;
	private Sprite hand2_sprite;
	public int hand2_spriteseq001Delay = 200;
	public int[] hand2_spriteseq001 = {0, 1, 2};
	private Image hand2_holding;
	private Sprite hand2h_sprite;
	public int hand2h_spriteseq001Delay = 200;
	public int[] hand2h_spriteseq001 = {0};
	private Image bckg;
	private TiledLayer bkg_tiledlayer;
//</editor-fold>//GEN-END:|fields|0|

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|

	public Image getBar1() throws java.io.IOException {//GEN-BEGIN:|1-getter|0|1-preInit
		if (bar1 == null) {//GEN-END:|1-getter|0|1-preInit
			// write pre-init user code here
bar1 = Image.createImage("/grab/graphics/bar1.png");//GEN-BEGIN:|1-getter|1|1-postInit
		}//GEN-END:|1-getter|1|1-postInit
		// write post-init user code here
return this.bar1;//GEN-BEGIN:|1-getter|2|
	}//GEN-END:|1-getter|2|

	public Sprite getBar1_sprite() throws java.io.IOException {//GEN-BEGIN:|2-getter|0|2-preInit
		if (bar1_sprite == null) {//GEN-END:|2-getter|0|2-preInit
			// write pre-init user code here
bar1_sprite = new Sprite(getBar1(), 6, 54);//GEN-BEGIN:|2-getter|1|2-postInit
			bar1_sprite.setFrameSequence(bar1_spriteseq001);//GEN-END:|2-getter|1|2-postInit
			// write post-init user code here
}//GEN-BEGIN:|2-getter|2|
		return bar1_sprite;
	}//GEN-END:|2-getter|2|

	public Image getBar2() throws java.io.IOException {//GEN-BEGIN:|4-getter|0|4-preInit
		if (bar2 == null) {//GEN-END:|4-getter|0|4-preInit
			// write pre-init user code here
bar2 = Image.createImage("/grab/graphics/bar2.png");//GEN-BEGIN:|4-getter|1|4-postInit
		}//GEN-END:|4-getter|1|4-postInit
		// write post-init user code here
return this.bar2;//GEN-BEGIN:|4-getter|2|
	}//GEN-END:|4-getter|2|

	public Sprite getBar2_sprite() throws java.io.IOException {//GEN-BEGIN:|5-getter|0|5-preInit
		if (bar2_sprite == null) {//GEN-END:|5-getter|0|5-preInit
			// write pre-init user code here
bar2_sprite = new Sprite(getBar2(), 6, 38);//GEN-BEGIN:|5-getter|1|5-postInit
			bar2_sprite.setFrameSequence(bar2_spriteseq001);//GEN-END:|5-getter|1|5-postInit
			// write post-init user code here
}//GEN-BEGIN:|5-getter|2|
		return bar2_sprite;
	}//GEN-END:|5-getter|2|

	public Image getBar3() throws java.io.IOException {//GEN-BEGIN:|7-getter|0|7-preInit
		if (bar3 == null) {//GEN-END:|7-getter|0|7-preInit
			// write pre-init user code here
bar3 = Image.createImage("/grab/graphics/bar3.png");//GEN-BEGIN:|7-getter|1|7-postInit
		}//GEN-END:|7-getter|1|7-postInit
		// write post-init user code here
return this.bar3;//GEN-BEGIN:|7-getter|2|
	}//GEN-END:|7-getter|2|

	public Sprite getBar3_sprite() throws java.io.IOException {//GEN-BEGIN:|8-getter|0|8-preInit
		if (bar3_sprite == null) {//GEN-END:|8-getter|0|8-preInit
			// write pre-init user code here
bar3_sprite = new Sprite(getBar3(), 6, 22);//GEN-BEGIN:|8-getter|1|8-postInit
			bar3_sprite.setFrameSequence(bar3_spriteseq001);//GEN-END:|8-getter|1|8-postInit
			// write post-init user code here
}//GEN-BEGIN:|8-getter|2|
		return bar3_sprite;
	}//GEN-END:|8-getter|2|

	public Image getHand1() throws java.io.IOException {//GEN-BEGIN:|10-getter|0|10-preInit
		if (hand1 == null) {//GEN-END:|10-getter|0|10-preInit
			// write pre-init user code here
hand1 = Image.createImage("/grab/graphics/hand1.png");//GEN-BEGIN:|10-getter|1|10-postInit
		}//GEN-END:|10-getter|1|10-postInit
		// write post-init user code here
return this.hand1;//GEN-BEGIN:|10-getter|2|
	}//GEN-END:|10-getter|2|

	public Sprite getHand1_sprite() throws java.io.IOException {//GEN-BEGIN:|11-getter|0|11-preInit
		if (hand1_sprite == null) {//GEN-END:|11-getter|0|11-preInit
			// write pre-init user code here
hand1_sprite = new Sprite(getHand1(), 27, 18);//GEN-BEGIN:|11-getter|1|11-postInit
			hand1_sprite.setFrameSequence(hand1_spriteseq001);//GEN-END:|11-getter|1|11-postInit
			// write post-init user code here
}//GEN-BEGIN:|11-getter|2|
		return hand1_sprite;
	}//GEN-END:|11-getter|2|

	public Image getHand1_holding() throws java.io.IOException {//GEN-BEGIN:|13-getter|0|13-preInit
		if (hand1_holding == null) {//GEN-END:|13-getter|0|13-preInit
			// write pre-init user code here
hand1_holding = Image.createImage("/grab/graphics/hand1_holding.png");//GEN-BEGIN:|13-getter|1|13-postInit
		}//GEN-END:|13-getter|1|13-postInit
		// write post-init user code here
return this.hand1_holding;//GEN-BEGIN:|13-getter|2|
	}//GEN-END:|13-getter|2|

	public Sprite getHand1h_sprite() throws java.io.IOException {//GEN-BEGIN:|14-getter|0|14-preInit
		if (hand1h_sprite == null) {//GEN-END:|14-getter|0|14-preInit
			// write pre-init user code here
hand1h_sprite = new Sprite(getHand1_holding(), 27, 18);//GEN-BEGIN:|14-getter|1|14-postInit
			hand1h_sprite.setFrameSequence(hand1h_spriteseq001);//GEN-END:|14-getter|1|14-postInit
			// write post-init user code here
}//GEN-BEGIN:|14-getter|2|
		return hand1h_sprite;
	}//GEN-END:|14-getter|2|

	public Image getHand2() throws java.io.IOException {//GEN-BEGIN:|16-getter|0|16-preInit
		if (hand2 == null) {//GEN-END:|16-getter|0|16-preInit
			// write pre-init user code here
hand2 = Image.createImage("/grab/graphics/hand2.png");//GEN-BEGIN:|16-getter|1|16-postInit
		}//GEN-END:|16-getter|1|16-postInit
		// write post-init user code here
return this.hand2;//GEN-BEGIN:|16-getter|2|
	}//GEN-END:|16-getter|2|

	public Sprite getHand2_sprite() throws java.io.IOException {//GEN-BEGIN:|17-getter|0|17-preInit
		if (hand2_sprite == null) {//GEN-END:|17-getter|0|17-preInit
			// write pre-init user code here
hand2_sprite = new Sprite(getHand2(), 27, 18);//GEN-BEGIN:|17-getter|1|17-postInit
			hand2_sprite.setFrameSequence(hand2_spriteseq001);//GEN-END:|17-getter|1|17-postInit
			// write post-init user code here
}//GEN-BEGIN:|17-getter|2|
		return hand2_sprite;
	}//GEN-END:|17-getter|2|

	public Image getHand2_holding() throws java.io.IOException {//GEN-BEGIN:|19-getter|0|19-preInit
		if (hand2_holding == null) {//GEN-END:|19-getter|0|19-preInit
			// write pre-init user code here
hand2_holding = Image.createImage("/grab/graphics/hand2_holding.png");//GEN-BEGIN:|19-getter|1|19-postInit
		}//GEN-END:|19-getter|1|19-postInit
		// write post-init user code here
return this.hand2_holding;//GEN-BEGIN:|19-getter|2|
	}//GEN-END:|19-getter|2|

	public Sprite getHand2h_sprite() throws java.io.IOException {//GEN-BEGIN:|20-getter|0|20-preInit
		if (hand2h_sprite == null) {//GEN-END:|20-getter|0|20-preInit
			// write pre-init user code here
hand2h_sprite = new Sprite(getHand2_holding(), 27, 18);//GEN-BEGIN:|20-getter|1|20-postInit
			hand2h_sprite.setFrameSequence(hand2h_spriteseq001);//GEN-END:|20-getter|1|20-postInit
			// write post-init user code here
}//GEN-BEGIN:|20-getter|2|
		return hand2h_sprite;
	}//GEN-END:|20-getter|2|

	public Image getBckg() throws java.io.IOException {//GEN-BEGIN:|22-getter|0|22-preInit
		if (bckg == null) {//GEN-END:|22-getter|0|22-preInit
			// write pre-init user code here
bckg = Image.createImage("/grab/graphics/bckg.png");//GEN-BEGIN:|22-getter|1|22-postInit
		}//GEN-END:|22-getter|1|22-postInit
		// write post-init user code here
return this.bckg;//GEN-BEGIN:|22-getter|2|
	}//GEN-END:|22-getter|2|

	public TiledLayer getBkg_tiledlayer() throws java.io.IOException {//GEN-BEGIN:|23-getter|0|23-preInit
		if (bkg_tiledlayer == null) {//GEN-END:|23-getter|0|23-preInit
			// write pre-init user code here
bkg_tiledlayer = new TiledLayer(3, 4, getBckg(), 80, 80);//GEN-BEGIN:|23-getter|1|23-midInit
			int[][] tiles = {
				{1, 1, 1},
				{1, 1, 1},
				{1, 1, 1},
				{1, 1, 1}
			};//GEN-END:|23-getter|1|23-midInit
			// write mid-init user code here
for (int row = 0; row < 4; row++) {//GEN-BEGIN:|23-getter|2|23-postInit
				for (int col = 0; col < 3; col++) {
					bkg_tiledlayer.setCell(col, row, tiles[row][col]);
				}
			}
		}//GEN-END:|23-getter|2|23-postInit
		// write post-init user code here
	return bkg_tiledlayer;//GEN-BEGIN:|23-getter|3|
	}//GEN-END:|23-getter|3|

	public void updateLayerManagerForGrabScene(LayerManager lm) throws java.io.IOException {//GEN-LINE:|24-updateLayerManager|0|24-preUpdate
		// write pre-update user code here
getHand2h_sprite().setPosition(116, 206);//GEN-BEGIN:|24-updateLayerManager|1|24-postUpdate
		getHand2h_sprite().setVisible(false);
		lm.append(getHand2h_sprite());
		getHand1h_sprite().setPosition(107, 89);
		getHand1h_sprite().setVisible(true);
		lm.append(getHand1h_sprite());
		getBar3_sprite().setPosition(122, 87);
		getBar3_sprite().setVisible(false);
		lm.append(getBar3_sprite());
		getBar2_sprite().setPosition(122, 78);
		getBar2_sprite().setVisible(false);
		lm.append(getBar2_sprite());
		getBar1_sprite().setPosition(122, 71);
		getBar1_sprite().setVisible(false);
		lm.append(getBar1_sprite());
		getHand2_sprite().setPosition(116, 206);
		getHand2_sprite().setVisible(true);
		lm.append(getHand2_sprite());
		getHand1_sprite().setPosition(107, 89);
		getHand1_sprite().setVisible(true);
		lm.append(getHand1_sprite());
		getBkg_tiledlayer().setPosition(0, 0);
		getBkg_tiledlayer().setVisible(true);
		lm.append(getBkg_tiledlayer());//GEN-END:|24-updateLayerManager|1|24-postUpdate
		// write post-update user code here
		getHand1_sprite().setFrame(0);
		getHand2_sprite().setFrame(0);
	}//GEN-LINE:|24-updateLayerManager|2|

}
