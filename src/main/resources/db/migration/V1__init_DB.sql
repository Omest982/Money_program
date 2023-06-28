create table users (
    id bigint not null auto_increment,
    created datetime(6),
    updated datetime(6),
    email varchar(255) not null unique,
    password varchar(255) not null,
    role varchar(255),
    status varchar(255),
    username varchar(255) not null unique,
    primary key (id)
);
create table wallets (
    id bigint not null auto_increment,
    created datetime(6),
    updated datetime(6),
    money integer not null,
    name varchar(255),
    user_id bigint not null,
    primary key (id)
);
create table categories (
    id bigint not null auto_increment,
    created datetime(6),
    updated datetime(6),
    money integer not null,
    name varchar(255),
    budget integer not null,
    is_spend bit not null,
    user_id bigint not null,
    primary key (id)
);
create table transactions (
    id bigint not null auto_increment,
    created datetime(6),
    money integer not null,
    category_id bigint not null,
    user_id bigint not null,
    wallet_id bigint not null,
    primary key (id)
);

ALTER TABLE categories ADD CONSTRAINT FK_category_user FOREIGN KEY (user_id) REFERENCES users (id);
ALTER TABLE transactions ADD CONSTRAINT FK_transaction_category FOREIGN KEY (category_id) REFERENCES categories (id);
ALTER TABLE transactions ADD CONSTRAINT FK_transaction_user FOREIGN KEY (user_id) REFERENCES users (id);
ALTER TABLE transactions ADD CONSTRAINT FK_transaction_wallet FOREIGN KEY (wallet_id) REFERENCES wallets (id);
ALTER TABLE wallets ADD CONSTRAINT FK_wallet_user FOREIGN KEY (user_id) REFERENCES users (id);