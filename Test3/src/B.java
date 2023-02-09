public class B extends A{
    boolean right = true;
    boolean left = true;
    public B(int x, int y){
        super(x,y);
    }

    @Override
    public void move(int i) throws MovementNotPermitted{
        if(i==0)
            x+=1;
        if(i==1)
            y+=1;
        if(i==2)
            y-=1;
        if(i==3)
            x-=1;
    }
}
