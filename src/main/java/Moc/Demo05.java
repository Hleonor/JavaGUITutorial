package Moc;

import javax.swing.*;
import java.awt.*;

public class Demo05 extends JFrame
{
    private JLabel jl = new JLabel("OK");
    private JTextField jTextField = new JTextField("ss", 14);
    private JPasswordField jpwf = new JPasswordField("ss", 14);
    private JTextArea jTextArea = new JTextArea(5, 25);
    private JScrollPane jScrollPane = new JScrollPane(jTextArea);
    private JButton jButton = new JButton("Henshin");
    private JCheckBox jCheckBox = new JCheckBox("数学", false);
    private JRadioButton jrb = new JRadioButton("男", true);
    /*private JComboBox jcb = new JComboBox(new String[]{"梅西", "阿尔瓦雷斯", "恩佐"});*/
    private JComboBox jcb = new JComboBox(
            new Object[]
                    {
                            new Student("阿库尼亚", "边后卫"),
                            new Student("德保罗", "中场"),
                            new Student("劳塔罗", "前锋")

                    }
    );
    private JList list = new JList(new Object[]
            {
                    new Student("罗梅罗", "中卫"),
                    new Student("利桑德罗 马丁内斯", "中卫"),
                    new Student("大马丁", "门将")

            });
    private JMenuBar jmb = new JMenuBar();
    private JMenu file = new JMenu("文件");
    private JMenu edit = new JMenu("编辑");
    private JMenu help = new JMenu("帮助");
    private JMenuItem open = new JMenuItem("打开");
    private JMenuItem save = new JMenuItem("保存");
    private Icon icon;

    public Demo05()
    {
        super("Demo05");
        this.setSize(600, 400);
        this.setLocation(200, 200);
        icon = new ImageIcon("src\\main\\java\\Moc\\res\\1.jpg"); // 不显示图片的原因在于路径问题

        jl.setIcon(icon);
        this.setLayout(new FlowLayout());
        this.add(jl);
        this.add(jTextField);
        this.add(jpwf);
        this.add(jScrollPane);
        this.add(jButton);
        this.add(jCheckBox);
        this.add(jrb);
        this.add(jcb);
        this.add(list);

        jmb.add(file);
        jmb.add(edit);
        jmb.add(help);
        file.add(open);
        file.add(save);
        this.setJMenuBar(jmb);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        new Demo05();
    }
}
