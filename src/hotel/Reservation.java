package hotel;




public class Reservation {
  
  private int number_chambre;
  private double prix_reservation;
  private Date d[];
  private String type_chambre;
  
 public Reservation( int number_chambre, double prix_reservation, Date[] d) {
	
	this.number_chambre = number_chambre;
	this.prix_reservation = prix_reservation;
	this.d = d;
	
 }
 
 public int getNumber_chambre() {
	return number_chambre;
 }
 public void setNumber_chambre(int number_chambre) {
	this.number_chambre = number_chambre;
 }
 public double getPrix_reservation() {
	return prix_reservation;
 }
 public void setPrix_reservation(double prix_reservation) {
	this.prix_reservation = prix_reservation;
 }
 public Date[] getD() {
	return d;
 }
 public void setD(Date[] d) {
	this.d = d;
 }
   
}
