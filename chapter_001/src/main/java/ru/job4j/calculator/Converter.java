package ru.job4j.calculator;

/**
 * Корвертор валюты.
 */
  public class Converter  {



	public static final int RUB_FOR_DOLLAR = 60;
	public static final  int RUB_FOR_EURO = 70;

	public static void main(String[] args) {
	 int euro = rubleToEuro(3000);
	 System.out.print(euro);
 }
	 
	 /**
	 * Конвертируем рубли в евро.
	 * @param value рубли.
	 * @return Евро.
	 */
	 
	public static int rubleToEuro(int value) {
		
		return value/RUB_FOR_EURO;
	 	 
	  }
	 
	 /**
	  *Конвертируем рубли в доллары.
	  *@param value рубли.
	  *@return Доллары
	  */
	  public int rubleToDollar(int value) {
		 return value/RUB_FOR_DOLLAR;
	  
	  }
	  
	public int DollartoRouble(int value){
		return value * RUB_FOR_DOLLAR;
	  	  }
	public int EuroForRouble(int value){
		return value * RUB_FOR_EURO;
	}
	
	
 }