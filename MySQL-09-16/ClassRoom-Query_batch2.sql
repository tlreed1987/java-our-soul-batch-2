create schema javaoursoul2;
use javaoursoul2;
show tables;
create table EMPLOYEE(
	EMP_ID  int,
    NAME varchar(20) not null,
    SALARY float,
    DEPT_ID tinyint unsigned,
    constraint emp_pk primary key(EMP_ID)
);

create table DEPARTMENT(
	DEPT_ID tinyint unsigned auto_increment,
    NAME varchar(20),
    LOCATION varchar(20),
    constraint dept_pk primary key(DEPT_ID)
);
ALTER TABLE DEPARTMENT auto_increment=101;
ALTER TABLE EMPLOYEE
ADD constraint fk_emp_dept foreign key(DEPT_ID) references DEPARTMENT(DEPT_ID);
#ALTER TABLE EMPLOYEE DROP constraint fk_emp_dept;
insert into department(NAME, LOCATION) values('Human Resoure','New Jersey');
select * from department;
insert into department(NAME, LOCATION) values('Cloud Eng','Houston');
insert into department(NAME, LOCATION) values('IT Admin','Pittsburgh');
select * from department;
select * from employee;
insert into employee values(1,'Jia Zhong',2300.01,101);
insert into employee values(2,'Dereje',3300.61,102);

insert into employee values(3,'Tony',4300.61,103);
insert into employee values(4,'Yashi',4400.51);
insert into employee values(5,'Nitin',3343.90,null);
select * from employee ; 
#INNER JOIN
SELECT * FROM EMPLOYEE JOIN DEPARTMENT ON EMPLOYEE.DEPT_ID=DEPARTMENT.DEPT_ID;
CREATE VIEW EMP_DEPT_VIEW AS
SELECT e.EMP_ID, e.NAME, e.SALARY, e.DEPT_ID , d.NAME AS "DEPT_NAME", d.LOCATION FROM EMPLOYEE e JOIN DEPARTMENT d ON e.DEPT_ID=d.DEPT_ID;
SELECT * FROM EMP_DEPT_VIEW;
#LEFT OUTER JOIN
SELECT e.EMP_ID, e.NAME, e.SALARY, e.DEPT_ID , d.NAME AS "DEPT_NAME", d.LOCATION FROM EMPLOYEE e LEFT OUTER JOIN DEPARTMENT d ON e.DEPT_ID=d.DEPT_ID;
#RIGHT OUTER JOIN
SELECT e.EMP_ID, e.NAME, e.SALARY, e.DEPT_ID , d.NAME AS "DEPT_NAME", d.LOCATION FROM EMPLOYEE e RIGHT OUTER JOIN DEPARTMENT d ON e.DEPT_ID=d.DEPT_ID;
select version();

DELIMITER &&
create procedure getSalayByDept()
begin
    select * from employee where dept_id=101;
	select round(sum(salary)) as 'TotalSalary', dept_id from employee group by DEPT_ID having dept_id=101;
end &&

call getSalayByDept();

DELIMITER &&
create procedure getSalaryByDept(in did int)
begin
    select * from employee where dept_id=did;
	select round(sum(salary)) as 'TotalSalary', dept_id from employee group by DEPT_ID having dept_id=did;
end &&

call getSalaryByDept(103);

DELIMITER &&
create procedure getSalaryByDept1(in did int, out tsal int)
begin
    select * from employee where dept_id=did;
	select round(sum(salary)) into tsal from employee group by DEPT_ID having dept_id=did;
end &&

call getSalaryByDept1(103,@value);
select @value;



DELIMITER &&
CREATE FUNCTION gradeSalary(sal double)
RETURNS VARCHAR(20)
deterministic
begin
		declare grade varchar(20);
		if (sal>0 and sal<=2000) then
			set grade='low';
		elseif (sal>2000 and sal<=3999) then
			set grade='average';
		else
			set grade='high';
		end if;
        return(grade);
end &&

select emp_id, name, salary , gradeSalary(salary) from employee;