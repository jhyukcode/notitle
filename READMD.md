welcome!


2025-02-19

Scanner 
->
scanner.close()

2025-02-25 
 mini project - bak
>url https://youtu.be/05yWf6Td1lo

2025-02-26
 JAVA - Method
  public static 반환변수 method명 (받는 변수) { 실행 내용 };
 HTML - onclick
  이벤트대상.이벤트 = 이벤트핸들러(처리)

2025-02-28
 JAVA - Class , Static
  Class  > 인스턴트 변수 : heap area - new O : this.name
  Static > 클래스 변수 : method area - new X : class.static

 2025-03-04
  JAVA 지정 접근자
   public    > 내부, 패키지, 하위 클래스, 그 외 모두 가능
   protected > 내부 , 패키지, 하위 클래스(상속)만 가능
   default   > 내부, 패키지만 가능
   private   > 내부만 가능
  클래스 배열
   클래스[] 배열명 = new 클래스 [];

2025-03-05
 JAVA 상속과 다형성
  (1) 상속
   - 모든 클래스는 Object 클래스를 상속한다
   - 상속의 주목적 : 클래스를 재사용하여 관리 및 수정이 용이하게 하기 위함
   - 상속 시 부모 생성자를 호출하여 인스턴스 변수를 초기화하여 부모 속성을 사용할 수 있다
  (2) 다형성
   - 많은 형상을 띄는 성품
   - 여러 타입의 객체를 하나의 타입으로 관리
   - 부모는 자식을 담을 수 있다 ( 업캐스팅 )
   - 자식은 부모를 담을 수 있다 ( 다운캐스팅 )
     [!] 단, 부모가 자식을 담은 적이 있어야 한다
   > 다형성은 부모 타입으로 자식 객체들을 관리하기 용이하다
 
2025-03-06
 JAVA 추상화 abstract와 interface
  (1) abstract
   : 실체화된 객체들 간에 공통되는 특성을 추출한 것
    [!] 미완성적인 개념 ( new 사용불가 )
    <목적>
     공통된 필드와 메서드의 이름을 통일하기 위함
   [형식] abstract class 'super' > class 'sub' extends 'super'
  (2) interface
   - 개발 코드와 객체 사이를 연결
   - 개발 코드변경 없이 객체를 바꿔 낄 수 있도록 하는 역할
   - interface가 abstract 보다 추상화 정도가 높다
 Html/css/jscrpit
  - onmouse'event' > style=(" ")

2025-03-07
 JAVA NoNameClass와 Exception
  익명클래스 : 
  예외처리 : 발생할 오류를 예상하여 해당 오류를 예외처리로 하여금 오류가 발생하지 않게 사전 방지
