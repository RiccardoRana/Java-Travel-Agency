package it.Java;

import it.Java.Vacation.Vacanza;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import static it.Java.Vacation.Vacanza.durataVacanza;

public class Agenzia {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate giorno = LocalDate.of(2022, 10, 10);
        LocalDate now = LocalDate.now();
        long g = ChronoUnit.DAYS.between(now, giorno);
        int inizioGiorno, inizioMese, inizioAnno, fineGiorno, fineMese, fineAnno;
        LocalDate dataInizio, dataFine;
        String destinazione;



        //if (d2.isAfter(d1)){}

        System.out.println("Ciao siamo la tua travel agency, per che destinazione vuoi prenotare la tua vacanza?");
        destinazione = in.nextLine();
        System.out.println("Benissimo, per che giorno avevi intenzione di partire?");
        inizioGiorno = in.nextInt();
        System.out.println("Di quale mese?");
        inizioMese = in.nextInt();
        System.out.println("Di quale anno?");
        inizioAnno = in.nextInt();
        dataInizio = LocalDate.of(inizioAnno, inizioMese, inizioGiorno);
        System.out.println(dataInizio);

        System.out.println("Benissimo, per che giorno avevi intenzione di tornare?");
        fineGiorno = in.nextInt();
        System.out.println("Di quale mese?");
        fineMese = in.nextInt();
        System.out.println("Di quale anno?");
        fineAnno = in.nextInt();
        dataFine = LocalDate.of(fineAnno, fineMese, fineGiorno);
        System.out.println(dataFine);

        if (dataInizio.isAfter(dataFine))
            System.out.println("La data d'inizio non può essere dopo quella della fine!");
        else {

            try {
                Vacanza vacanza = new Vacanza(destinazione, dataInizio, dataFine);
                System.out.println("Hai prenotato la tua vacanza!");
                System.out.println("Data inizio:" + dataInizio.format(df)); //11/10/2022!!!
                System.out.println("Data fine:" + dataFine.format(df));
                System.out.println("Durata:" + durataVacanza(dataInizio, dataFine));


            } catch (Exception e) {
                System.out.println("Non valido");
            }
            in.close();
        }
    }
}