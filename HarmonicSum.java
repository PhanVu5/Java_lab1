package Week_1;
import java.util.Iterator;

public class HarmonicSum {
	public static void main(String[] agsr) {
		double Harmonic = 0;
		for(double i = 1; i<= 500; i++) {
			Harmonic += 1/i;
			
		}
		System.out.println(Harmonic);
		Harmonic = 0;
	for(double i = 500; i>=1; i--) {
		Harmonic += 1/i;
	}
	System.out.println(Harmonic);
	}
	// Result will return two price different, Because computer did remove price VCB at function first
	// Result function two correct than. Because It take of price VCB. 
}
