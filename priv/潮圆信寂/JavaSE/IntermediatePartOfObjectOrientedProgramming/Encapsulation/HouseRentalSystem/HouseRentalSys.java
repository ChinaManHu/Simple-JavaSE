package priv.潮圆信寂.JavaSE.IntermediatePartOfObjectOrientedProgramming.Encapsulation.HouseRentalSystem;

import java.util.Scanner;

/**
 * @author 潮圆信寂
 * @date 2022/9/2
 */
public class HouseRentalSys {
    public static void main(String[] args) {
        //面向过程编程的房屋出租系统
        //用于退出系统
        boolean loop = true;
        //显示用户对房屋出租系统功能的选择
        int choice;
        //房屋编号
        String number;
        //房屋主人姓名
        String houseOwner;
        //房主联系电话
        String telephoneNumber;
        //出租房的具体位置
        String location;
        //房屋的月租
        String monthlyRent;
        //房屋的出租状态
        String houseStatus;
        //用户查找房屋时输入的相关房屋查找提示信息
        String tips;
        //显示待删除的房屋编号
        String numberOfDelete;
        //显示待修改的房屋编号
        String numberOfChange;
        //用于确认是否删除
        String confirmSelection;
        //显示修改后的房屋信息
        String informationOfChanged;
        //用于判断是否确认退出系统
        String confirm;
        Scanner scanner = new Scanner(System.in);
        //初始定义房屋数量和房屋初始信息
        String[][] houseInformation = new String[2][6];
        houseInformation[0][0] = "1";
        houseInformation[0][1] = "潮圆信寂";
        houseInformation[0][2] = "15270338364";
        houseInformation[0][3] = "上饶万达广场";
        houseInformation[0][4] = "5000";
        houseInformation[0][5] = "已出租";
        houseInformation[1][0] = "2";
        houseInformation[1][1] = "胡昊天";
        houseInformation[1][2] = "18679352810";
        houseInformation[1][3] = "红谷滩万达广场";
        houseInformation[1][4] = "10000";
        houseInformation[1][5] = "未出租";
        do {
            //显示系统功能选择列表
            System.out.println("---------------房屋出租系统------------------");
            System.out.println("\t\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t\t6 退 出 系 统");
            System.out.print("请输入您的选择（1~6）:");
            //输入选择的系统某个功能
            choice = scanner.nextInt();
            //判断根据用户提供的提示信息是否存在此房屋
            boolean key = false;
            switch (choice) {
                case 1:
                    //新增房源时对原有数组的扩容
                    String[][] temp = new String[houseInformation.length + 1][6];
                    for (int i = 0; i < houseInformation.length; i++) {
                        for (int j = 0; j < 6; j++) {
                            temp[i][j] = houseInformation[i][j];
                        }
                    }
                    houseInformation = temp;
                    //输入新增房源的各类信息
                    System.out.println("------------------添加房屋------------------");
                    System.out.print("房屋编号：");
                    number = scanner.next();
                    System.out.print("房主姓名：");
                    houseOwner = scanner.next();
                    System.out.print("房主电话：");
                    telephoneNumber = scanner.next();
                    System.out.print("房屋地址：");
                    location = scanner.next();
                    System.out.print("房屋月租金额：");
                    monthlyRent = scanner.next();
                    System.out.print("房屋状态(已出租/未出租)：");
                    houseStatus = scanner.next();
                    houseInformation[houseInformation.length - 1][0] = number;
                    houseInformation[houseInformation.length - 1][1] = houseOwner;
                    houseInformation[houseInformation.length - 1][2] = telephoneNumber;
                    houseInformation[houseInformation.length - 1][3] = location;
                    houseInformation[houseInformation.length - 1][4] = monthlyRent;
                    houseInformation[houseInformation.length - 1][5] = houseStatus;
                    System.out.println("------------------添加完成------------------");
                    break;
                case 2:
                    System.out.println("------------------查找房屋------------------");
                    System.out.print("请输入你要查找的相关房屋提示信息：");
                    //用户输入查找房屋时需要提供的相关房屋信息
                    tips = scanner.next();
                    //遍历数组，根据用户给出的提示信息查找房屋
                    for (int i = 0; i < houseInformation.length; i++) {
                        for (int j = 0; j < 6; j++) {
                            if (houseInformation[i][j].equals(tips)) {
                                key = true;
                                for (int k = 0; k < 6; k++) {
                                    System.out.print(houseInformation[i][k] + "\t\t\t");
                                }
                                System.out.println();
                            }
                        }
                    }
                    if (key == false) {
                        System.out.println("------------------查无房屋!-----------------");
                    }
                    break;
                case 3:
                    System.out.println("------------------删除房屋------------------");
                    System.out.print("请输入待删除的房屋顺序号位：");
                    numberOfDelete = scanner.next();
                    for (int i = 0; i < houseInformation.length; i++) {
                        if (numberOfDelete.equals(houseInformation[i][0])) {
                            System.out.print("确认是否删除(Y/N)，请小心选择：");
                            confirmSelection = scanner.next();
                            if ("Y".equals(confirmSelection)) {
                                //删除房源时对数组进行缩减
                                temp = new String[houseInformation.length - 1][6];
                                //创建中间数组存储原数组内容
                                for (int x = 0; x < temp.length; x++) {
                                    for (int y = 0; y < 6; y++) {
                                        if (x < Integer.parseInt(numberOfDelete) - 1) {
                                            temp[x][y] = houseInformation[x][y];
                                        } else if (x >= Integer.parseInt(numberOfDelete) - 1) {
                                            temp[x][y] = houseInformation[x + 1][y];
                                        }
                                    }
                                }
                                houseInformation = temp;
                                System.out.println("------------------删除完成------------------");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("---------------修改房屋信息------------------");
                    System.out.print("请输入待修改的房屋编号：");
                    numberOfChange = scanner.next();
                    for (int i = 0; i < houseInformation.length; i++) {
                        if (houseInformation[i][0].equals(numberOfChange))
                        {
                            //查找到需修改的房屋后，对房屋信息进行修改
                            System.out.print("房屋编号(" + houseInformation[i][0] + ")修改为：");
                            informationOfChanged = scanner.next();
                            houseInformation[i][0] = informationOfChanged;
                            System.out.print("房主姓名(" + houseInformation[i][1] + ")修改为：");
                            informationOfChanged = scanner.next();
                            houseInformation[i][1] = informationOfChanged;
                            System.out.print("房主电话(" + houseInformation[i][2] + ")修改为：");
                            informationOfChanged = scanner.next();
                            houseInformation[i][2] = informationOfChanged;
                            System.out.print("房屋地址(" + houseInformation[i][3] + ")修改为：");
                            informationOfChanged = scanner.next();
                            houseInformation[i][3] = informationOfChanged;
                            System.out.print("房屋租金(" + houseInformation[i][4] + ")修改为：");
                            informationOfChanged = scanner.next();
                            houseInformation[i][4] = informationOfChanged;
                            System.out.print("房屋出租状态(" + houseInformation[i][5] + ")修改为：");
                            informationOfChanged = scanner.next();
                            houseInformation[i][5] = informationOfChanged;
                            System.out.println("------------------修改完成------------------");
                        }
                    }
                    break;
                case 5:
                    System.out.println("---------------房 屋 列 表------------------");
                    System.out.println("编号 房主 电话 地址 月租 状态(未出租/已出租)");
                    //打印所有房屋信息
                    for (int i = 0; i < houseInformation.length; i++) {
                        for (int j = 0; j < houseInformation[0].length; j++) {
                            System.out.print(houseInformation[i][j] + "\t\t\t");
                        }
                        System.out.println();
                    }
                    System.out.println("---------------房屋列表完成------------------");
                    break;
                case 6:
                    System.out.print("确认退出系统吗(Yes/No)：");
                    confirm = scanner.next();
                    if ("Yes".equals(confirm))
                    {
                        loop = false;
                        System.out.println("正在退出系统！！！");
                    }
                    else
                    {
                        System.out.println("请继续使用！");
                        continue;
                    }
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！！！");
            }
        } while (loop);
    }
}
