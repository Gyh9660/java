--10. 이름을 인풋 받아서 사원명, 급여, 부서번호, 부서명, 부서위치을 
--OUT 파라미터에 넘겨주는 프로시저를 PL / SQL에서 호출
create or replace procedure out1(
    v_name in employee.ename%type,
    v_ename out varchar2,
    v_salary out number,
    v_dno out number,
    v_dname out varchar2,
    v_loc out varchar2
)
is

begin
    select e.ename, e.salary, d.dno ,d.dname,d.loc into v_ename,v_salary,v_dno,v_dname,v_loc
    from employee e,department d
    where e.dno = d.dno
    and e.ename = v_name;

end;
/

select * from employee;
select * from department;

declare
    v_ename varchar2(20);
    v_salary number(20);
    v_dno number(20);
    v_dname varchar2(20);
    v_loc varchar2(20);
begin
    out1 ('KING',v_ename,v_salary,v_dno,v_dname,v_loc);
    dbms_output.put_line('사원이름 : '||v_ename||', 급여 : '||v_salary||', 부서번호 : '||v_dno||', 부서이름 : '||v_dname||', 부서위치 : '||v_loc);
end;
/

--11. 사원번호를 받아서 사원명, 급여, 직책,부서명,부서위치를 OUT 파라미터에 넘겨주는 프로시저를 PL / SQL에서 호출
create or replace procedure out2(
    v_eno in number,
    v_ename out varchar2,
    v_salary out number,
    v_job out varchar2,
    v_dname out varchar2,
    v_loc out varchar2
)
is
begin
    select e.ename, e.salary,e.job,d.dname,d.loc into v_ename,v_salary,v_job,v_dname,v_loc
    from employee e, department d
    where e.dno= d.dno
    and e.eno =v_eno;

end;
/

declare
    v_ename varchar2(20);
    v_salary number(20);
    v_job varchar2(20);
    v_dname varchar2(20);
    v_loc varchar2(20);
begin
    out2(7788,v_ename,v_salary,v_job,v_dname,v_loc);
    dbms_output.put_line('출력결과 : '||v_ename||'   '||v_salary||'   '||v_job||'   '||v_dname||'   '||v_loc);
end;
/
--11-1. 부서번호를 받아서 사원명, 급여, 직책을 OUT 파라미터에 넘겨주는 프로시저를 PL / SQL에서 호출
--모르겟다 이건 
create or replace procedure out23(
    v_dno in number,
    c1 out sys_refcursor
)
is
begin
    open c1 for
    select ename, salary,job
    from employee
    where dno = v_dno;

end;
/
declare
    v_ename employee.ename%type;
    v_salary employee.salary%type;
    v_job employee.job%type;
    v_dno employee.dno%type;
    c1 sys_refcursor;
begin
    out23(10,c1);
    loop
        fetch c1 into v_ename,v_salary,v_job;
        exit when c1%notfound;
        dbms_output.put_line(v_ename||' '||v_salary||' '||v_job);
    end loop; -- dbms~_line 쓸때 연결 ||' '||로해야함 ,로하면 오류발생
    close c1;
end;
/