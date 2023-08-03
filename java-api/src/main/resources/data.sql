--SELECT * FROM CSVREAD('C:/work/Group20Project/java-api/src/main/resources/db-bonds-data.csv');

INSERT INTO BOOK
(name)
SELECT BOOK_NAME FROM CSVREAD('C:/work/Group20Project/java-api/src/main/resources/db-bonds-data.csv');

INSERT INTO SECURITY
(isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status)
SELECT isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status
FROM CSVREAD('C:/work/Group20Project/java-api/src/main/resources/db-bonds-data.csv');

INSERT INTO COUNTERPARTY
(name)
SELECT ISSUER_NAME FROM CSVREAD('C:/work/Group20Project/java-api/src/main/resources/db-bonds-data.csv');

INSERT INTO TRADES
(book_id, security_id, counterparty_id, currency, status, quantity, unit_price, trade_type, trade_date, trade_settlement_date)
SELECT id, id, id, currency, status, quantity, unit_price, trade_type, trade_date, trade_settlement_date
FROM CSVREAD('C:/work/Group20Project/java-api/src/main/resources/db-bonds-data.csv');

