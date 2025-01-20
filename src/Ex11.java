import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex11 {
        public static void main(String[] args) {
            // 東京オリンピック開会式の日付を設定
            LocalDate olympicsOpening = LocalDate.of(2020, 7, 24);
            // 自分の誕生日を設定（例として1990年5月15日を使用）
        LocalDate myBirthday = LocalDate.of(1990, 5, 15);

        // 曜日を調べる
        String olympicsDayOfWeek = olympicsOpening.getDayOfWeek().toString();
        String birthdayDayOfWeek = myBirthday.getDayOfWeek().toString();

        // 日付フォーマットを設定
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 EEEE");

        // フォーマットした日付と曜日を表示
        System.out.println("東京オリンピック開会式: " + olympicsOpening.format(formatter));
        System.out.println("その曜日: " + olympicsDayOfWeek);

        System.out.println("私の誕生日: " + myBirthday.format(formatter));
        System.out.println("その曜日: " + birthdayDayOfWeek);
 }
}

