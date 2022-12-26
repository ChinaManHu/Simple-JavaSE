package priv.潮圆信寂.JavaSE.BasicPart;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/5
 */
public class ObjectDemo1 {
    public static void main(String[] args) {
        LeadingRole role1 = new LeadingRole();
        role1.age = 18;
        role1.name = "牧寒";
        role1.sect = "至尊道场";
        role1.strength = "灵海六变";
        LeadingRole role2 = new LeadingRole();
        role2.age = 21;
        role2.name = "胡昊天";
        role2.sect = "逍遥派";
        role2.strength = "斗帝";
        System.out.print("主角的相关信息：\n");
        System.out.println(role1.name);
        System.out.println(role1.age);
        System.out.println(role1.sect);
        System.out.println(role1.strength);
        System.out.println(role2.name);
        System.out.println(role2.age);
        System.out.println(role2.sect);
        System.out.println(role2.strength);
    }
}
class LeadingRole {
    int age;
    String name;
    String sect;
    String strength;
}
