-- inner join 
select c.customerNumber, o.orderNumber ,c.customerName 
from customers c, orders o
where c.customerNumber = o.customerNumber 
and c.customerNumber = 496
order by c.customerNumber desc;

SELECT *
FROM customers c -- table A
INNER JOIN orders o  -- UNIÓN
ON c.customerNumber = o.customerNumber  -- A.KEY = B.KEY