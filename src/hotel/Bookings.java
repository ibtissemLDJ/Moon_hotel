package hotel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;
import javax.swing.JButton;

public class Bookings extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bookings frame = new Bookings();
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
	public Bookings() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setTitle("Moon Hotel");
		setBounds(350, 160, 800, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(253, 245, 230));
		setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon icon = new ImageIcon(this.getClass().getResource("Frame 63 (2).png"));
		JLabel lblImage = new JLabel(icon);
		lblImage.setBounds(33, 191, 811, 242);
		contentPane.add(lblImage);
		
		JLabel Moon = new JLabel("New label");
		Image img2 = new ImageIcon(this.getClass().getResource("Typograms 1.png")).getImage();
		Moon.setIcon(new ImageIcon(img2));
		Moon.setBounds(10, 9, 162, 70);
		contentPane.add(Moon);
		
		JLabel lblLatestsBook = new JLabel("My latests bookings : ");
		lblLatestsBook.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLatestsBook.setBounds(20, 73, 168, 17);
		contentPane.add(lblLatestsBook);
		
		JLabel lblSeeBook = new JLabel("See my bookings");
		lblSeeBook.setForeground(new Color(153, 51, 0));
		lblSeeBook.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSeeBook.setBounds(535, 13, 127, 17);
		contentPane.add(lblSeeBook);
		
		JButton buttonBookArom = new JButton("Book a room");
		buttonBookArom.setBackground(new Color(153, 51, 0)); 
		buttonBookArom.setForeground(new Color(245, 245, 220));
		buttonBookArom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonBookArom.setBounds(407, 12, 118, 21);
		buttonBookArom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookARoom bkRom= new BookARoom();
				bkRom.show();
			}
		});
		contentPane.add(buttonBookArom);
		
		JButton buttonSeeRom = new JButton("See rooms");
		buttonSeeRom.setBackground(new Color(153, 51, 0)); 
		buttonSeeRom.setForeground(new Color(245, 245, 220));
		buttonSeeRom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonSeeRom.setBounds(662, 9, 100, 21);
		buttonSeeRom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				SRoomsC seeRom= new SRoomsC();
				seeRom.show();
				Administrateur.afficherRooms();
			}
		});
		contentPane.add(buttonSeeRom);
		
		JList listBookings = new JList();
		listBookings.setBounds(172, 73, 544, 95);
		listBookings.setBackground(new Color(253, 245, 230));
		contentPane.add(listBookings);
		
		
		
		
		JButton ButtonAnnulReserv = new JButton("New button");
	    ButtonAnnulReserv.setBackground(new Color(153, 51, 0)); 
	    ButtonAnnulReserv.setForeground(new Color(245, 245, 220));
	    ButtonAnnulReserv.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    ButtonAnnulReserv.setBounds(536, 160, 85, 21);
	    ButtonAnnulReserv.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        AnnulerReser anRsrv = new AnnulerReser();
	        anRsrv.show();
	      }
	    });
	    contentPane.add(ButtonAnnulReserv);
	    
	    JButton ButtonModifResrv = new JButton("New button");
	    ButtonModifResrv.setBackground(new Color(153, 51, 0)); 
	    ButtonModifResrv.setForeground(new Color(245, 245, 220));
	    ButtonModifResrv.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    ButtonModifResrv.setBounds(631, 160, 85, 21);
	    ButtonModifResrv.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        ModifierReserv modRsrv = new ModifierReserv();
	        modRsrv.show();
	      }
	    });
	    contentPane.add(ButtonModifResrv);
        
	}

}
		