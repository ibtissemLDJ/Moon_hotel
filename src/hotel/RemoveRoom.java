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
import javax.swing.JTextField;

public class RemoveRoom extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldRoomNbr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoveRoom frame = new RemoveRoom();
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
	public RemoveRoom() {
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
		
		JButton buttonAddRom = new JButton("Add a room");
		buttonAddRom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 buttonAddRom.setForeground(new Color(255, 255, 255));
	        buttonAddRom.setBackground(new Color(153, 51, 0));
		buttonAddRom.setBounds(508, 412, 115, 21);
		 buttonAddRom.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AddRoom rom= new AddRoom();
					rom.show();
				}
			});
		contentPane.add(buttonAddRom);
		
		JLabel lblRemoveRom = new JLabel("Remove a room");
		lblRemoveRom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRemoveRom.setForeground(new Color(153, 51, 0));
		lblRemoveRom.setBackground(new Color(153, 51, 0));
		lblRemoveRom.setBounds(656, 412, 97, 18);
		contentPane.add(lblRemoveRom);
		
		JButton buttonPendReserv = new JButton("Pending reservations");
		buttonPendReserv.setBackground(new Color(153, 51, 0)); 
		buttonPendReserv.setForeground(new Color(245, 245, 220));
		buttonPendReserv.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonPendReserv.setBounds(608, 9, 152, 21);
		buttonPendReserv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PendingReservations pendRsrv = new PendingReservations();
				pendRsrv.show();
			}
		});
		contentPane.add(buttonPendReserv);
		
		JButton buttonSeeClients = new JButton("See clients ");
		buttonSeeClients.setBackground(new Color(153, 51, 0)); 
		buttonSeeClients.setForeground(new Color(245, 245, 220));
		buttonSeeClients.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonSeeClients.setBounds(498, 9, 100, 21);
		buttonSeeClients.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SClients clients= new SClients();
					clients.show();
				}
			});
		contentPane.add(buttonSeeClients);
		
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
		
		JButton buttonRemoveRom = new JButton("Remove room");
		buttonRemoveRom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		 buttonRemoveRom.setForeground(new Color(255, 255, 255));
	        buttonRemoveRom.setBackground(new Color(153, 51, 0));
		buttonRemoveRom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonRemoveRom.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            // Récupérer le numéro de la chambre à supprimer depuis le champ de texte
	            int roomNumber = Integer.parseInt(textFieldRoomNbr.getText());

	            // Supprimer la chambre avec le numéro correspondant de la liste des chambres
	            Administrateur.removeRoom(roomNumber);

	            // Afficher un message pour indiquer que la chambre a été supprimée avec succès
	            System.out.println("Room removed successfully!");
	        }
	    });
		buttonRemoveRom.setBounds(651, 98, 109, 21);
		contentPane.add(buttonRemoveRom);
		
		JLabel lblNumRoom = new JLabel("Room number :");
		lblNumRoom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumRoom.setBounds(32, 97, 109, 21);
		contentPane.add(lblNumRoom);
		
		textFieldRoomNbr = new JTextField();
		textFieldRoomNbr.setBounds(134, 100, 62, 19);
		contentPane.add(textFieldRoomNbr);
		textFieldRoomNbr.setColumns(10);
		
		
	}
}

