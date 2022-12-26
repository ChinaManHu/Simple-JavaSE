package priv.潮圆信寂.JavaSE.MiddlePart.WorkInThisChapter;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/29
 */
public class Exercise06 {
    public static void main(String[] args) {
//        设计一个Point类， 其x和y坐标可以通过构造器提供。
//        提供一个子类LabeledPoint,其构造器接受一个标签值和x,y坐标,
//        比如:new LabeledPoint( "BlackThursday" ,1929,230.07),写出对应的构造器即可
        LabeledPoint labeledPoint = new LabeledPoint("BlackThursday", 1929, 230.07);
        labeledPoint.toString();
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class LabeledPoint extends Point {
    String  label;

    public LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    @Override
    public String toString() {
        return "LabeledPoint{" +
                "label='" + this.label + '\'' +
                '}';
    }
}