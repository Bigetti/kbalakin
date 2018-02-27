package ru.job4j.calculator;

/**
* Программа рассчета идеального веса.
*/
public class Fit {

	public static final int MAN_MINUS = 100;
	public static final int WOM_MINUS = 110;
	public static final double KOFF = 1.15;
	/**
	* Идеальный вес для мужчины.
	* @param height Рост.
	*@ return идеальный вес.
	*/
	static double manWeight(double height) {
		return (height - MAN_MINUS)*KOFF;
	}
	
	/**
	*Идеальный вес для женщины.
	*@param height Рост.
	*@return идеальный вес.
	*/
	static double womanWeight(double height) {
		return (height - WOM_MINUS)*KOFF;
	}
	
	public static void main(String[] args) {
		double mweight = manWeight(180);
		System.out.println(mweight);

		double wweight = womanWeight(160);
		System.out.print(wweight);
	}
	
}