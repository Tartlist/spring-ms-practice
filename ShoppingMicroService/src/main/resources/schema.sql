DROP TABLE IF EXISTS tbl_invoices;

CREATE TABLE tbl_invoices (
                                id BIGINT AUTO_INCREMENT  PRIMARY KEY,
                                number_id VARCHAR(250),
                                number_invoice VARCHAR(250) NOT NULL,
                                description VARCHAR(250) NOT NULL,
                                customer_id BIGINT,
                                create_at TIMESTAMP,
                                state VARCHAR(250) NOT NULL
);


DROP TABLE IF EXISTS tbl_invoice_items;

CREATE TABLE tbl_invoice_items (
                              id BIGINT AUTO_INCREMENT  PRIMARY KEY,
                              quantity DOUBLE,
                              price DOUBLE,
                              product_id BIGINT,
                              invoice_id BIGINT
);