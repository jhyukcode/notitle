package com.company.java012;

class MobileNote7 {
	private String iris;
	public String getIris() { return iris; }
	public void setIris(String iris) { this.iris = iris; }
	void newshow() {
		System.out.println("──── NOTE7 새로운기능 (Overriding)");
		System.out.println("= iris 홍채인식기능 !");
		System.out.println("= myiris : "+iris);
	}
}
class MobileNote8 extends MobileNote7 {
	private String face;
	public String getFace() { return face; }
	public void setFace(String face) { this.face = face; }
	@Override void newshow() {
		super.newshow();
		System.out.println("──── NOTE8 새로운기능 (Overriding)");
		System.out.println("= face 안면인식기능 !");
		System.out.println("= face : "+face);
	}
}
class MobileNote9 extends MobileNote8 {
	private int battery = 24;
	@Override void newshow() {
		super.newshow();
		System.out.println("──── NOTE9 새로운기능 (Overriding)");
		System.out.println("= battery 하루종일 사용가능 !");
		System.out.println("= battery : "+battery);
	}
}
public class Extends003 {
	public static void main(String[] args) {
		MobileNote9 my9 = new MobileNote9();
		my9.setIris("brown");
		my9.setFace("pretty");
		my9.newshow();
	}
}
