package Problem_019;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

/**
 * Created by anon on 15.12.2014.
 */
public class CountingSundays {

  public static void main(String[] args) {

    int count = 0;
    for (int year = 1901; year <= 2000; year++) {
      for (Month month : Month.values()) {
        LocalDate date = LocalDate.of(year, month, 1);
        count += DayOfWeek.SUNDAY == date.getDayOfWeek() ? 1 : 0;
      }
    }

    System.out.println(count);
  }
}
