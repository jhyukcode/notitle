package repeat0310;

class User004{
	char division;
	String jumin;
	public User004 () {
		this.division = 'A';
		this.jumin = "123456-1234567";
	}
	public User004 (char division, String jumin) {
		this.division = division;
		this.jumin = jumin;
	}
	@Override
	public String toString() {
		return "User004 [division=" + division + ", jumin=" + jumin + "]";
	}
	
}
public class Repeat004 {
	public static void main(String[] args) {
		User004 c1 = new User004('B', "200101-1234567");
		System.out.println(c1);
		User004 c2 = new User004();
		System.out.println(c2);
	}
}

//	접근자 범위 (제일 작음 > 제일 큼)
//	private > package > protected > public