package hotel;



import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePageClient extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePageClient frame = new HomePageClient();
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
	public HomePageClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 160, 800, 480);
		setTitle("Moon Hotel");

		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(253, 245, 230));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Moon = new JLabel("");
		Moon.setBounds(10, 9, 162, 70);
		Image img2 = new ImageIcon(this.getClass().getResource("Typograms 1.png")).getImage();
		Moon.setIcon(new ImageIcon(img2));
		contentPane.add(Moon);
		
		
		
		
		
		JButton buttonBookings = new JButton("See my bookings");
		buttonBookings.setBackground(new Color(153, 51, 0)); 
		buttonBookings.setForeground(new Color(245, 245, 220));
		buttonBookings.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonBookings.setBounds(525, 9, 126, 21);
		 buttonBookings.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Bookings booking= new Bookings();
					booking.show();
				}
			});
		contentPane.add(buttonBookings);
		
		JButton buttonRooms = new JButton("See rooms");
		buttonRooms.setBackground(new Color(153, 51, 0)); 
		buttonRooms.setForeground(new Color(245, 245, 220));
		buttonRooms.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonRooms.setBounds(661, 9, 99, 21);
		buttonRooms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SRoomsC seeRom = new SRoomsC();
				seeRom.show();
			}
		});
		contentPane.add(buttonRooms);
		
		JLabel teamImg = new JLabel("");
		teamImg.setBounds(469, 53, 356, 232);
		Image img = new ImageIcon(this.getClass().getResource("Hotel's Christmas Decoration - Front Office Staff 1 (5).png")).getImage();
		teamImg.setIcon(new ImageIcon(img));
		contentPane.add(teamImg);
		
		ImageIcon icon = new ImageIcon(this.getClass().getResource("Frame 40.png"));
		JButton buttonRom1 = new JButton(icon);
		
		buttonRom1.setBounds(26, 295, 225, 138);
		buttonRom1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SRoomsC seeRom= new SRoomsC();
				seeRom.show();
			}
		});
		
		contentPane.add(buttonRom1);
		
		
		
		
		
		JLabel msg1 = new JLabel("Meet Our Beloved");
		msg1.setFont(new Font("Tahoma", Font.BOLD, 25));
		msg1.setBounds(67, 89, 242, 49);
		contentPane.add(msg1);
		
		JLabel msg2 = new JLabel("Team !");
		msg2.setFont(new Font("Tahoma", Font.BOLD, 25));
		msg2.setBounds(67, 148, 201, 36);
		contentPane.add(msg2);
		
		JLabel msg3 = new JLabel("See our rooms");
		msg3.setFont(new Font("Tahoma", Font.BOLD, 13));
		msg3.setBounds(342, 256, 117, 21);
		contentPane.add(msg3);
		
		ImageIcon icon3 = new ImageIcon(this.getClass().getResource("Frame 38.png"));
		JButton buttonRom3 = new JButton(icon3);
		buttonRom3.setBounds(535, 295, 225, 138);
		buttonRom3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SRoomsC seeRom= new SRoomsC();
				seeRom.show();
			}
		});
        contentPane.add(buttonRom3);
        
        
        ImageIcon icon2 = new ImageIcon(this.getClass().getResource("Frame 39.png"));
        JButton buttonRoom2 = new JButton(icon2);
        buttonRoom2.setBounds(280, 295, 225, 138);
        buttonRoom2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SRoomsC seeRom= new SRoomsC();
				seeRom.show();
			}
		});
        
        contentPane.add(buttonRoom2);
        
        JButton buttonBookARom = new JButton("Book a room");
        buttonBookARom.setForeground(new Color(255, 255, 255));
        buttonBookARom.setBackground(new Color(153, 51, 0));
        buttonBookARom.setFont(new Font("Tahoma", Font.PLAIN, 12));
        buttonBookARom.setBounds(406, 9, 109, 21);
        buttonBookARom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookARoom bkRoom = new BookARoom();
				bkRoom.show();
			}
		});
        contentPane.add(buttonBookARom);
		
        setResizable(false);		
		
	}

}
