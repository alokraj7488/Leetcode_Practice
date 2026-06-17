# Write your MySQL query statement below
SELECT COALESCE(u.unique_id, null) AS unique_id, e.name AS name
FROM Employees e
LEFT JOIN EmployeeUNI u
ON e.id = u.id;