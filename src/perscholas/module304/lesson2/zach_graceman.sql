-- 1
SELECT productName AS "Product Name",
	   productLine AS "Product Line",
       buyPrice AS "Buy Price"
FROM classicmodels.products
ORDER BY buyPrice;

-- 2
SELECT contactFirstName AS "First Name",
	   contactLastName AS "Last Name",
       city AS "City"
FROM classicmodels.customers
WHERE country = "Germany"
ORDER BY contactLastName;

-- 3
SELECT DISTINCT status
FROM classicmodels.orders
ORDER BY status;

-- 4
SELECT *
FROM classicmodels.payments
WHERE paymentDate >= '2005-01-01'
ORDER BY paymentDate DESC;

-- 5
SELECT firstName, lastName, email, jobTitle
FROM classicmodels.employees
WHERE officeCode = 1
ORDER BY lastName;

-- 6
SELECT productName, productLine, productScale, productVendor
FROM classicmodels.products
WHERE productLine = "Vintage Cars" OR productLine = "Classic Cars"
ORDER BY 2 DESC, 1

