package hotel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;

public class SRoomsAdmin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SRoomsAdmin frame = new SRoomsAdmin();
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
	public SRoomsAdmin() {
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
		
		JButton buttonAddRoom = new JButton("Add a room");
		buttonAddRoom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 buttonAddRoom.setForeground(new Color(255, 255, 255));
	        buttonAddRoom.setBackground(new Color(153, 51, 0));
		buttonAddRoom.setBounds(508, 412, 115, 21);
		 buttonAddRoom.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					AddRoom rom= new AddRoom();
					rom.show();
					
				}
			});
		contentPane.add(buttonAddRoom);
		
		JButton buttonRemoveRom = new JButton("Remove a room");
		buttonRemoveRom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		 buttonRemoveRom.setForeground(new Color(255, 255, 255));
	        buttonRemoveRom.setBackground(new Color(153, 51, 0));
		buttonRemoveRom.setBounds(635, 412, 125, 21);
		buttonRemoveRom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RemoveRoom supRom = new RemoveRoom();
				supRom.show();
			}
		});
		contentPane.add(buttonRemoveRom);
		
		
		
		
		JButton buttonSeeClien = new JButton("See clients ");
		buttonSeeClien.setBackground(new Color(153, 51, 0)); 
		buttonSeeClien.setForeground(new Color(245, 245, 220));
		buttonSeeClien.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonSeeClien.setBounds(498, 9, 100, 21);
		buttonSeeClien.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SClients clients= new SClients();
					clients.show();
				}
			});
		contentPane.add(buttonSeeClien);
		
		JLabel lblRooms = new JLabel("Rooms");
		lblRooms.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRooms.setForeground(new Color(153, 51, 0));
		
		lblRooms.setBounds(433, 0, 55, 37);
		contentPane.add(lblRooms);
		
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
		
        
		
		
		JLabel lblMsg = new JLabel("Our rooms :");
		lblMsg.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMsg.setBounds(41, 77, 109, 38);
		contentPane.add(lblMsg);
		
		JLabel lblRomNum = new JLabel("Room number");
		lblRomNum.setBounds(41, 103, 87, 31);
		contentPane.add(lblRomNum);
		
		
		
		
		
		
	        
		
		
	}
}

