CREATE TABLE va_jumin (
    JUMIN      VARCHAR(20) PRIMARY KEY, 
    NAME       VARCHAR(15),
    PHONE      VARCHAR(15),          
    ADDRESS    VARCHAR(50)
);
INSERT INTO va_jumin (JUMIN, NAME, PHONE, ADDRESS) VALUES 
('710101-1000001', '김주민', '010-1111-1111', '경기도 성남시 수정구 태평1동'),
('720101-2000001', '이주민', '010-1111-2222', '경기도 성남시 수정구 태평2동'),
('730101-1000001', '박주민', '010-1111-3333', '경기도 성남시 수정구 복정동'),
('740101-2000001', '홍주민', '010-1111-4444', '경기도 성남시 수정구 산성동'),
('750101-1000001', '조주민', '010-1111-5555', '경기도 성남시 중원구 성남동'),
('760101-2000001', '최주민', '010-1111-6666', '경기도 성남시 중원구 중앙동'),
('770101-1000001', '장주민', '010-1111-7777', '경기도 성남시 중원구 상대원동'),
('780101-2000001', '정주민', '010-1111-8888', '경기도 성남시 중원구 하대원동'),
('790101-1000001', '강주민', '010-1111-9999', '경기도 성남시 분당구 야탑1동'),
('800101-2000001', '신주민', '010-2222-1111', '경기도 성남시 분당구 야탑2동');
select * from va_jumin;
-- ===================================================================
CREATE TABLE va_hosp (
    HOSPCODE   CHAR(4) PRIMARY KEY,
    HOSPNAME   VARCHAR(40),           
    HOSPTEL    VARCHAR(15),           
    HOSPADDR   VARCHAR(50)
);
INSERT INTO va_hosp (HOSPCODE, HOSPNAME, HOSPTEL, HOSPADDR) VALUES 
('H001', '가_병원', '031-111-2222', '10'),
('H002', '나_병원', '031-111-3333', '20'),
('H003', '다_병원', '031-111-4444', '30'),
('H004', '라_병원', '031-111-5555', '40');
select * from va_hosp;
-- ===================================================================
CREATE TABLE va_vacc_resv (
    RESVNO     NUMERIC(8) PRIMARY KEY,
    JUMIN      VARCHAR(20) NOT NULL REFERENCES va_jumin(JUMIN), 
    HOSPCODE   CHAR(4) NOT NULL REFERENCES va_hosp(HOSPCODE), 
    RESVDATE   DATE,                
    RESVTIME   VARCHAR(4),           
    VCODE      CHAR(4)          
);
INSERT INTO va_vacc_resv (RESVNO, JUMIN, HOSPCODE, RESVDATE, RESVTIME, VCODE) VALUES 
(20210001, '710101-1000001', 'H001', '2021-08-01', '0930', 'V001'),
(20210002, '720101-2000001', 'H002', '2021-08-01', '1030', 'V002'),
(20210003, '730101-1000001', 'H003', '2021-08-01', '1130', 'V003'),
(20210004, '740101-2000001', 'H001', '2021-08-01', '1230', 'V001'),
(20210005, '750101-1000001', 'H001', '2021-08-01', '1330', 'V002'),
(20210006, '760101-2000001', 'H002', '2021-08-01', '1430', 'V003'),
(20210007, '770101-1000001', 'H003', '2021-08-01', '1530', 'V001'),
(20210008, '780101-2000001', 'H001', '2021-08-01', '1630', 'V002'),
(20210009, '790101-1000001', 'H001', '2021-08-01', '1730', 'V003'),
(20210010, '800101-2000001', 'H002', '2021-08-01', '1830', 'V001');
select * from va_vacc_resv;
-- ===================================================================
SELECT 
    r.RESVNO,
    j.NAME,
    j.JUMIN,
    h.HOSPNAME,
    r.RESVDATE,
    r.RESVTIME,
    r.VCODE,
    h.HOSPADDR
FROM va_vacc_resv r
JOIN va_jumin j ON r.JUMIN = j.JUMIN
JOIN va_hosp h ON r.HOSPCODE = h.HOSPCODE
WHERE r.RESVNO = 20210001;