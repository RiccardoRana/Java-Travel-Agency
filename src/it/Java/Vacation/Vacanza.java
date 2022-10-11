package it.Java.Vacation;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vacanza {

    String destinazione;
    LocalDate dataInizio;
    LocalDate dataFine;

    LocalDate now = LocalDate.now();

    public Vacanza(String destinazione, LocalDate dataInizio, LocalDate dataFine) throws Exception {

        this.destinazione = destinazione;

        if (this.dataInizio.isBefore(now)) {
            this.dataInizio = dataInizio;
        } else {
            throw new Exception("Data non valida");
        }

        this.dataFine = dataFine;

    }


    public static long durataVacanza(LocalDate dataInizio, LocalDate dataFine) {
        return ChronoUnit.DAYS.between(dataInizio, dataFine);
    }
}
