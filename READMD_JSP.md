1. WEB
  (1)
  - TCP/IP 기반으로 연결되어 있는 컴퓨터 네트워크
  - 클라이언트 ↔ 서버
  [1] web 프로그래밍 (Http 통신) : 단방향통신 
    (클라이언트 요청시 서버 응답/종료)
  [2] socket 프로그래밍 (채팅) : 양방향통신
    (특정 포트를 통해 실시간 정보 교류/계속 연결되어 있음)
  (2) WS vs WAS
    - WS(Web Server) : 정적콘텐츠(html,css, js) 웹브라우저에 제공
      [ex] Apache
    - WAS(Web Application Server) : 동적콘텐츠
      브라우저와 DBMS 사이에 동작하는 미들웨어
      [ex] Apache + tomcat
  (3) Tomcat
    - Http request(요청) > Catalina > Context > Servlet > response
    [1] http request
    [2] Coyte가 해결사 찾기 :
      http 요청을 처리할 웹어플리케이션(context) web.xml 파일 내용을 참고해서 요청 전달 
    [3] Catalina(Servlet) : 해결사
    [4] Jasper (Jsp Engine) : java+html 페이지 요청처리 응답(respone)

2. JSP
  (1) 기본요소
    HTML + java
    - 스크립트립 : <% %> 자바코드
    - 지시자 : <%@ %>
    - 주석 : <%-- --%>
    - 표현 : <%= %> 출력
    - 선언 : <%! %> 선언
  (2) FORM 
    서버쪽으로 정보 전달
    - action : 요청처리
    - method : 요청처리방식 (get, post)
    - name : "데이터보관이름"
  (3) 쿼리스트링
    httpS:www/.google.com/search?q=apple
    - url 뒤에 입력 데이트를 함꼐 제공하는 데이터 전달방법
    - get 방식
      클라이언트[#] ↔ 서버
  (4) reueqst,getParameter('name')
    - 클라이언트 ↔ 서버[#]
