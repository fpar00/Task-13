public interface AccountOperations {

	public int getAccountBalance();
	public void makeTransfer(BankAccount receivingAccount, int transferAmmount) throws AccountOperationException;
	public void makePayment(BankAccount payingAccount, int paymentAmmount) throws AccountOperationException;
	
}
