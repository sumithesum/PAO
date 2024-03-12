package lab2.task6.prob1;

public class Romb extends  Paralelogram {
    public int diagonala1,diahonala2;

    public Romb(){
        this(0,0,0,0);
    }
    public  Romb(int latura1,int latura2 , int d1 , int d2){
       super(latura1,latura2,latura1,latura2);
       this.diagonala1 = d1;
       this.diahonala2 = d2;
    }
    @Override
    public double aria(){
       return  (this.diagonala1 * this.diahonala2) / 2;
    }
}
