-- 创建一个数据库
CREATE DATABASE	spring_jdbctemplate_crud;

USE spring_jdbctemplate_crud;

-- 创建两张表
-- departments部门表
CREATE TABLE departments (
	id INT(11) NOT NULL AUTO_INCREMENT,
	NAME VARCHAR(255) DEFAULT NULL,
	PRIMARY KEY(id)
) ENGINE = INNODB AUTO_INCREMENT = 4 DEFAULT CHARSET = gb2312
-- 给部门表添加一些数据
INSERT INTO departments (id,NAME) VALUES (1,'技术部') , (2,'人事部') , (3,'运营部');


-- employees员工表
CREATE TABLE employees(
	id INT(11) NOT NULL AUTO_INCREMENT,
	last_name VARCHAR(255) DEFAULT NULL,
	email VARCHAR(255) DEFAULT NULL,
	salary	DOUBLE(11,2) DEFAULT NULL,
	dept_id INT(11) DEFAULT NULL,
	PRIMARY KEY (id),
	KEY dept_id (dept_id),
	CONSTRAINT employees_ibfk_1 FOREIGN KEY (dept_id) REFERENCES departments (id) 
) ENGINE = INNODB AUTO_INCREMENT = 8 DEFAULT CHARSET = gb2312;

-- 为员工表添加一些数据
INSERT	INTO employees (id,last_name,email,salary,dept_id) VALUES 
	(1,'dalin','dalin@163.com',2000.00,1),
	(2,'zhangsan','zhangsan@qq.com',10000.00,2),
	(3,'lisi','lisi@sina.com',20000.00,1);