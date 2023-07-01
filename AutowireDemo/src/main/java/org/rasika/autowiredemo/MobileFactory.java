package org.rasika.autowiredemo;

public class MobileFactory {

	static String mobileType = "Andriod";
	public static MobileFactory getMobiles() {
		System.out.println(mobileType);
		return new MobileFactory();
	}
}
