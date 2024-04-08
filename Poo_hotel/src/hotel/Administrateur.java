package hotel;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class Administrateur extends User {
   private boolean active;
   private double salary;
   private double price1; // Ajoutez ces variables pour stocker les prix des différentes types de chambre
   private double price2;
   private double price3;
   private double price4;
   private HashMap <String, Administrateur> Administrateurs = new HashMap<>();
  private HashMap<String, Client> clients = new HashMap<>();
  private HashMap<String, HashMap<String, Date[]>> reservations = new HashMap<>();
  private HashMap<Integer, Chambre> chambres = new HashMap<>();
  public Administrateur(String name, String lastName, String email, String password, String phonenumber,boolean active, double salary, String ID) {
	super(name, lastName, email, password, phonenumber );
	this.active=active;
	this.salary=salary;
	// Initialisez les prix des chambres
    this.price1 = 1000; // Prix pour la chambre single
    this.price2 = 1500; // Prix pour la chambre double
    this.price3 = 2000; // Prix pour la chambre triple
    this.price4 = 2500; // Prix pour la suite
  }
  public boolean isActive() {
	return active;
  }
  public void setActive(boolean active) {
	this.active = active;
  }
  public double getSalary() {
	return salary;
  }
  public void setSalary(double salary) {
	this.salary = salary;
  }
  

  public void verifierReservation(String ID ) {
    for (Map.Entry<String, HashMap<String, Date[]>> e: main.reservations.entrySet()) {
  Map <String , Date []> map = new HashMap () ;
  map = e.getValue();
  if (map.containsKey(ID)) { //si hashmap contient ID du client
    Date [] tab = map.get(ID); //alors recuperer sa date de reservation 
    System.out.println("Vous avez une reservation du "+ tab[0]+ "au"+ tab[1]);
  }else {
    System.out.println("Vous n'avez pas de reservations");
  }
    } }
  
  public double calculateTotalPrice(Date deb , Date fin , String typeRoom) {
    double price = 0;
    int nbrJours = nbrDeNuits (deb , fin);
    if (typeRoom.equals ("single")) price = price1;
    else if (typeRoom.equals ("double")) price = price2;
    else if (typeRoom.equals ("triple")) price = price3;
    else if (typeRoom.equals ("suite")) price = price4;
    return price*nbrJours ;
  }
  public int nbrDeNuits(Date debut, Date fin) {
	    // Appelez la méthode nbrDeNuits de la classe Date directement
	    return debut.nbrDeNuits(debut, fin);
	}
public int checkAvailableRoomDate(String typeRoom , Date dateDebut , Date dateFin ) {//methode pour verifier la date chpisit par le client est disponible
    for (Entry<String, HashMap<String, Date[]>> e1: reservations.entrySet()) {//parcourir la hashmap externe 
    if ( e1.getKey().startsWith(typeRoom)){ //si la cle commence par le type de la chambre demande
    String numRoom1 = (e1.getKey()).replaceAll("\\D", "");//
    int numRoom2 = Integer.parseInt(numRoom1);
      if (reservedRoom(typeRoom,numRoom2)== false) return numRoom2 ; //si la chambre nest reserver par personne retourner son numero directement
      else{//sinon verifier si la date est disponible
        Map <String , Date []> map = new HashMap () ; 
      map = e1.getValue();//mettre la hashmap interne dans une hashmap intermediere 
      boolean bool ;
      for (Entry<String,  Date[]> e2: map.entrySet()){
        //recuperer les dates en utilisant getValue
        Date [] tab = e2.getValue() ;
         bool = false ;
        if ((tab[0].getMonth())==(dateDebut.getMonth())) {
          if ((dateDebut.getDay()) > (tab[0].getDay())) {//si la date du deb est > a la date du debut du tableau
            if((dateDebut.getDay()) > (tab[1].getDay())) {//si la date du deb est > a la date du fin du tableau
              bool = true ;
            }
          } else if ((dateDebut.getDay()) < (tab[0].getDay())) {//si la date du deb est < a la date de debut du tableau
            if ((dateFin.getDay()) < (tab[0].getDay())){//si la date du fin est < a la date du debut du tableau
              bool = true ;
            }
          }
        }
          } if (bool = false) return 0 ;
          else return numRoom2;
      }
    }}
	return 0;
  }
  
  public void ajouterReservation(String ID ,String type, Date debut , Date fin) {
     int numRoom = checkAvailableRoomDate(type , debut , fin); //appel a la methode checkAvailableRoomDate
     if (!(numRoom == 0) ) { 
     String  numberRoom = String.valueOf(numRoom); //transformer le type de numero de la chambre en string
     String cle = type.concat(numberRoom); //former la cle en concatinant le type et le num de la chambre
    //ajouter la reservation 
     Date[] tab = { debut , fin }; //creer un tableau avec la date de resrvation
    reservations.get(cle).put(ID, tab); //ajouter le tableau au hashmap 
     } else  //si num de la chambre =0 
     {
      System.out.println("Nous excusons, pas de chambres libres pour cette date"); 
     }
  }
  
  public void anullerReservation(String ID , int numRoom, String typeRoom){
    String  numberRoom = String.valueOf(numRoom);
    String cle = typeRoom.concat(numberRoom);
    if (reservations.containsKey(cle)) {
    reservations.get(cle).remove(ID);
    } 
    }
  
  public void modifierReservation(String ID , int numRoom, String typeRoom, Date nouvDateDeb , Date nouvDateFin) {
    String  numberRoom = String.valueOf(numRoom);
    String cle = typeRoom.concat(numberRoom);
    if (reservations.containsKey(cle)) {
        //il faut verifier si la nouvelle date existe deja 
      HashMap<String , Date[]> map2 = new HashMap();
     map2=  reservations.get(cle);
     Date [] tab2 ;
     for (Entry<String, Date[]> e3: map2.entrySet()) {
      tab2= e3.getValue();
     }
      Date [] tab = { nouvDateDeb , nouvDateFin} ;
      reservations.get(cle).put(ID, tab);
    }
  }
  
  public void addRoom(Chambre chmbr) {
    if (reservations.containsKey(chmbr.getNumber_chambre())) {//verifier si cette chambre existe deja avant de la creer
      System.out.println("Cette chambre existe deja !!");
    }
    else chambres.put(chmbr.getNumber_chambre(), chmbr);
  }
  
  public void removeRoom(Chambre chmbr) {
    if (reservedRoom(chmbr.getType() , chmbr.getNumber_chambre()) == false)  {
  chambres.remove(chmbr.getNumber_chambre());
  } 
  }
 
  public void addClient(Client clint) {
    if (clients.containsKey(clint.ID)) {// verifier si le client existe deja 
      System.out.println("Ce client a deja une reservation !!");
    }
    else clients.put(clint.ID, clint);
  }
  
  public void removeClient (Client clint ) {
    clients.remove(clint.ID);
  }
  
  public Client findClient(String ID) {
    Client client = clients.get(ID);
    return client ;
  }
  
  public Chambre findRoom(int nbrRoom) {
    Chambre chmbr = chambres.get(nbrRoom);
    return chmbr ;
  }
  
  public boolean reservedRoom (String type ,int numRoom) { //methode pour verifier si une chambre est deja reserve
    String  numberRoom = String.valueOf(numRoom);
    String cle = type.concat(numberRoom);
    HashMap <String , Date[]> map = new HashMap ();
  map = reservations.get(cle);
  if(map.isEmpty()) return false ;
  else return true ;
  }
  
@Override
public void signUpAdmin(int ID, String name, String lastName, String email, String password, String phonenumber,boolean active, double salary) {
	// TODO Auto-generated method stub
	if (password.equals("3365990-85462344")){
	     if (Administrateurs.containsKey(ID)){
	     throw new AlreadyExistException();
	      }else {
	       Administrateur admin = new Administrateur(ID,name,lastName,email,password,phonenumber,true, 3000000,00);
	      Administrateurs.put(ID,admin);
	      }
	    }else{
	    throw new NotAdminException();  
	    }
}
@Override
public void signInAdmin(String email, String password) throws ForgetPasswordException, DoesntExistException {
	// TODO Auto-generated method stub
	Administrateur admin;
    boolean found = false;

    for (Entry<String, Administrateur> entry : Administrateurs.entrySet()) {
        admin = entry.getValue();

        found = true;
            if (admin.getPassword().equals(password)) { 
                System.out.println("Welcome back, " + admin.getName()); 
                break;
            } else {
                throw new ForgetPasswordException(); 
            }
        }
    

    if (!found) {
        throw new DoesntExistException();
    }

}
  
  
 
  


}
