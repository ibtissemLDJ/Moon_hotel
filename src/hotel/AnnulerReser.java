
package hotel;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;

public class AnnulerReser extends JFrame {

  private static final long serialVersionUID = 1L;
  private JPanel contentPane;

 
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          AnnulerReser frame = new AnnulerReser ();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  
  public AnnulerReser() {
    
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    setTitle("Moon Hotel");
    setBounds(350, 160, 800, 480);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    contentPane.setBackground(new Color(253, 245, 230));
    setResizable(false);
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel Moon = new JLabel("");
    Moon.setBounds(10, 9, 162, 70);
    Image img2 = new ImageIcon(this.getClass().getResource("/Typograms 1.png")).getImage();
    Moon.setIcon(new ImageIcon(img2));
    contentPane.add(Moon);
    
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
      
      JLabel lblRoomType = new JLabel("Room Type :");
      lblRoomType.setFont(new Font("Tahoma", Font.PLAIN, 14));
      lblRoomType.setBounds(10, 113, 117, 29);
      contentPane.add(lblRoomType);
      
      JLabel lblArrivDate = new JLabel("Arrival Date :");
      lblArrivDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
      lblArrivDate.setBounds(10, 169, 82, 21);
      contentPane.add(lblArrivDate);
      
      JLabel lblDeparDate = new JLabel("Departure Date :");
      lblDeparDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
      lblDeparDate.setBounds(10, 217, 117, 21);
      contentPane.add(lblDeparDate);
      
      JComboBox typesRoom = new JComboBox();
      typesRoom.setFont(new Font("Tahoma", Font.PLAIN, 10));
      typesRoom.setEditable(true);
      typesRoom.setForeground(new Color(153, 51, 0));


typesRoom.setBackground(new Color(253, 245, 230));
      typesRoom.setBounds(106, 119, 109, 21);
      typesRoom.addItem("Single");
      typesRoom.addItem("Double");
      typesRoom.addItem("Suite");
      typesRoom.setSelectedItem("Select room type");
      
      contentPane.add(typesRoom);
      
      JComboBox JourARIV = new JComboBox();
      JourARIV.setBounds(127, 171, 36, 21);
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
      MoisARIV.setBounds(173, 171, 36, 21);
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
      AnneeARIV.setBounds(219, 171, 62, 21);
      AnneeARIV.setForeground(new Color(153, 51, 0));
      AnneeARIV.setBackground(new Color(253, 245, 230));
      AnneeARIV.addItem("2024");
      AnneeARIV.addItem("2025");
      contentPane.add(AnneeARIV);
      
      JComboBox JourDEPAR = new JComboBox();
      JourDEPAR.setBounds(127, 219, 36, 21);
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
      MoisDEPAR.setBounds(174, 219, 36, 21);
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
      AnneeDEPAR.setBounds(219, 219, 62, 21);
      AnneeDEPAR.setForeground(new Color(153, 51, 0));
      AnneeDEPAR.setBackground(new Color(253, 245, 230));
      AnneeDEPAR.addItem("2024");
      AnneeDEPAR.addItem("2025");
      contentPane.add(AnneeDEPAR);
      
    
  }
}
