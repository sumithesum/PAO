package lab6.task1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LisaStudenti lisaStudenti = new LisaStudenti();

        lisaStudenti.addStudent(new Student.Builder()
                .setNume("Petru")
                .setLaborator(10)
                .setPartial(8)
                .setExamen(10)
                .build());

        lisaStudenti.addStudent(new Student.Builder()
                .setNume("Andrei")
                .setLaborator(7)
                .setPartial(9)
                .setExamen(10)
                .build());

        lisaStudenti.addStudent(new Student.Builder()
                .setNume("Mitza")
                .setLaborator(6)
                .setPartial(7)
                .setExamen(8)
                .build());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        ///Strategy pattern
        if (number  == 0){
            lisaStudenti.sortareMaiMare();
            lisaStudenti.afisare();

        }else if (number == 1){
            lisaStudenti.sortarePartial();
            lisaStudenti.afisare();

        }else if (number == 2){
            lisaStudenti.sorareMedie();
            lisaStudenti.afisare();

        }

    }
}
