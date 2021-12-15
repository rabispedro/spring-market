INSERT INTO tb_clients(id, name, email) VALUES(null, 'Alex Green', 'alex@gmail.com')

INSERT INTO tb_products(id, name, price) VALUES(null, 'TV', 1000.00)
INSERT INTO tb_products(id, name, price) VALUES(null, 'Mouse', 40.00)
INSERT INTO tb_products(id, name, price) VALUES(null, 'PC', 1200.00)

INSERT INTO tb_orders(id, moment, status, client_id) VALUES(null, '2021-04-18T11:25:09Z', 1, 1)
INSERT INTO tb_orders(id, moment, status, client_id) VALUES(null, '2021-04-20T13:30:00Z', 0, 1)

INSERT INTO tb_order_items(id, quantity, price, product_id, order_id) VALUES(null, 1, 1000.00, 1, 1)
INSERT INTO tb_order_items(id, quantity, price, product_id, order_id) VALUES(null, 2, 40.00, 2, 1)
INSERT INTO tb_order_items(id, quantity, price, product_id, order_id) VALUES(null, 1, 40.00, 2, 2)
INSERT INTO tb_order_items(id, quantity, price, product_id, order_id) VALUES(null, 1, 12000.00, 3, 2)
