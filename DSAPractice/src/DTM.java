import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class DTM {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate tmrw = date.plusDays(1);
		System.out.println(tmrw);
		
		LocalDate ntweek = date.plusWeeks(1);
		System.out.println(ntweek);
		
		LocalDate ntmonth = date.plusMonths(1);
		System.out.println(ntmonth);
		
		
		
		//TIME
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println("hours :"+time.getHour());
		System.out.println("minutes :"+time.getMinute());
		
		//BETWEEN
		LocalDate dt = LocalDate.of(1989, 04,05);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(formatter);
		String result = dt.format(formatter);
		System.out.println(result);
		
		LocalDate bdy = LocalDate.of(1994, 06, 04);
		LocalDate tdy = LocalDate.now();
		Period p = Period.between(bdy, tdy);
		System.out.println(p.getYears()+" "+p.getMonths()+" "+p.getDays());
		
		
		//ZONE
		ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(india);
		
		
		//LEAP YEAR
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year num : ");
		int n = sc.nextInt();
		
		Year y = Year.of(n);
		
		if (y.isLeap()) {
            System.out.println(n + " is a leap year");
        } else {
            System.out.println(n + " is not a leap year");
        }
		
		sc.close();
	}

}
