import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
public class BinaryConverter implements MouseListener {
	static JTextField tf = new JTextField(20);
	static JButton b = new JButton();
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		b.setText("Convert to ASCII");
		JLabel l = new JLabel();
		p.add(tf);
		p.add(b);
		p.add(l);
		f.add(p);
		f.setVisible(true);
		f.pack();
	}
	void addlist() {
		b.addMouseListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		convert(tf.getText());
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
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
}
