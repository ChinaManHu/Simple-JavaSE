package priv.潮圆信寂.JavaSE.BasicPart.Method.Recursion;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/11
 */
public class HanoiTower {
    public static void main(String[] args) {
        //输入盘子数量，输出对应的汉诺塔操作
        ShowHanoiTower hanoiTower = new ShowHanoiTower();
        hanoiTower.showHanoiTower(5, 'A', 'B', 'C');
    }
}

class ShowHanoiTower {
    public void showHanoiTower(int number, char a, char b, char c)
    {
        if (number == 1)
        {
            System.out.println(a + "->" + c);
        }
        else
        {
            showHanoiTower(number - 1, a, c, b);
            System.out.println(a + "-->" + c);
            showHanoiTower(number - 1, b, a, c);
        }
    }
}