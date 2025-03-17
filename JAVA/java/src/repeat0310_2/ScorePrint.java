package repeat0310_2;

public class ScorePrint {
	public void show(Score std) { }
	public void show(Score[] std) {
		for (int i=0;i<std.length;i++) {
			System.out.println(std[i].getName()+"\t"+std[i].getKor()+"\t"+std[i].getEng()+"\t"+std[i].getMath()+"\t"+String.format("%.2f", std[i].getAvg())+"\t"+std[i].getPass()); }
	}
	public void show_title() {
		System.out.println("────────────────────────────────────────────────────────────");
		System.out.println("이름\t국어\t영어\t수학\t평균\t합불");
		System.out.println("────────────────────────────────────────────────────────────");
	}
}
