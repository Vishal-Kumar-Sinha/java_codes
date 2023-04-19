abstract class ReserveBank {
	public abstract double getSavingInterestRate();
	public abstract double getFDInterestRate();
}
class AxisBank extends ReserveBank {
	public double getSavingInterestRate() {
		return 4;
	}
	public double getFDInterestRate() {
		return 8.5;
	}
}
class SBIBank extends ReserveBank {
	public double getSavingInterestRate() {
		return 6;
	}
	public double getFDInterestRate() {
		return 9;
	}
}
public class pg9 {

	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		System.out.println("Calling...AxisBank a=new AxisBank()");
		System.out.println("Savings interest :: "+a.getSavingInterestRate()+"%.");
		System.out.println("Fixed interest :: "+a.getFDInterestRate()+"%.");
		SBIBank s=new SBIBank();
		System.out.println("Calling...SBIBank s=new SBIBank()");
		System.out.println("Savings interest :: "+s.getSavingInterestRate()+"%.");
		System.out.println("Fixed interest :: "+s.getFDInterestRate()+"%.");
		ReserveBank r1=new AxisBank();
		System.out.println("Calling...ReserveBank r1=new AxisBank()");
		System.out.println("Savings interest :: "+r1.getSavingInterestRate()+"%.");
		System.out.println("Fixed interest :: "+r1.getFDInterestRate()+"%.");
		ReserveBank r2=new SBIBank();
		System.out.println("Calling...ReserveBank r2=new SBIBank()");
		System.out.println("Savings interest :: "+r2.getSavingInterestRate()+"%.");
		System.out.println("Fixed interest :: "+r2.getFDInterestRate()+"%.");
		
	}

}
