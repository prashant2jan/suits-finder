--Broad categories (Future case add sub-categories)
INSERT INTO CASES (name, description) VALUES ('ProBono', 'ProBono case with PIL');
INSERT INTO CASES (name, description) VALUES ('Murder', 'Murder case');
INSERT INTO CASES (name, description) VALUES ('Property', 'Property dispute');
INSERT INTO CASES (name, description) VALUES ('Taxation', 'Sales tax and Vat fraud');

INSERT INTO USERS (username, password, enabled) VALUES ('prashant2jan', 'Aspire@01', 1);
INSERT INTO USERS (username, password, enabled) VALUES ('harveysp', 'Harward@01', 1);
INSERT INTO ATTORNEYS (name, age, gender, degree, fee, userid, phone, email, enabled) VALUES ('Harvey Spector', '43', 'M', 'LLB-Harward Law', '500', 2, '+10556677843','harvey.specter@suits.com',1);
INSERT INTO CUSTOMERS (name, age, gender, userid, phone, email, enabled) VALUES ('Prashant Srivastava', '34', 'M', 1, '+919975967654', 'prashant2jan@gmail.com',1);
