package day5;

public class Girl {
    private  String name;
    private int age;
    public void Girl(){
        System.out.println("无参构造方法");
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
}
