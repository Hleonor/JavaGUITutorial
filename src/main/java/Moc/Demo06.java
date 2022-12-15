package Moc;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class Demo06 extends JFrame
{
    private JPanel pan = new JPanel();
    private JButton but = new JButton("OK");
    private JTextField jtx = new JTextField(25);
    private JCheckBox jcb = new JCheckBox("Messi", true);
    private JComboBox<String> jcom = new JComboBox<String>(new String[]{"Messi", "Zidane", "Neymar"});
    public void initListener()
    {
        /*jcb.addChangeListener(new ChangeListener()
        {
            @Override
            public void stateChanged(ChangeEvent e)
            {
                jtx.setText("~~" + jcb.isSelected());
                // JOptionPane.showMessageDialog(null, "~~" + jcb.isSelected() );
            }
        });*/
        jcom.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                jtx.setText(jcom.getSelectedItem().toString());
            }
        });

        jcb.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //jtx.setText("~~" + jcb.isSelected());
                JOptionPane.showMessageDialog(null, "~~" + jcb.isSelected() );
            }
        });

        but.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String txt = jtx.getText();
                // JOptionPane.showMessageDialog(null, "HELLO");
                Demo06.this.setTitle(txt);
            }
        });
        jtx.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String txt = jtx.getText();
                // JOptionPane.showMessageDialog(null, "HELLO");
                Demo06.this.setTitle(txt);
            }
        });

        jtx.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseEntered(MouseEvent e)
            {
                jtx.setBackground(Color.lightGray);
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                jtx.setBackground(Color.BLACK);
            }
        });

        jtx.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                if (e.getKeyCode() == KeyEvent.VK_F4)
                {
                    System.exit(0);
                }
            }

        });
    }

    public Demo06() throws HeadlessException
    {
        super("Demo06");
        this.setSize(600, 400);
        pan.add(jtx);
        pan.add(but);
        pan.add(jcb);
        pan.add(jcom);

        this.initListener();
        this.add(pan);

        this.setLocation(200, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new Demo06();
    }
}
