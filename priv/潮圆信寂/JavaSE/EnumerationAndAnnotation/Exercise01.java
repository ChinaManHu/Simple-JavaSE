package priv.潮圆信寂.JavaSE.EnumerationAndAnnotation;

/**
 *
 * @author 潮圆信寂
 * @date 2022/12/29 20:40
 *
 */

/*
枚举类
1.创建一个Color枚举类
2.有RED,BLUE,BLACK,YELLOW,GREEN这个五个枚举值/对象;
3. Color有三个属性redValue, greenValue, blueValue,
4.创建构造方法，参数包括这三个属性，
5.每个枚举值都要给这三个属性赋值，三个属性对应的值分别是
6. red: 255,0,0 blue:0,0,255 black:0,0,0 yellow:255,255,0 green:0,255,0
7.定义接口，里面有方法show,要求Color实现该接口
8. show方法中显示三属性的值
9.将枚举对象在switch语句中匹配使用
 */


public class Exercise01 {
    public static void main(String[] args) {
        Color[] colors = new Color[5];
        colors[0] = Color.RED;
        colors[1] = Color.BLUE;
        colors[2] = Color.BLACK;
        colors[3] = Color.YELLOW;
        colors[4] = Color.GREEN;
        for (int i = 0; i < colors.length; i++) {
            Color color = colors[i];
            switch (color)
            {
                case RED:
                    color.showColor();
                    break;
                case BLUE:
                    color.showColor();
                    break;
                case BLACK:
                    color.showColor();
                    break;
                case YELLOW:
                    color.showColor();
                    break;
                case GREEN:
                    color.showColor();
                    break;
                default:
                    System.out.println("Error!");
            }
        }
    }
}

enum Color implements ShowColor{
    RED(255,0,0), BLUE(0,0,255),
    BLACK(0,0,0), YELLOW(255,255,0),
    GREEN(0,255,0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void showColor() {
        System.out.println("蓝值" + this.blueValue);
        System.out.println("绿值" + this.greenValue);
        System.out.println("红值" + this.redValue);
        System.out.println();
    }

}

interface ShowColor {
    public void showColor();
}
