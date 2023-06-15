CREATE TABLE emp13
AS SELECT * FROM emp;
SELECT * FROM emp13;
ALTER TABLE emp13

ADD dname varchar2(50);
ALTER TABLE emp13
RENAME COLUMN ename  TO empenme;
ALTER TABLE emp13
MODIFY job varchar2(100);
ALTER TABLE emp13
MODIFY deptno references dept(deptno);
ALTER TABLE emp13
add CONSTRAINT EMP13_EMPNO_PK PRIMARY KEY (EMPNO);
ALTER TABLE emp13
DROP COLUMN comm;
SELECT *
FROM  sys.all_constraints
WHERE table_name LIKE 'EMP13';
