import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class Boles{

    public static JTextArea input = new JTextArea();
    public static JTextArea output= new JTextArea();

    public static void main(String[] args) {


        JFrame guiFrame = new JFrame();
        guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiFrame.setTitle("Key Listener");
        guiFrame.setLocationRelativeTo(null);
        guiFrame.setSize(800,600);

        JScrollPane scroll = new JScrollPane(output);



        input.addKeyListener(new KeyListener(){
              @Override
              public void keyPressed(KeyEvent e){
            	  
                  output.append("Key Pressed: " + e.getKeyText(e.getKeyCode()) + "\n");
              }
              @Override
              public void keyReleased(KeyEvent e){
                  output.append("Key Released: " + e.getKeyText(e.getKeyCode()) + "\n");
              }

              @Override
              public void keyTyped(KeyEvent e){
                  output.append("Key Typed: " + e.getKeyChar() + " " + KeyEvent.getKeyModifiersText(e.getModifiers()) + "\n");
              }
        });

        guiFrame.add(input, BorderLayout.NORTH);
        guiFrame.add(scroll, BorderLayout.CENTER);
        guiFrame.setVisible(true);
    }

}