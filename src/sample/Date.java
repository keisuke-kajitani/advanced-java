package sample;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;
public class Date {
public static void main(String[] args) {
LocalDate aDate = LocalDate.now();
System.out.println(aDate);
LocalDateTime aDateTime = LocalDateTime.now();
System.out.println(aDateTime);
LocalTime aTime = LocalTime.now();
System.out.println(aTime);

LocalDateTime aDateTime2 = LocalDateTime.of(2025, 1, 20, 11, 47, 50);
int year = aDateTime2.getYear();
System.out.println(year);

aDate = aDate.plusDays(6);
aDateTime2 = aDateTime2.minusYears(5);
LocalDateTime a = aDateTime2.plusYears(30);
System.out.println(aDateTime2);
System.out.println(aDate);
System.out.println(a);

LocalDate localDat = LocalDate.now();
System.out.println("現在の日付:" +localDat);
System.out.println("月末は:" +localDat.with(TemporalAdjusters.lastDayOfMonth()));
}
}
