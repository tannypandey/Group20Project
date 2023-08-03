SELECT * FROM CSVREAD('C:\Users\Admin\Downloads\db-bonds-data.csv')

SELECT * FROM BOOK 

INSERT INTO BOOK
(name)
SELECT BOOK_NAME FROM CSVREAD('C:\Users\Admin\Downloads\db-bonds-data.csv')

INSERT INTO SECURITY
(isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status)
SELECT isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status FROM CSVREAD('C:\Users\Admin\Downloads\db-bonds-data.csv')
