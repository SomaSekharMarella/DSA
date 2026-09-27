# Write your MySQL query statement below
select d.name as Department,
e.name as Employee,
e.salary as Salary from Employee e right join Department d
on e.departmentId = d.id where
e.salary = (
    select Max(salary) from Employee e2 where e.departmentId = e2.departmentId
);