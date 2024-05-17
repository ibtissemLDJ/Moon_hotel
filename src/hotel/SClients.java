package hotel;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeMap;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class SClients extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SClients frame = new SClients();
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
	public SClients() {
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
		
		
		
		
		JButton buttonRooms = new JButton("Rooms");
		 buttonRooms.setForeground(new Color(255, 255, 255));
	        buttonRooms.setBackground(new Color(153, 51, 0));
	        buttonRooms.setFont(new Font("Tahoma", Font.PLAIN, 12));
	        buttonRooms.setBounds(378, 9, 109, 21);
	        buttonRooms.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					SRoomsAdmin srm = new SRoomsAdmin();
					srm.show();
				}
			});
		contentPane.add(buttonRooms);
		
		
		JLabel lblSeeClients = new JLabel("See clients");
		lblSeeClients.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSeeClients.setForeground(new Color(153, 51, 0));
		lblSeeClients.setBackground(new Color(153, 51, 0));
		lblSeeClients.setBounds(516, 14, 82, 13);
		contentPane.add(lblSeeClients);
		
		
		
		
		Client client1 = new Client("amira", "benbellil", "amira@example.com", "password123", "0123456789", "123 Street");
		Client client3 = new Client("manel", "tifoura", "manel@example.com", "password124", "0123456788", "124 Street");
		Client client4 = new Client("ibtissem", "ladjici", "sam@example.com", "password125", "0123456787", "125 Street");

		Administrateur.addClient(client1);
		Administrateur.addClient(client3);
		Administrateur.addClient(client4);
// j'ai utilise treemap pour redondance pas le clent qui affiche
		// Créer un TreeMap pour stocker les clients triés par nom de famille
		TreeMap<String, Client> sortedClients = new TreeMap<>();
		for (Client client : main.clients.values()) {
		    sortedClients.put(client.getLastName(), client);
		}

		// Créer un modèle de liste pour les clients
		DefaultListModel<String> listModel = new DefaultListModel<>();

		// Ajouter les clients triés à la liste
		for (Client client : sortedClients.values()) {
		    listModel.addElement(client.getName() + " " + client.getLastName());
		}

		// Créer une nouvelle JList avec le modèle de liste mis à jour
		JList<String> list_1 = new JList<>(listModel);
		list_1.setBounds(41, 148, 265, 261);
		list_1.setBackground(new Color(253, 245, 230));

		// Ajouter la nouvelle JList au contentPane
		contentPane.add(list_1);
		
       
        
		
        
	        JLabel lblMsg1 = new JLabel("Our clients :");
	        lblMsg1.setFont(new Font("Tahoma", Font.BOLD, 14));
	        lblMsg1.setBounds(41, 77, 109, 38);
	        contentPane.add(lblMsg1);
	        
	        JLabel lblName = new JLabel("Name ");
	        lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lblName.setBounds(41, 117, 38, 21);
	        contentPane.add(lblName);
	        
	        JLabel lblLastName = new JLabel("Last name ");
	        lblLastName.setFont(new Font("Tahoma", Font.BOLD, 12));
	        lblLastName.setBounds(90, 117, 70, 21);
	        contentPane.add(lblLastName);
		
		
	}
}
