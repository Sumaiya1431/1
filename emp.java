package ac.in.kletech.Employee;

public class emp {
	int iEmpID;	
	String sEmpName;
	float fEmpBasicSalary;
	float fAllowance;
	float fb_s;
	float fGross_salary;
	float fnet_sal;
	float fInc_tax;
	public emp(int iEmpID, String sEmpName, float fEmpBasicSalary) {
		super();
		this.iEmpID = iEmpID;
		this.sEmpName = sEmpName;
		this.fEmpBasicSalary = fEmpBasicSalary;
	}
	
	void EmpDetails(){
		if(fEmpBasicSalary<5000)
		{
			fnet_sal=fEmpBasicSalary;
			fInc_tax=0;
			fAllowance=0.46f*fEmpBasicSalary;
			fGross_salary=fAllowance+fnet_sal;
		}
		else if(fEmpBasicSalary>5000 && fEmpBasicSalary<=10000)
		{
			fnet_sal=fEmpBasicSalary-fEmpBasicSalary*0.1f;
			fAllowance=0.46f*fEmpBasicSalary;
			fGross_salary=fAllowance+fnet_sal;
		}
		else if(fEmpBasicSalary>10000 && fEmpBasicSalary<=20000)
		{
			fnet_sal=fEmpBasicSalary-fEmpBasicSalary*0.2f;
			fAllowance=0.46f*fEmpBasicSalary;
			fGross_salary=fAllowance+fnet_sal;
		}
		else if(fEmpBasicSalary>20000)
		{
			fnet_sal=fEmpBasicSalary-fEmpBasicSalary*0.3f;
			fAllowance=0.46f*fEmpBasicSalary;
			fGross_salary=fAllowance+fnet_sal;
		}
	}
	void display(){
		System.out.println("emp id:"+iEmpID);
		System.out.println("basic salary:"+fEmpBasicSalary);
		System.out.println("allowance:"+fAllowance);
		System.out.println("gross pay:"+fGross_salary);
	}
}
