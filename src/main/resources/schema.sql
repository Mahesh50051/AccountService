drop table payment_account;
create table payment_account(account_id NUMERIC, account_number NUMERIC, account_name VARCHAR(50), account_type VARCHAR(10), balance_date VARCHAR(50), currency VARCHAR(3), available_balance DECIMAL);

drop table payment_account_transacation;

create table payment_account_transacation(transaction_id NUMERIC,account_id NUMERIC, account_number NUMERIC, account_name VARCHAR(50), value_date VARCHAR(50), currency VARCHAR(3), debit_amount DECIMAL, credit_amount DECIMAL, transaction_type VARCHAR(10), transaction_narrative VARCHAR(255));