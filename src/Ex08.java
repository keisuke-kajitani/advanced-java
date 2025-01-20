import java.time.LocalDate;
import java.time.LocalTime;

public class Ex08 {
public static void main(String[] args) {
LocalDate local = LocalDate.of(2020, 2, 1);

System.out.println("月末は"+ local.with(TemporalAdjusters.lastDayOfMonth()));



}
}
