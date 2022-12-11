package Moc;

import java.awt.*;

public class Demo01 extends Frame
{
    private Button btn = new Button("OK");
    public Demo01()
    {
        super("第一个窗口");
        this.setSize(600, 400);
        this.add(btn);
        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        Demo01 demo01 = new Demo01();
        System.out.println("Hello world!");
    }
}