INSERT INTO CLIENTES (name,lastname,dni) VALUES
('Tito', 'Calderón', 12345678),
('Rusty', 'Curly', 91011121),
('Mico', 'Lawrie', 31415161);

INSERT INTO PRODUCTOS (description,code,stock,price) VALUES
('Fideos MAROLIO', 'Marolio', 3, 1200),
('Galletas DIVERSION', 'Diversión', 4, 2500),
('Gaseosa SPRITE', 'Sprite', 5, 3000);

INSERT INTO INVOICE (client_id,total) VALUES
(1, 50.00),
(2, 10.20),
(3, 74.89);

INSERT INTO INVOICE_DETAILS (invoice_id,amount,product_id,price) VALUES
(1, 5000, 1, 234.55),
(2, 6465, 2, 678.88);