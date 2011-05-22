DROP TABLE IF EXISTS ProductItem, Product, Item, Language;
 
CREATE TABLE Product(
	id integer PRIMARY KEY AUTO_INCREMENT NOT NULL,
	name varchar(50),
	description varchar(255)
) ENGINE=INNODB;

CREATE TABLE Item(
	id integer PRIMARY KEY AUTO_INCREMENT NOT NULL,
	name varchar(50)
) ENGINE=INNODB;

CREATE TABLE Language(
	id integer PRIMARY KEY AUTO_INCREMENT NOT NULL,
	name varchar(50),
	code varchar(3)
) ENGINE=INNODB;

CREATE TABLE ProductItem(
	product_id integer NOT NULL,
	item_id integer NOT NULL,
	language_id integer NOT NULL,
	name varchar(50),
	FOREIGN KEY(product_id)
	REFERENCES Product(id),
	FOREIGN KEY(item_id)
	REFERENCES Item(id),
	FOREIGN KEY(language_id)
	REFERENCES Language(id),
	PRIMARY KEY(product_id, item_id, language_id)
) ENGINE=INNODB;

INSERT INTO Product(name, description) values("Product 1", "This is Product one");
INSERT INTO Product(name, description) values("Product 2", "This is Product two");
INSERT INTO Product(name, description) values("Product 3", "This is Product three");

INSERT INTO Item(name) values("Item 1");
INSERT INTO Item(name) values("Item 2");
INSERT INTO Item(name) values("Item 3");

INSERT INTO Language(name, code) values("German", "DEU");
INSERT INTO Language(name, code) values("English", "ENG");
INSERT INTO Language(name, code) values("French", "FRE");

INSERT INTO ProductItem values(1,1,1,"Product 1 has Item 1 in German");
INSERT INTO ProductItem values(1,2,2,"Product 1 has Item 2 in English");
INSERT INTO ProductItem values(1,3,3,"Product 1 has Item 3 in French");
INSERT INTO ProductItem values(2,1,1,"Product 2 has Item 1 in German");
INSERT INTO ProductItem values(2,2,2,"Product 2 has Item 2 in English");
INSERT INTO ProductItem values(2,3,3,"Product 2 has Item 3 in French");
INSERT INTO ProductItem values(3,1,1,"Product 3 has Item 1 in German");
INSERT INTO ProductItem values(3,2,1,"Product 3 has Item 2 in German");