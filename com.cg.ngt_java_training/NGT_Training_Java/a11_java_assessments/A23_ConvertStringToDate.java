package a11_java_assessments;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A23_ConvertStringToDate {
	
	public static void main(String[] args) throws ParseException {
		
		String date = "18/07/1998";
		
		Date fDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);  
		
		System.out.println(fDate);
	}

}
