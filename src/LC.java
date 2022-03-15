import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LC {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2022-03-01");
        LocalDate date1 = LocalDate.now();
        System.out.println(date.until(date1, ChronoUnit.DAYS));

        System.out.println(date.getLong(ChronoField.YEAR));
        System.out.println(date.getLong(ChronoField.YEAR_OF_ERA));

        Integer month = date.getMonthValue();
        System.out.println(month);

        Integer year = date.getYear();
        System.out.println(year);

        YearMonth ym = YearMonth.of(year, month);
        ym.getMonthValue();
        ym.getYear();
        System.out.println(ym);

    }
}
