import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class theBoard extends JFrame implements ActionListener{
    private JLabel wageLabel;     
    private JLabel salLabel;   
    private JLabel textLabel;   
    private JTextField salField; 
    private JTextField wageField;
    private JButton calcButton;

    

    theBoard(){
        GridBagConstraints layoutConst = null;
    
        
        
        setTitle("Battleship");

        textLabel = new JLabel("Welcome to Battleship!");
        



    }

    @Override
    public void actionPerformed(ActionEvent e) {

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}