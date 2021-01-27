import java.awt.*; //폰트 등 그래픽 처리를 위한 클래스들의 경로명
import java.awt.event.*; //이벤트 처리에 필요한 기본 클래스들의 경로명
import javax.swing.*; //스윙 컴포넌트 클래스들의 경로명
import javax.swing.event.*; //스윙 이벤트 처리에 필요한 클래스들의 경로명

public class CalculatorFrame extends JFrame { //JFrame을 상속받은 CalculatorFrame
	public CalculatorFrame() {
		setTitle("계산기"); //프레임 타이틀
		/*super("계산기"); 와 같음*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //프레임 윈도우 닫으면 프로그램 종료
		
		Container contentPane = getContentPane(); //컨텐트 팬 알아내기
		
//		Color myPurple = new Color(255,255,200); //나만의 r,g,b color 만들기
//		contentPane.setBackground(myPurple); //배경 색상 지정
//		contentPane.setBackground(new Color(255,255,225));
		
		contentPane.add(new UpperPanel(), BorderLayout.NORTH);
		contentPane.add(new UnderPanel(), BorderLayout.SOUTH);
		contentPane.add(new CenterPanel(), BorderLayout.CENTER);
	
		setSize(300,300); //프레임 크기 (300*300)
		setVisible(true); //프레임 출력 (false의 경우 프레임 숨겨짐) ->바로 안보이던게 이거 두개 옮기니까 바로 보임
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