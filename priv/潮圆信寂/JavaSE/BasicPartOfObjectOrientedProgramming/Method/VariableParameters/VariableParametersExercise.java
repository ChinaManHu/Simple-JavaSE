package priv.潮圆信寂.JavaSE.BasicPartOfObjectOrientedProgramming.Method.VariableParameters;

import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/12
 */
public class VariableParametersExercise {
    public static void main(String[] args) {
        //可变参数的简单应用
        //输出学生及不同数量学科成绩的总和
        ShowScore showScore = new ShowScore();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生的姓名：");
        String name = scanner.next();
        System.out.println(showScore.showScore(name, 88, 99));
        System.out.println(showScore.showScore(name, 99, 100, 119));
        System.out.println(showScore.showScore(name, 88, 99, 100, 110, 119));
    }
}

class ShowScore {
    public String showScore(String name, int...score)
    {
        int totalScore = 0;
        for (int i = 0; i < score.length; i++)
        {
            totalScore += score[i];
        }
        String ts = Integer.toString(totalScore);
        return name + ts;
    }
}