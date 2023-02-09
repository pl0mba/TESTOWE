public class Donkey {
    private double mass;
    private static Balloons[] balloons;
    int amountofBalloons = 0;

    public Donkey(double mass){
       this.mass = Math.random()*0.01;
    }
    public void addBalloons(Balloons b){
        Balloons newArr[] = new Balloons[balloons.length+1];
        for(int i=0; i<balloons.length; i++){
            newArr[i] = balloons[i];
        }
        newArr[amountofBalloons] = new Balloons();
        amountofBalloons++;
        balloons = newArr;
    }
    public boolean isFlying(Balloons[] balloons){
        int load = 0;
        for (int i = 0; i < balloons.length; i++) {
            load += balloons[i].getLoad();
        }
        if(load>=this.mass)
            return true;
        return false;
    }
}
