use generationg1;

SELECT  * 
FROM customers c; 

SELECT * 
FROM customers c
WHERE c.customerName  LIKE '%toy%';

SELECT c.customerName , c.customerNumber 
FROM customers c
WHERE c.customerName  LIKE '%toy%';

SELECT c.customerName , c.customerNumber , c.city 
FROM customers c;

SELECT  c.customerName , c.customerNumber , c.city 
FROM customers c
WHERE c.city = 'Madrid';


SELECT *
from customers c, orders o
WHERE c.customerNumber = o.customerNumber 
order by c.customerNumber DESC;

-- obtener todas las ordernes por clientes 
SELECT c.customerNumber , o.orderNumber 
from customers c, orders o
WHERE c.customerNumber = o.customerNumber 
order by c.customerNumber DESC;

-- las ordernes del cliente 496 
SELECT c.customerNumber , o.orderNumber 
from customers c, orders o
WHERE c.customerNumber = o.customerNumber 
and c.customerNumber = 496
order by c.customerNumber DESC;

-- uno busca un user 
SELECT * FROM customers c 
WHERE c.customerNumber  = 496;

-- las ordernes del user
SELECT * from orders o  
WHERE o.customerNumber = 496;







