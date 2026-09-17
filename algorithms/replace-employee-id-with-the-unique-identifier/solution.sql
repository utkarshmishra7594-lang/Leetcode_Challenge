# Write your MySQL query statement below

select euni.unique_id as unique_id,e.name as name
from Employees as e
left join EmployeeUNI as euni
on e.id=euni.id;


