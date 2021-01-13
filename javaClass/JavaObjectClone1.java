package javaClass;

public class JavaObjectClone1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetPoint pt1 = new SetPoint(1, 2);
		SetPoint pt2;
		try {
			pt1.showPosition();
			pt2 = (SetPoint) pt1.clone();
			pt2.showPosition();
			System.out.print(pt1.equals(pt2));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

class SetPoint implements Cloneable {
	private int xpos;
	private int ypos;

	public SetPoint(int x, int y) {
		xpos = x;
		ypos = y;
	}

	public void showPosition() {
		System.out.println("[" + xpos + "," + ypos + "]");
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
