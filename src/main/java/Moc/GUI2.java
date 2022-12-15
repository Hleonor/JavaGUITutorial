package Moc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI2 extends Frame
{
    private Panel p = new Panel();
    private Button button = new Button("OK");
    private Button button_1 = new Button("cancel");

    public GUI2() throws HeadlessException
    {
        super("GUI2");
        this.setSize(600, 400);

        p.add(button);
        p.add(button_1);
        this.add(p);

        button.addFocusListener(new FocusListener()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                GUI2.this.setTitle(e.getSource() + "获得焦点");
                //JOptionPane.showMessageDialog(null, "获得了焦点");
            }

            @Override
            public void focusLost(FocusEvent e)
            {

            }
        });
        button.addActionListener(new MyClick());


        // 给事件源注册一个窗口处理器
        this.addWindowListener(new MyListener());

        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        new GUI2();
    }
}

class MyListener implements WindowListener
{
    @Override
    public void windowOpened(WindowEvent e)
    {

    }

    @Override
    public void windowClosing(WindowEvent e)
    {
        System.out.println("你单击了关闭X");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e)
    {

    }

    @Override
    public void windowIconified(WindowEvent e)
    {

    }

    @Override
    public void windowDeiconified(WindowEvent e)
    {

    }

    @Override
    public void windowActivated(WindowEvent e)
    {

    }

    @Override
    public void windowDeactivated(WindowEvent e)
    {

    }
}

class MyClick implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(null, "你单击了" + e.getActionCommand());
    }
}
