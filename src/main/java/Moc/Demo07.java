package Moc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ref.PhantomReference;

public class Demo07 extends JFrame
{
    private JTabbedPane top = new JTabbedPane(JTabbedPane.TOP);
    private JPanel pan = new JPanel();
    private JButton but1 = new JButton("OK");
    private JButton but2 = new JButton("cancel");

    private DefaultComboBoxModel dcm = new DefaultComboBoxModel();
    private JComboBox<String> jcom = new JComboBox<String>(dcm);
    private JTextField jtx = new JTextField(25);
    public Demo07() throws HeadlessException
    {
        super("Demo07");
        this.setSize(600, 400);
        this.setLocation(200, 200);
        dcm.addElement("Messi");

        pan.add(jcom);
        pan.add(jtx);

        pan.add(but1);

        top.add("第一卡", pan);
        top.add("第二卡", but2);
        this.add(top);

        but1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                dcm.addElement(jtx.getText());
            }
        });

        /*this.setBackground(Color.RED);
        Container c = this.getContentPane();
        c.setBackground(Color.BLUE);*/

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new Demo07();
    }
}
