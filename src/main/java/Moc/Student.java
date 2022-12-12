package Moc;

public class Student
{
    private String name;
    private String position;

    public Student(String name, String position)
    {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
