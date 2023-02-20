--Accounts
insert into payment_account (account_id,account_number, account_name, account_type, balance_date, currency, available_balance) 
values (1000,584567323,'SGSaving7323','Savings','08-NOV-2018','SGD',84327.51);

insert into payment_account (account_id,account_number, account_name, account_type, balance_date, currency, available_balance) 
values (1001,684568343,'SGCurrent8343','Current','28-OCT-2016','SGD',74327.91);

insert into payment_account (account_id,account_number, account_name, account_type, balance_date, currency, available_balance) 
values (1002,984565363,'AUSaving5363','Savings','18-JAN-2015','AUD',14697.00);

insert into payment_account (account_id,account_number, account_name, account_type, balance_date, currency, available_balance) 
values (1003,784562363,'AUCurrent2363','Current','25-AUG-2018','AUD',24327.41);

--Transactions
insert into payment_account_transacation(transaction_id, account_number, account_name, value_date, currency, debit_amount, credit_amount, transaction_type, transaction_narrative)
values (1000,584567323,'SGSaving7323','08-JAN-2022', 'SGD', null, 200.45, 'Credit', '');

insert into payment_account_transacation(transaction_id, account_number, account_name, value_date, currency, debit_amount, credit_amount, transaction_type, transaction_narrative)
values (1001,584567323,'SGSaving7323', '09-JAN-2022', 'SGD', 100.56, null, 'Debit', 'Groceries');

insert into payment_account_transacation(transaction_id, account_number, account_name, value_date, currency, debit_amount, credit_amount, transaction_type, transaction_narrative)
values (1002,584567323,'SGSaving7323','09-JAN-2022', 'SGD', 56.60, null, 'Debit', 'Shopping');

insert into payment_account_transacation(transaction_id, account_number, account_name, value_date, currency, debit_amount, credit_amount, transaction_type, transaction_narrative)
values (1003,584567323,'SGSaving7323','09-JAN-2022', 'SGD', 60.00, null, 'Debit', '');

insert into payment_account_transacation(transaction_id, account_number, account_name, value_date, currency, debit_amount, credit_amount, transaction_type, transaction_narrative)
values (1004,584567323,'SGSaving7323','09-JAN-2022', 'SGD', 800.78, null, 'Debit', '');