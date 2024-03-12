package lab2.task6.prob1;

public class Patrat extends Dreptunghi {
    public Patrat(int lungime){
        super(lungime,lungime);
    }
    @Override
    public double aria(){
        return this.latura1 * this.latura2;
    }
}
