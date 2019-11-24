
public class main_fractions {
	public static void main(String[] args) {
		Fractions frac1 = new Fractions(2,3);
		Fractions frac2 = new Fractions(6,8);
		Fractions frac3 = new Fractions(3,1);
		System.out.println(frac1.addFraction(frac2));
		System.out.println(frac1.addFraction(frac3));
		//System.out.println(frac1.subFraction(frac2));
		//System.out.println(frac1.subFraction(frac3));
		System.out.println(frac1.multFraction(frac2));
		System.out.println(frac1.multFraction(frac3));
		System.out.println(frac1.divFraction(frac2));
		System.out.println(frac1.divFraction(frac3));
		System.out.println(frac1.toDecimal());
		System.out.println(frac1.toDecimal());
		System.out.println(frac1.toString());
		System.out.println(frac2.toString());
		System.out.println(frac3.toString());
		System.out.println(frac2.reduce());
		System.out.println(Fractions.toFraction(0.75));
		MixedNumbers mixed1 = new MixedNumbers(1,2);
		MixedNumbers mixed2 = new MixedNumbers(3,4);
		MixedNumbers mixed3 = new MixedNumbers(1);
		Fractions frac = new Fractions(5,3);
		MixedNumbers mixed4 = new MixedNumbers(frac);
		MixedNumbers mixed5 = mixed1.addMixedNumber(mixed2);
		MixedNumbers mixed6 = new MixedNumbers();
		System.out.println(mixed6);
		System.out.println(mixed4.simplifyMixedNumber());
		System.out.println(mixed5.simplifyMixedNumber());
		System.out.println(mixed1.addMixedNumber(mixed2));
		System.out.println(mixed1.addMixedNumber(mixed3));
		System.out.println(mixed1.addMixedNumber(mixed4));
		System.out.println(mixed2.subMixedNumber(mixed1));
		System.out.println(mixed4.subMixedNumber(mixed1));
		System.out.println(mixed1.multMixedNumber(mixed2));
		System.out.println(mixed1.multMixedNumber(mixed3));
		System.out.println(mixed1.multMixedNumber(mixed4));
		System.out.println(mixed1.divMixedNumber(mixed2));
		System.out.println(mixed1.divMixedNumber(mixed3));
		System.out.println(mixed1.divMixedNumber(mixed4));
		System.out.println(mixed3.subMixedNumber(mixed1));
	}

}
