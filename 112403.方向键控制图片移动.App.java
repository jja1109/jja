import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class App {
    JPanel myPanel=new JPanel();
    JLabel label_plane=new JLabel();
    JLabel label_background=new JLabel();
    JTextArea textArea=new JTextArea();

  
    int x=300;
    int y=700;
    public App() {

        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP){
                    label_plane.setBounds(x,(y=y-30),64,64);
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    label_plane.setBounds(x,(y=y+30),64,64);
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT){
                    label_plane.setBounds((x=x-20),y,64,64);
                }
                if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                    label_plane.setBounds((x=x+20),y,64,64);
                }
            }
        });
    }
  
    void go(){
        java.net.URL ImgPL= App.class.getResource("img/plane1.png");
        label_plane.setIcon(new ImageIcon(ImgPL));
        label_plane.setBounds(x,y,64,64);
        java.net.URL ImgBack= App.class.getResource("img/background.png");
        label_background.setIcon(new ImageIcon(ImgBack));
        label_background.setBounds(0,0,600,800);


        JFrame frame = new JFrame("飞机游戏");
        myPanel.setLayout(null);
        myPanel.add(label_plane);
        myPanel.add(label_background);
        myPanel.add(textArea);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,600,800);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
