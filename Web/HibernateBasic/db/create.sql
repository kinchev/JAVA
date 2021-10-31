create table beers
(
    beer_id     int auto_increment primary key,
    name        varchar(50)    not null,
    abv         decimal(10, 1) not null
);

create table users
(
    user_id     int auto_increment primary key,
    first_name  varchar(50)    not null,
    last_name   varchar(50)    not null,
    email       varchar(50)    not null
);