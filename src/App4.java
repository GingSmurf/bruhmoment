import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class App4 {
    public static void main(String[] args) {


        LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate pastWeekDate = d04.minusDays(7); // Subtrai Dias // pastWeekDate é uma variavel !
		LocalDate nextWeekDate = d04.plusDays(7); // Adiciona Dias
		
		LocalDateTime pastWeekLocalDate = d05.minusDays(7);
		LocalDateTime nextWeekLocalDate = d05.plusDays(7);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); //Instant não tem minusDays!, tem que usar ChronosUnits.Bruh para especificar
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekDate = " + pastWeekDate);
		System.out.println("nextWeekDate = " + nextWeekDate);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), d04.atStartOfDay()); //Não tem como calcular sem indicar horario, atStartOfDay : 00:00 
		Duration t2 = Duration.between(pastWeekLocalDate, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);

		System.out.println("t1 dias = " + t1.toDays()); 
		System.out.println("t2 dias = " + t2.toDays()); // Calcula a duração de dias entre duas datas, no caso pastWeekDate e d04
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());



    }
}
