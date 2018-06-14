create database forum;
create user 'postgres'@'localhost' identified by password;
grant all on forum.* to 'postgres'@'localhost';

CREATE TABLE public."user"(
    id bigint NOT NULL CONSTRAINT user_pkey PRIMARY KEY
    username character varying(10) NOT NULL,
    password character varying(60) NOT NULL,
    introduction character varying(16),
    "createdDate" timestamp without time zone
)
WITH (OIDS = FALSE)
TABLESPACE pg_default;

ALTER TABLE public."user" OWNER to postgres;

CREATE TABLE public."topic"(
    id bigint NOT NULL CONSTRAINT user_pkey PRIMARY KEY
    title character varying(32) NOT NULL,
    content character varying(1024) NOT NULL,
    category character varying(16),
    "createdDate" timestamp without time zone,
    code character varying(1024)

)
WITH (OIDS = FALSE)
TABLESPACE pg_default;

ALTER TABLE public."topic" OWNER to postgres;

CREATE TABLE public."answer"(
    id bigint NOT NULL CONSTRAINT user_pkey PRIMARY KEY
    content character varying(1024) NOT NULL,
    useful boolean,
    "createdDate" timestamp without time zone,
    code character varying(1024)
)
WITH (OIDS = FALSE)
TABLESPACE pg_default;

ALTER TABLE public."topic" OWNER to postgres;