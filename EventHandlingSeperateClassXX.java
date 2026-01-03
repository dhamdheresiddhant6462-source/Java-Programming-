import javax.swing.*;
import java.awt.event.*;
import java.nio.MappedByteBuffer;

class MarvellousListener implements ActionListener
{
    public void actionPerformed(ActionEvent aobj)
            {
               JOptionPane.showMessageDialog(null, "Button Clicked...");;
            }

}

class EventHandlingSeperateClassXX
{
    public static void main(String A[])
    {
        JFrame fobj =new JFrame("PPA");
        JButton bobj = new JButton("OK");

        bobj.setBounds(100,100,150,50);
        
        MarvellousListener mobj = new MarvellousListener();

        bobj.addActionListener(new MarvellousListener());

        fobj.add(bobj);
        fobj.setLayout(null);

        fobj.setSize(400,300);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}