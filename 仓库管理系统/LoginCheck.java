package 仓库管理系统;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LoginCheck {
    private String name;
    private String password;

    public LoginCheck(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public boolean equals() {
        if ("root".equals(name) && "123456".equals(password)) {
            return true;
        } else {
            return false;
        }
    }
};

class ActionHandle {
    private JFrame frame = new JFrame("仓库信息管理系统");
    private JTextField name = new JTextField();//设置文本框
    private JPasswordField pass = new JPasswordField();
    private JLabel but1 = new JLabel("用户名:");
    private JLabel but2 = new JLabel("密   码:");
    private JButton but3 = new JButton("登录");
    private JButton but4 = new JButton("重置");

    public ActionHandle() {
        but3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == but3) {
                    String sname = name.getText();
                    String spass = new String(pass.getPassword());
                    LoginCheck log = new LoginCheck(sname, spass);
                    if (log.equals()) {
                        try {
                            new Menu();
                        } catch (Exception e1) {

                            e1.printStackTrace();
                        }
                        frame.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "登录失败，错误的用户名或密码！");
                        name.setText("");
                        pass.setText("");
                    }
                }
            }
        });
        but4.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (e.getSource() == but4) {
                            name.setText("");
                            pass.setText("");
                        }
                    }

                });
        ImageIcon icon = new ImageIcon("D:\\Java实验报告\\Warehouse\\登录.jfif");
        frame.setIconImage(icon.getImage());
        frame.setLayout(null);
        but1.setBounds(80, 40, 80, 30);
        name.setBounds(140, 42, 120, 25);    //
        but2.setBounds(80, 80, 80, 30);
        pass.setBounds(140, 82, 120, 25);
        but3.setBounds(130, 150, 60, 30);
        but4.setBounds(210, 150, 60, 30);
        frame.setSize(400, 330);
        frame.setLocationRelativeTo(null);
        frame.add(but1);
        frame.add(name);
        frame.add(pass);
        frame.add(but2);
        frame.add(but3);
        frame.add(but4);
        frame.setVisible(true);
    }
}
