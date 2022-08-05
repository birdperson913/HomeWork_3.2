public class BmiService {
    public double calculate(double mass, double height){
          double IMT = (mass *10000) /(height*height);
        return  IMT;
    }
}
