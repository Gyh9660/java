
create table freeboard2 (
    id number constraint PK_freeboard_id primary key, --자동 증가 컬럼
    name varchar2(100) not null,
    password varchar2(100) null,
    email varchar2(100) null,
    subject varchar2(100) not null, -- 글제목
    content varchar2(2000) not null, -- 글내용
    inputdate varchar2(100) not null, -- 글쓴 날짜
    masterid number default 0 , -- 질문답변형 게시판에서 답변의 글을 그룹핑할때 사용 
    readcount number default 0, -- 글 조회수
    replynum number default 0,  -- 질문답변형 게시판에서 답변의 글을 그룹핑할때 사용
    step number default 0  -- 질문답변형 게시판에서 답변의 글을 그룹핑할때 사용
    );
    
select * from freeboard2;