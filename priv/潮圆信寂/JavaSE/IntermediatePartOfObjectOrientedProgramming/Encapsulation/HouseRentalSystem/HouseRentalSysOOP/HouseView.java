package priv.潮圆信寂.JavaSE.IntermediatePartOfObjectOrientedProgramming.Encapsulation.HouseRentalSystem.HouseRentalSysOOP;

/**
 * @author 潮圆信寂
 * @date 2022/9/5
 */
public class HouseView {
    //控制显示菜单
    private boolean loop = true;
    //接受用户选择
    private char choice;
    private HouseService houseService = new HouseService(10);
    public void listHouses() {
        System.out.println("---------------房 屋 列 表------------------");
        System.out.println("\t\t编号\t房主\t\t电话\t地址\t月租\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null)
            {
                break;
            }
            System.out.println(houses[i].toString());
        }
        System.out.println("---------------显 示 完 毕------------------");
    }
    public void mainView() {
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
            choice = Utility.readChar();
            switch (choice) {
                case '1':
                    System.out.println("------------------添加房屋------------------");
                    break;
                case '2':
                    System.out.println("------------------查找房屋------------------");
                    break;
                case '3':
                    System.out.println("------------------删除房屋------------------");
                    break;
                case '4':
                    System.out.println("---------------修改房屋信息------------------");
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    loop = false;
                    System.out.println("正在退出系统！！！");
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！！！");
            }
        } while (loop);
    }
}
