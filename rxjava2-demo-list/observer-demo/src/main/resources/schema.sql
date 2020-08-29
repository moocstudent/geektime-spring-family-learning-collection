drop table t_coffee if exists;
drop table t_order if exists;

create table t_coffee (
    id bigint auto_increment,
    name varchar(255),
    primary key (id)
);

create table t_order (
    id bigint auto_increment,
    customer varchar(255),
    item bigint,
    primary key (id)
);