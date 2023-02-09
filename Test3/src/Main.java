import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        B pointZ = new B(3,5);
        try{
            pointZ.move(2);
        }
        catch (MovementNotPermitted exc){
            exc.printStackTrace();
        }
        try{
            program(pointZ);
        }
        catch(MovementNotPermitted exc){
            exc.printStackTrace();
        }
    }
    public static void program(B point) throws MovementNotPermitted {
        String z = "";
        while(point.getX()!= point.getY())
            z = JOptionPane.showInputDialog("Please enter:\n0-to move right\n1-to move up\n2-to move down\n3-to move left");
            point.move(Integer.parseInt(z));
    }
}