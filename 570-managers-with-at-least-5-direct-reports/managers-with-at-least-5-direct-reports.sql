SELECT e.name
FROM Employee e 
JOIN Employee t
WHERE e.id = t.managerId
GROUP BY e.name, e.id
HAVING COUNT(*) >= 5;