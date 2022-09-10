INSERT INTO customers(name) VALUES ('Vambud');
INSERT INTO customers(name) VALUES ('IF-molokozavod');
INSERT INTO customers(name) VALUES ('IF-molokozavod');

INSERT INTO transporters(name) VALUES ('Super Delivery');
INSERT INTO transporters(name) VALUES ('Pershyj pereviznyk');

INSERT INTO users(first_name,last_name, email, role, activated, customer_id, password) VALUES('Taras','Halynskyi', 'taras@gmail.com', 'CUSTOMER_USER', true, 1, '$2a$10$JGBiypjUOMYtmc/dTYg8tOIBI29h6ouGp8q9ZKaBwca3QO0kCj9we');
INSERT INTO users(first_name,last_name, email, role, activated, customer_id, password) VALUES('Andrii','Liulka', 'andrii@gmail.com', 'CUSTOMER_USER', true, 2, '$2a$10$JGBiypjUOMYtmc/dTYg8tOIBI29h6ouGp8q9ZKaBwca3QO0kCj9we');
INSERT INTO users(first_name,last_name, email, role, activated, customer_id, password) VALUES('Vitalii','Piven', 'vitalii@gmail.com', 'CUSTOMER_USER', true, 3, '$2a$10$JGBiypjUOMYtmc/dTYg8tOIBI29h6ouGp8q9ZKaBwca3QO0kCj9we');
INSERT INTO users(first_name,last_name, email, role, activated, transporter_id, password) VALUES('Serhiy','Nemikov', 'serhiy@gmail.com', 'TRANSPORTER_USER', true, 1, '$2a$10$JGBiypjUOMYtmc/dTYg8tOIBI29h6ouGp8q9ZKaBwca3QO0kCj9we');
INSERT INTO users(first_name,last_name, email, role, activated, transporter_id, password) VALUES('Dmytro','Sakhman', 'dmytro@gmail.com', 'TRANSPORTER_USER', true, 2, '$2a$10$JGBiypjUOMYtmc/dTYg8tOIBI29h6ouGp8q9ZKaBwca3QO0kCj9we');

INSERT INTO goods(weight,weight_unit,volume_unit,name,customer_id) VALUES(26,'TON','CUBIC_METER','Soap',1);
INSERT INTO goods(weight,weight_unit,volume,volume_unit,name,customer_id) VALUES(30,'KILOGRAM',30,'LITER','Water',2);
INSERT INTO goods(weight,weight_unit,name,customer_id) VALUES(5,'TON','Sand',3);
INSERT INTO goods(weight,weight_unit,name,customer_id) VALUES(10,'TON','Land',1);
INSERT INTO goods(weight,weight_unit,name,customer_id) VALUES(300,'KILOGRAM','Toys',2);

INSERT INTO deliveries(capacity,creation_date,departure_date,receiving_date,destination,is_paid,price,source,state,transporter_id) VALUES(26,CURRENT_DATE,null,null,'Kharkiv',false,2000,'Ternopil','not sent',1);
INSERT INTO deliveries(capacity,creation_date,departure_date,receiving_date,destination,is_paid,price,source,state,transporter_id) VALUES(15,CURRENT_DATE,null,null,'Kiev',false,3000,'Ternopil','sent',2);
INSERT INTO deliveries(capacity,creation_date,departure_date,receiving_date,destination,is_paid,price,source,state,transporter_id) VALUES(19,CURRENT_DATE,null,null,'Kiev',false,1500,'Ternopil','sent',2);


INSERT INTO offers(conditions,transporter_id,delivery_id) VALUES('None',1,1);
INSERT INTO offers(conditions,transporter_id,delivery_id) VALUES('None',1,2);
INSERT INTO offers(conditions,transporter_id,delivery_id) VALUES('Only not far',2,3);


INSERT INTO goods_deliveries(good_id,delivery_id) VALUES(2,1);
INSERT INTO goods_deliveries(good_id,delivery_id) VALUES(1,1);
INSERT INTO goods_deliveries(good_id,delivery_id) VALUES(3,3);

INSERT INTO goods_deliveries(good_id,delivery_id) VALUES(3,2);
INSERT INTO goods_deliveries(good_id,delivery_id) VALUES(4,2);
