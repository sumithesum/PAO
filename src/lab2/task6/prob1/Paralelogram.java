package lab2.task6.prob1;

public class Paralelogram extends Patrulater {

    public  Paralelogram(int l1,int l2 ,int l3, int l4){
        super(l1,l2,l3,l4);
    }
    public Paralelogram(int lungime , int latime,double unghi1){
        super(lungime,latime,lungime,latime);
        this.unghi1 = unghi1;
    }
    @Override
    public double aria(){
        return this.latura1 * this.latura2 * Math.sin(Math.toRadians(this.unghi1));
    }
}
