# WEB

## (1) 컴퓨터 네트워크
- TCP/IP 기반으로 연결되어 있는 컴퓨터 네트워크
- 클라이언트 ↔ 서버

### [1] Web 프로그래밍 (Http 통신) 
- **단방향 통신** 
  - 클라이언트 요청 시 서버 응답 후 종료

### [2] Socket 프로그래밍 (채팅)
- **양방향 통신**
  - 특정 포트를 통해 실시간 정보 교류
  - 연결이 지속적으로 유지됨

## (2) WS vs WAS

- **WS (Web Server)** 
  - 정적 콘텐츠(html, css, js) 웹 브라우저에 제공
  - 예시: Apache

- **WAS (Web Application Server)** 
  - 동적 콘텐츠 처리
  - 브라우저와 DBMS 사이에 동작하는 미들웨어
  - 예시: Apache + Tomcat

## (3) Tomcat

- Http request(요청) → Catalina → Context → Servlet → response

### [1] Http Request
- 클라이언트의 요청을 서버로 전달

### [2] Coyte가 해결사 찾기
- http 요청을 처리할 웹 어플리케이션(context)의 `web.xml` 파일 내용을 참고하여 요청 전달

### [3] Catalina (Servlet)
- 실제 요청을 처리하는 해결사 역할

### [4] Jasper (JSP Engine)
- Java + HTML 페이지 요청 처리 후 응답 (response)

---

# JSP

## (1) 기본 요소
- **HTML + Java**
  - **스크립트릿**: `<% %>` 자바 코드
  - **지시자**: `<%@ %>`
  - **주석**: `<%-- --%>`
  - **표현**: `<%= %>` 출력
  - **선언**: `<%! %>` 선언

## (2) FORM
서버로 정보를 전달하는 방법
- **action**: 요청 처리
- **method**: 요청 처리 방식 (GET, POST)
- **name**: 데이터 보관 이름

## (3) 쿼리 스트링
- URL 뒤에 입력 데이터를 함께 제공하는 데이터 전달 방법
- 예시: `https://www.google.com/search?q=apple`
  - **GET 방식**: 클라이언트 ↔ 서버

## (4) request, getParameter('name')
- **request** 객체를 통해 클라이언트에서 서버로 데이터를 전달
- `getParameter('name')`: 클라이언트 → 서버

---

# 내장 객체

## (1) request [요청]
- **request.getParameter("name")**: 값 하나 가져오기
- **request.getParameterValues("name")**: 값 여러 개 가져오기

## (2) response [응답]
- **response.sendRedirect("처리경로")**  
  - `response`/`request`가 유지되지 않음
  - 같은 처리에서 `alert` 출력되지 않음
  - 대체 방법:
    - `location.href` 또는 `<meta http-equiv='refresh' content='초'; url='경로'>`

- **request.getRequestDispatcher("경로").forward(request, response)**  
  - 요청과 응답 위임
  - `response`/`request` 유지됨

## (3) scope 범위
- **application(앱) > session(브라우저) > request(요청) > pageContext(페이지)**

## (4) session
- **http 프로토콜**: 데이터 요청 후 응답을 받으면 바로 종료
- 서버 측에 저장되는 정보
- 보안성이 높음

## (5) cookie
- 클라이언트 측에 저장되는 정보
- 보안성이 낮음

## (6) error
- **(1) 4xx (클라이언트 오류)**
  - 404: 페이지를 찾을 수 없음
- **(2) 5xx (서버 측 오류)**
  - 코드 상에 오류
  - `web.xml`: 에러 설정

## (7) out
- 출력

---

# 5. DBCP

## (1) DBCP
- **DBCP** (Database Connection Pooling): 분산 응용 프로그램에서 데이터베이스 연결을 효율적으로 관리하기 위한 기술

## (2) 실습
### [1] 다운로드
- [commons] : dbcp, pool, collections

### [2] [WEB-INF] - Jar 파일 추가

### [3] DBCP - JAVA 파일 생성

### `server.xml`
```xml
<Context>
  <Resource name="jdbc/mbasic" auth="Container" type="javax.sql.DataSource"
            maxTotal="100" maxIdle="30" maxWaitMillis="10000"
            username="root" password="1234" driverClassName="com.mysql.cj.jdbc.Driver"
            url="jdbc:mysql://localhost:3306/mbasic"/>
</Context>
---
```web.xml
<resource-ref>
  <description>DB Connection</description>
  <res-ref-name>jdbc/mbasic</res-ref-name>
  <res-type>javax.sql.DataSource</res-type>
  <res-auth>Container</res-auth>
</resource-ref>
---
```[DBCP 연동]
Context initContext = new InitialContext();
Context envContext  = (Context)initContext.lookup("java:/comp/env");
DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
Connection conn = ds.getConnection();
