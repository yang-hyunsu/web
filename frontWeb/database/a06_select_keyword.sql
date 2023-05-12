/*
# keyword를 이용한 조건문의 활용
1. nvl() 함수 : null을 효과적으로 처리
2. in : or를 줄이기 위한 조건 검색
3. like : 키워드 검색 - 비슷한 글자가 있으면 검색
*/
SELECT mgr, comm
FROM emp;
-- 사원정보에서 급여+보너스 합산하여 출력
-- NULL포함되어 있을 때는 + 연산자에 의해서 처리되면 null
SELECT ename, sal, comm, sal + comm 합산
FROM emp;
-- nvl(컬럼, 대체데이터) : 해당컬럼이 null일 때,
-- 해당 컬럼과 같은 유형의 데이터를 지정하면, null대신 처리가된다.
SELECT comm, nvl(comm,0) 보너스
FROM emp;
--SELECT comm, nvl(comm,' ') 보너스 같은 유형이 아니기에 에러발생
--FROM emp; 
CREATE TABLE emp01
AS SELECT * FROM emp;
INSERT INTO emp01(empno) values(8000);
INSERT INTO emp01(empno) values(8001);
INSERT INTO emp01(empno) values(8002);
SELECT empno, nvl(ename,'이름없음') 이름,
		nvl(job,0) 직책 -- 숫자는 자동 casting되어 '0'처리
FROM emp01
WHERE ename IS null;
SELECT * FROM EMPLOYEES e ;
--  ex) EMPLOYEES기준으로 last_name과 salary와
--       commission_pct 기준으로 보너스를 출력하되,
--       급여와 보너스의 합산을 처리하세요. nvl활용
--   사원명, 급여, 보너스(%), 보너스, 급여+보너스  출력하세요.
SELECT LAST_NAME 사원명, SALARY 급여, 
	nvl(COMMISSION_PCT,0)*100 "보너스(%)",
	nvl(SALARY*COMMISSION_PCT,0) 보너스,
	SALARY + nvl(SALARY*COMMISSION_PCT,0) "급여+보너스"
FROM EMPLOYEES e;
SELECT * FROM EMPLOYEES e ;
-- 사원의 보너스
SELECT * FROM emp;
-- 보너스 null이거나 0인 데이터를 제외하고 
-- 사원정보에서 급여와 보너스를 확인할 때..
SELECT ename, sal, comm
FROM emp
WHERE comm IS NOT  NULL AND  comm != 0;
--WHERE NOT (comm IS NULL or comm = 0);
-- nvl로 처리한 경우
SELECT ename, sal, comm
FROM emp
WHERE nvl(comm,0) != 0; -- NULL도 아니고, 0이 아니경우
-- 함수를 통해서 간단하게 처리할 수 있다.
SELECT *
FROM emp;
-- 사원번호를 7499, 7521, 7566에 대한 데이터를 가져올 때..
SELECT *
FROM emp
WHERE empno = 7499
OR empno = 7521
OR empno = 7566
OR empno = 7654;
-- 컬럼명 in (데이터1, 데이터2, 데이터3, 데이터4)
-- 지정한 데이터가 or조건으로 연결될 때, 사용한다.
SELECT *
FROM emp
WHERE empno IN (7499,7521,7566,7654);
SELECT * FROM emp
WHERE ename IN ('SMITH','ALLEN','JONES');
SELECT * FROM EMP;
-- EX) 부서번호가 20이거나 30인 경우 급여가 2000미만인 데이터를
--     출력하세요
SELECT ename, deptno, sal
FROM emp
WHERE deptno in(20,30)
AND sal<2000;
SELECT ename, job
FROM emp
WHERE ename LIKE '%A%'
AND job LIKE '%MAN';
-- 키워드 검색 형식
-- 컬럼명 LIKE '%키워드%' : 해당 키워드를 포함되어 있을때 검색
-- 컬럼명 LIKE '키워드%' : 해당 키워드로 시작이 포함되어 있을때 검색
-- 컬럼명 LIKE '%키워드' : 해당 키워드로 마지막이 포함되어 있을때 검색
SELECT * FROM EMPLOYEES;
-- ex) first_name, last_name을 검색할 때
--     1) 특정한 키워드를 포함이 되는 경우 처리
--     2) first_name/list_name에 특정한 키워드로 시작하는 데이터 검색
--     3) first_name에 'er'로 끝나는 데이터를 검색하세요
SELECT first_name, last_name
FROM EMPLOYEES e 
WHERE first_name LIKE '%ll%'
AND last_name LIKE '%G%';
SELECT first_name, last_name
FROM EMPLOYEES e 
WHERE first_name LIKE 'A%'
AND last_name LIKE 'B%';
SELECT first_name, last_name
FROM EMPLOYEES e 
WHERE first_name LIKE '%er';
-- 17:05~

