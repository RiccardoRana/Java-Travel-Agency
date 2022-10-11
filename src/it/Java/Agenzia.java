package it.Java;

import it.Java.Vacation.Vacanza;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import static it.Java.Vacation.Vacanza.durataVacanza;

public class Agenzia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate giorno = LocalDate.of(2022, 10, 10);
        LocalDate now = LocalDate.now();
        long g = ChronoUnit.DAYS.between(now, giorno);
        int inizioGiorno, inizioMese, inizioAnno, fineGiorno, fineMese, fineAnno;
        LocalDate dataInizio, dataFine;
        String destinazione;
        Vacanza vacanza;

        //if (d2.isAfter(d1)){}

        System.out.println("Ciao siamo la tua travel agency, per che destinazione vuoi prenotare la tua vacanza?");
        destinazione = in.nextLine();
        System.out.println("Benissimo, per che giorno avevi intenzione di partire?");
        inizioGiorno = Integer.parseInt(in.nextLine());
        System.out.println("Di quale mese?");
        inizioMese = Integer.parseInt(in.nextLine());
        System.out.println("Di quale anno?");
        inizioAnno = Integer.parseInt(in.nextLine());
        dataInizio = LocalDate.of(inizioAnno, inizioMese, inizioGiorno);

        System.out.println("Benissimo, per che giorno avevi intenzione di tornare?");
        fineGiorno = Integer.parseInt(in.nextLine());
        System.out.println("Di quale mese?");
        fineMese = Integer.parseInt(in.nextLine());
        System.out.println("Di quale anno?");
        fineAnno = Integer.parseInt(in.nextLine());
        dataFine = LocalDate.of(fineAnno, fineMese, fineGiorno);


        try {
            vacanza = new Vacanza(destinazione, dataInizio, dataFine);
            System.out.println("Data inzio:" + dataInizio.format(df)); //11/10/2022!!!
            System.out.println("Data fine:" + dataFine.format(df));
            System.out.println("Durata:" + durataVacanza(dataInizio, dataFine));
            in.close();

        } catch (Exception e) {
            System.out.println("Le date inserite non sono valide!");
        }

    }
}