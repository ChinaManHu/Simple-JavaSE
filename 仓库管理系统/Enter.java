package 仓库管理系统;

/**
 * @author 胡
 */
public class Enter {
    public static void main(String[] args) {
        //窗口界面风格设为Nimbus风格
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
        new ActionHandle();
    }
}