CREATE TABLE categories (
    id NUMBER(19) PRIMARY KEY,
    name VARCHAR2(255) NOT NULL UNIQUE,
    description VARCHAR2(1000),
    active NUMBER(1) DEFAULT 1
);

CREATE TABLE customers (
    id NUMBER(19) PRIMARY KEY,
    first_name VARCHAR2(255) NOT NULL,
    last_name VARCHAR2(255) NOT NULL,
    email VARCHAR2(255) NOT NULL UNIQUE,
    password VARCHAR2(255) NOT NULL,
    phone_number VARCHAR2(20) UNIQUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE addresses (
    id NUMBER(19) PRIMARY KEY,
    street VARCHAR2(500) NOT NULL,
    city VARCHAR2(100) NOT NULL,
    state VARCHAR2(100) NOT NULL,
    zip_code VARCHAR2(20) NOT NULL,
    country VARCHAR2(100) NOT NULL,
    is_default NUMBER(1) DEFAULT 0,
    customer_id NUMBER(19) NOT NULL,
    CONSTRAINT fk_address_customer FOREIGN KEY (customer_id) REFERENCES customers(id)
);

CREATE TABLE suppliers (
    id NUMBER(19) PRIMARY KEY,
    name VARCHAR2(255) NOT NULL,
    email VARCHAR2(255),
    phone_number VARCHAR2(20),
    address VARCHAR2(1000),
    active NUMBER(1) DEFAULT 1
);

CREATE TABLE products (
    id NUMBER(19) PRIMARY KEY,
    name VARCHAR2(255) NOT NULL,
    description VARCHAR2(2000),
    price NUMBER(10,2) NOT NULL,
    image_url VARCHAR2(500),
    active NUMBER(1) DEFAULT 1,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    category_id NUMBER(19) NOT NULL,
    CONSTRAINT fk_product_category FOREIGN KEY (category_id) REFERENCES categories(id)
);

CREATE TABLE inventory (
    id NUMBER(19) PRIMARY KEY,
    quantity NUMBER(10) NOT NULL,
    reserved_quantity NUMBER(10) DEFAULT 0,
    last_updated TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    product_id NUMBER(19) NOT NULL,
    supplier_id NUMBER(19),
    CONSTRAINT fk_inventory_product FOREIGN KEY (product_id) REFERENCES products(id),
    CONSTRAINT fk_inventory_supplier FOREIGN KEY (supplier_id) REFERENCES suppliers(id)
);

CREATE TABLE carts (
    id NUMBER(19) PRIMARY KEY,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    customer_id NUMBER(19) NOT NULL,
    CONSTRAINT fk_cart_customer FOREIGN KEY (customer_id) REFERENCES customers(id)
);

CREATE TABLE orders (
    id NUMBER(19) PRIMARY KEY,
    order_number VARCHAR2(50) NOT NULL UNIQUE,
    total_amount NUMBER(10,2) NOT NULL,
    status VARCHAR2(20) DEFAULT 'PENDING',
    order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    customer_id NUMBER(19) NOT NULL,
    delivery_address_id NUMBER(19),
    CONSTRAINT fk_order_customer FOREIGN KEY (customer_id) REFERENCES customers(id),
    CONSTRAINT fk_order_delivery_address FOREIGN KEY (delivery_address_id) REFERENCES addresses(id)
);

CREATE TABLE order_items (
    id NUMBER(19) PRIMARY KEY,
    quantity NUMBER(10) NOT NULL,
    price NUMBER(10,2) NOT NULL,
    total_price NUMBER(10,2) NOT NULL,
    order_id NUMBER(19) NOT NULL,
    product_id NUMBER(19),
    CONSTRAINT fk_order_item_order FOREIGN KEY (order_id) REFERENCES orders(id),
    CONSTRAINT fk_order_item_product FOREIGN KEY (product_id) REFERENCES products(id)
);

CREATE TABLE payments (
    id NUMBER(19) PRIMARY KEY,
    amount NUMBER(10,2) NOT NULL,
    payment_method VARCHAR2(20),
    status VARCHAR2(20) DEFAULT 'PENDING',
    transaction_id VARCHAR2(100),
    payment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    order_id NUMBER(19) NOT NULL,
    CONSTRAINT fk_payment_order FOREIGN KEY (order_id) REFERENCES orders(id)
);

CREATE TABLE shipping (
    id NUMBER(19) PRIMARY KEY,
    tracking_number VARCHAR2(100),
    carrier VARCHAR2(100),
    status VARCHAR2(20) DEFAULT 'PENDING',
    shipped_date TIMESTAMP,
    estimated_delivery_date TIMESTAMP,
    actual_delivery_date TIMESTAMP,
    order_id NUMBER(19) NOT NULL,
    delivery_address_id NUMBER(19),
    CONSTRAINT fk_shipping_order FOREIGN KEY (order_id) REFERENCES orders(id),
    CONSTRAINT fk_shipping_delivery_address FOREIGN KEY (delivery_address_id) REFERENCES addresses(id)
);

CREATE TABLE reviews (
    id NUMBER(19) PRIMARY KEY,
    rating NUMBER(1) NOT NULL CHECK (rating BETWEEN 1 AND 5),
    comment VARCHAR2(2000),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    customer_id NUMBER(19) NOT NULL,
    product_id NUMBER(19) NOT NULL,
    CONSTRAINT fk_review_customer FOREIGN KEY (customer_id) REFERENCES customers(id),
    CONSTRAINT fk_review_product FOREIGN KEY (product_id) REFERENCES products(id)
);

CREATE TABLE product_suppliers (
    product_id NUMBER(19) NOT NULL,
    supplier_id NUMBER(19) NOT NULL,
    PRIMARY KEY (product_id, supplier_id),
    CONSTRAINT fk_ps_product FOREIGN KEY (product_id) REFERENCES products(id),
    CONSTRAINT fk_ps_supplier FOREIGN KEY (supplier_id) REFERENCES suppliers(id)
);

CREATE TABLE cart_products (
    cart_id NUMBER(19) NOT NULL,
    product_id NUMBER(19) NOT NULL,
    PRIMARY KEY (cart_id, product_id),
    CONSTRAINT fk_cp_cart FOREIGN KEY (cart_id) REFERENCES carts(id),
    CONSTRAINT fk_cp_product FOREIGN KEY (product_id) REFERENCES products(id)
);
