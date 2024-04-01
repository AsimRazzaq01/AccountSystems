public class LoanAccount extends Account {
    private double LoanLimit ;
    private double loanLimit ;

    LoanAccount(String _accountType, double _loanLimit) {
        this.AccountType = _accountType;
        this.Balance = 0;
        this.LoanLimit = _loanLimit;
    }
    public void setLoanLimit(double LoanLimit) {
        LoanLimit = loanLimit;
    }
    @Override
    public boolean deposit(double amount) {
        if (this.Balance <= 0) {
            this.Balance = 0;
            System.out.println("Sorry! No Balance to pay back loan");
            return false;
        } else if (this.Balance < amount) {
            System.out.println("The balance is less than the amount you want to pay");
            System.out.println(this.toString());
        } else {
            this.Balance = this.Balance - amount;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if ((this.LoanLimit - this.Balance) >= amount)
        {
            this.Balance = this.Balance + amount;
        }
        else {
            System.out.println("The Loan amount available is: " + (amount-Balance) );
            System.out.println("The Amount to be paid back is: " + (Balance));
            return false;
        }
        return true;
    }
    @Override
    public String toString(){
        String content = "Remaining fund;" +(this.LoanLimit - this.Balance) + "\r\n";
        content = content + super.toString();
        return content;
    }





}