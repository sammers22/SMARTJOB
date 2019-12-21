package br.com.caixaseguradora.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Util {


	public static String dateToStringUtc(Date date) {
		SimpleDateFormat outFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

		String formattedDate = outFormat.format(date);
		System.out.println(formattedDate);
		
		return formattedDate;
	}
	

}
