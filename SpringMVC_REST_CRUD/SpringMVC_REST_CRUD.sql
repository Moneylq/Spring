-- 创建数据库springMVC_REST
CREATE DATABASE springMVC_REST;

USE springMVC_REST;

-- 创建部门表
CREATE TABLE departments(
	id INT(11) NOT NULL AUTO_INCREMENT,
	NAME VARCHAR(255) DEFAULT NULL,
	PRIMARY KEY(id)
) ENGINE = INNODB AUTO_INCREMENT 4 DEFAULT CHARSET = gb2312

-- 创建员工表
CREATE TABLE employees (
	id INT(11) NOT NULL AUTO_INCREMENT,
	last_name VARCHAR(255) DEFAULT NULL,
	email VARCHAR(255) DEFAULT NULL,
	gender INT(11) DEFAULT NULL,
	dept_id INT(11) DEFAULT NULL,
	PRIMARY KEY (id),
	KEY dept_id (dept_id),
	CONSTRAINT employees_ibfk_1 FOREIGN KEY(dept_id) REFERENCES departments (id)
) ENGINE = INNODB AUTO_INCREMENT 8 DEFAULT CHARSET = gb2312

-- 给部门表添加一些数据
INSERT INTO departments (id,NAME) VALUES (1,"技术部"),(2,"运行部"),(3,"人事部");

-- 给员工表添加一些数据
INSERT INTO employees (id,last_name,email,gender,dept_id) VALUES 
(1,"张三","zs@qq.com","1",1),
(2,"李四","ls@sina.com","0",2),
(3,"王五","ww@qq.com","1",3),
(4,"赵六","zl@qq.com","0",2)

