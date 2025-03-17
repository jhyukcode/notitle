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

2025-03-10 
 JAVA Collection Framework
  (1) 배열의 단점을 개선한 클래스, 객체(클래스)만 저장 가능
  (2) 저장 단위
   변수 < 배열 < 클래스 < 컬렉션 프레임워크 < 파일 < db
  (3) 핵심 인터페이스
   - List : 순서가 있음, 중복을 허용함
    > add, get, size, remove, contains
   - Set : 순서가 없음, 중복이 불가함
    > add, 향상된 for/iterator, size, remove, contains
   - Map : key, value가 쌍을 이룸
    > put, get(key), 향상된 for/iterator, size, remove, contains
 Html Bootstrap5 <Grids>
  .col-sm-'number'(max 12) : 한 줄에 최대 12칸(혹은 12칸 길이)의 그리드를 생성한다.
   - alert alert-warning(다른 alert)를 이용하여 그리드가 생성된 모양을 가시성 좋게 확인할 수 있다

2025-03-13
 JAVA IO
  (1) Input/Output
    - 입력과 출력
    - 두 대상 간의 데이터를 주고 받는 것
    - 스트림 : 사용 연결 통로
    [!] 입력스트림 → [프로그램] → 출력스트림
  (2) JAVA I/O 분류
    - byte 단위 / char 단위
      > byte 단위 ( InputStream / OutputStream ) : 모든 종류
      > char 단위 ( Reader / Writer ) : 문자
  (3) 보조스트림
    - 사용 연결 통로
    - new BufferedReader( new InputStreamReader(new FileInputStream(file)))
    [1] new FileInputStream(file) : byte#/char
    [2] new InputStreamReader : 바이트를 문자 스트림으로, 텍스트 처리 가능하게
    [3] new BufferedReader : 속도 향상

2025-03-14 
 JAVA Thread, Network
  1. Thread
   (1) 프로세스
     - 실행 중인 하나의 프로그램
   (2) 멀티 프로세스
     - 동시에 여러 프로세스를 실행
   (3) 구성
     - 자원(리소스)+Thread(자원으로 실제 작업을 수행)
     - 모든 프로세스느 최소한 하나의 스레드(main)
     - 같은 프로세스 내의 모든 스레드는 자원 공유
   (4) 동시성과 병렬성
     - 동시에 실행하는 것 같은 효과
     - 동시성 : 하나의 코어 멀티 스레드가 번갈아가면서 실행
       > 일꾼1 : 작업1 > 작업2 > 작업3 (작업 수 > 일꾼)
     - 병렬성 : 멀티 코어에서 개별 스레드를 동시에 실행
       > (일꾼 > 작업 수)
   2. Network
   (1) Network ( net 그물 + work 일하다)
     - 연결된 통신을 이용해서 컴퓨터의 자원 공유
   (2) 서버와 클라이언트 
     [Client]  ↔  [Server]
     서비스사용    서비스제공
     웹브라우저    네이버
 
   [1] web 프로그래밍 (Http 통신) : 단방향통신 (클라이언트 요청시 서버 응답/종료)
   [2] socket 프로그래밍 (채팅) : 양방향통신 (특정 포트를 통해 실시간 정보 교류/계속 연결되어 있음)
 
   (3) Socket 프로그래밍
     - TCP(연결형) / UDP(비연결형)
     - TCP : 컴퓨터 연결, 전화
     - UDP : 한 쪽에서 일방적으로 데이터를 보내는 편지
   (4) TCP/IP
     - ip : 패킷통신, 작은 단위로 나눠서 전송하는 방식, 전달 보증X, 받는 순서/보내는 순서가 다름
     - tcp : ip 위에서 동작, 데이터의 전달을 보증하고, 보낸 순서대로 받게 해주는 역할
     - 특징 : 연결 지향이므로 데이터는 정확하고 안전하게 전달, 통신 선로를 고정하므로 전송 속도가 느림
