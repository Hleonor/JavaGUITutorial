package Moc;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;

public class Login extends JFrame
{
    private Box box0 = Box.createHorizontalBox();
    private Box box1 = Box.createHorizontalBox();
    private Box box2 = Box.createHorizontalBox();
    private Box box3 = Box.createHorizontalBox();
    private Box box4 = Box.createVerticalBox();

    Icon icon = null;
    private JLabel top = new JLabel();
    private JLabel luser = new JLabel("用户名：");
    private JLabel lpasswd = new JLabel("密  码：");
    private JTextField user = new JTextField(20);
    private JPasswordField pwd = new JPasswordField(20);
    private JButton btn1 = new JButton("登录");
    private JButton btn2 = new JButton("取消");

    public void init()
    {
        this.setResizable(false); // 取消窗口大小自适应
        icon = new ImageIcon("src\\main\\java\\Moc\\res\\2.jpeg");
        top.setSize(377, 300  );
        top.setIcon(icon);

        box0.add(top);

        box1.add(Box.createHorizontalStrut(40));
        box1.add(luser);
        box1.add(user);
        box1.add(Box.createHorizontalStrut(60));

        box2.add(Box.createHorizontalStrut(40));
        box2.add(lpasswd);
        box2.add(pwd);
        box2.add(Box.createHorizontalStrut(60));

        box3.add(btn1);
        box3.add(Box.createHorizontalStrut(40));
        box3.add(btn2);

        box4.add(box0);
        box4.add(Box.createVerticalStrut(30));
        box4.add(box1);
        box4.add(Box.createVerticalStrut(30));
        box4.add(box2);
        box4.add(Box.createVerticalStrut(30));
        box4.add(box3);
        box4.add(Box.createVerticalStrut(30));

        this.add(box4);
    }
    public Login()
    {
        super("Login");
        this.setSize(840, 625);

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize(); // Dimension就是封装高度和宽度的
        int width = (int)dimension.getWidth();
        int height = (int)dimension.getHeight();
        System.out.println(width + "\t" + height);
        this.setLocation((width - 840) / 2, (height - 625) / 2);

        init();

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new Login();
    }
}
