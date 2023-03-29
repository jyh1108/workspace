-- 한 줄 주석 

/*
범위
주석
*/

ALTER SESSION SET "_ORACLE_SCRIPT" = TRUE;
-- 사용자 계정생성
CREATE USER kh_jyh IDENTIFIED BY "oracle_jyh123A";
-- 사용자 계정에 권한 부여
GRANT RESOURCE, CONNECT TO kh_jyh;

--객체가 생성될 수 있는 공간 할당량 지정
ALTER USER kh_jyh DEFAULT TABLESPACE SYSTEM QUOTA UNLIMITED ON SYSTEM;


