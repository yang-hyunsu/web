/*
# 그룹함수란?
1. 테이블의 전체 행을 하나 이상의 컬럼을 기준으로 그룹화하여
그룹별로 결과를 출력하는 함수, 그룹함수는 통계적인 결과를 출력
하는데 자주 사용한다.
2. 기본 형식
	select 기준컬럼, 그룹함수(컬럼)
	from 테이블명
	where
	group by 그룹컬럼
	having 그룹함수를 적용한 결과를 조건 처리
3. 그룹함수의 종류
	1) count() : null을 제회한 데이터의 건수, 행의 건수
	2) max() : null을 제외한 모든 행의 최대값
	3) min() : null을 제외한 모든 행의 최소값
	4) sum() : null을 제외한 모든 행의 합
	5) avg() : null을 제외한 모든 행의 평균값
	6) stddev() : null을 제외한 모든 행의 표준편차
	7) variance() : null을 제외한 모든 행의 분산값
 * */
SELECT comm
FROM emp;
SELECT count(comm)
FROM emp;
-- emp테이블에서 comm의 전체 컬럼의 null을 제외한 데이터 건수
SELECT max(comm), min(comm), avg(comm)
FROM emp;

SELECT deptno, sal
FROM emp
ORDER BY deptno, sal;
-- 부서별로, sal를 가진 데이터 건수가 얼마일까? 
-- 부서별로, sal를 가진 데이터 최대값 얼마일까? 
-- 부서별로, sal를 가진 데이터 최소값 얼마일까? 
-- 부서별로, sal를 가진 데이터 평균 얼마일까? 
SELECT deptno, count(sal) "건수", max(sal) "최대",
       min(sal) "최소"
FROM emp
GROUP BY deptno
ORDER BY deptno;
-- select 그룹할컬럼, 함수(통계처리할데이터)
-- from 테이블
-- group by 그룹할컬럼
-- 주의 : 그룹할컬럼은 select 하나만 지정하면, group by 하나만 지정.
--       통계할 함수는 여러개를 선언해서 확인하는 것은 상관 없음.



