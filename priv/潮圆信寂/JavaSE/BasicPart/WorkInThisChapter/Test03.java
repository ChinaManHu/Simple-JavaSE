package priv.潮圆信寂.JavaSE.BasicPart.WorkInThisChapter;

import java.util.Scanner;

/**
 *
 *@author 潮圆信寂
 *@date 2022/8/14
 */
public class Test03 {
    public static void main(String[] args) {
        //编写类Book,定义方法updatePrice, 实现更改某本书的价格
        //具体:如果价格 > 150.则更改为150，如果价格> 100,更改为100，否则不变
        double price;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入java核心技术卷一的价格：");
        price = scanner.nextDouble();
        Book book = new Book();
        System.out.print("java核心技术卷一的最新价格为：" + book.updatePrice(price));
    }
}

class Book {
    public double updatePrice(double price)
    {
        if (price > 150)
        {
            price = 150;
        }
        else if (price > 100)
        {
            price = 100;
        }
        else if (price <= 0)
        {
            System.out.println("请重新输入价格，您输入的价格不合理！");
        }
        return price;
    }
}