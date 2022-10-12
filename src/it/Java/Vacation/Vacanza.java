package it.Java.Vacation;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vacanza {

    String destinazione;
    LocalDate dataInizio;
    LocalDate dataFine;

    LocalDate now = LocalDate.now();

    public Vacanza(String destinazione, LocalDate dataInizio, LocalDate dataFine) throws Exception {
        if(destinazione == null || destinazione.equals("")) {
            throw new Exception("Non hai inserito la destinazione!");
        } else {
            this.destinazione = destinazione;
        }

        if (dataInizio.isAfter(now) && dataInizio.isBefore(dataFine)) {
            this.dataInizio = dataInizio;
        } else {
            throw new Exception("Data non valida");
        }


        this.dataFine = dataFine;

    }

    public String getDestinazione() {
        return destinazione;
    }

    public  long durataVacanza(LocalDate dataInizio, LocalDate dataFine) {
        return ChronoUnit.DAYS.between(dataInizio, dataFine);
    }
}
