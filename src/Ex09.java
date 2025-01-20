import java.time.LocalDateTime;

public class Ex09 {
    public static void main(String[] args) {
LocalDateTime a = LocalDateTime.of(2020, 1, 1, 0, 0, 0);
a  = a.plusYears(6);
a  = a.plusMonths(5);
a = a.plusDays(30);
System.out.println(a);

    }
}
