create table USER
(
    ID           INT auto_increment,
    NAME         VARCHAR not null,
    SURNAME      VARCHAR not null,
    ROLE         VARCHAR,
    LOGIN        VARCHAR not null,
    PASSWORD     VARCHAR not null,
    CRUISE_ID    INT,
    EXCURSION_ID INT,
    constraint USER_PK
        primary key (ID)
);

create table PORTS
(
    ID   INT auto_increment,
    NAME VARCHAR not null,
    constraint PORTS_PK
        primary key (ID)
);

create table SHIP
(
    ID       INT auto_increment,
    NAME     VARCHAR not null,
    CAPACITY INT     not null,
    constraint SHIP_PK
        primary key (ID)
);

create table CRUISESTOPS
(
    ID_CRUISE INT not null,
    ID_PORT   INT not null
);

create table EXCURSION
(
    ID   INT auto_increment,
    NAME VARCHAR not null,
    COST INT     not null,
    constraint EXCURSION_PK
        primary key (ID)
);

create table CRUISE
(
    ID       INT auto_increment,
    NAME     VARCHAR not null,
    DURATION INT     not null,
    constraint CRUISE_PK
        primary key (ID)
);

