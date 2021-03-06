select * from member;

drop table member;

create table member (
    id varchar2(10) not null,
    pass varchar2(10) not null,
    name varchar2(30) not null,
    regidate date default sysdate not null,
    primary key (id)
);
--더미 데이터 입력
insert into member ( id, pass, name)
values ('admin','1234','관리자');

insert into member ( id, pass, name)
values ('hong','1234','홍길동');

select * from member;

commit;

-- 회원 등급을 나타내는 컬럼

create table member03 (
    id varchar2(10) not null,
    pass varchar2(10) not null,
    name varchar2(30) not null,
    regidate date default sysdate not null,
    grade varchar2(50) not null, 
    primary key (id)
);

--더미 데이터 입력
insert into member03 ( id, pass, name,grade)
values ('admin','1234','관리자','vip');

insert into member03 ( id, pass, name,grade)
values ('hong','1234','홍길동','gold');

insert into member03 ( id, pass, name,grade)
values ('kim','1234','김유신','silver');

select * from member03;

commit;
