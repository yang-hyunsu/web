select * from emp;
select empno from emp; -- ctrl+enter
select empno, ename from emp;
-- ex) empno, job, mgr, deptno를 1, 2, 3, 4 선택해서
--     조회해보세요..
select empno from emp;
select empno, job from emp;
select empno, job, mgr from emp;
select empno, job, mgr, deptno from emp;
select deptno, empno, ename 
from emp;
select ename, sal 
from emp
where sal >= 2000;
select *
from emp;
-- ex1) sal가 2000미만 사원정보 검색하세요.
select ename, sal
from emp
where sal < 2000;
-- ex2) sal가 2000이상 4000미만 사원정보 검색하세요.
--      and, or 이용
select ename, sal
from emp
where sal >= 2000 and sal < 4000;
select deptno, ename, sal
from emp
where sal < 2000 or sal >=5000;
select * from emp;
-- ex) empno 기준으로 7500미만 이거나 7800이상인
--  사원의 empno, ename, sal 를 출력하세요.
select empno, ename, sal
from emp
where empno <7500 or empno>=7800;
select * 
from emp
where ename ='SMITH'; 
-- = : 비교연산자(동일데이터)
-- '문자열' : 문자열 데이터 표시 

