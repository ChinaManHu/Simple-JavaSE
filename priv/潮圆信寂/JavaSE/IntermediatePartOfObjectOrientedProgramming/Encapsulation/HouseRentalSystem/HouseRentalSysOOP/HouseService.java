package priv.潮圆信寂.JavaSE.IntermediatePartOfObjectOrientedProgramming.Encapsulation.HouseRentalSystem.HouseRentalSysOOP;

/**
 *
 *@author 潮圆信寂
 *@date 2022/9/6
 */
public class HouseService {
    private House[] houses;

    public HouseService(int size) {
        //初始化数组大小
        houses = new House[size];
        //测试
        houses[0] = new House("1", "潮圆信寂", "110", "上饶", "6666", "未出租");
    }

    public House[] list() {
        return houses;
    }
}
