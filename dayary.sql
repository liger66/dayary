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

insert into diary values (seq_diary_id.nextval, 'liger66', '첫번재 작성222', '첫번째 222작성 내용이다.', sysdate);
