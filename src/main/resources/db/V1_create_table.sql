CREATE TABLE if not exists products
(
    id          serial not null,
    ext_id      varchar(10),
    title       varchar(50),
    description varchar(150),
    price       varchar(20),
    currency    varchar(3),
    category    varchar(20),
    active      bool,

    PRIMARY KEY (id)
    );

insert into products (ext_id, title, description, price, currency, category, active) values
    ('EXT-001', 'iPhone 13 128GB', 'Smartphone Apple...', '18999.99', 'MXN', 'smartphones', true);
insert into products (ext_id, title, description, price, currency, category, active) values
    ('EXT-002', 'Samsung Galaxy S22', 'Gama alta...', '17499.50', 'MXN', 'smartphones', true);
insert into products (ext_id, title, description, price, currency, category, active) values
    ('EXT-003', 'MacBook Air M1', 'Laptop ligera...', '21999.00', 'MXN', 'laptops', true);
insert into products (ext_id, title, description, price, currency, category, active) values
    ('EXT-004', 'Dell XPS 13', 'Ultrabook premium...', '24999.99', 'MXN', 'laptops', true);
insert into products (ext_id, title, description, price, currency, category, active) values
    ('EXT-005', 'Audífonos Sony WH-1000XM4', 'Cancelación de ruido', '5999.00', 'MXN', 'audio', true);
