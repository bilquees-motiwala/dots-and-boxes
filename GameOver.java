import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class GameOver extends JFrame implements ActionListener{

	private JPanel contentPane;
	private GameFrame gf;
	private GameBoard gb;
	private JButton again;
	private int type;
	/**
	 * Launch the application.
	 */
	//public static void main(String[] args) {
		//EventQueue.invokeLater(new Runnable() {
			//public void run() {
				//try {
					//GameOver frame = new GameOver();
				//	frame.setVisible(true);
				//} catch (Exception e) {
				//	e.printStackTrace();
				//}
			//}
		//});
	//}

	/**
	 * Create the frame.
	 */
	public GameOver(GameFrame gf, int type, GameBoard gb) {
		this.gf = gf;
		this.gf.getFrame().setFocusable(false);
		this.gb = gb;
		this.gb.removeMouseListener(this.gb);
		this.type = type;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("             GAME OVER");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Cordia New", Font.PLAIN, 47));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		this.again = new JButton("Rematch?");
		this.again.setForeground(Color.WHITE);
		this.again.setBackground(Color.RED);
		contentPane.add(this.again, BorderLayout.SOUTH);
		
		this.again.addActionListener(this);
		setLocationRelativeTo(null);
		
		URL url = this.getClass().getClassLoader().getResource("dblogo.jpg");
		ImageIcon i = new ImageIcon(url);
		
		setIconImage(i.getImage());
		
		setTitle("Dots & Boxes");
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == this.again)
		{
			this.gf.getFrame().dispose();
			GameFrame gf = new GameFrame(this.type);
			this.dispose();
		}
	}

}

