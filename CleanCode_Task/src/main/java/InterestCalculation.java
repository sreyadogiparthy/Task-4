
public class InterestCalculation {
	public static double simpleIntrest(double principal_amt,double rate,double time_period)
	 {
	     double si=principal_amt*time_period*rate/100;
	     return si;
	 }
	 public static double compoundInterest(double principal_amt,double rate,double time_period,double times_intrest_applied)
	 {  double cmpnd_amt=principal_amt*(Math.pow((1+(rate)/times_intrest_applied), time_period*times_intrest_applied));
	     double ci=cmpnd_amt-principal_amt;
	     return ci;
	 }
}
