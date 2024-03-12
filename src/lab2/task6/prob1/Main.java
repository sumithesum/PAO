package lab2.task6.prob1;

public class Main {
    public static void main(String[] args) {
        Patrulater patrat = new Patrat(5);
        Patrulater dreptunghi = new Dreptunghi(10,5);
        Patrulater romb = new Romb(10,20,17,2);
        Patrulater paralelogram = new Paralelogram(10,20,60);
        System.out.println("Aria patratului este : " + patrat.aria());
        System.out.println("Aria dreptunghiului este : " + dreptunghi.aria());
        System.out.println("Aria rombului este : " + romb.aria());
        System.out.println("Aria paralelogramului este : " + paralelogram.aria());


    }
}
