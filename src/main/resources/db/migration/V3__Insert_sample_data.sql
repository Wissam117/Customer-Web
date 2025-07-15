-- Insert TV product categories
INSERT INTO categories (id, name, description, active) VALUES (category_seq.NEXTVAL, 'DTH', 'Direct-to-Home satellite television services', 1);
INSERT INTO categories (id, name, description, active) VALUES (category_seq.NEXTVAL, 'OTT', 'Over-the-Top streaming services', 1);
INSERT INTO categories (id, name, description, active) VALUES (category_seq.NEXTVAL, 'IPTV', 'Internet Protocol Television services', 1);
INSERT INTO categories (id, name, description, active) VALUES (category_seq.NEXTVAL, 'Broadband', 'High-speed internet services', 1);

-- Insert sample suppliers
INSERT INTO suppliers (id, name, email, phone_number, address, active) VALUES
(supplier_seq.NEXTVAL, 'TechVision Ltd', 'contact@techvision.com', '+1-555-0101', '123 Tech Street, Silicon Valley, CA', 1);

INSERT INTO suppliers (id, name, email, phone_number, address, active) VALUES
(supplier_seq.NEXTVAL, 'StreamMax Corp', 'sales@streammax.com', '+1-555-0102', '456 Stream Ave, Los Angeles, CA', 1);

INSERT INTO suppliers (id, name, email, phone_number, address, active) VALUES
(supplier_seq.NEXTVAL, 'ConnectNet Solutions', 'info@connectnet.com', '+1-555-0103', '789 Network Blvd, Austin, TX', 1);

-- Insert sample products
INSERT INTO products (id, name, description, price, image_url, active, category_id) VALUES
(product_seq.NEXTVAL, 'Premium DTH Package', 'Complete DTH solution with 200+ channels including HD channels', 49.99, '/images/dth-premium.jpg', 1,
(SELECT id FROM categories WHERE name = 'DTH'));

INSERT INTO products (id, name, description, price, image_url, active, category_id) VALUES
(product_seq.NEXTVAL, 'Netflix Premium Subscription', '4K streaming with multiple device support', 15.99, '/images/netflix.jpg', 1,
(SELECT id FROM categories WHERE name = 'OTT'));

INSERT INTO products (id, name, description, price, image_url, active, category_id) VALUES
(product_seq.NEXTVAL, 'Ultra IPTV Service', 'High-definition IPTV with video on demand', 29.99, '/images/iptv-ultra.jpg', 1,
(SELECT id FROM categories WHERE name = 'IPTV'));

INSERT INTO products (id, name, description, price, image_url, active, category_id) VALUES
(product_seq.NEXTVAL, 'Fiber Broadband 100Mbps', 'High-speed fiber internet connection', 39.99, '/images/fiber-100.jpg', 1,
(SELECT id FROM categories WHERE name = 'Broadband'));

-- Insert sample customer
INSERT INTO customers (id, first_name, last_name, email, password, phone_number) VALUES
(customer_seq.NEXTVAL, 'John', 'Doe', 'john.doe@email.com', 'password123', '+1-555-1234');

-- Insert sample address
INSERT INTO addresses (id, street, city, state, zip_code, country, is_default, customer_id) VALUES
(address_seq.NEXTVAL, '123 Main Street', 'New York', 'NY', '10001', 'USA', 1,
(SELECT id FROM customers WHERE email = 'john.doe@email.com'));

-- Insert sample cart
INSERT INTO carts (id, customer_id) VALUES
(cart_seq.NEXTVAL, (SELECT id FROM customers WHERE email = 'john.doe@email.com'));

-- Link products to suppliers
INSERT INTO product_suppliers (product_id, supplier_id) VALUES
((SELECT id FROM products WHERE name = 'Premium DTH Package'), (SELECT id FROM suppliers WHERE name = 'TechVision Ltd'));

INSERT INTO product_suppliers (product_id, supplier_id) VALUES
((SELECT id FROM products WHERE name = 'Netflix Premium Subscription'), (SELECT id FROM suppliers WHERE name = 'StreamMax Corp'));

INSERT INTO product_suppliers (product_id, supplier_id) VALUES
((SELECT id FROM products WHERE name = 'Ultra IPTV Service'), (SELECT id FROM suppliers WHERE name = 'TechVision Ltd'));

INSERT INTO product_suppliers (product_id, supplier_id) VALUES
((SELECT id FROM products WHERE name = 'Fiber Broadband 100Mbps'), (SELECT id FROM suppliers WHERE name = 'ConnectNet Solutions'));

-- Insert sample inventory
INSERT INTO inventory (id, quantity, reserved_quantity, product_id, supplier_id) VALUES
(inventory_seq.NEXTVAL, 100, 5, (SELECT id FROM products WHERE name = 'Premium DTH Package'), (SELECT id FROM suppliers WHERE name = 'TechVision Ltd'));

INSERT INTO inventory (id, quantity, reserved_quantity, product_id, supplier_id) VALUES
(inventory_seq.NEXTVAL, 1000, 0, (SELECT id FROM products WHERE name = 'Netflix Premium Subscription'), (SELECT id FROM suppliers WHERE name = 'StreamMax Corp'));

INSERT INTO inventory (id, quantity, reserved_quantity, product_id, supplier_id) VALUES
(inventory_seq.NEXTVAL, 50, 2, (SELECT id FROM products WHERE name = 'Ultra IPTV Service'), (SELECT id FROM suppliers WHERE name = 'TechVision Ltd'));

INSERT INTO inventory (id, quantity, reserved_quantity, product_id, supplier_id) VALUES
(inventory_seq.NEXTVAL, 75, 3, (SELECT id FROM products WHERE name = 'Fiber Broadband 100Mbps'), (SELECT id FROM suppliers WHERE name = 'ConnectNet Solutions'));

COMMIT;