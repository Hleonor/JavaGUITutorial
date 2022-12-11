package Moc;

import java.awt.*;

public class Demo02 extends Frame
{
    private Button btn1 = new Button("btn1");
    private Button btn2 = new Button("btn2");
    private Button btn3 = new Button("btn3");
    private Button btn4 = new Button("btn4");
    private Button btn5 = new Button("btn5");
    public Demo02() throws HeadlessException
    {
        super("Demo02");
        this.setSize(600, 400);
        this.setLocation(200, 200);

        // 设置组件摆放规则，默认布局方式，东西南北中
        /*this.setLayout(new BorderLayout());*/
        this.setLayout(new FlowLayout());

        // 添加按钮
        this.add(btn1, BorderLayout.NORTH);
        this.add(btn2, BorderLayout.SOUTH);
        this.add(btn3, BorderLayout.CENTER);
        this.add(btn4, BorderLayout.WEST);
        this.add(btn5, BorderLayout.EAST);


        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        new Demo02();
    }
}
