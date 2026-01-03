import javax.swing.*;
import java.awt.event.*;

class MarvellousListener implements ActionListener
{
    public void actionPerformed(ActionEvent aobj)
            {
                System.out.println("Button Clicked");
            }

}

class EventHandlingSeperateClassX
{
    public static void main(String A[])
    {
        JFrame fobj =new JFrame("PPA");
        JButton bobj = new JButton("OK");

        bobj.setBounds(100,100,150,50);

        MarvellousListener = new MarvellousListener();

        bobj.addActionListener(new MarvellousListener());

        fobj.add(bobj);
        fobj.setLayout(null);

        fobj.setSize(400,300);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}