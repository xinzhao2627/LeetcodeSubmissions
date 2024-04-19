# Write your MySQL query statement below
SELECT
    e.name,
    b.bonus
FROM 
    Bonus b
RIGHT JOIN
    Employee e ON e.empID = b.empID
WHERE
    coalesce(bonus, 0) < 1000
 