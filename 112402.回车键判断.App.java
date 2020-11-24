import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class App {
    JPanel myPanel=new JPanel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();

    public App() {

        textArea_A.setBounds(100, 100, 256, 128);
        textArea_A.setBackground(Color.green);
        myPanel.add(textArea_A);
        textArea_B.setBounds(100, 300, 256, 128);
        textArea_B.setBackground(Color.yellow);
        myPanel.add(textArea_B);

        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (textArea_A.getText().equals("wei")){
                        textArea_B.setText("正确");
                    }else{
                        textArea_B.setText("错误");
                    }

                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    textArea_B.setText("");
                }
            }
        });
    }
    void go(){
        JFrame frame = new JFrame("窗体");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
