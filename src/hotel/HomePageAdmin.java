package hotel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class HomePageAdmin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePageAdmin frame = new HomePageAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomePageAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 160, 800, 480);
		setTitle("Moon Hotel");
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(253, 245, 230));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Moon = new JLabel("");
		Moon.setBounds(10, 9, 162, 70);
		Image img2 = new ImageIcon(this.getClass().getResource("Typograms 1.png")).getImage();
		Moon.setIcon(new ImageIcon(img2));
		contentPane.add(Moon);
		
		JButton buttonPendRsrv = new JButton("Pending reservations");
		buttonPendRsrv.setBackground(new Color(153, 51, 0)); 
		buttonPendRsrv.setForeground(new Color(245, 245, 220));
		buttonPendRsrv.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonPendRsrv.setBounds(608, 9, 152, 21);
		buttonPendRsrv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SRoomsC seeRom = new SRoomsC();
				seeRom.show();
			}
		});
		contentPane.add(buttonPendRsrv);
		
		JButton buttonSeeClient = new JButton("See clients ");
		buttonSeeClient.setBackground(new Color(153, 51, 0)); 
		buttonSeeClient.setForeground(new Color(245, 245, 220));
		buttonSeeClient.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonSeeClient.setBounds(498, 9, 100, 21);
		buttonSeeClient.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SClients clients= new SClients();
					clients.show();
				}
			});
		contentPane.add(buttonSeeClient);
		
		JButton buttonRooms = new JButton("Rooms");
		 buttonRooms.setForeground(new Color(255, 255, 255));
	        buttonRooms.setBackground(new Color(153, 51, 0));
	        buttonRooms.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        buttonRooms.setBounds(378, 9, 109, 21);
	        buttonRooms.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				  SRoomsAdmin bkRoom = new SRoomsAdmin();
					bkRoom.show();
				}
			});
		contentPane.add(buttonRooms);
	}
}
