import java.util.Scanner;
class Account {
	static long balance;
	String accNo;
	long amount;
	Account(String accNo ,long balance) {
		this.accNo= accNo;
		this.balance= balance;
	}
	void display() {
		System.out.println("accNo:" + accNo +" " + "balance:" + balance);
	}
	String withdrawAmount(long amount) throws insufficiantBalanceException{
		if(amount>balance) {
			throw new insufficiantBalanceException();
		}
		else {
			balance-=amount;
		}
		return "";
	}
	
}

class insufficiantBalanceException extends Exception { }


class Main {
	public static void main(String args[])  {
	Scanner sc= new Scanner(System.in);
	Account a1= new Account("abc1",5000);
	a1.display();
	for(int i=3;i>0;i--) {
		System.out.println("enter amount for withdraw");
		long amount= sc.nextLong();
		try{
			a1.withdrawAmount(amount);
			a1.display();
			break;
		}
	
		catch(insufficiantBalanceException e) {
			System.out.println("insufficiant balance check entered amount and try again");
			System.out.println(i-1 +"attempt left");
		}
	
	finally {
		System.out.println("transition complited");
	}}
	}
}