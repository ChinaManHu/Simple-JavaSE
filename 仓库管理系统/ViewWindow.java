package 仓库管理系统;

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * @author 胡
 */
public class ViewWindow extends JFrame {
    public ViewWindow(String title) throws HeadlessException {
        super(title);
        // TODO Auto-generated constructor stub
    }

    {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private JScrollPane scpDemo;
    private JTableHeader jth;
    private JTable tabDemo;
    private JButton btnShow;
    private JButton bt1;
    private JButton bt2;

    public ViewWindow() {
        super("显示所有货物信息");        //JFrame的标题名称
        this.setSize(700, 600);        //控制窗体大小
        this.setLayout(null);        //自定义布局
        this.setLocationRelativeTo(null);    //点击运行以后，窗体在屏幕的位置
        this.scpDemo = new JScrollPane();
        this.bt1 = new JButton("确定");
        this.bt2 = new JButton("取消");
        this.btnShow = new JButton("显示数据");
        this.bt1.setBounds(100, 465, 100, 30);
        this.bt2.setBounds(450, 465, 100, 30);
        this.scpDemo.setBounds(15, 50, 650, 400);    //设置滚动框大小
        this.btnShow.setBounds(10, 10, 120, 30);    //设置按钮
        this.btnShow.addActionListener(new ActionListener()    //给“显示数据”按钮添加事件响应。
        {
            @Override
            public void actionPerformed(ActionEvent ae) {
                btnShow_ActionPerformed(ae);
            }
        });
        /********按钮“确定”的响应*******/
        this.bt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        /******按钮 “取消”的响应*****/
        this.bt2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        /******* 将组件加入到窗体中******/
        add(this.scpDemo);
        add(this.btnShow);
        add(this.bt1);
        add(this.bt2);
        this.setVisible(true);
        //dispose();
    }

    /***连接数据库并显示到表格中***/
    public void btnShow_ActionPerformed(ActionEvent ae) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/stuexpm1?";
            String username = "root";
            String passwords = "123456";
            Connection conn = DriverManager.getConnection(url, username, passwords);
            String sql = "select * from warehourse";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            int count = 0;
            while (rs.next()) {
                count++;
            }
            rs = pstm.executeQuery();
            // 将查询获得的记录数据，转换成适合生成JTable的数据形式
            Object[][] info = new Object[count][8];
            String[] title = {"货物编号", "货物名", " 库存", "价格", "所在仓库", "取货号", "修改时间", "联系方式"};
            count = 0;
            while (rs.next()) {
                info[count][0] = Integer.valueOf(rs.getInt("货物编号"));
                info[count][1] = rs.getString("货物名");
                info[count][2] = rs.getString("库存");
                info[count][3] = rs.getString("价格");
                info[count][4] = rs.getString("所在仓库");
                info[count][5] = rs.getString("取货号");
                info[count][6] = rs.getString("修改时间");
                info[count][7] = rs.getString("联系方式");
                count++;
            }
            // 创建JTable
            this.tabDemo = new JTable(info, title);
            // 显示表头
            this.jth = this.tabDemo.getTableHeader();
            // 将JTable加入到带滚动条的面板中
            this.scpDemo.getViewport().add(tabDemo);
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
            JOptionPane.showMessageDialog(null, "数据源错误", "错误", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            JOptionPane.showMessageDialog(null, "数据操作错误", "错误", JOptionPane.ERROR_MESSAGE);
        }

    }


}
