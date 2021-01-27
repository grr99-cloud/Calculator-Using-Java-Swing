import java.awt.*; //��Ʈ �� �׷��� ó���� ���� Ŭ�������� ��θ�
import java.awt.event.*; //�̺�Ʈ ó���� �ʿ��� �⺻ Ŭ�������� ��θ�
import javax.swing.*; //���� ������Ʈ Ŭ�������� ��θ�
import javax.swing.event.*; //���� �̺�Ʈ ó���� �ʿ��� Ŭ�������� ��θ�

public class CalculatorFrame extends JFrame { //JFrame�� ��ӹ��� CalculatorFrame
	public CalculatorFrame() {
		setTitle("����"); //������ Ÿ��Ʋ
		/*super("����"); �� ����*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ������ ������ ���α׷� ����
		
		Container contentPane = getContentPane(); //����Ʈ �� �˾Ƴ���
		
//		Color myPurple = new Color(255,255,200); //������ r,g,b color �����
//		contentPane.setBackground(myPurple); //��� ���� ����
//		contentPane.setBackground(new Color(255,255,225));
		
		contentPane.add(new UpperPanel(), BorderLayout.NORTH);
		contentPane.add(new UnderPanel(), BorderLayout.SOUTH);
		contentPane.add(new CenterPanel(), BorderLayout.CENTER);
	
		setSize(300,300); //������ ũ�� (300*300)
		setVisible(true); //������ ��� (false�� ��� ������ ������) ->�ٷ� �Ⱥ��̴��� �̰� �ΰ� �ű�ϱ� �ٷ� ����
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CalculatorFrame();
	}

}

class UpperPanel extends JPanel {
	public UpperPanel() {
		setBackground(new Color(200,200,255));
		add(new JTextField(20));
		JButton delete = new JButton("delete");
		delete.setBackground(new Color(235,235,255));
		add(delete);
	}
}

class UnderPanel extends JPanel {
	public UnderPanel() {
		setBackground(new Color(200,200,255));
		setLayout(new GridLayout(5,4,5,5));
		String[] msg = {
				"(", ")", "%", "CE", 
				"7", "8", "9", "/",
				"4", "5", "6", "x",
				"1", "2", "3", "-",
				"0", ".", "=", "+"
		};
		Color btnColor = new Color(235,235,255);
		JButton[] btn = new JButton[msg.length];
		
		for(int i=0; i<msg.length; i++) {
			btn[i] = new JButton(msg[i]);
			btn[i].setBackground(btnColor);
			add(btn[i]);
		}
	}
}

class CenterPanel extends JPanel {
	public CenterPanel() {
		setBackground(new Color(255,255,225));
	}
}