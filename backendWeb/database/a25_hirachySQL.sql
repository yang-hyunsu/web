/*
# 계층적 질의문
1. 데이터베이스를 처리하면서 여러가지 업무 처리에 따라 테이블을 
구성할 수 있는데, 간혹 계층적으로 하나의 테이블 안에 처리가 필요한
경우가 나타난다.
2. 게시물에 답글을 계층적을 달아야 하는 경우, 직급에 있어서 상위
관리자와 하위 관리자를 구분하여 처리하는 경우, 메뉴 항목에 있어서
상위메뉴와 하위 메뉴를 처리하여야 하는 경우 등 여러가지 경우가 
발생한다.
3. 이 때, 간혹 여러 테이블을 만들어서 계층적으로 처리하는 경우도
있지만, 계층적으로 하나의 테이블에 데이터를 처리하고, 오라클에서
사용하는 계층적 질의문을 처리하면 원하는 데이터가 계층적으로 출력
되는 경우가 많다.
4. 계층적 질의문의 위한 테이블 구조
	1) 계층적 질의문 처리를 위해서는, 테이블의 특정 컬럼의
	계층구조로 되어 있어야 한다.
	우리가 많이 아는 emp테이블의 empno와 mgr이 전형적이 계층적
	구조를 가진 컬럼구조로 empno와 mgr은 사원번호와 관리자번호
	라는 관계가 다시 mgr은 empno에 연결관계가 있기 때문이다.
	결국, 최상위 관리자의 mgr 번호에서 empno가 있고,
	그 하위에 관리자나 사원들을 이 번호를 mgr의 번호로 설정되어
	있기때문이다.
	2) 			공과대학
	
	정보미디어학부			메카트로닉스학부
	
컴퓨터공학과 멀리미디어학과	전자공학과		기계공학과			
	
	학과테이블
	deptno	dname		col	
	100		공과대학	
	101		정보미디어학부	100	
	102		메카트로닉스학부	100
	103		컴퓨터공학과   101		
	104		멀리미디어학과  101
	105		전자공학과     102		
	106		기계공학과     102	
	
	ex) part01 테이블을 위 구조와 데이터 만들고,
	계층적 sql으로 level로 출력하세요.	
	ex) 코드성 테이블 구조 (select, checkbox, radio)
	Code 테이블
	no	title refno odr
	100	과일들  0		0
	101 사과    100  1
	102 바나나   100  2
	103 딸기    100   3
	104 오렌지   100   4
	
	
	sequence code_seq
		start with 100
		
			
					

5. 계층적 질의문의 기본 형식
	1) select 명령문에서 start with와 connect by절 이용
	2) 계층적 질의문에는 계층적인 출력 형식과 시작 위치 제어
	3) 출력 형식은 top-down 또는 bottom-up 방식이 있다.
	4) 사용 코드
		select level, 컬럼명....   
		from 테이블명
		where 조건
		start with 조건1
		connect by prior 조건2
		
		level : 계층레벨을 가져온다. 위 공과대학은 1level
			멀리미디어학과는 3level을 가져온다.
		조건1 : 계층구조가 시작하는 조건을 말한다. 테이블의
			여러계층이 있더라도 최상위에서 시작할 수도 있고
			중간 계층에서 시작할 수 있기 때문이다.
		조건2 : 계층구조에서 상위와 하위를 연결하는 컬럼을 말한다.
			emp의 경우 empno = mgr, 위 학과 정보의 경우
			deptno와 col을 들수 있다.
6. 계층적 질의문의 옵션
7. 여러가지 적용 예시..
 * */

SELECT LEVEL, empno, ename, mgr
FROM emp
START WITH empno = 7839
CONNECT BY PRIOR  empno=mgr;
SELECT * FROM DEPARTMENTS;
/*
	학과테이블
	deptno	dname		col	
	100		공과대학	
	101		정보미디어학부	100	
	102		메카트로닉스학부	100
	103		컴퓨터공학과   101		
	104		멀미디어학과  101
	105		전자공학과     102		
	106		기계공학과     102	
	
	ex) part01 테이블을 위 구조와 데이터 만들고,
	계층적 sql으로 level로 출력하세요.
 * */
CREATE TABLE part01(
	deptno NUMBER PRIMARY KEY,
	dname varchar2(100),
	col number
);
SELECT * FROM part01;
INSERT INTO part01 values(100,'공과대학', null);
INSERT INTO part01 values(101,'정보미디어학부', 100);
INSERT INTO part01 values(102,'메카트로닉스학부', 100);
INSERT INTO part01 values(103,'컴퓨터공학과', 101);
INSERT INTO part01 values(104,'멀티미디어학과', 101);
INSERT INTO part01 values(105,'전자공학과', 102);
INSERT INTO part01 values(106,'기계공학과', 102);
INSERT INTO part01 values(107,'인공지능학과', 101);
SELECT LEVEL, p.*
FROM part01 p
START WITH deptno=100
CONNECT BY PRIOR deptno = col;




