
    set client_min_messages = WARNING;

    alter table if exists tasks 
       drop constraint if exists FKocg5h7sg0hfg92cfutkbvow4g;

    alter table if exists tasks 
       drop constraint if exists FK6s1ob9k4ihi75xbxe2w0ylsdh;

    drop table if exists tasks cascade;

    drop table if exists users cascade;
