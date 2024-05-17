package hotel;



import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class BookARoom extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookARoom frame = new BookARoom();
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
	public BookARoom() {
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
		
		ImageIcon icon3 = new ImageIcon (this.getClass().getResource("Frame 40.png"));
		JLabel lblImageSingle = new JLabel(icon3);
		lblImageSingle.setBounds(27, 225, 225, 138);
		contentPane.add(lblImageSingle);
		
		ImageIcon icon2 = new ImageIcon(this.getClass().getResource("Frame 39.png"));
		JLabel lblImageDouble = new JLabel(icon2);
		lblImageDouble.setBounds(280, 225, 225, 138);
		contentPane.add(lblImageDouble);
		
		ImageIcon icon = new ImageIcon (this.getClass().getResource("Frame 38.png"));
		JLabel lblImageSuite = new JLabel(icon);
		lblImageSuite.setBounds(537, 225, 225, 138);
		contentPane.add(lblImageSuite);
		
		JLabel lblLigne1 = new JLabel("a single room ");
		lblLigne1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLigne1.setBounds(27, 361, 124, 34);
		contentPane.add(lblLigne1);
		
		JLabel lbl2ligne1 = new JLabel("a double room ");
		lbl2ligne1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl2ligne1.setBounds(280, 373, 100, 13);
		contentPane.add(lbl2ligne1);
		
		JLabel lbl3ligne1 = new JLabel("a triple room");
		lbl3ligne1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl3ligne1.setBounds(547, 373, 118, 22);
		contentPane.add(lbl3ligne1);
		
		JLabel lbl3ligne2 = new JLabel("suite");
		lbl3ligne2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl3ligne2.setBounds(546, 396, 70, 13);
		contentPane.add(lbl3ligne2);
		
		JLabel lbl3ligne3 = new JLabel("with ");
		lbl3ligne3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl3ligne3.setBounds(545, 409, 56, 24);
		contentPane.add(lbl3ligne3);
		
		table = new JTable();
		table.setBounds(88, 387, 1, 1);
		contentPane.add(table);
		
		JLabel lblLigne2 = new JLabel("with a big window");
		lblLigne2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLigne2.setBounds(27, 373, 162, 48);
		contentPane.add(lblLigne2);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setBounds(318, 390, 45, 13);
		contentPane.add(lblNewLabel_9);
		
		JLabel lbl2ligne2 = new JLabel("New label");
		lbl2ligne2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl2ligne2.setBounds(290, 396, 118, 13);
		contentPane.add(lbl2ligne2);
		
		JLabel lblBookArom = new JLabel("Book a room");
		lblBookArom.setForeground(new Color(153, 51, 0));
		lblBookArom.setBackground(new Color(153, 51, 0));
		lblBookArom.setFont(new Font("Tahoma", Font.PLAIN, 12));
	
		lblBookArom.setBounds(436, 9, 80, 22);
		contentPane.add(lblBookArom);
		
		JButton buttonBookings = new JButton("See my bookings");
		buttonBookings.setBackground(new Color(153, 51, 0)); 
		buttonBookings.setForeground(new Color(245, 245, 220));
		buttonBookings.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonBookings.setBounds(523, 10, 124, 21);
		buttonBookings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bookings seeBook= new Bookings();
				seeBook.show();
			}
		});
		contentPane.add(buttonBookings);
		
		JButton buttonSeeRom = new JButton("See rooms");
		buttonSeeRom.setBackground(new Color(153, 51, 0)); 
		buttonSeeRom.setForeground(new Color(245, 245, 220));
		buttonSeeRom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonSeeRom.setBounds(662, 9, 100, 21);
		buttonSeeRom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SRoomsC seeRom= new SRoomsC();
				seeRom.show();
				
			}
		});
		contentPane.add(buttonSeeRom);
		
		
		JLabel lblRomType = new JLabel("Room type:");
		lblRomType.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRomType.setBounds(260, 134, 70, 13);
		contentPane.add(lblRomType);
		
		JLabel lblArivDate = new JLabel("Arrival date:");
		lblArivDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblArivDate.setBounds(37, 89, 80, 21);
		contentPane.add(lblArivDate);
		
		JLabel lblDeparDate = new JLabel("Departure date:");
		lblDeparDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDeparDate.setBounds(413, 93, 92, 13);
		contentPane.add(lblDeparDate);
		
		
		JComboBox typesRoom = new JComboBox();
		typesRoom.setFont(new Font("Tahoma", Font.PLAIN, 10));
		typesRoom.setEditable(true);
		typesRoom.setForeground(new Color(153, 51, 0));
		typesRoom.setBackground(new Color(253, 245, 230));
		typesRoom.setBounds(330, 131, 109, 21);
		contentPane.add(typesRoom);
		typesRoom.addItem("Single");
		typesRoom.addItem("Double");
		typesRoom.addItem("Suite");
		typesRoom.setSelectedItem("Select room type");
		
		JComboBox JourARIV = new JComboBox();
		JourARIV.setBounds(109, 89, 42, 21);
		JourARIV.setForeground(new Color(153, 51, 0));
		JourARIV.setBackground(new Color(253, 245, 230));
		JourARIV.addItem("1");
		JourARIV.addItem("2");
		JourARIV.addItem("3");
		JourARIV.addItem("4");
		JourARIV.addItem("5");
		JourARIV.addItem("6");
		JourARIV.addItem("7");
		JourARIV.addItem("8");
		JourARIV.addItem("9");
		JourARIV.addItem("10");
		JourARIV.addItem("11");
		JourARIV.addItem("12");
		JourARIV.addItem("13");
		JourARIV.addItem("14");
		JourARIV.addItem("15");
		JourARIV.addItem("16");
		JourARIV.addItem("17");
		JourARIV.addItem("18");
		JourARIV.addItem("19");
		JourARIV.addItem("20");
		JourARIV.addItem("21");
		JourARIV.addItem("22");
		JourARIV.addItem("23");
		JourARIV.addItem("24");
		JourARIV.addItem("25");
		JourARIV.addItem("26");
		JourARIV.addItem("27");
		JourARIV.addItem("28");
		JourARIV.addItem("29");
		JourARIV.addItem("30");
		JourARIV.addItem("31");
		contentPane.add(JourARIV);

		JComboBox MoisARIV = new JComboBox();
		MoisARIV.setBounds(161, 89, 42, 21);
		MoisARIV.setForeground(new Color(153, 51, 0));
		MoisARIV.setBackground(new Color(253, 245, 230));
		MoisARIV.addItem("1");
		MoisARIV.addItem("2");
		MoisARIV.addItem("3");
		MoisARIV.addItem("4");
		MoisARIV.addItem("5");
		MoisARIV.addItem("6");
		MoisARIV.addItem("7");
		MoisARIV.addItem("8");
		MoisARIV.addItem("9");
		MoisARIV.addItem("10");
		MoisARIV.addItem("11");
		MoisARIV.addItem("12");
		contentPane.add(MoisARIV);
		
		JComboBox AnneeARIV = new JComboBox();
		AnneeARIV.setBounds(213, 89, 56, 21);
		AnneeARIV.setForeground(new Color(153, 51, 0));
		AnneeARIV.setBackground(new Color(253, 245, 230));
		AnneeARIV.addItem("2024");
		AnneeARIV.addItem("2025");
		contentPane.add(AnneeARIV);
		
		JComboBox JourDEPAR = new JComboBox();
		JourDEPAR.setBounds(508, 90, 42, 21);
		JourDEPAR.setForeground(new Color(153, 51, 0));
		JourDEPAR.setBackground(new Color(253, 245, 230));
		JourDEPAR.addItem("1");
		JourDEPAR.addItem("2");
		JourDEPAR.addItem("3");
		JourDEPAR.addItem("4");
		JourDEPAR.addItem("5");
		JourDEPAR.addItem("6");
		JourDEPAR.addItem("7");
		JourDEPAR.addItem("8");
		JourDEPAR.addItem("9");
		JourDEPAR.addItem("10");
		JourDEPAR.addItem("11");
		JourDEPAR.addItem("12");
		JourDEPAR.addItem("13");
		JourDEPAR.addItem("14");
		JourDEPAR.addItem("15");
		JourDEPAR.addItem("16");
		JourDEPAR.addItem("17");
		JourDEPAR.addItem("18");
		JourDEPAR.addItem("19");
		JourDEPAR.addItem("20");
		JourDEPAR.addItem("21");
		JourDEPAR.addItem("22");
		JourDEPAR.addItem("23");
		JourDEPAR.addItem("24");
		JourDEPAR.addItem("25");
		JourDEPAR.addItem("26");
		JourDEPAR.addItem("27");
		JourDEPAR.addItem("28");
		JourDEPAR.addItem("29");
		JourDEPAR.addItem("30");
		JourDEPAR.addItem("31");
		contentPane.add(JourDEPAR);
		
		JComboBox MoisDEPAR = new JComboBox();
		MoisDEPAR.setBounds(559, 90, 42, 21);
		MoisDEPAR.setForeground(new Color(153, 51, 0));
		MoisDEPAR.setBackground(new Color(253, 245, 230));
		MoisDEPAR.addItem("1");
		MoisDEPAR.addItem("2");
		MoisDEPAR.addItem("3");
		MoisDEPAR.addItem("4");
		MoisDEPAR.addItem("5");
		MoisDEPAR.addItem("6");
		MoisDEPAR.addItem("7");
		MoisDEPAR.addItem("8");
		MoisDEPAR.addItem("9");
		MoisDEPAR.addItem("10");
		MoisDEPAR.addItem("11");
		MoisDEPAR.addItem("12");
		contentPane.add(MoisDEPAR);
		
		JComboBox AnneeDEPAR = new JComboBox();
		AnneeDEPAR.setBounds(609, 90, 56, 21);
		AnneeDEPAR.setForeground(new Color(153, 51, 0));
		AnneeDEPAR.setBackground(new Color(253, 245, 230));
		AnneeDEPAR.addItem("2024");
		AnneeDEPAR.addItem("2025");
		contentPane.add(AnneeDEPAR);
		
		
		
		
		
	}
}
