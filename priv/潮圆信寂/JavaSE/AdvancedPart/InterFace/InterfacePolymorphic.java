package priv.潮圆信寂.JavaSE.AdvancedPart.InterFace;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/4 13:52
 *
 */


public class InterfacePolymorphic {
    public static void main(String[] args) {
        //  简单的接口多态应用
        Usb usbs[] = new Usb[2];
        usbs[0] = new Phone("华为");
        usbs[1] = new Camera("OPPO");
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].insert();
            if (usbs[i] instanceof Phone)
            {
                ((Phone)usbs[i]).call();
            }
        }
    }
}

interface Usb {
    void insert();
}

class Phone implements Usb {
    private String name;

    public Phone(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void insert() {
        System.out.println(this.getName() + "  Usb插入成功...");
    }

    public void call() {
        System.out.println(this.getName() + "  语音拨号功能已启动");
    }
}


class Camera implements Usb {
    private String name;

    public Camera(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void insert() {
        System.out.println(this.getName() + "  Usb插入成功...");
    }
}