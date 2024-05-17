package hotel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SRoomsC extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SRoomsC frame = new SRoomsC();
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
	public SRoomsC() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 160, 800, 480);
		setTitle("Moon Hotel");
		
		setResizable(false);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(253, 245, 230));

		setContentPane(contentPane);
		
		
        contentPane.setLayout(null);
       
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
		
		
		JLabel buttonRooms = new JLabel("See rooms");
		buttonRooms.setForeground(new Color(153, 51, 0));
		buttonRooms.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonRooms.setBounds(676, 9, 85, 21);
		 contentPane.add(buttonRooms);
		
		 
	        /*
	        Administrateur.afficherRooms();
	        
	        
	        DefaultListModel<String> listRoomss  = new DefaultListModel<>();
	        for (int key : main.chambres.keySet()) {
	            Chambre chambre = main.chambres.get(key);
	            listRoomss.addElement(chambre.getType() + "          " + chambre.getNumber_chambre());
	        }
			
	        JList<String> list_1 = new JList<>(listRoomss);
	        list_1.setBounds(35, 134, 326, 254);
	        list_1.setBackground(new Color(253, 245, 230));
	        contentPane.add(list_1);
	        */
		 Chambre chambre1 = new Chambre(5, "suite", "06789004", true ,20000, 3);
	        Chambre chambre2 = new Chambre(12, "simple", "023467", true, 700.50, 1);
	        Chambre chambre3 = new Chambre(10, "double", "034567", true, 10000, 2);
	        // Ajout du client au HashMap clients avec l'ID 1
	       
	        Administrateur.addRoom(chambre1);
	        Administrateur.addRoom(chambre2);
	        Administrateur.addRoom(chambre3);
	        
	        DefaultListModel<String> listRoomss  = new DefaultListModel<>();
	        for (int key : main.chambres.keySet()) {
	            Chambre chambre = main.chambres.get(key);
	            listRoomss.addElement(chambre.getType() + "          " + chambre.getNumber_chambre());
	        }
			
	        JList<String> list_1 = new JList<>(listRoomss);
	        list_1.setBounds(35, 134, 326, 254);
	        list_1.setBackground(new Color(253, 245, 230));
	        contentPane.add(list_1);
			
	        
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
      
        	JLabel lblOurRom = new JLabel("Our Rooms :");
        	        lblOurRom.setFont(new Font("Tahoma", Font.BOLD, 20));
        	        lblOurRom.setBounds(35, 82, 126, 38);
        	        contentPane.add(lblOurRom);
        	        
        	        JLabel Moon = new JLabel("");
        	    Moon.setBounds(10, 9, 162, 70);
        	    Image img2 = new ImageIcon(this.getClass().getResource("/Typograms 1.png")).getImage();
        	    Moon.setIcon(new ImageIcon(img2));
        	    contentPane.add(Moon);

        	
        	JList listRooms = new JList();
        	    listRooms.setBounds(35, 130, 302, 256);
        	    listRooms.setBackground(new Color(253, 245, 230));
        	    contentPane.add(listRooms);

	}
	
	






}

