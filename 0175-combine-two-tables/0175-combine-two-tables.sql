# Write your MySQL query statement below
select p1.firstname, p1.lastname, a1.city, a1.state 
from Person p1
left join address a1
on p1.personID = a1.personID;