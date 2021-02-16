CREATE DATABASE OnionArchDemo;

USE OnionArchDemo;

CREATE TABLE Users (
    Username VARCHAR(100) PRIMARY KEY,
    Password VARCHAR(100) NOT NULL,
    Fullname VARCHAR(100),
    Roles VARCHAR(100) NOT NULL,
    Description NVARCHAR(MAX)
)