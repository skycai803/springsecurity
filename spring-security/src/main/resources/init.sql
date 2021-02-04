create database dev;
use dev;
show tables;

create table users(
id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
username VARCHAR(30) NOT NULL,
password VARCHAR(60) NOT NULL,
role VARCHAR(10) NOT NULL
);

insert into users (
    password,
    role,
    username)
values (
-- https://bcrypt-generator.com/ to generate bcrypt string
    '$2y$12$Md3D8R1Xsrs9iCM/UmrsluIitrepiGQ4td4ogwsJapOhcr3wuKoyi',
    'ADMIN',
    'sky')
;
