create table topic
(
    id               serial not null
        constraint topic_pk
            primary key,
    title            varchar(255),
    description      varchar(255),
    additionalsource varchar(255),
    complete         boolean,
    creationdate     timestamp,
    completedate     timestamp,
    alerttime        timestamp,
    alarmstatus       boolean
);

alter table topic
    owner to postgres;
