DROP TABLE IF EXISTS tb_cliente;

CREATE TABLE tb_cliente (
		 id_cliente BIGINT AUTO_INCREMENT NOT NULL,
		 nome VARCHAR(255) NULL,
		 renda DOUBLE NULL,
		 PRIMARY KEY (id_cliente));

CREATE TABLE tb_funcionario (
        id_funcionario BIGINT AUTO_INCREMENT NOT NULL,
        nome VARCHAR(255) NOT NULL,
        renda DOUBLE NOT NULL,
        cargo VARCHAR(255) NOT NULL,
        email VARCHAR(255) NULL,
        PRIMARY KEY (id_funcionario));