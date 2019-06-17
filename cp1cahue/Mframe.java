import javax.swing.JFrame;

public class Mframe{
    public static void main(String[] args){
        JFrame frame = new JFrame ("MM");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        MMmouse r = new MMmouse ();
        frame.add(r);
        frame.setVisible(true);
    }
}