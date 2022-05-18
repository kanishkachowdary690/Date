package date;
import java.time.*;
import java.time.chrono.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d=LocalDate.now();
		LocalDate e=LocalDate.of(1998,Month.JANUARY, 20);
		LocalTime f=LocalTime.now(ZoneId.of("Europe/Monaco"));
		LocalTime g=LocalTime.now();
		Instant i=Instant.now();
		LocalDateTime t=LocalDateTime.now();
		
		ZoneId z=ZoneId.systemDefault();
		System.out.println(z);
	    
		System.out.println(t);
		System.out.println(i);
		System.out.println(e);
		System.out.println(d);
		System.out.println();
		
		/*
		 * for(String s:ZoneId.getAvailableZoneIds()) { System.out.println(s); }
		 */
		 System.out.println(g);

	}

}
