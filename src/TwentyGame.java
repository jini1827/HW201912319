import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TwentyGame extends JFrame {
	JLabel la = new JLabel("<< �������� ������ ������ �˾Ƹ��� ������! ������ 1~20�Դϴ�. >>");
	JTextField tf = new JTextField(20);
	int num = (int)(Math.random()*20+1);
	TwentyGame() {
		super("�Ͻɵ�ü ����!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();		
		c.setBackground(Color.yellow);
		c.setLayout(null);
		
		c.add(la);
		la.setSize(400, 20);
		la.setLocation(35, 60);
		
		c.add(tf);
		tf.setSize(400, 20);
		tf.setLocation(20, 90);
		
		tf.addKeyListener(new MyKeyListener());
		setSize(450, 200);
	    setVisible(true);
	    tf.setFocusable(true);
	    tf.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			JTextField t = (JTextField)e.getSource();
			String sget = t.getText();
			
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				int usernum = Integer.parseInt(sget);
				if(num == usernum) {
					getContentPane().setBackground(Color.GREEN);
					t.setText("�����մϴ�!  ���� ���ڴ� '"+num+"'  !");
				}
				else {
					getContentPane().setBackground(Color.RED);
					t.setText("");
				}
			}
		}

	}
	
	public static void main(String[] args) {
		new TwentyGame();
	}
}
