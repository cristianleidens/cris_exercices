DROP TABLE IF EXISTS client;

CREATE TABLE client (
		 id_client BIGINT AUTO_INCREMENT NOT NULL,
		 name VARCHAR(255) NULL,
		 income DOUBLE NULL,
		 PRIMARY KEY (id_client));

DROP TABLE IF EXISTS product;

CREATE TABLE product (
         id_product BIGINT AUTO_INCREMENT NOT NULL,
         name VARCHAR(255) NULL,
         price DOUBLE NULL,
         PRIMARY KEY (id_product));