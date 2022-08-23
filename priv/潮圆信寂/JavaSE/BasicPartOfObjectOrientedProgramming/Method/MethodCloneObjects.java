package priv.潮圆信寂.JavaSE.BasicPartOfObjectOrientedProgramming.Method;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/8
 */
public class MethodCloneObjects {
    public static void main(String[] args) {
        PersonFive personFive1 = new PersonFive();
        personFive1.age = 18;
        personFive1.name = "小明";
        PersonCopyTools personCopyTools = new PersonCopyTools();
        //此时的personFive5和personFive1都是PersonFive的对象，但是彼此独立，只是属性相同
        PersonFive personFive5 = personCopyTools.copyObject(personFive1);
        if (personFive5 == personFive1)
        {
            System.out.println("personFive1和personFive5相等");
        }
        else
        {
            System.out.println("personFive1和personFive5不相等");
        }
        if (personFive1 == personFive1)
        {
            System.out.println("personFive1和personFive1相等");
        }
        else
        {
            System.out.println("personFive1和personFive1不相等");
        }
    }
}

class PersonFive {
    String name;
    int age;
}

class PersonCopyTools {
    public PersonFive copyObject(PersonFive personFive2) {
        PersonFive personFive3 = new PersonFive();
        personFive3.age = personFive2.age;
        personFive3.name = personFive2.name;
        return personFive3;
    }
}
