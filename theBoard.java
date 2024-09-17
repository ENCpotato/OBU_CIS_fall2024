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
 
       wageLabel = new JLabel("User Name:");
 
       wageField = new JTextField(15);
       wageField.setEditable(true);
       wageField.setText("Ethan");
       wageField.addActionListener(this);
        
       salField = new JTextField(15);
       salField.setEditable(false);
 
       setLayout(new GridBagLayout());
       layoutConst = new GridBagConstraints();
 
       layoutConst.gridx = 0;
       layoutConst.gridy = 0;
 
       layoutConst.insets = new Insets(10, 10, 10, 10);
 
       add(wageLabel, layoutConst);
 
       layoutConst = new GridBagConstraints();
       layoutConst.gridx = 1;
       layoutConst.gridy = 0;
       layoutConst.insets = new Insets(10, 10, 10, 10);
       add(wageField, layoutConst);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {

        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}