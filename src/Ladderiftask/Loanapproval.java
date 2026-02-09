package Ladderiftask;

public class Loanapproval{
	double salary;
	int creditScore;
	public String checkLoanApproval(double salary, int creditScore) {
		if((salary>=80000)&&(creditScore>=750)) {
			return "Loan Approved Immediately" ;
		}
		else if(((salary>=50000)&&(salary<80000))&&(creditScore>=650) ){
			return "Loan Approved with Higher Interset Rate" ;
		}
		else if(((salary>=30000)&&(salary<50000))&&((creditScore>=500) )){
			return "Co-signer Required" ;
		}
		else {
			return "Loan Rejected";
		}
	}
	public static void main(String[] args) {
		Loanapproval obj = new Loanapproval();
		System.out.println("checking with (60000,600) :"+obj.checkLoanApproval(60000,600));
		

	}

}
