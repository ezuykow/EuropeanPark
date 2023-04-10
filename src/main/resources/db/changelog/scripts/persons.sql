-- liquibase formatted sql

-- changeset ezuykow:1
CREATE TABLE persons (
    tg_user_id BIGINT PRIMARY KEY ,
    tg_username VARCHAR(100) NOT NULL UNIQUE ,
    first_name VARCHAR(100) NOT NULL ,
    last_name VARCHAR(100) ,
    role VARCHAR(100) NOT NULL DEFAULT 'guest' ,
    entrance INT ,
    floor INT ,
    flat_number INT ,
    phone_number VARCHAR(25) ,
    car_number VARCHAR(10) ,
    parking_number VARCHAR(10) ,
    rating INT NOT NULL DEFAULT 0
);