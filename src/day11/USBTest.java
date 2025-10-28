package day11;
/*接口实际上就是定义一种规范

* */
public class USBTest {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        m.connect();
        m.unconnect();
        computer c = new computer();
        c.connect(m);
    }

}
class computer{
    public void connect(USB usb){
        usb.connect();
    }

}
interface USB{
    public abstract void connect();
    public abstract void unconnect();
}
class Mouse implements USB{
    @Override
    public void connect() {
        System.out.println("鼠标连接成功");
    }
    @Override
    public void unconnect() {
        System.out.println("鼠标断开连接");
    }
}

