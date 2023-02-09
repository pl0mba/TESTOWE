public class Balloons {
    double vol, liftweight;
    Balloons(){
        this.vol = Math.random()*(0.009-0.005) + 0.005;
        liftweight = (vol/0.007)*6;
    }
    public double getLoad(){
        return liftweight;
    }

}
