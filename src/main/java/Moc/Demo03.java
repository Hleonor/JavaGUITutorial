package Moc;

import javax.swing.*;
import java.awt.*;

public class Demo03 extends Frame
{
    // 定义三个盒子
    private Box box1 = Box.createHorizontalBox();
    private Box box2 = Box.createVerticalBox();
    private Box box3 = Box.createHorizontalBox();

    // 定义五个按钮
    private Button btn1 = new Button("btn1");
    private Button btn2 = new Button("btn2");
    private Button btn3 = new Button("btn3");
    private Button btn4 = new Button("btn4");
    private Button btn5 = new Button("btn5");

    public Demo03()
    {
        super("Demo03");
        this.setSize(600, 400);

        box1.add(btn1);
        box1.add(Box.createHorizontalGlue());
        box1.add(btn2);
        box2.add(btn3);
        box2.add(Box.createHorizontalStrut(30));
        box2.add(btn4);
        box3.add(box1);
        box3.add(box2);

        this.add(box3);
        this.setLocation(200, 200);
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        new Demo03();
    }
}
