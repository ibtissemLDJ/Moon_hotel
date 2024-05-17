package hotel;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.HashMap;
import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PendingReservations extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PendingReservations frame = new PendingReservations();
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
	public PendingReservations() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Moon Hotel");
		setBounds(350, 160, 800, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(253, 245, 230));
		setResizable(false);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 //Administrateur admin = new Administrateur();
		   // Date dd = new Date(13,01,2024);
		   // Date df = new Date(25,01,2024);
		    
		   String typeChambre1 = "simple12";
        String typeChambre2 = "double10";

        HashMap<Integer, Date[]> reservationsType1 = new HashMap<>();
       reservationsType1.put(1, new Date[]{new Date(1,1,2024), new Date(5,1,2024)});
       reservationsType1.put(2, new Date[]{new Date(10,2,2024), new Date(15,2,2024)});

        HashMap<Integer, Date[]> reservationsType2 = new HashMap<>();
        reservationsType2.put(3, new Date[]{new Date(20,3,2024), new Date(25,3,2024)});
         reservationsType2.put(4, new Date[]{new Date(30,4,2024), new Date(5,5,2024)});

        main.reservations.put(typeChambre1, reservationsType1);
        main.reservations.put(typeChambre2, reservationsType2); //admin.ajouterReservation( "3" ,"simple", dd ,df);
		    
		    DefaultListModel<String> listModel = new DefaultListModel<>();
	        for (String key : main.reservations.keySet()) {
	         Map<Integer, Date[]> reservation = new HashMap();
	            
	         reservation = main.reservations.get(key);
	         for(Integer key1: reservation.keySet()) {
	        	 Date[] date = reservation.get(key1);
	        	 listModel.addElement(date[0]+ "     "+ date[1]);
	         }
	            
	        }
		    JList list_1 = new JList(listModel);
	        list_1.setBounds(41, 148, 265, 261);
	        contentPane.add(list_1);
	}
 
		//Administrateur admin = new Administrateur(); // Création d'un objet Administrateur
       // Date dd = new Date(13, 01, 2024);
       // Date df = new Date(25, 01, 2024);

        

}
