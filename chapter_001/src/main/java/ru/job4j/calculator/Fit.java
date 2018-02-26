package ru.job4j.calculator;

/**
* Программа рассчета идеального веса.
*/
public class Fit {
	
	/**
	* Идеальный вес для мужчины.
	* @param height Рост.
	*@ return идеальный вес.
	*/
	static double manWeight(double height) {
		return (height - 100)*1.15;
	}
	
	/**
	*Идеальный вес для женщины.
	*@param height Рост.
	*@return идеальный вес.
	*/
	static double womanWeight(double height) {
		return (height - 110)*1.15;
	}
	
	public static void main(String[] args) {
		double mweight = manWeight(180);
		System.out.println(mweight);

		double wweight = womanWeight(160);
		System.out.print(wweight);
	}
	
}