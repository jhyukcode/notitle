package repeat0310_2;

public class ScoreProcess {
	public void process_avg(Score[] std) {
		for(int i=0; i<std.length;i++) {
			 std[i].setAvg( ( std[i].getKor() + std[i].getEng() + std[i].getMath() ) / 3f ) ;
		}
	}
	public void process_pass(Score[] std) {
		for(int i=0; i<std.length;i++) {
		std[i].setPass( (std[i].getKor())<40||(std[i].getEng()<40)||(std[i].getMath()<40)?"과락": (std[i].getAvg()>=60)?"합격":"불합격" );
		}
	}
}