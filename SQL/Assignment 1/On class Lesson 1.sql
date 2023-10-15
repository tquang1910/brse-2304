CREATE DATABASE ecommerce;
USE ecommerce;

CREATE TABLE customer(
customer_id INT PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
email_address VARCHAR(100) NOT NULL UNIQUE,
number_of_complaints INT DEFAULT 0
);

CREATE TABLE sales( 
purchase_number INT PRIMARY KEY AUTO_INCREMENT,
date_of_purchase DATE NOT NULL, 
customer_id INT NOT NULL, 
item_code CHAR(3)
);

CREATE TABLE items(
item_code CHAR(3) PRIMARY KEY,
item VARCHAR(50) NOT NULL,
unit_price_usd INT NOT NULL, 
company_id INT NOT NULL,
company VARCHAR(50) NOT NULL, 
headquaters_phone_number CHAR(17)
);

INSERT INTO customer(first_name, last_name, email_address)
VALUE ('John', 'McKinley', 'john.mackinley@365careers.com');

INSERT INTO customer(first_name, last_name, email_address, number_of_complaints)
VALUE ('Elizabeth', 'McFarlane', 'e.mcfarlane@365careers.com', '2');