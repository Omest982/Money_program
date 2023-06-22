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

create table category_earns (
    id bigint not null auto_increment,
    created datetime(6),
    updated datetime(6),
    money integer not null,
    name varchar(255),
    user_id bigint not null,
    primary key (id)
);

create table category_spends (
    id bigint not null auto_increment,
    created datetime(6), updated datetime(6),
    money integer not null, name varchar(255),
    budget integer not null,
    user_id bigint not null,
    primary key (id)
);

create table transaction_earns (
    id bigint not null auto_increment,
    created datetime(6),
    money integer not null,
    user_id bigint not null,
    wallet_id bigint not null,
    category_earn_id bigint not null,
    primary key (id)
);

create table transaction_spends (
    id bigint not null auto_increment,
    created datetime(6),
    money integer not null,
    user_id bigint not null,
    wallet_id bigint not null,
    category_spend_id bigint not null, primary key (id)
);

ALTER TABLE category_earns ADD CONSTRAINT FK_category_earns_user FOREIGN KEY (user_id) REFERENCES users (id);
ALTER TABLE category_spends ADD CONSTRAINT FK_category_spends_user FOREIGN KEY (user_id) REFERENCES users (id);
ALTER TABLE transaction_earns ADD CONSTRAINT FK_transactions_earns_user FOREIGN KEY (user_id) REFERENCES users (id);
ALTER TABLE transaction_earns ADD CONSTRAINT FK_transactions_earns_wallet FOREIGN KEY (wallet_id) REFERENCES wallets (id);
ALTER TABLE transaction_earns ADD CONSTRAINT FK_transactions_earns_category_earn FOREIGN KEY (category_earn_id) REFERENCES category_earns (id);
ALTER TABLE transaction_spends ADD CONSTRAINT FK_transactions_spends_user FOREIGN KEY (user_id) REFERENCES users (id);
ALTER TABLE transaction_spends ADD CONSTRAINT FK_transactions_spends_wallet FOREIGN KEY (wallet_id) REFERENCES wallets (id);
ALTER TABLE transaction_spends ADD CONSTRAINT FK_transactions_spends_category_spends FOREIGN KEY (category_spend_id) REFERENCES category_spends (id);
ALTER TABLE wallets ADD CONSTRAINT FK_wallets_user FOREIGN KEY (user_id) REFERENCES users (id);