
public class BankAccount implements AccountOperations {
	int accountBalance = 0;
	int accountNumber;

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int balance) {
		accountBalance = balance;
		Transactions.Transactions(balance, )
	}

	public void makeTransfer(BankAccount receivingAccount, int transferAmmount) throws AccountOperationException {
		if (transferAmmount <= 0) {
			throw new AccountOperationException("Transfer ammount can not be less than or equal to 0");
		}
		accountBalance += transferAmmount;
		receivingAccount.setAccountBalance(receivingAccount.getAccountBalance() - transferAmmount);
	}

	public void makePayment(BankAccount payingAccount, int paymentAmmount) throws AccountOperationException {
		if (paymentAmmount <= 0) {
			throw new AccountOperationException("Payment ammount can not be less than or equal to 0");
		}
		accountBalance -= paymentAmmount;
		payingAccount.setAccountBalance(payingAccount.getAccountBalance() + paymentAmmount);
	}

}
