
package spin;

import javax.microedition.lcdui.Graphics;
import main.GMCanvas;

public class spinGame {
	int xpos;
	int ypos;
	int xCenter;
	int yCenter;
	int angle;
	int arc;
	int delay;
	int speed = 2;
	int[][] arrow;
	boolean interrupted;
	private boolean movearrow;
	private int sceneNo;
	private final GMCanvas host;
	public boolean ready;
	
	
	public spinGame(int h, int w, GMCanvas myHost){		
		xCenter = h / 2;
		yCenter = w / 2;
		arrow = new int[3][2];
		host  = myHost;
	}
	
	public void LoadScene() {
		interrupted = false;
		movearrow = false;
		arrow[0][0] = xCenter + 51;
		arrow[0][1] = yCenter;
		arrow[1][0] = xCenter + 59;
		arrow[1][1] = yCenter - 4;
		arrow[2][0] = xCenter + 59;
		arrow[2][1] = yCenter + 4;
		angle = -175;
		delay = 10;
		if(speed < 12) speed += 2;
		
		switch (sceneNo) {
			case 0:
				arc = 90;
				sceneNo = 1;
				break;
			case 1:
				arc = 45;
				sceneNo = 2;
				break;
			case 2:		
				arc = 25;
				sceneNo = 0;
				break;
			default:
				break;
		}
	}
	
	public void paint(Graphics g) {
		g.setColor(0xEEEEEE);
		g.fillRect(0, 0, xCenter*2, yCenter*2);

		g.setColor(0xFFFF00);
		g.fillArc(xCenter - 45, yCenter - 45, 90, 90, 0, 360);

		g.setColor(0);
		g.fillArc(xCenter - 42, yCenter - 42, 84, 84, 0, 360);

		g.setColor(0xFFFF00);
		g.fillArc(xCenter - 30, yCenter - 30, 60, 60, 0, 360);

		g.setColor(0);
		g.fillArc(xCenter - 27, yCenter - 27, 54, 54, 0, 360);

		g.setColor(0xFFFF00);
		g.fillArc(xCenter - 15, yCenter - 15, 30, 30, 0, 360);

		g.setColor(0);
		g.fillArc(xCenter - 12, yCenter - 12, 24, 24, 0, 360);

		g.fillTriangle(arrow[0][0], arrow[0][1], arrow[1][0],
				arrow[1][1], arrow[2][0], arrow[2][1]);
		g.fillRect(arrow[2][0], arrow[1][1] + 3, 5, 3);

		g.setColor(150, 150, 150);
		g.fillArc(xCenter - 45, yCenter - 45, 90, 90, angle, arc);
	}
	
	public void spinGameRun() {
		angle -= speed;
		if (angle <= -360) {
			angle += 360;
		}
		else if (angle >= 360) {
			angle -= 360;
		}

		if (movearrow) {
			arrow[0][0] -= 2;
			arrow[1][0] -= 2;
			arrow[2][0] -= 2;
			if (arrow[0][0] <= xCenter + 45) {
				ready = false;		
				host.buttonhit = false;
				movearrow = false;
				host.nextGame();
			}
		}
	}

	public void fire() {
		if (ready)	movearrow = true;
		else host.buttonhit = false;
	}

	public void start() {
		ready = true;
	}
}
