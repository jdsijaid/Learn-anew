package day5;

public class Boy {
    private String name;
    private int age;
    public void setAge(int age){
        this.age = age;

    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void marry(Boy boy){
        System.out.println("我想娶"+boy.getName());
        boy.marry(this);
    }
    public int compare(Girl girl){
        if(this.age > girl.getAge()){
            return 1;

        }
        else if(this.age < girl.getAge()){
            return -1;
        }
        else{
            return 0;
        }

    }

}
