DROP DATABASE IF EXISTS db_test;
CREATE DATABASE db_test;

# user
DROP TABLE IF EXISTS db_test.user;
CREATE TABLE db_test.user (
 id       INT UNSIGNED AUTO_INCREMENT PRIMARY KEY COMMENT 'ID PK',
 username VARCHAR(255) UNIQUE  COMMENT '用户名',
 password VARCHAR(255) COMMENT '密码'
)COMMENT '用户表';

DROP TABLE IF EXISTS db_test.book;
CREATE TABLE db_test.book (
 id       INT UNSIGNED AUTO_INCREMENT PRIMARY KEY COMMENT 'ID PK',
 title VARCHAR(255) NOT NULL COMMENT '书名',
 author VARCHAR(255) NOT NULL COMMENT '作者',
 date DATE NOT NULL COMMENT '出版日期',
 price DECIMAL NOT NULL COMMENT '定价'
)COMMENT '图书表';

SELECT *
FROM db_test.user;

TRUNCATE db_test.user;