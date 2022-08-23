package 仓库管理系统;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.*;
import java.sql.*;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu {

    //创建按钮对象
    private JButton putButton = new JButton("入       库"); // 按钮
    private JButton deleteButton = new JButton("出       库");
    private JButton alterButton = new JButton("纠正信息");
    private JButton viewButton = new JButton("查看货物");
    private JButton exitButton = new JButton("退出系统");
    private JButton showButton = new JButton("显示");
    private JButton clearButton = new JButton("清空");
    private JButton removeButton = new JButton("删除数据");
    //创建文本框对象
    JTextField goodsIDField = new JTextField();          //货物编号
    JTextField goodsNameField = new JTextField();          //货物名
    JTextField invenField = new JTextField();          //库存
    JTextField priceField = new JTextField();          //价格
    JTextField wareField = new JTextField();          //所在仓库
    JTextField numField = new JTextField();          //取货号
    JTextField timeField = new JTextField();          //修改时间
    JTextField phoneField = new JTextField();          //联系方式
    private JTextArea show = new JTextArea(16, 30);
    //创建标签对象
    private JLabel goodsIDLabel = new JLabel("货物编号:");           //  货物编号
    private JLabel goodsNameLabel = new JLabel("货  物  名:");           //  货物名
    private JLabel invenLabel = new JLabel("数       量:");           //  库存
    private JLabel priceLabel = new JLabel("价       格:");           //  价格
    private JLabel wareLabel = new JLabel("所在仓库:");           //  所在仓库
    private JLabel numLabel = new JLabel("取  货  号:");           //  取货号
    private JLabel timeLabel = new JLabel("修改时间:");           //  修改时间
    private JLabel phoneLabel = new JLabel("联系方式:");           //  联系方式
    //创建窗口对象
    private JFrame frame = new JFrame("仓库管理系统"); // 框架
    private JFrame frame1 = new JFrame("显示货号信息");
    private ViewWindow vw;
    Hashtable<String, Person> has = new Hashtable<String, Person>();// 哈希表，加密，文件乱码
    File file = new File("新建文件.txt");// 注意：新建一个文件

    public Menu() {

        if (!file.exists()) {
            try {
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));// 把一个实例的对象以文件的形式保存到磁盘上。        out.writeObject(has);
                out.close();
            } catch (IOException e) {
            }
        }
        putButton.addActionListener(new ActionListener() { // 增加，内部类//进行某项操作时触发功能
            @Override
            public void actionPerformed(ActionEvent e) {//用于接收操作事件的侦听器接口
                if (e.getSource() == putButton) {
                    //alterButton.setEnabled(false);//使alterButton这个按钮变灰不可点击了
                    String number1 = goodsIDField.getText();
                    if (number1.length() == 6) {
                        try {
                            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));//读回对象
                            has = (Hashtable) in.readObject();
                            in.close();
                        } catch (Exception e1) {
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame, "请输入6位数字的货物编号");//提示框显示
                    }
                    if (number1.length() == 6) {
                        Connection ct = null;
                        PreparedStatement pstmt = null;
                        ResultSet rs = null;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                        } catch (ClassNotFoundException e3) {
                            e3.printStackTrace();
                        }
                        System.out.println("加载数据成功");
                        String url = "jdbc:mysql://localhost:3306/stuexpm1?";
                        String user = "root";
                        String passwd = "123456";
                        try {
                            ct = DriverManager.getConnection(url, user, passwd);
                        } catch (SQLException e3) {
                            e3.printStackTrace();
                        }
                        String sql = "select * from warehourse where 货物编号 = " + goodsIDField.getText();
                        try {
                            pstmt = ct.prepareStatement(sql);
                            rs = pstmt.executeQuery();
                        } catch (SQLException e3) {
                            e3.printStackTrace();
                        }
                        try {
                            if (rs.next()) {
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    System.out.println("加载数据成功");
                                    ct = DriverManager.getConnection(url, user, passwd);
                                    String strsql = "update warehourse set 库存=库存+" + invenField.getText()
                                            + " where 货物编号 = " + goodsIDField.getText();
                                    pstmt = ct.prepareStatement(strsql);
                                    JOptionPane.showMessageDialog(frame, "入库成功！");
                                    try {
                                        pstmt.executeUpdate();
                                    } catch (Exception arg1) {
                                        arg1.printStackTrace();
                                    } finally {
                                        try {
                                            if (rs != null) {
                                                rs.close();
                                                rs = null;
                                            }
                                            if (pstmt != null) {
                                                pstmt.close();
                                                pstmt = null;
                                            }
                                            if (ct != null) {
                                                ct.close();
                                                ct = null;
                                            }
                                        } catch (Exception arg2) {
                                            arg2.printStackTrace();
                                        }
                                    }
                                } catch (Exception e2) {
                                }
                            } else {
                                JOptionPane.showMessageDialog(frame, "暂无此货物，已将此货物入库！");
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
                                    System.out.println("加载数据成功");
                                    ct = DriverManager.getConnection(url, user, passwd);
                                    String strsql = "insert into warehourse values(?,?,?,?,?,?,?,?)";
                                    pstmt = ct.prepareStatement(strsql);
                                    try {
                                        pstmt.setString(1, goodsIDField.getText());
                                        pstmt.setString(2, goodsNameField.getText());
                                        pstmt.setString(3, invenField.getText());
                                        pstmt.setString(4, priceField.getText());
                                        pstmt.setString(5, wareField.getText());
                                        pstmt.setString(6, numField.getText());
                                        pstmt.setString(7, timeField.getText());
                                        pstmt.setString(8, phoneField.getText());
                                        pstmt.executeUpdate();
                                    } catch (Exception arg1) {
                                        arg1.printStackTrace();
                                    } finally {
                                        try {
                                            if (rs != null) {
                                                rs.close();
                                                rs = null;
                                            }
                                            if (pstmt != null) {
                                                pstmt.close();
                                                pstmt = null;
                                            }
                                            if (ct != null) {
                                                ct.close();
                                                ct = null;
                                            }
                                        } catch (Exception arg2) {
                                            arg2.printStackTrace();
                                        }
                                    }
                                } catch (Exception e2) {
                                }

                                String name = goodsNameField.getText();
                                int inven = Integer.parseInt(invenField.getText());
                                String price = priceField.getText();
                                String ware = wareField.getText();
                                String num = numField.getText();
                                String time = timeField.getText();
                                String phone = phoneField.getText();
                                Person per = null;
                                per = new Person(number1, name, inven, price, ware, num, time, phone);
                                has.put(number1, per);// ???
                                try {
                                    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
                                    out.writeObject(has);
                                    out.close();
                                    JOptionPane.showMessageDialog(frame, "入库成功！");
                                } catch (Exception e1) {
                                }
                            }
                        } catch (NumberFormatException | SQLException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
            }
        });
        clearButton.addActionListener(new ActionListener() { // 清空
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == clearButton) {//获得事件所作用的对象
                    goodsIDField.setText(null);
                    invenField.setText(null);
                    goodsNameField.setText(null);
                    priceField.setText(null);
                    wareField.setText(null);
                    numField.setText(null);
                    timeField.setText(null);
                    phoneField.setText(null);
                }
            }
        });
        deleteButton.addActionListener(new ActionListener() { // 出库
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == deleteButton) {
                    //alterButton.setEnabled(false);
                    String number1 = goodsIDField.getText();
                    if (number1.length() == 6) {
                        Connection ct = null;
                        PreparedStatement pstmt = null;
                        ResultSet rs = null;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            System.out.println("加载数据成功");
                            String url = "jdbc:mysql://localhost:3306/stuexpm1?";
                            String user = "root";
                            String passwd = "123456";
                            ct = DriverManager.getConnection(url, user, passwd);
                            String sql = "select 库存 from warehourse where 货物编号 =" + goodsIDField.getText();
                            pstmt = ct.prepareStatement(sql);
                            ct.prepareStatement(sql);
                            rs = pstmt.executeQuery();
                            if (rs.next()) {
                                if (rs.getString("库存").compareTo(invenField.getText()) >= 0) {
                                    String strsql = "update warehourse set 库存=库存-" + invenField.getText()
                                            + " where 货物编号 = " + goodsIDField.getText();
                                    pstmt = ct.prepareStatement(strsql);
                                    JOptionPane.showMessageDialog(frame, "出库成功！");
                                } else {
                                    JOptionPane.showMessageDialog(frame, "失败，库存不足，无法出库！当前库存为:" + rs.getString("库存"));
                                }
                            } else {
                                JOptionPane.showMessageDialog(frame, "暂无此货物信息，请尽快采购！");
                            }
                            try {
                                pstmt.executeUpdate();
                            } catch (Exception arg1) {
                                arg1.printStackTrace();
                            } finally {
                                try {
                                    if (rs != null) {
                                        rs.close();
                                        rs = null;
                                    }
                                    if (pstmt != null) {
                                        pstmt.close();
                                        pstmt = null;
                                    }
                                    if (ct != null) {
                                        ct.close();
                                        ct = null;
                                    }
                                } catch (Exception arg2) {
                                    arg2.printStackTrace();
                                }
                            }
                        } catch (Exception e2) {
                        }
                        try {
                            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
                            has = (Hashtable) in.readObject();
                            in.close();
                        } catch (Exception e1) {
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame, "请输入6位数字的货物编号");
                    }
                    if (has.containsKey(number1)) {
                        has.remove(number1);
                        ObjectOutputStream out = null;
                        try {
                            out = new ObjectOutputStream(new FileOutputStream(file));
                            out.close();
                        } catch (IOException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);//记录当前类可能发生的异常
                        }
                    } else {
                    }
                }
            }
        });

        alterButton.addActionListener(new ActionListener() { // 修改
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == alterButton) {
                    String ID = goodsIDField.getText();
                    String name = goodsNameField.getText();
                    int inven = Integer.parseInt(invenField.getText());
                    String price = priceField.getText();
                    String ware = wareField.getText();
                    String num = numField.getText();
                    String time = timeField.getText();
                    String phone = phoneField.getText();
                    Person per = new Person(ID, name, inven, price, ware, num, time, phone);
                    has.put(ID, per);
                    if (ID.length() == 6) {
                        Connection ct = null;
                        PreparedStatement pstmt = null;
                        ResultSet rs = null;
                        try {
                            //1.加载驱动
                            Class.forName("com.mysql.jdbc.Driver");
                            System.out.println("加载数据成功");
                            //2.连接数据库
                            //定义几个常量
                            String url = "jdbc:mysql://localhost:3306/stuexpm1?";
                            String user = "root";
                            String passwd = "123456";
                            ct = DriverManager.getConnection(url, user, passwd);
                            //与编译语句对象
                            String strsql = "replace into warehourse values(?,?,?,?,?,?,?,?)";
                            pstmt = ct.prepareStatement(strsql);
                            try {
                                //给对象赋值
                                pstmt.setString(1, goodsIDField.getText());
                                pstmt.setString(2, goodsNameField.getText());
                                pstmt.setString(3, invenField.getText());
                                pstmt.setString(4, priceField.getText());
                                pstmt.setString(5, wareField.getText());
                                pstmt.setString(6, numField.getText());
                                pstmt.setString(7, timeField.getText());
                                pstmt.setString(8, phoneField.getText());
                                pstmt.executeUpdate();
                            } catch (Exception arg1) {
                                arg1.printStackTrace();
                            } finally {
                                try {
                                    if (rs != null) {
                                        rs.close();
                                        rs = null;
                                    }
                                    if (pstmt != null) {
                                        pstmt.close();
                                        pstmt = null;
                                    }
                                    if (ct != null) {
                                        ct.close();
                                        ct = null;
                                    }
                                } catch (Exception arg2) {
                                    arg2.printStackTrace();
                                }
                            }
                        } catch (Exception e2) {
                        }
                        try {
                            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
                            has = (Hashtable) in.readObject();
                            in.close();
                        } catch (Exception e1) {
                        }
                        JOptionPane.showMessageDialog(frame, "纠正成功");

                        try {
                            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
                            out.writeObject(has);
                            out.close();
                        } catch (Exception e1) {
                        }
                    }
                }
            }
        });

        viewButton.addActionListener(new ActionListener() { // 查看
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == viewButton) {
                    //alterButton.setEnabled(false);
                    String number1 = goodsIDField.getText();
                    if (number1.length() == 6) {
                        Connection ct = null;
                        PreparedStatement pstmt = null;
                        ResultSet rs = null;
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            System.out.println("加载数据成功");
                            String url = "jdbc:mysql://localhost:3306/stuexpm1?";
                            String user = "root";
                            String passwd = "123456";
                            ct = DriverManager.getConnection(url, user, passwd);
                            String strsql = "select * from warehourse where 货物编号 =  " + goodsIDField.getText();
                            pstmt = ct.prepareStatement(strsql);
                            rs = pstmt.executeQuery();
                            if (rs.next()) {
                                String name = rs.getString("货物名");
                                String inven = rs.getString("库存");
                                String price = rs.getString("价格");
                                String ware = rs.getString("所在仓库");
                                String num = rs.getString("取货号");
                                String time = rs.getString("修改时间");
                                String phone = rs.getString("联系方式");
                                goodsNameField.setText(name);
                                invenField.setText(inven);
                                priceField.setText(price);
                                wareField.setText(ware);
                                numField.setText(num);
                                timeField.setText(time);
                                phoneField.setText(phone);
                            } else {
                                JOptionPane.showMessageDialog(frame, "没有此货物，请尽快入库");
                                goodsNameField.setText(null);
                                invenField.setText(null);
                                priceField.setText(null);
                                wareField.setText(null);
                                numField.setText(null);
                                timeField.setText(null);
                                phoneField.setText(null);
                            }
                        } catch (Exception e2) {
                        }
                        try {
                            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
                            has = (Hashtable) in.readObject();
                            in.close();
                        } catch (Exception e1) {
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame, "请输入6位数字的货物编号");
                    }
                }
            }

        });
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == removeButton) {
                    int n = JOptionPane.showConfirmDialog(frame, "确认是否删除该货物数据", "确认删除", JOptionPane.YES_NO_OPTION);
                    String number1 = goodsIDField.getText();
                    if (number1.length() == 6) {
                        Connection ct = null;
                        PreparedStatement pstmt = null;
                        ResultSet rs = null;
                        if (n == JOptionPane.YES_OPTION) {
                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                System.out.println("加载数据成功");
                                String url = "jdbc:mysql://localhost:3306/stuexpm1?";
                                String user = "root";
                                String passwd = "123456";
                                ct = DriverManager.getConnection(url, user, passwd);
                                String sql = "select * from warehourse where 货物编号 = " + goodsIDField.getText();
                                pstmt = ct.prepareStatement(sql);
                                rs = pstmt.executeQuery();
                                if (rs.next()) {
                                    String strsql = "delete from warehourse where 货物编号 = " + goodsIDField.getText();
                                    pstmt = ct.prepareStatement(strsql);
                                    pstmt.execute(strsql);
                                    JOptionPane.showMessageDialog(frame, "删除成功！");
                                } else {
                                    JOptionPane.showMessageDialog(frame, "无此货物编号数据，无需删除");
                                }
                            } catch (Exception e1) {
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(frame, "请输入6位数字的货物编号");
                    }
                }

            }
        });
        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //alterButton.setEnabled(false);
                ViewWindow vw = new ViewWindow();
                ImageIcon icon = new ImageIcon("D:\\Java实验报告\\Warehouse\\仓库.jpeg");
                vw.setIconImage(icon.getImage());
                //vw.setVisible(true);
                if (e.getSource() == showButton) {
                    //frame1.setVisible(true);

                    try {
                        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
                        has = (Hashtable) in.readObject();
                        in.close();
                    } catch (Exception ee) {
                    }
                    if (has.isEmpty()) {
                        show.append("目前还此货物的入库记录！\n");
                    } else {

                        for (Enumeration enu = has.elements(); enu.hasMoreElements(); ) {
                            //存入内存的内容如果不经过遍历是显示不出来的
                            Person per = (Person) enu.nextElement();
                            String str = "  <货物编号>：" + per.getGoodsID() + "\n" +
                                    "  <货  物  名>：" + per.getGoodsName() + "\n" +
                                    "  <库       存>：" + per.getInven() + "\n" +
                                    "  <价       格>：" + per.getPrice() + "\n" +
                                    "  <所在仓库>：" + per.getWare() + "\n" +
                                    "  <取  货  号>：" + per.getNum() + "\n" +
                                    "  <修改时间>：" + per.getTime() + "\n" +
                                    "  <联系方式>：" + per.getPhone() + "\n" +
                                    "\n";


                            show.append(str);
                        }
                        String str2 = "------------------------------结束---------------------------------------------------"
                                + "\n";
                        show.append(str2);
                    }
                }
            }

        });
        //文本框设置键盘监听器，以下文本框只能输入特定文本内容
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == exitButton) {
                    frame.setVisible(false);
                    vw.setVisible(false);
                    new ActionHandle();
                }
            }
        });
        invenField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (!(keyChar >= '0' && keyChar <= '9')) {
                    e.consume();
                }
            }
        });
        priceField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (!(keyChar >= '0' && keyChar <= '9' || keyChar == '.')) {
                    e.consume();
                }
            }
        });
        phoneField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (!(keyChar >= '0' && keyChar <= '9')) {
                    e.consume();
                }
            }
        });
        goodsIDField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (!(keyChar >= '0' && keyChar <= '9')) {
                    e.consume();
                }
            }
        });
        ImageIcon icon = new ImageIcon("D:\\Java实验报告\\Warehouse\\仓库.jpeg");
        frame.setIconImage(icon.getImage());
        frame.setLayout(null);
        //null布局，设置组件参数
        putButton.setBounds(30, 35, 90, 25);
        deleteButton.setBounds(30, 75, 90, 25);
        alterButton.setBounds(30, 115, 90, 25);
        viewButton.setBounds(30, 155, 90, 25);
        removeButton.setBounds(30, 195, 90, 25);
        exitButton.setBounds(240, 430, 100, 25); // setBounds(x,y,width,height);
        goodsIDLabel.setBounds(150, 30, 70, 25);
        goodsNameLabel.setBounds(150, 65, 70, 25);//
        invenLabel.setBounds(150, 100, 70, 25);
        priceLabel.setBounds(150, 135, 70, 25);
        wareLabel.setBounds(150, 170, 70, 25);
        numLabel.setBounds(150, 205, 70, 25);
        timeLabel.setBounds(150, 240, 70, 25);
        phoneLabel.setBounds(150, 275, 70, 25);
        goodsIDField.setBounds(230, 30, 90, 25);
        goodsNameField.setBounds(230, 65, 90, 25);
        invenField.setBounds(230, 100, 90, 25);
        priceField.setBounds(230, 135, 90, 25);
        wareField.setBounds(230, 170, 90, 25);
        numField.setBounds(230, 205, 90, 25);
        timeField.setBounds(230, 240, 90, 25);
        phoneField.setBounds(230, 275, 90, 25);
        clearButton.setBounds(250, 310, 60, 25);
        showButton.setBounds(150, 310, 60, 25);
        frame.add(invenLabel);
        frame.add(goodsNameLabel);
        frame.add(priceLabel);
        frame.add(wareLabel);
        frame.add(numLabel);
        frame.add(timeLabel);
        frame.add(phoneLabel);
        frame.add(goodsIDLabel);
        frame.add(goodsIDField);
        frame.add(goodsNameField);
        frame.add(invenField);
        frame.add(priceField);
        frame.add(wareField);
        frame.add(numField);
        frame.add(timeField);
        frame.add(phoneField);
        frame.add(clearButton);
        frame.add(putButton);
        frame.add(deleteButton);
        frame.add(alterButton);
        frame.add(viewButton);
        frame.add(removeButton);
        frame.add(exitButton);
        JScrollPane scroll = new JScrollPane(show);
        frame1.add(scroll, BorderLayout.CENTER);
        frame.add(showButton);
        frame.setSize(400, 500); // 页面大小
        frame1.setBounds(200, 200, 400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame1.setVisible(false);
        //vw.setVisible(false);
        //ViewWindow vw = new ViewWindow("显示所有货物信息");
    }
}



