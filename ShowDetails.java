package greatlearningoops2ndweek;

class Account{
	String CustomerName;
	int AccountNo;
	 Account(String a,int b){
		 CustomerName=a;
		 AccountNo=b;
		 }	

 void display() {
	 System.out.println("CustomerName: " +CustomerName);
	 System.out.println("AccountNo: " +AccountNo);
}
}
 
 class CurrentAccount extends Account{
	 int CurrentAccount;
	 
	 CurrentAccount(String a, int b, int c){
		 super(a,b);//constructor call should be first statement
		 CurrentAccount=c;
	 }
	  void display() {
		 super.display();
		 System.out.println("CuurentBalance : " +CurrentAccount);
	}
}
 
 class AccountDetails extends CurrentAccount{
	 int depositAmount, withdrawalAmount;
	 
	 AccountDetails(String a, int b, int c, int d,int e){
	     super(a,b,c);// super use to call the method parameter or output in the other subclass or child class
		 depositAmount=d; 
		 withdrawalAmount=e;		
	 }
    void display(){
	   super.display();
	 System.out.println ("Deposit Amount:"+depositAmount);
	 System.out.println ("Withdrawal Amount:"+withdrawalAmount);	 
   }
 }
 
class ShowDetails {
	public static void main(String args[]) {
	AccountDetails A = new AccountDetails("Gaurav",9170100,20000,10000,500);
	     A.display();
	     
	   }
     }

