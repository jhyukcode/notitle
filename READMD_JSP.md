# WEB

## 1. 컴퓨터 네트워크
- **TCP/IP 기반으로 연결된 컴퓨터 네트워크**
- **클라이언트 ↔ 서버**

### [1] Web 프로그래밍 (HTTP 통신)
- **단방향 통신**
  - 클라이언트 요청 → 서버 응답 → 종료

### [2] Socket 프로그래밍 (채팅)
- **양방향 통신**
  - 특정 포트를 통해 실시간 정보 교류
  - 계속 연결되어 있음

## 2. WS vs WAS

- **WS (Web Server)**: 정적 콘텐츠 제공 (html, css, js)
  - 예: Apache

- **WAS (Web Application Server)**: 동적 콘텐츠 제공
  - 브라우저와 DBMS 사이에서 동작하는 미들웨어
  - 예: Apache + Tomcat

## 3. Tomcat

- **Http Request 처리 흐름**
  - Http Request → Catalina → Context → Servlet → Response

### [1] Http Request
- **Coyte**: 해결사를 찾기
  - `web.xml` 파일을 참고하여 요청을 전달

### [2] Catalina (Servlet)
- **해결사 역할** 수행

### [3] Jasper (JSP Engine)
- **Java + HTML 페이지 요청 처리 응답**

---

# JSP

## 1. 기본 요소
- **HTML + Java**

### - 스크립트 리터
```jsp
<% %> 자바 코드
- 지시자
jsp
복사
<%@ %>
- 주석
jsp
복사
<%-- --%>
- 표현
jsp
복사
<%= %> 출력
- 선언
jsp
복사
<%! %> 선언
2. FORM
서버로 정보 전달

action: 요청 처리 URL

method: 요청 처리 방식 (GET, POST)

name: 데이터 보관 이름

3. 쿼리 스트링
예: https://www.google.com/search?q=apple

URL 뒤에 데이터를 제공하여 정보 전달

GET 방식

- 클라이언트 ↔ 서버
4. Request/Response
Checkbox: 다중 선택 가능

Radio: 단일 선택 가능

Select: 클릭 시 선택 옵션 표시

DBCP
1. DBCP
분산 응용 프로그램

2. 실습
[1] 다운로드
[commons]: dbcp, pool, collections 라이브러리 다운로드

[2] [WEB-INF] - Jar 파일 추가
[3] DBCP - JAVA 파일 생성
server.xml
xml
복사
<Context>
  <Resource name="jdbc/mbasic" auth="Container" type="javax.sql.DataSource"
             maxTotal="100" maxIdle="30" maxWaitMillis="10000"
             username="root" password="1234" driverClassName="com.mysql.cj.jdbc.Driver"
             url="jdbc:mysql://localhost:3306/mbasic"/>
</Context>
web.xml
xml
복사
<resource-ref>
  <description>DB Connection</description>
  <res-ref-name>jdbc/mbasic</res-ref-name>
  <res-type>javax.sql.DataSource</res-type>
  <res-auth>Container</res-auth>
</resource-ref>
DBCP 연동
java
복사
Context initContext = new InitialContext();
Context envContext  = (Context)initContext.lookup("java:/comp/env");
DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
Connection conn = ds.getConnection();
복사

이제 복사하기 편하게 한 박스 안에 내용이 모두 담겨 있습니다. 쉽게 복사해서 사용하실 수 있습니다!
