package Moc;

import java.awt.*;

public class Demo04 extends Frame
{
    private Button btn1 = new Button("OK");
    private TextField tx = new TextField("input", 25);
    private TextField pw = new TextField("pw", 25);
    private Label label = new Label("Hello"); // 复选框
    private Choice choice = new Choice();
    // 单选框
    private CheckboxGroup group = new CheckboxGroup();
    public Demo04() throws HeadlessException
    {
        super("Demo04");
        this.setSize(600, 400);
        this.setLocation(200, 200);
        this.setLayout(new FlowLayout());
        this.add(btn1);
        this.add(tx);
        this.add(pw);
        pw.setEchoChar('*');
        this.add(label);
        this.add(new Checkbox("one", null, true));
        choice.add("Green");
        choice.add("Red");
        choice.add("Blue");
        this.add(choice);
        this.add(new Checkbox("two", group, false));

        this.setVisible(true);
    }

    public static void main(String[] args)
    {
        new Demo04();
    }
}
