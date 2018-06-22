create user commitnpush identified by 111111111;
grant dba to commitnpush;

create table diary (
    id number primary key,
    u_id varchar2(15),
    title varchar2(50),
    content clob,
    regdate date
);

create sequence seq_diary_id;

insert into diary values (seq_diary_id.nextval, 'liger66', '3번재 작성333', '2번째 333 내용이다.', sysdate);
select * from diary;

create table member (
    id varchar2(10) primary key,
    password varchar2(10),
    name varchar2(30),
    email varchar2(30) unique,
    gender char(1) check(gender in('m','f'))
);