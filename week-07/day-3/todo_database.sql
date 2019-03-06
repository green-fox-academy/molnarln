CREATE DATABASE todo_app_database;
SHOW DATABASES;
USE todo_app_database;
CREATE TABLE Tasks(
Name varchar(255),
Description varchar(255),
State enum('yes', 'no')
);
describe tasks;
ALTER TABLE tasks ADD COLUMN ID INT NOT NULL auto_increment primary key;

describe tasks;


