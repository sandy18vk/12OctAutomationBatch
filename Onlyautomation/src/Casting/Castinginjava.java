package Casting;

public class Castinginjava {

	// casting in java 2 types mainly = conveting one datatype into another datatype
	// ( L to H || H to L )

	// 1. primitive -all data type conversion sub two types - a. implicit - (L to H
	// ) b. explicit - ( H to L)

	// 2. non primitive - a. upcasting to perform using inheritance b. downcasting -
	// in java not possibel downcasting

	byte byteType = 6; // lower data type to
	short shortType = 45;
	int intType = 7;
	long longType = 57768;
	float floatType = 45.9f;
	double doubleType = 566579.9098; // higher data type

	char charType = 'r';
	boolean booleanType = true;

	void convertIntTypeToOther() {

		byteType = (byte) intType; // explicite H to L
	//	shortType = (short) intType; // explicite H to L
		charType = (char) intType; // explicite H to L
	//	 booleanType = intType; not possible casting in java

		intType = intType; // implicite data type L to H
		longType = intType; // implicite data type L to H
		floatType = intType; // implicite data type L to H
		doubleType = intType; // implicite data type L to H

		System.out.println(byteType);
		System.out.println(shortType);
		System.out.println(charType);
		System.out.println(intType);
		System.out.println(longType);
		System.out.println(floatType);
		System.out.println(doubleType);
        System.out.println("*********************************");
	}

	void convertOtherTypetoInt() {

		intType = byteType; // implicite data type L to H
		intType = shortType;
		intType = charType;
//		intType = intType;

		// intType = booleanType; not possible casting in java

		intType = (int) longType; // explicite H to L
		intType = (int) floatType;
		intType = (int) doubleType;

		System.out.println(byteType);
		System.out.println(shortType);
		System.out.println(charType);
		System.out.println(intType);
		System.out.println(longType);
		System.out.println(floatType);
		System.out.println(doubleType);
		System.out.println("******************************");
	}

	void convertshortTypeToOther() {

		byteType = (byte) shortType; // explicite H to L
		// shortType = (short) shortType; // explicite H to L
		charType = (char) shortType; // explicite H to L
		// booleanType = shortType; not possible casting in java

		intType = shortType; // implicite data type L to H
		longType = shortType; // implicite data type L to H
		floatType = shortType; // implicite data type L to H
		doubleType = shortType; // implicite data type L to H
		System.out.println(byteType);
		System.out.println(shortType);
		System.out.println(charType);
		System.out.println(intType);
		System.out.println(longType);
		System.out.println(floatType);
		System.out.println(doubleType);
		System.out.println("******************************");

	}

	void convertOtherTypetoshort() {

		shortType = byteType; // implicite data type L to H
		// shortType = shortType;
		shortType = (short) charType;
		shortType = (short) intType;

		// intType = booleanType; not possible casting in java

		shortType = (short) longType; // explicite H to L
		shortType = (short) floatType;
		shortType = (short) doubleType;

		System.out.println(byteType);
		System.out.println(shortType);
		System.out.println(charType);
		System.out.println(intType);
		System.out.println(longType);
		System.out.println(floatType);
		System.out.println(doubleType);
		System.out.println("******************************");
	}

	void convertlongTypeToOther() {

		byteType = (byte) longType; // explicite H to L
		//shortType = (short) longType; // explicite H to L
		charType = (char) longType; // explicite H to L
		// booleanType = longType; not possible casting in java

		intType = (int) longType; // explicite H to L
//		longType = longType; // implicite data type L to H
		floatType = longType; // implicite data type L to H
		doubleType = longType; // implicite data type L to H
		System.out.println(byteType);
		System.out.println(shortType);
		System.out.println(charType);
		System.out.println(intType);
		System.out.println(longType);
		System.out.println(floatType);
		System.out.println(doubleType);
		System.out.println("******************************");
	}

	void convertOtherTypetolong() {

		longType = byteType; // implicite data type L to H
		longType = shortType;
		longType = charType;
		longType = intType;

		// longType = booleanType; not possible casting in java

//		longType = longType; // explicite H to L
		longType = (long) floatType;
		longType = (long) doubleType;

		System.out.println(byteType);
		System.out.println(shortType);
		System.out.println(charType);
		System.out.println(intType);
		System.out.println(longType);
		System.out.println(floatType);
		System.out.println(doubleType);
		System.out.println("******************************");
	}

	void convertfloatTypeToOther() {

		byteType = (byte) floatType; // explicite H to L
		shortType = (short) floatType; // explicite H to L
		charType = (char) floatType; // explicite H to L
		// booleanType = longType; not possible casting in java

		intType = (int) floatType; // explicite H to L
		//longType = (long) floatType; // explicite H to L
//		floatType = floatType; // implicite data type L to H
		doubleType = floatType; // implicite data type L to H

		System.out.println(byteType);
		System.out.println(shortType);
		System.out.println(charType);
		System.out.println(intType);
		System.out.println(longType);
		System.out.println(floatType);
		System.out.println(doubleType);
		System.out.println("******************************");
	}

	void convertOtherTypetofloat() {

		floatType = byteType; // implicite data type L to H
		floatType = shortType;
		floatType = charType;
		floatType = intType;

		// longType = booleanType; not possible casting in java

		floatType = longType;
//		floatType = floatType;
		floatType = (float) doubleType; // explicite H to L

		System.out.println(byteType);
		System.out.println(shortType);
		System.out.println(charType);
		System.out.println(intType);
		System.out.println(longType);
		System.out.println(floatType);
		System.out.println(doubleType);
		System.out.println("******************************");
	}

	void convertdoubleTypeToOther() {

		byteType = (byte) doubleType; // explicite H to L
		shortType = (short) doubleType; // explicite H to L
		charType = (char) doubleType; // explicite H to L
		// booleanType = doubleType; not possible casting in java

		intType = (int) doubleType; // explicite H to L
		longType = (long) doubleType; // explicite H to L
		//floatType = (float) doubleType; // explicite H to L
//		doubleType = doubleType; // implicite data type L to H

		System.out.println(byteType);
		System.out.println(shortType);
		System.out.println(charType);
		System.out.println(intType);
		System.out.println(longType);
		System.out.println(floatType);
		System.out.println(doubleType);
		System.out.println("******************************");
	}

	void convertOtherTypetodouble() {

		doubleType = byteType; // implicite data type L to H
		doubleType = shortType;
		doubleType = charType;
		doubleType = intType;

		// longType = booleanType; not possible casting in java

		doubleType = longType; // explicite H to L
		doubleType = floatType;
//		doubleType = doubleType;

		System.out.println(byteType);
		System.out.println(shortType);
		System.out.println(charType);
		System.out.println(intType);
		System.out.println(longType);
		System.out.println(floatType);
		System.out.println(doubleType);
		System.out.println("******************************");
	}

	public static void main(String[] args) {
		Castinginjava s = new Castinginjava();
//		Castinginjava s1=new Castinginjava();
//		Castinginjava s2=new Castinginjava();
//		Castinginjava s3=new Castinginjava();
//		Castinginjava s4=new Castinginjava();

		s.convertIntTypeToOther();
		
		s.convertOtherTypetoInt();
		s.convertshortTypeToOther();
		s.convertOtherTypetoshort();
		s.convertlongTypeToOther();
		s.convertOtherTypetolong();
		s.convertfloatTypeToOther();
		s.convertOtherTypetofloat();
		s.convertdoubleTypeToOther();
		s.convertOtherTypetodouble();

	}

}
