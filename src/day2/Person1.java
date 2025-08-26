package day2;

public class Person1 {
    String name;
    /**
     * 这是年龄
     */
    int age;
    /**
     * 这是性别如果是0就是女生，如果是1就是男生
     */
    int sex;

    public void study(){
        System.out.println("study");
    }
    public void showAge(){
        System.out.println(age);
    }
    public int addAge(int i){
        return age+=i;
    }
}
