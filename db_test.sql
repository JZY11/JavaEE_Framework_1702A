DROP DATABASE IF EXISTS db_test;
CREATE DATABASE db_test;

# user
DROP TABLE IF EXISTS db_test.user;
CREATE TABLE db_test.user (
 id       INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
 username VARCHAR(255),
 password VARCHAR(255)
);

SELECT *
FROM db_test.user;