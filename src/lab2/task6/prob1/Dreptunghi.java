package lab2.task6.prob1;

public class Dreptunghi  extends  Paralelogram{
    public Dreptunghi (int lungime , int latime){
        super(lungime,latime,lungime,latime);
    }
    @Override
    public double aria(){
        return this.latura1 * this.latura2;
    }
}
