/* 변경##
# 데이터 수정
1. update 명령문은 테이브렝 저장된 데이터 수정을 위한 
	조작어이다.
2. 기본형식
	update 테이블명
		set 컬럼1 = 수정할데이터1,
		    컬럼2 = 수정할데이터2,
		    ...
	where 조건(비교/논리)
3. 주의 사항
	1) where 조건절이 생략되면 모든 행의 데이터가
		수정된다.(현업에서 발생하는 엄청난 에러..)
4. subquery를 활용한 여러가지 수정 처리.
	1) where 조건문
	2) set 수정 컬럼 지정 및 데이터 부분에도
		subquery을 활용하여 처리한다.		
 * */
SELECT * FROM emp03;
UPDATE emp03
   SET ename='이영수',
       mgr = 7902,
       sal = 5000,
       comm = 1000,
       hiredate = sysdate
  WHERE empno = 7369;
-- ex1) emp02에서 comm이 null인 데이터를 comm을 1000으로 수정
-- ex2) emp02에서 입사연도가 1/4분기인 사원 정보를는 
--          현재날짜로 수정하세요.
-- ex3) emp02에서 1980/1981인 입사자는 40년을 더해서 
--			입사날짜를 바꾸고 연봉도 + 2000씩 더하여 처리하세요.
UPDATE emp02
   SET comm = 1000
   WHERE comm IS NULL;
SELECT * FROM EMP02;  
UPDATE emp02
   SET hiredate = sysdate
   WHERE to_char(hiredate,'Q') = '1';
SELECT * FROM EMP02;    
UPDATE emp02
   SET hiredate = ADD_MONTHS(HIREDATE,12*40),
       SAL = SAL + 2000
   WHERE to_char(hiredate,'YY') IN('80','81');
UPDATE emp02
   SET hiredate = ADD_MONTHS(HIREDATE,12*40),
       SAL = SAL + 2000
   WHERE EXTRACT(YEAR FROM hiredate) in(1981,1982);
SELECT * FROM EMP02; 
/*
# subquery를 활용한 수정 처리
1. update명령문에 set부분이나 where 조건절에 subquery를 이용하여
	수정 처리하는 것을 말한다.
2. 다른 테이블이나 현재 테이블에 정보를 변경할 때, 일단 query를 
	수행한 결과로 해당 데이터를 수정 처리하는 것을 말한다.
3. 변경할 컬럼의 타입과 갯수는 반드시 일치하여야 한다.
4. 유형
	1) set부분 subquery 활용
	 	- 한개의 컬럼 set 컬럼명 = (결과가 1개인 컬럼데이터)
	 	- 두개 이상의 컬럼 set 컬럼1,컬럼2.. = (결과가 n인 subquery)	
	
	2) where조건 subquery 활용
 * */
SELECT * FROM EMP03; 
-- 부서정보가 10인 데이터는 부서번호가 20인 사원의 최고급여로 급여를
-- 수정 처리하는 경우 어떻게 update 구문을 처리하는가?
SELECT ename, sal
FROM emp03
WHERE deptno = 10;
SELECT max(sal)
FROM emp03
WHERE deptno = 20;
UPDATE emp03
    SET sal = (
			SELECT max(sal)
			FROM emp03
			WHERE deptno = 20    
        )
  WHERE deptno = 10;  
SELECT * FROM emp03; 
--  ex1) job이 SALESMAN의 평균 급여를 사원번호 7499의 급여로 수정
--     처리하세요
SELECT floor(avg(sal))
			FROM emp02
			WHERE job = 'SALESMAN';
SELECT *
FROM EMP02
WHERE empno = 7499;
UPDATE EMP02
  SET SAL = (SELECT floor(avg(sal))
			FROM emp02
			WHERE job = 'SALESMAN'
)
WHERE empno = 7499;
--  ex2) 2사분기 사원의 최고급여를 사원명 JAMES 의 급여로 변경처리하세요.
SELECT MAX(SAL)
FROM EMP02
WHERE TO_CHAR(HIREDATE,'Q') = '2';
SELECT * 
FROM emp02
WHERE ename = 'JAMES';
UPDATE emp02
  SET SAL = (
		SELECT MAX(SAL)
		FROM EMP02
		WHERE TO_CHAR(HIREDATE,'Q') = '2'  
  	 )
WHERE ENAME = 'JAMES';  
-- 대상이 되는 2개이상의 컬럼을 한꺼번에 변경 처리하는 수정
-- 1. 대상이 되는 subquery 작성(sql)
-- 2. update subquery로 처리..
SELECT * 
FROM EMP03 e;
-- 부서번호가 30번의 최고 급여
SELECT deptno, max(sal)
FROM emp03
WHERE deptno = 30
GROUP BY deptno;
-- 부서가 20인 사원정보에  부서번호와 급여 수정
SELECT deptno, sal
FROM emp03
WHERE deptno = 20;
UPDATE emp03
    SET (deptno, sal) = (
			 SELECT deptno, max(sal)
			   FROM emp03
			  WHERE deptno = 30
			  GROUP BY deptno   
        )
  WHERE deptno = 20;
 SELECT *
  FROM emp03
 WHERE deptno = 30; -- 15:05~
/*
# 삭제 처리
1. 데이터를 행단위를 삭제 처리하는 구문을 말한다.
2. 기본 형식
	delete
	from 테이블명
	where 조건처리
3. subquery 삭제
	delete
	from 테이블
	where 컬럼 = ( subquery)	
# subquery를 활용한 where 조건의 조회/수정/삭제 	
1. 단일/다중행 조건
	delete
	from 테이블
	where 컬럼 = (결과가 1개의 데이터)
	
	select
	from 테이블
	where 컬럼 in (결과 2개 이상의 row 데이터)

2. 하나의 컬럼/하나이상 컬럼 조건
	delete
	from 테이블
	where (컬럼1, 컬럼2) = (결과가 1개의 데이터 - 컬럼이 다중)
	
	select
	from 테이블
	where (컬럼1, 컬럼2) in (결과 2개 이상의 row 데이터- 컬럼이 다중)	
 * */
SELECT * FROM EMP03;
-- sal가 3000미만인 데이터를 삭제
DELETE
FROM emp03
WHERE sal < 3000;
-- ex) 입사일이 2사분기 데이터를 삭제..
SELECT *
FROM emp03
WHERE to_char(hiredate,'Q')='2';
delete
FROM emp03
WHERE to_char(hiredate,'Q')='2';
CREATE TABLE emp09
AS SELECT * FROM emp;
SELECT * FROM emp09;
-- 여러개의 row 데이터를 검색 처리하는 subquery
-- 급여가 2000이상 사원 번호
-- 사원 정보를 처리
SELECT empno
FROM emp09
WHERE sal>=2000;

SELECT *
FROM emp09
WHERE empno IN (
	SELECT empno
	FROM emp09
	WHERE sal>=2000
);
-- 부서별 최고급여자 정보를 출력하고자 한다.
SELECT deptno, max(sal)
FROM emp09
GROUP BY deptno;
SELECT *
FROM emp09
WHERE (deptno, sal) IN (
	SELECT deptno, max(sal)
	FROM emp09
	GROUP BY deptno
);
SELECT *
FROM emp09;
-- ex1) 직책별 최근 입사자들의 정보를 출력하세요
-- ex2) 직책별 최저 급여인 사원 정보를 출력하세요
SELECT *
FROM emp09
WHERE (job, hiredate) IN (
	SELECT job, max(hiredate)
	FROM emp09
	GROUP BY job
);
SELECT *
FROM emp09
WHERE (job, sal) IN (
	SELECT job, min(sal)
	FROM emp09
	GROUP BY job
);
