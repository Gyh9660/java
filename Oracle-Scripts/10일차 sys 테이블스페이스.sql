--보기 -> dba -> + -> sys계정 -> 저장영역 ->테이블스페이스

--테이블 스페이스 : 객체와 로그를 저장하는 물리적인 파일
    --DataFile : 객체를 저장하고 있다. (테이블,뷰,인덱스....)
    --Log : Transaction Log 를 저장
    
/* 계정명 : wine_account
    암호 :1234
    기본 테이블 스페이스 : A_HDD / WINE_DATAFILE / 100m / ++100m 무제한
    임시 테이블 스페이스 : B_HDD / WINE_LOG      / 100m / ++100m 1GB
    
    테이블 10개 생성후 각 테이블에 값(레코드) 3개씩 추가
    
*/
grant create any directory to HR;