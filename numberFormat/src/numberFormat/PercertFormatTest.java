package numberFormat;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

public class PercertFormatTest {

	public PercertFormatTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception{
		double num=0.5267;
		NumberFormat defaultFormat = NumberFormat.getPercentInstance();
		defaultFormat.setMinimumFractionDigits(1);
		System.out.println("Percentformat: "+defaultFormat.format(num));
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		Date d = new Date(4444444444000L);
		System.out.println(df.format(d));
	}

}
