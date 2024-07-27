create table administer
(
    ADMINISTER_USERNAME varchar(30) not null
        primary key,
    ADMINISTER_PASSWORD varchar(30) not null
);

create table stuff
(
    STUFF_ID_NUMBER    int auto_increment
        primary key,
    STUFF_NAME         varchar(30) not null,
    STUFF_GENDER       varchar(10) not null,
    STUFF_AGE          int         not null,
    STUFF_PHONE_NUMBER varchar(50) not null,
    STUFF_JOB          varchar(30) not null,
    STUFF_EMAIL        varchar(50) null
);

create table task
(
    TASK_NUMBER       int auto_increment
        primary key,
    TASK_SUBJECT      varchar(100)              not null,
    CAPTAIN_NUMBER    int                       not null,
    TASK_RELEASE_TIME timestamp default (now()) null,
    TASK_LOCATION     varchar(150)              not null,
    TASK_DESCRIPTION  varchar(500)              not null,
    TASK_STATE        varchar(50)               not null,
    constraint task_stuff_STUFF_ID_NUMBER_fk
        foreign key (CAPTAIN_NUMBER) references stuff (STUFF_ID_NUMBER)
);

create table user
(
    USER_USERNAME                varchar(50)          null,
    USER_PASSWORD                varchar(50)          not null,
    USER_NICKNAME                varchar(30)          null,
    USER_ID_NUMBER               varchar(40)          not null
        primary key,
    USER_NAME                    varchar(30)          null,
    USER_GENDER                  varchar(8)           null,
    USER_AGE                     int                  null,
    USER_PHONE_NUMBER            varchar(50)          null,
    USER_EMAIL                   varchar(50)          null,
    USER_VOLUNTEER_QUALIFICATION tinyint(1) default 0 null
);

create table pet
(
    PET_NUMBER           int auto_increment
        primary key,
    PET_NAME             varchar(50)  null,
    PET_GENDER           varchar(50)  not null,
    PET_BREED            varchar(50)  not null,
    PET_AGE              int          null,
    PET_ADOPTER_ID       varchar(50)  null,
    PET_HEALTH_CONDITION varchar(500) null,
    PET_PHOTO            varchar(100) null,
    PET_DISPOSITION      varchar(30)  null,
    constraint pet_ibfk_1
        foreign key (PET_ADOPTER_ID) references user (USER_ID_NUMBER)
);

create table adoption
(
    ADOPTION_NUMBER     int auto_increment
        primary key,
    ADOPTER_NUMBER      varchar(50)                                                        not null,
    ADOPTION_PET_NUMBER int                                                                not null,
    ADOPTION_TIME       timestamp                                default CURRENT_TIMESTAMP not null,
    ADOPTION_SKETCH     varchar(500)                                                       not null,
    CHECK_STATE         enum ('UNCHECKED', 'PASSED', 'REJECTED') default 'UNCHECKED'       null,
    constraint adoption_pet_PET_NUMBER_fk
        foreign key (ADOPTION_PET_NUMBER) references pet (PET_NUMBER),
    constraint adoption_user_USER_ID_NUMBER_fk
        foreign key (ADOPTER_NUMBER) references user (USER_ID_NUMBER)
);

create index adopter_id
    on pet (PET_ADOPTER_ID);


