import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex10 {
public static void main(String[] args) {
    LocalDateTime a = LocalDateTime.of( 2020, 7, 20, 0, 0);
 
    System.out.println(a);
    DateTimeFormatter b = DateTimeFormatter.ofPattern("yyy年MM月dd日HH時mm分ss秒");
    String format = a.format(b);
    System.out.println(format);

}
}
