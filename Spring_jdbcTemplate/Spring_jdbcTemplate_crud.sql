-- 创建一个数据库
CREATE DATABASE	spring_jdbctemplate_crud;

USE spring_jdbctemplate_crud;

-- 创建两张表
-- employees员工表
CREATE TABLE employees(
	id INT(11) NOT NULL AUTO_INCREMENT,
	last_name VARCHAR(255) DEFAULT NULL,
	email VARCHAR(255) DEFAULT NULL,
	salary	DOUBLE(11,2) DEFAULT NULL,
	
)
