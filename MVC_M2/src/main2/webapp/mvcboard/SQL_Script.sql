create table mvcboard (
    idx number primary key,
    name varchar2(50) not null,
    title varchar2(200) not null,
    content varchar2(2000) not null,
    postdate date default sysdate not null,
    ofile varchar2(200),
    afile varchar2(50),
    downcount number(5) default 0 not null,
    pass varchar2(50) not null,
    visitcount number default 0 not null
    );
    
create SEQUENCE seq_board_num
    INCREMENT by 1
    start with 1
    nocache;
    
-- 더미 데이터 입력 ( 5개 정도 값 입력    

insert into mvcboard (idx,name,title,content,pass)
values(SEQ_BOARD_NUM.nextval,'김유신','자료실 제목1 입니다','내용1','1234');

insert into mvcboard (idx,name,title,content,pass)
values(SEQ_BOARD_NUM.nextval,'장보고','자료실 제목2 입니다','내용2','1234');

insert into mvcboard (idx,name,title,content,pass)
values(SEQ_BOARD_NUM.nextval,'이순신','자료실 제목3 입니다','내용3','1234');

insert into mvcboard (idx,name,title,content,pass)
values(SEQ_BOARD_NUM.nextval,'강감찬','자료실 제목4 입니다','내용4','1234');

insert into mvcboard (idx,name,title,content,pass)
values(SEQ_BOARD_NUM.nextval,'대조영','자료실 제목5 입니다','내용5','1234');

commit;

select * from mvcboard;