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
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class AddRoom extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Roomnbr;
	private JTextField textFieldRomPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddRoom frame = new AddRoom();
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
	public AddRoom() {
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
		
		JLabel lblRomNbr = new JLabel("Room number");
		lblRomNbr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRomNbr.setBounds(37, 89, 98, 13);
		contentPane.add(lblRomNbr);
		
		Roomnbr = new JTextField();
		Roomnbr.setBounds(131, 89, 41, 19);
		contentPane.add(Roomnbr);
		Roomnbr.setColumns(10);
		
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
		
		
		
		JButton buttonRemoveRom = new JButton("Remove a room");
		buttonRemoveRom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 buttonRemoveRom.setForeground(new Color(255, 255, 255));
	        buttonRemoveRom.setBackground(new Color(153, 51, 0));
		buttonRemoveRom.setBounds(635, 412, 125, 21);
		buttonRemoveRom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoveRoom room= new RemoveRoom();
				room.show();
			}
		});
		contentPane.add(buttonRemoveRom);
		
		
		JComboBox typesRoom = new JComboBox();
		typesRoom.setFont(new Font("Tahoma", Font.PLAIN, 13));
		typesRoom.setEditable(true);
		typesRoom.setForeground(new Color(153, 51, 0));
		typesRoom.setBackground(new Color(253, 245, 230));
		typesRoom.setBounds(131, 125, 125, 21);
		contentPane.add(typesRoom);
		typesRoom.addItem("Single");
		typesRoom.addItem("Double");
		typesRoom.addItem("Suite");
		typesRoom.setSelectedItem("Select room type");
		
		JLabel lblRomType = new JLabel("Room type");
		lblRomType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRomType.setBounds(37, 124, 72, 21);
		contentPane.add(lblRomType);
		
		JLabel lblEmpty = new JLabel("Empty");
		lblEmpty.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmpty.setBounds(37, 167, 45, 19);
		contentPane.add(lblEmpty);
		
		JComboBox isEmpty = new JComboBox();
		isEmpty.setFont(new Font("Tahoma", Font.PLAIN, 13));
		isEmpty.setEditable(true);
		isEmpty.setForeground(new Color(153, 51, 0));
		isEmpty.setBackground(new Color(253, 245, 230));
		isEmpty.setBounds(131, 167, 125, 21);
		contentPane.add(isEmpty);
		isEmpty.addItem("Empty");
		isEmpty.addItem("Double");
		isEmpty.setSelectedItem("");
		
		JLabel lblFloorNbr = new JLabel("Floor number");
		lblFloorNbr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFloorNbr.setBounds(37, 209, 98, 19);
		contentPane.add(lblFloorNbr);
		
		JComboBox nbrEtage = new JComboBox();
		nbrEtage.setFont(new Font("Tahoma", Font.PLAIN, 13));
		nbrEtage.setEditable(true);
		nbrEtage.setForeground(new Color(153, 51, 0));
		nbrEtage.setBackground(new Color(253, 245, 230));
		nbrEtage.setBounds(131, 209, 125, 21);
		contentPane.add(nbrEtage);
		nbrEtage.addItem("1");
		nbrEtage.addItem("2");
		nbrEtage.addItem("3");
		nbrEtage.addItem("5");
		nbrEtage.addItem("6");
		nbrEtage.addItem("7");
		nbrEtage.addItem("8");
		nbrEtage.setSelectedItem("");
		
		JLabel lblRomPrice = new JLabel("Room price");
		lblRomPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRomPrice.setBounds(37, 253, 82, 19);
		contentPane.add(lblRomPrice);
		
		JButton buttonAddRoom = new JButton("Add room");
		buttonAddRoom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 buttonAddRoom.setForeground(new Color(255, 255, 255));
	     buttonAddRoom.setBackground(new Color(153, 51, 0));
		buttonAddRoom.setBounds(112, 312, 85, 21);
		buttonAddRoom.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Récupérer les valeurs des champs du formulaire
		        int roomNumber = Integer.parseInt(Roomnbr.getText());
		        String roomType = (String) typesRoom.getSelectedItem();
		        boolean isEmptyRoom = isEmpty.getSelectedItem().equals("Empty");
		        int floorNumber = Integer.parseInt((String) nbrEtage.getSelectedItem());
		        double roomPrice = Double.parseDouble(textFieldRomPrice.getText());

		        // Créer une nouvelle instance de Chambre avec les valeurs récupérées
		        Chambre newRoom = new Chambre(roomNumber, roomType,"", isEmptyRoom, roomPrice, floorNumber);

		        // Ajouter la nouvelle chambre à la liste des chambres
		        Administrateur.addRoom(newRoom);

		        // Afficher un message pour indiquer que la chambre a été ajoutée
		        System.out.println("Room added successfully!");
		    }
		});
		 contentPane.add(buttonAddRoom);
	
            
		textFieldRomPrice = new JTextField();
		textFieldRomPrice.setBounds(131, 255, 125, 19);
		contentPane.add(textFieldRomPrice);
		textFieldRomPrice.setColumns(10);
		
		JLabel lblAddRoom = new JLabel("Add a room");
		lblAddRoom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAddRoom.setForeground(new Color(153, 51, 0));
		lblAddRoom.setBackground(new Color(153, 51, 0));
		lblAddRoom.setBounds(540, 413, 98, 19);
		contentPane.add(lblAddRoom);
	}
}

