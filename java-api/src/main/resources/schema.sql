CREATE TABLE book (
id int NOT NULL  AUTO_INCREMENT,
Name varchar(255) NOT NULL,
PRIMARY KEY (id)
);


CREATE TABLE user_info
(
    id int NOT NULL  AUTO_INCREMENT,
    name varchar (255) NOT NULL,
    email varchar (255) NOT NULL,
    role varchar (255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE counterparty
(
    id int NOT NULL  AUTO_INCREMENT,
    name varchar (255) NOT NULL,
    PRIMARY KEY (id)
);

create table security
(
    id int NOT NULL AUTO_INCREMENT,
    isin VARCHAR(50) DEFAULT NULL,
    cusip VARCHAR(50) DEFAULT NULL,
    issuer_name VARCHAR(255) NOT NULL,
    maturity_date datetime NOT NULL,
    coupon FLOAT NOT NULL,
    type VARCHAR(255) NOT NULL,
    face_value FLOAT NOT NULL,
    currency VARCHAR(10) NOT NULL,
    status VARCHAR(32) DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE trades
(
    id int AUTO_INCREMENT PRIMARY KEY,
    book_id int NOT NULL,
    security_id int NOT NULL,
    counterparty_id int NOT NULL,
    currency varchar(10) NOT NULL,
    status varchar(32) NOT NULL,
    quantity int NOT NULL,
    unit_price float NOT NULL,
    buy_sell varchar(32) NOT NULL,
    trade_date datetime NOT NULL,
    settlement_date datetime NOT NULL,
    FOREIGN key (security_id) REFERENCES security (id),
    FOREIGN key (counterparty_id) REFERENCES counterparty (id),
    FOREIGN key (book_id) REFERENCES book (id)
);


create table book_user
(
    book_id int NOT NULL,
    user_id int NOT NULL,
    FOREIGN key (user_id) REFERENCES user_info (id),
    FOREIGN key (book_id) REFERENCES book (id)
);

ALTER TABLE book_user ADD PRIMARY KEY(book_id, user_id);

