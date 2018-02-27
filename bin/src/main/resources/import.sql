INSERT INTO CUSTOMERS (customerID, fName, sName) values ('1','Sarah', 'Mulligan')
INSERT INTO CUSTOMERS (customerID, fName, sName) values ('2','Tony', 'Wong')
INSERT INTO CUSTOMERS (customerID, fName, sName) values ('3','Jack', 'Wilshere')
INSERT INTO CUSTOMERS (customerID, fName, sName) values ('4','Magnus', 'Carter')
INSERT INTO CUSTOMERS (customerID, fName, sName) values ('5','John', 'Smith')
INSERT INTO CUSTOMERS (customerID, fName, sName) values ('6','Gary', 'Gendry')
INSERT INTO CUSTOMERS (customerID, fName, sName) values ('7','Nia', 'Long')

INSERT INTO ACCOUNT (accountID, customerID, AccountNo, balance) values ('1', '1','98754439', 25.68)
INSERT INTO ACCOUNT (accountID, customerID, AccountNo, balance) values ('2', '2','55684309', 34.23)
INSERT INTO ACCOUNT (accountID, customerID, AccountNo, balance) values ('3', '3','95660091', 50.67)
INSERT INTO ACCOUNT (accountID, customerID, AccountNo, balance) values ('4', '4','87664903', 14.12)
INSERT INTO ACCOUNT (accountID, customerID, AccountNo, balance) values ('5', '5','76990234', 112.45)
INSERT INTO ACCOUNT (accountID, customerID, AccountNo, balance) values ('6', '6','78643320', 68.90)
INSERT INTO ACCOUNT (accountID, customerID, AccountNo, balance) values ('7', '7','66029840', 150.23)


INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('1', '1', 'Withdrawal', 'TESCO GREENFORD', 'DEB', '2.50', '2018-01-01', (SELECT balance FROM Account Where AccountID=1)-2.50)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=1)-2.50 WHERE ACCOUNTID=1

INSERT into TRANSACTIONS (transactionID, AccountID, Deposit_Withdrawal, Description, TransactionType, Amount, dateOfTransaction, Updatedbalance) values ('2', '1', 'Withdrawal', 'PRIMARK GREENFORD', 'DEB', '11.50', '2018-01-01', (SELECT balance FROM Account Where AccountID=1)-11.50)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=1)-11.50 WHERE ACCOUNTID=1

INSERT into TRANSACTIONS (transactionID, AccountID, Deposit_Withdrawal, Description, TransactionType, Amount, dateOfTransaction, Updatedbalance) values ('3', '1', 'Deposit', 'PRIMARK GREENFORD', 'TFR', '120.00', '2018-08-01', (SELECT balance FROM Account Where AccountID=1)+120.00)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=1)+120.00 WHERE ACCOUNTID=1

INSERT into TRANSACTIONS (transactionID, AccountID, Deposit_Withdrawal, Description, TransactionType, Amount, dateOfTransaction, Updatedbalance) values ('4', '1', 'Withdrawal', 'Victoria Secrets GREENFORD', 'DEB', '72.34', '2018-01-15', (SELECT balance FROM Account Where AccountID=1)-72.34)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=1)-72.34 WHERE ACCOUNTID=1

INSERT into TRANSACTIONS (transactionID, AccountID, Deposit_Withdrawal, Description, TransactionType, Amount, dateOfTransaction, Updatedbalance) values ('5', '1', 'Withdrawal', 'Chicken Cottage GREENFORD', 'DEB', '7.34', '2018-01-17', (SELECT balance FROM Account Where AccountID=1)-7.34)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=1)-7.34 WHERE ACCOUNTID=1


INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('6', '2', 'Withdrawal', 'PRET MANAGER ANCHORAGE', 'DEB', '7.81', '2018-02-01', (SELECT balance FROM Account Where AccountID=2)-7.81)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=2)-7.81 WHERE ACCOUNTID=2

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('7', '2', 'Withdrawal', 'SAINSBURYS ANCHORAGE', 'DEB', '2.41', '2018-02-02', (SELECT balance FROM Account Where AccountID=2)-2.41)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=2)-2.41 WHERE ACCOUNTID=2

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('8', '2', 'Withdrawal', 'BAR BURITO ANCHORAGE', 'DEB', '8.63', '2018-02-05', (SELECT balance FROM Account Where AccountID=2)-8.63)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=2)-8.63 WHERE ACCOUNTID=2

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('9', '2', 'Deposit', 'SANTANDER ANCHORAGE', 'CDM', '80.00', '2018-02-12', (SELECT balance FROM Account Where AccountID=2)+80.00)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=2)+80.00 WHERE ACCOUNTID=2

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('10', '2', 'Deposit', 'SANTANDER ANCHORAGE', 'CDM', '100.00', '2018-02-14', (SELECT balance FROM Account Where AccountID=2)+100.00)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=2)+100.00 WHERE ACCOUNTID=2

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('11', '2', 'Withdrawal', 'ARGOS PICADILLY', 'DEB', '76.00', '2018-02-18', (SELECT balance FROM Account Where AccountID=2)-76.00)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=2)-76.00 WHERE ACCOUNTID=2


INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('12', '3', 'Deposit', 'LLOYDS LONG SIGHT', 'CDM', '200.00', '2018-03-01', (SELECT balance FROM Account Where AccountID=3)+200.00)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=3)+200.00 WHERE ACCOUNTID=3

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('13', '3', 'Withdrawal', 'LLOYDS LONG SIGHT', 'ATM', '20.00', '2018-03-05', (SELECT balance FROM Account Where AccountID=3)-20.00)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=3)-20.00 WHERE ACCOUNTID=3

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('14', '3', 'Withdrawal', 'NANDOS BELLE VUE', 'DEB', '35.81', '2018-03-06', (SELECT balance FROM Account Where AccountID=3)-35.81)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=3)-35.81 WHERE ACCOUNTID=3

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('15', '3', 'Withdrawal', 'BELLA ITALIA PICADILLY', 'DEB', '25.13', '2018-03-08', (SELECT balance FROM Account Where AccountID=3)-25.13)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=3)-25.13 WHERE ACCOUNTID=3


INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('16', '3', 'Withdrawal', 'COSTCO LEVUESHAM', 'DEB', '45.77', '2018-03-15', (SELECT balance FROM Account Where AccountID=3)-45.77)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=3)-45.77 WHERE ACCOUNTID=3


INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('17', '5', 'Withdrawal', 'BARCLAYS LEVUESHAM', 'ATM', '40.00', '2018-03-01', (SELECT balance FROM Account Where AccountID=5)-40.00)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=5)-40.00 WHERE ACCOUNTID=5

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('18', '5', 'Withdrawal', 'VUE CINEMAS PICADALLY', 'DEB', '35.50', '2018-03-03', (SELECT balance FROM Account Where AccountID=5)-35.50)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=5)-35.50 WHERE ACCOUNTID=5

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('19', '5', 'Withdrawal', 'MACDONALDS PICADALLY', 'DEB', '5.70', '2018-03-04', (SELECT balance FROM Account Where AccountID=5)-5.70)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=5)-5.70 WHERE ACCOUNTID=5

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('20', '5', 'Withdrawal', 'KFC PICADALLY', 'DEB', '6.50', '2018-03-07', (SELECT balance FROM Account Where AccountID=5)-6.50)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=5)-6.50 WHERE ACCOUNTID=5

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('21', '5', 'Withdrawal', 'MORRISONS PICADALLY', 'DEB', '2.80', '2018-03-10', (SELECT balance FROM Account Where AccountID=5)-2.80)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=5)-2.80 WHERE ACCOUNTID=5

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('22', '5', 'Withdrawal', 'UDEMY.COM', 'DEB', '14.00', '2018-03-13', (SELECT balance FROM Account Where AccountID=5)-14.00)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=5)-14.00 WHERE ACCOUNTID=5

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('22', '5', 'Deposit', 'BARCLAYS LEVUESHAM', 'CDM', '100.00', '2018-03-18', (SELECT balance FROM Account Where AccountID=5)+100.00)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=5)+100.00 WHERE ACCOUNTID=5


INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('23', '4', 'Deposit', 'BARCLAYS LEVUESHAM', 'CDM', '100.00', '2018-02-01', (SELECT balance FROM Account Where AccountID=4)+100.00)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=4)+100.00 WHERE ACCOUNTID=4

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('24', '4', 'Withdrawal', 'BARCLAYS LEVUESHAM', 'ATM', '30.00', '2018-02-03', (SELECT balance FROM Account Where AccountID=4)-30.00)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=4)-30.00 WHERE ACCOUNTID=4

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('25', '4', 'Withdrawal', 'LIDL LONG SIGHT', 'DEB', '20.98', '2018-02-04', (SELECT balance FROM Account Where AccountID=4)-20.98)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=4)-20.98 WHERE ACCOUNTID=4

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('26', '4', 'Withdrawal', 'LIDL LONG SIGHT', 'DEB', '2.62', '2018-02-06', (SELECT balance FROM Account Where AccountID=4)-2.62)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=4)-2.62 WHERE ACCOUNTID=4

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('27', '4', 'Withdrawal', 'AMAZON.COM', 'DEB', '58.00', '2018-02-10', (SELECT balance FROM Account Where AccountID=4)-58.00)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=4)-58.00 WHERE ACCOUNTID=4

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('28', '4', 'Withdrawal', 'DECODE.COM', 'DEB', '18.00', '2018-02-11', (SELECT balance FROM Account Where AccountID=4)-18.00)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=4)-18.00 WHERE ACCOUNTID=4

INSERT INTO TRANSACTIONS (TRANSACTIONID, ACCOUNTID, DEPOSIT_WITHDRAWAL, DESCRIPTION, TRANSACTIONTYPE, AMOUNT, dateOfTransaction, UPDATEDBALANCE) values ('29', '4', 'Deposit', 'BARCLAYS PICADILLY', 'CDM', '20.00', '2018-02-18', (SELECT balance FROM Account Where AccountID=4)+20.00)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=4)+20.00 WHERE ACCOUNTID=4

INSERT INTO TRANSACTIONS (transactionID, AccountID, Deposit_Withdrawal, Description, TransactionType, Amount, dateOfTransaction, Updatedbalance) values ('30', '1', 'Withdrawal', 'EBAY.COM', 'DEB', '20.34', '2018-02-25', (SELECT balance FROM Account Where AccountID=1)-7.34)
UPDATE ACCOUNT SET BALANCE=(SELECT BALANCE FROM ACCOUNT WHERE ACCOUNTID=1)-7.34 WHERE ACCOUNTID=1




