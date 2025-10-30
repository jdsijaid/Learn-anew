package day13;

import java.util.Arrays;

public class llj {
    String name;
    int age;
    String sex;
    llj spouse; // 配偶属性

    public llj(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void show() {
        System.out.println("姓名：" + name + "  年龄：" + age + "  性别：" + sex);
    }

    public void findGirlFriend() {
        System.out.println("开始找女朋友");
        try {
            System.out.println("向ta发邮件");
            System.out.println("向ta发短信");
            System.out.println("向ta发电话");
            System.out.println("向ta交朋友");
            System.out.println("恭喜你，找到女朋友");
        } catch (Exception e) {
            System.out.println("对不起，没有找到女朋友");
        }
    }

    // 结婚方法
    public void marry(llj partner) {
        if (this.spouse != null) {
            System.out.println(this.name + " 已经结婚了！");
            return;
        }

        if (partner.spouse != null) {
            System.out.println(partner.name + " 已经结婚了！");
            return;
        }

        this.spouse = partner;
        partner.spouse = this;
        System.out.println(this.name + " 和 " + partner.name + " 结婚了！恭喜！");
    }

    // 离婚方法
    public void divorce() {
        if (this.spouse == null) {
            System.out.println(this.name + " 还没有结婚！");
            return;
        }

        System.out.println(this.name + " 和 " + this.spouse.name + " 离婚了！");
        this.spouse.spouse = null;
        this.spouse = null;
    }

    // 显示婚姻状态
    public void showMarriageStatus() {
        if (this.spouse == null) {
            System.out.println(this.name + " 目前单身");
        } else {
            System.out.println(this.name + " 已婚，配偶是 " + this.spouse.name);
        }
    }
}

class Test {
    public static void main(String[] args) {
        // 创建llj对象
        llj llj = new llj("llj", 18, "男");

        // 创建苏骚峰对象
        llj susaofeng = new llj("苏骚峰", 20, "男");

        // 显示初始信息
        llj.show();
        susaofeng.show();

        // llj先和别人结婚
        llj marrySomeone = new llj("小红", 19, "女");
        llj.marry(marrySomeone);
        llj.showMarriageStatus();

        // 离婚
        llj.divorce();
        llj.showMarriageStatus();

        // llj和苏骚峰再婚
        llj.marry(susaofeng);
        llj.showMarriageStatus();
        susaofeng.showMarriageStatus();
        System.out.println();
        System.out.println("llj = " + llj);
        System.out.println("args = " + Arrays.toString(args));
    }
}
