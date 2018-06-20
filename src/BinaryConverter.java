import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class BinaryConverter implements ActionListener {
	static JTextField tf = new JTextField(20);
	static JButton b = new JButton();
	static JLabel l = new JLabel();
	static JFrame f = new JFrame();
	String input;
	public static void main(String[] args) {
		BinaryConverter c = new BinaryConverter();
		c.addUI();
	}
	void addUI() {
		b.addActionListener(this);
		JPanel p = new JPanel();
		b.setText("Convert to ASCII");
		p.add(tf);
		p.add(b);
		p.add(l);
		f.add(p);
		f.setVisible(true);
		f.pack();
	}
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }
	@Override
	public void actionPerformed(ActionEvent e) {
		String ascii = convert(tf.getText());
		l.setText(ascii);
		f.pack();
	}
}
