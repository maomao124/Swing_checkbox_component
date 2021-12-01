import javax.swing.*;
import java.awt.*;

/**
 * Project name(项目名称)：Swing复选框组件
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/12/1
 * Time(创建时间)： 10:19
 * Version(版本): 1.0
 * Description(描述)：
 * 一个复选框有选中和未选中两种状态，并且可以同时选定多个复选框。Swing 中使用 JCheckBox 类实现复选框，该类的常用构造方法如下。
 * JCheckBox()：创建一个默认的复选框，在默认情况下既未指定文本，也未指定图像，并且未被选择。
 * JCheckBox(String text)：创建一个指定文本的复选框。
 * JCheckBox(String text,boolean selected)：创建一个指定文本和选择状态的复选框。
 */

public class test
{
    public static void main(String[] args)
    {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("测试");
        jFrame.setSize(640, 480);
        jFrame.setLocation(200, 200);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel();
        JLabel label = new JLabel("年龄段：");
        Font font=new Font("宋体", 1, 20);
        label.setFont(font);
        JCheckBox jCheckBox1 = new JCheckBox();
        //jCheckBox1.setBackground(Color.cyan);
        //jCheckBox1.setBorderPainted(true);
        jCheckBox1.setText("0-12");
        jCheckBox1.setSelected(true);
        JCheckBox jCheckBox2 = new JCheckBox("12-18", false);
        JCheckBox jCheckBox3 = new JCheckBox("18-30");
        JCheckBox jCheckBox4 = new JCheckBox("30-60");
        JCheckBox jCheckBox5 = new JCheckBox("60-80");
        JCheckBox jCheckBox6 = new JCheckBox("80-100", false);
        jPanel.add(label);
        jPanel.add(jCheckBox1);
        jPanel.add(jCheckBox2);
        jPanel.add(jCheckBox3);
        jPanel.add(jCheckBox4);
        jPanel.add(jCheckBox5);
        jPanel.add(jCheckBox6);
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}
