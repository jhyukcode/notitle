package repeat0310_2;

class Marine{   
	// 멤버변수
	int x; int y;  int hp; // 각 병사의 x, y좌표 ,  hp 병사의 체력    
	static int weapon = 5;    // 공격력 	   
	static int armor  = 0;     // 방어력       
	
	// 멤버함수
	void move(int x, int y){  this.x = x;   this.y=y; }
    void weaponUp() {  weapon++; }
	void armorUp()  {  armor++;  } 
	// 생성자
}
public class FInal_B {

}
