package org.rasika.BeanInheritingDemo;

public class Payment {
	long basic;
	long variablePay;
	long HRA;
	long pf;

	public Payment() {
		super();
	}

	public Payment(long basic, long variablePay, long hRA) {
		super();
		this.basic = basic;
		this.variablePay = variablePay;
		HRA = hRA;
	}

	public Payment(long basic, long variablePay, long hRA, long pf) {
		super();
		this.basic = basic;
		this.variablePay = variablePay;
		HRA = hRA;
		this.pf = pf;
	}

	public long getBasic() {
		return basic;
	}

	public void setBasic(long basic) {
		this.basic = basic;
	}

	public long getVariablePay() {
		return variablePay;
	}

	public void setVariablePay(long variablePay) {
		this.variablePay = variablePay;
	}

	public long getHRA() {
		return HRA;
	}

	public void setHRA(long hRA) {
		HRA = hRA;
	}

	public long getPf() {
		return pf;
	}

	public void setPf(long pf) {
		this.pf = pf;
	}
	
	public void CalculateTotalSalary() {
		long result = basic+variablePay+HRA+pf;
		System.out.println("Total salary is "+ result);
	}

	@Override
	public String toString() {
		return "Payment [basic=" + basic + ", variablePay=" + variablePay + ", HRA=" + HRA + ", pf=" + pf + "]";
	}	
}
