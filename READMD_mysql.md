1. mysql
  (1) DBMS
    - 데이터베이스 관리 시스템
  (2) 데이터베이스
    - data + base
    - 데이터(값), 정보(의미부여)
    - oracle, mysql, mssql
    데이터 : 1년동안 월간 우산 판매량을 조사 했습니다.  
    정보 : 이 조사표를 가지고 처리해서    우산은 겨울보다 여름에 잘 팔린다는 결과를 얻었습니다.
  (3) setting
    - 버전확인 (8.0.41)
    - 설치확인
        mysql -uroot -p
        status

2. RDB
  (1) RDBMS
    - 관계형 데이터베이스 관리 시스템
    - 테이블 관계
  (2) RDBMS 구성요소
    - 개체 ( Entity : Table )
    - 관계 ( Relationship : 외래키 )
    - 속성 ( Attribute : 필드 )
  (3) 데이터베이스 언어
    - 정의어(DDL) : CREATE, ALTER, DROP (CAD)
    - 조작어(DML) : INSERT, SELECT, UPDATE, DELETE (CRUD)
    - 제어어(DCL) : GRANT, REVOKE ()

3. table
  (1) 저장소 안 분류표
    create table 'table_name'('field1' 자료형 속성, 'field2' 자료형 속성);
  (2) 자료형
    - 숫자 : int, double
    - 문자 : char(고정문자열), varchar(가변형 문자열), text(제한없음)
    - 날짜 : date, datetime, timestamp
  (3) 속성
    - 필수입력 : not null
    - 숫자자동증가 : auto_increment
    - 기본키 : primary key
    use : db선택
    create table t1(name varchar(100) not null, age int);
    show tables; : 테이블 전체 확인
    desc 'table_name'; : 테이블 구조 확인
    create table t2(no int not null auto_increment primary key, name varchar(100) not null, age int);

4. key
  튜플(행, 레코드, 정보)을 구분할 수 있는 기준 필드(행, 속성)
  no | name | age | email             | 부서번호
  2   second  10   second22@gamil.com      1
  3   second  10   second33@gamil.com      2
  (1) 후보키 : 기본 키로 사용할 수 있는 속성
    > no, email 
  (2) 기본키 : 후보키들 중에서 선택한 주 키
    > no
  (3) 대체키 : 후보키 중에서 기본키가 아닌 키
    > email
  (4) 외래키 : 테이블과 테이블을 연결해주는 속성 
    > cno
  (5) 슈퍼키 : 속성+속성 집합으로 구성된 키
    > (no,name)

    [company]
    cno | 부서 | 지역
    1    백엔드  부평
    2    프론트  판교

5. alter 
  테이블 수정
  (1) 데이터 정의
    : create alter drop 
  (2) 문법
    > alter table 'table_name' add(추가) 'field_name' 자료형 속성
                               drop(삭제) 'field_name'
                               modify(필드수정) 'field_name' 자료헝 속성
                               change(필드수정) 'field_name' 'new_field_name' 자료형 속성
                               rename          'new_table_name'
