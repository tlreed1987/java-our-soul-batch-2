use world;
create table EU_Countries 
select name, population, 1.5 * population as newPopulation from country where continent = 'Europe';

select * from eu_countries;
create database javamysoul;
use javamysoul;

create table EMPLOYEE
(
	EMP_ID  int  primary key,
    EMP_NAME varchar(30) not null,
    SALARY double not null,
    DEPT_ID int null
)

select * from EMPLOYEE;
insert into EMPLOYEE(EMP_ID, EMP_NAME, SALARY, DEPT_ID) value(1,'NITIN',2300.00,101);
insert into EMPLOYEE value(2,'ALEX',2334.10,101);
insert into EMPLOYEE(EMP_NAME, SALARY, DEPT_ID, EMP_ID) value('Pete',4300.00,102, 3);

insert into EMPLOYEE(EMP_NAME, SALARY, EMP_ID) value('Marawan',4640.00, 4);
create table EMPLOYEE
(
	EMP_ID  int  primary key,
    EMP_NAME varchar(30) not null,
    SALARY double not null,
    DEPT_ID int null
)

select * from EMPLOYEE;
insert into EMPLOYEE(EMP_ID, EMP_NAME, SALARY, DEPT_ID) value(1,'NITIN',2300.00,101);
insert into EMPLOYEE value(2,'ALEX',2334.10,101);
insert into EMPLOYEE(EMP_NAME, SALARY, DEPT_ID, EMP_ID) value('Pete',4300.00,102, 3);
insert into EMPLOYEE values(5,'Frank',1300.10,102),
(6,'Alina',4500.40,101),
(7,'Jack',5300.10,101);

replace into employee values(8,'Mark',4213.89,103);

create table department (
	dept_id int primary key,
    dept_name varchar(30) not null
);

insert into department values(101,'HR'), (102,'Admin'),  (103,'Cloud Ops');
select * from department;
select * from employee right join department on employee.dept_id=department.dept_id;

alter table employee 
add constraint foreign key(DEPT_ID) references Department(dept_id);

insert into EMPLOYEE value(10,'Saif',2334.10,104);
	 use javamysoul;
     
DELIMITER &&
create procedure getSalayByDept()
begin
    select * from employee where dept_id=101;
	select round(sum(salary)) as 'TotalSalary', dept_id from employee group by DEPT_ID having dept_id=101;
end &&

DELIMITER &&
create procedure getSalaryByDept(in did int)
begin
    select * from employee where dept_id=did;
	select round(sum(salary)) as 'TotalSalary', dept_id from employee group by DEPT_ID having dept_id=did;
end &&

DELIMITER &&
create procedure getSalaryByDept1(in did int, out tsal int)
begin
    select * from employee where dept_id=did;
	select round(sum(salary)) into tsal from employee group by DEPT_ID having dept_id=did;
end &&

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
