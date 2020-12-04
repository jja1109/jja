import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_img=new JLabel();
    
    int x=0,y=0,chll=128;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    chll+=10;
                    label_img.setBounds(x,y*chll,chll,chll);
                    myPanel.repaint();
                }
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    chll-=10;
                    label_img.setBounds(x,y*chll,chll,chll);
                    myPanel.repaint();
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    x-=10;
                    label_img.setBounds(x,y*chll,chll,chll);
                    myPanel.repaint();
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    x+=10;
                    label_img.setBounds(x,y*chll,chll,chll);
                    myPanel.repaint();
                }
            }
        });

    }
    //显示窗体方法
    void go(){
        java.net.URL imgURL = App.class.getResource("img/plane0.png");
        label_img.setIcon(new ImageIcon(imgURL));
        label_img.setBounds(0,0,128,128);
        myPanel.add(label_img);

        label_txt.setBounds(0,0,200,200);
        myPanel.add(label_txt);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("飞机移动");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
