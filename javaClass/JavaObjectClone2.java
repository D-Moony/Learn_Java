package javaClass;

public class JavaObjectClone2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set4Gak sg1 = new Set4Gak(1, 2, 3, 4);
		Set4Gak sg2;

		try {
			sg2 = (Set4Gak) sg1.clone();
			sg1.changePosition(5, 6, 7, 8);
			sg1.showInfo();
			sg2.showInfo();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}

class SetPosition implements Cloneable {
	private int xPos;
	private int yPos;

	SetPosition(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void showInfo() {
		System.out.println("[" + xPos + "," + yPos + "]");
	}

	public void changePosition(int x, int y) {
		xPos = x;
		yPos = y;
		System.out.println("값 대입 완료");
	}

	public Object clone() throws CloneNotSupportedException {
		System.out.println("메소드 호출!");
		return super.clone();
	}

}

class Set4Gak implements Cloneable {

	SetPosition up, down;

	Set4Gak(int x1, int y1, int x2, int y2) {
		up = new SetPosition(x1, y1);
		down = new SetPosition(x2, y2);
	}

	public void showInfo() {
		System.out.print("up :");
		up.showInfo();
		System.out.print("down :");
		down.showInfo();
	}

	public void changePosition(int x1, int y1, int x2, int y2) {
		up.changePosition(x1, y1);
		down.changePosition(x2, y2);
	}

	public Object clone() throws CloneNotSupportedException {
		
		Set4Gak gak = (Set4Gak)super.clone();
		gak.up = (SetPosition)up.clone();
		gak.down = (SetPosition)down.clone();
		return gak;
	}
}