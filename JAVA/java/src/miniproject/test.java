package miniproject;

class Aasd{	// 
    int a;   //인스턴스 변수
    static String company; // 클래스 변수 

    void method(){  int a=0; System.out.println(a);       }
//    static void   show(){             System.out.println(this.a);  }  // 오류 : static 에서 인스턴스 변수 호출

    public Aasd(){   }
    public Aasd(int a) {   this.a = a;   }      //지역변수
}

public class test {
	public void main(String[] args) {


	}
}