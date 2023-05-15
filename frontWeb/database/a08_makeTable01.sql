/*
# 테이블 생성
1. 데이터베이스에서 핵심 객체인 테이블 생성 물리적으로
	sql에 의해서 처리되는 것을 말한다.
2. 테이블 생성 기초
	1) 데이터 유형
		number : 숫자형
		varchar2(byte) : 가변형문자열
			한글 3byte(oracle)
		Date : 날짜
		==> 테이블 생성시, 사용되는 가장 기초적인 데이터 유형을
		분류한 것이다.
	2) 테이블 생성 기본형식
		create table 테이블명(
			컬럼1명 데이터유형,
			컬럼2명 데이터유형
		);
		ps) 테이블 삭제 sql
		drop table 테이블명;
	3) 기본 데이터 입력 형식
		insert into 테이블 values(데이터1, 데이터2...);
**/
-- 학생테이블1 학생명과 점수
CREATE TABLE student01(
	name varchar2(50),
	point number
);
INSERT INTO student01 values('홍길동',70);
INSERT INTO student01 values('김길동',80);
INSERT INTO student01 values('신길동',90);
SELECT * FROM student01;
-- ex) 구매물건 정보 테이블(물건일련번호, 물건명, 판매가격)
--   char() : 데이터의 크기가 고정되어 있을 때, 활용한다.
--   ex) 학번, 주민번호, 사번..
CREATE TABLE product01(
	psid char(10),
	name varchar2(50),
	price number
);
INSERT INTO product01 values('PA10000001','사과',3000);
INSERT INTO product01 values('PA10000002','바나나',4000);
INSERT INTO product01 values('PA10000003','딸기',12000);
SELECT * FROM product01;
-- ex) 회원정보 테이블(회원아이디, 회원패스워드,  회원명, 포인트, 권한)
CREATE TABLE member01(
	id varchar2(50),
	pass varchar2(20),
	name varchar2(50),
	point NUMBER,
	auth varchar2(20)
);
INSERT INTO member01 values('himan','7777','홍길동',1000,'관리자');
INSERT INTO member01 values('higirl','8888','오현정',2000,'일반사용자');
INSERT INTO member01 values('goodman','5555','마길동',9000,'관리자');
SELECT * FROM member01;
-- ex) 학생정보2 테이블(학생번호, 학생명, 국어,영어,수학)
-- 테이블 생성 및 데이터 입력
CREATE TABLE STUDENT02(
	sno NUMBER,
	name varchar2(50),
	kor number(3),
	eng number(3),
	math number(3)
);
INSERT INTO STUDENT02 values(1,'홍길동',70,90,80);
INSERT INTO STUDENT02 values(2,'김길동',90,90,80);
INSERT INTO STUDENT02 values(3,'신길동',70,100,80);
SELECT * FROM STUDENT02;



