package it.Java.Vacation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vacanza {

    String destinazione;
    LocalDate dataInizio;
    LocalDate dataFine;

    LocalDate now = LocalDate.now();

    public Vacanza(String destinazione, LocalDate dataInizio, LocalDate dataFine) throws Exception {
        if (!destinazione.equals(" "))
            this.destinazione = destinazione;
        else
            throw new Exception("Destinazione non valida!");
        if (ChronoUnit.DAYS.between(this.dataInizio, now) < 0)
            this.dataInizio = dataInizio;
        else
            throw new Exception("Data non valida!");

        if (durataVacanza(this.dataInizio, this.dataFine) < 0)
            this.dataFine = dataFine;
        else
            throw new Exception("La data della fine non può essere prima di quella dell'inizio!");
    }


    public static long durataVacanza(LocalDate dataInizio, LocalDate dataFine) {
        return ChronoUnit.DAYS.between(dataInizio, dataFine);
    }
}
