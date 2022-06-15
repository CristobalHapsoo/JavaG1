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



-- productos 
SELECT *
FROM products p;

-- productos con descripcion 
SELECT * 
FROM  productlines pl;

-- buscar con una palabra clave
select p.productName , pl.productLine 
from products p , productlines pl
where p.productLine  = pl.productLine
and pl.productLine = 'Motorcycles';


-- Ejercicio 1 
SELECT p.productName, pl.productLine, p.quantityInStock
FROM products p, productlines pl  
WHERE p.productLine = pl.productLine
AND p.productLine = 'Motorcycles' 
ORDER BY p.quantityInStock DESC;

SELECT p.productName, p.quantityInStock, pl.productLine
FROM products p , productlines pl  
WHERE p.productName LIKE '%Ford%'
And p.productLine = pl.productLine
ORDER BY p.productLine ASC;




-- inner join 
select c.customerNumber, o.orderNumber ,c.customerName 
from customers c, orders o
where c.customerNumber = o.customerNumber 
and o.customerNumber = 496
order by c.customerNumber desc;


SELECT  c.customerNumber, o.orderNumber ,c.customerName 
FROM customers c -- table A
INNER JOIN orders o  -- UNIÓN
ON c.customerNumber = o.customerNumber  -- A.KEY = B.KEY
and o.customerNumber = 496
order by c.customerNumber desc;


-- repaso

select * 
FROM alumnos a
inner join gruposg g 
on a.alumnos_id = b.grupos_id;









