package priv.潮圆信寂.JavaSE.ProgramControlStructure;

/**
 * @author 潮圆信寂
 * @date 2022/7/30
 */
public class ContinueDetail {
    public static void main(String[] args) {
        label1:
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            label2:
            for (int j = 11; j <= 15; j++) {
                System.out.println(j);
//                continue label1;
//                1
//                11
//                2
//                11
//                3
//                11
//                4
//                11
//                5
//                11
//                continue label2;
//                1
//                11
//                12
//                13
//                14
//                15
//                2
//                11
//                12
//                13
//                14
//                15
//                3
//                11
//                12
//                13
//                14
//                15
//                4
//                11
//                12
//                13
//                14
//                15
//                5
//                11
//                12
//                13
//                14
//                15
            }
        }
    }
}
