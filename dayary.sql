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

insert into diary values (seq_diary_id.nextval, 'liger66', 'ù���� �ۼ�222', 'ù��° 222�ۼ� �����̴�.', sysdate);
