package com.corejava;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateFormate{

public static void main(String[] args) throws ParseException
{
	SimpleDateFormat In = new SimpleDateFormat("dd/MM/YYYY");

	SimpleDateFormat Output = new SimpleDateFormat("dd/MM/YYYY");

	Date date = In.parse("32/01/2017");

	System.out.println(date);

	String Out = Output.format(date);

	 System.out.println(Out);


}
}