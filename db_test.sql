DROP DATABASE IF EXISTS db_test;
CREATE DATABASE db_test;

# user
DROP TABLE IF EXISTS db_test.user;
CREATE TABLE db_test.user (
 id       INT UNSIGNED AUTO_INCREMENT PRIMARY KEY COMMENT 'ID PK',
 username VARCHAR(255) NOT NULL UNIQUE  COMMENT '用户名',
 password VARCHAR(255) NOT NULL COMMENT '密码',
 lastTime DATETIME COMMENT '用户最后一次登录时间'
)COMMENT '用户表';

# student table
DROP TABLE IF EXISTS db_test.student;
CREATE TABLE db_test.student (
 id       INT UNSIGNED AUTO_INCREMENT PRIMARY KEY COMMENT 'ID PK',
 name VARCHAR(255) NOT NULL UNIQUE  COMMENT '学生姓名',
 age INT COMMENT '年龄',
 height DOUBLE COMMENT '身高',
 married VARCHAR(255) COMMENT '婚否'
)COMMENT '学生表';

DROP TABLE IF EXISTS db_test.demo;
CREATE TABLE db_test.demo(
 id INT AUTO_INCREMENT PRIMARY KEY COMMENT 'ID PK',
 name VARCHAR(255) NOT NULL UNIQUE COMMENT '姓名'
)COMMENT '测试表';

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

SELECT *
FROM db_test.book;

SELECT count(*)
FROM db_test.book;

SELECT *
FROM db_test.demo;

INSERT INTO db_test.book VALUES (NULL ,'title...','author...','2017-01-01','123.45');

SELECT *
FROM db_test.student;

TRUNCATE db_test.user;

TRUNCATE db_test.book;

desc db_test.user;

SELECT *
FROM db_test.demo;

INSERT INTO db_test.demo VALUES (NULL, 'name...');

