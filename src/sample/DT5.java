package sample;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DT5 {
public static void main(String[] args) {
    System.out.println("LocalDateTime からフォーマットされた文字列へ変換");
LocalDateTime local = LocalDateTime.now();
System.out.println(local);
DateTimeFormatter formatter
= DateTimeFormatter.ofPattern("yyyy 年 MM 月 dd 日 HH 時 mm 分 ss 秒");
String format = local.format(formatter);
System.out.println(format);
   
 }
}