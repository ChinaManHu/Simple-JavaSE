package priv.潮圆信寂.JavaSE.BasicPart.Method.Recursion;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/9
 */
public class RecursionExercise02 {
    public static void main(String[] args) {
        //老鼠出迷宫
        //0表示可以走，但是还没走的地方    1表示障碍物
        //2表示可以走的路线，可以理解为老鼠的行走路线    3表示老鼠走过，但是走不通，是死路
        //迷宫为八行七列（包括障碍物）    老鼠的初始位置为（1,1），出口为：（6,5），（i，j）为老鼠的当前所在位置

        //迷宫初始化
        int[][] map = new int[8][7];
        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                if (i == 0 || i == 7 || j == 0 || j == 6)
                {
                    map[i][j] = 1;
                }
                else
                {
                    map[i][j] = 0;
                }
            }
        }

        //设置障碍物
        map[2][1] = 1;
        map[2][2] = 1;
        FindWay fWay = new FindWay();
        fWay.findWay(map, 1, 1);

        //输出迷宫最终样图及老鼠的路线
        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class FindWay {
    public boolean findWay(int[][] map, int i,int j) {
        if (map[6][5] == 2)
        {
            return true;
        }
        else
        {
            if (map[i][j] == 0)
            {
                map[i][j] = 2;

                //老鼠的试探方向顺序为右下左上
                if (findWay(map, i + 1, j))
                {
                    return true;
                }
                else if (findWay(map, i, j + 1))
                {
                    return true;
                }
                else if (findWay(map, i - 1, j))
                {
                    return true;
                }
                else if (findWay(map, i, j - 1))
                {
                    return true;
                }
                else
                {
                    //老鼠四周都无法行走时
                    map[i][j] = 3;
                    return false;
                }
            }
            else
            {
                //map[i][j]为1,2,3时
                return false;
            }
        }
    }
}
