package hotel;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.DefaultListModel;

public class Administrateur extends User {
   
private double salary;

public  Administrateur(String name, String lastName, String email, String password, String phonenumber ) {
   super ( name,  lastName,  email,  password, phonenumber);
}

public  Administrateur() {
	   
	}
 
public double getSalary() {
    return salary;
}

public void setSalary(double salary) {
    this.salary = salary;
}
  

/*public void verifierReservation(String ID ) {
    for (Map.Entry<String, HashMap<String, Date[]>> e: main.reservations.entrySet()) {
        Map <String , Date []> map = new HashMap () ;
        map = e.getValue();
        if (map.containsKey(ID)) { //si hashmap contient ID du client
            Date [] tab = map.get(ID); //alors recuperer sa date de reservation 
            System.out.println("Vous avez une reservation du "+ tab[0]+ "au"+ tab[1]);
        }else {
            System.out.println("Vous n'avez pas de reservations");
        }
    } 
}
*/

public void verifierReservation(Integer ID ) { //methode qui verifie si un client a une reserv
    for (Map.Entry<String, HashMap<Integer, Date[]>> e: main.reservations.entrySet()) {
  Map <Integer , Date []> map = new HashMap () ;
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
    int nbrJours = deb.toNumberOfNights(deb, fin);
    if (typeRoom.equals ("single")) price = main.price1;
    else if (typeRoom.equals ("double")) price = main.price2;
    else if (typeRoom.equals ("triple")) price = main.price3;
    else if (typeRoom.equals ("suite")) price = main.price4;
    return price*nbrJours ;
}
  

public static int checkAvailableRoomDate(String typeRoom , Date dateDebut , Date dateFin ) {//methode pour verifier si la date choisit par le client est disponible
    for (Entry<String, HashMap<Integer, Date[]>> e1: main.reservations.entrySet()) {//parcourir la hashmap externe 
    if (e1.getKey().startsWith(typeRoom)){ //si la cle commence par le type de la chambre demande
    String numRoom1 = (e1.getKey()).replaceAll("\\D", "");//pour recuperer le numero de la chambre a partir du string
    int numRoom2 = Integer.parseInt(numRoom1);
      if (reservedRoom(typeRoom,numRoom2)== false) return numRoom2 ; //si la chambre nest reserver par personne retourner son numero directement
      else{//sinon verifier si la date est disponible
        Map <Integer , Date []> map = new HashMap () ; 
      map = e1.getValue();//mettre la hashmap interne dans une hashmap intermediere 
      boolean bool = false;
      for (Entry<Integer,Date[]> e2: map.entrySet()){
        //recuperer les dates en utilisant getValue
        Date [] tab = e2.getValue() ;
         bool = false ;
        if ((tab[0].getYear())==(dateDebut.getYear())) {
          if ((tab[0].getMonth())==(dateDebut.getMonth())) {
          if ((dateDebut.getDay()) > (tab[0].getDay())) {//si la date du deb est > a la date du debut reserve
            if((dateDebut.getDay()) > (tab[1].getDay())) {//si la date du deb est > a la date du fin reserve
              bool = true ;
            }
          } else if ((dateDebut.getDay()) < (tab[0].getDay())) {//si la date du deb est < a la date de debut reserve
            if ((dateFin.getDay()) < (tab[0].getDay())){//si la date du fin est < a la date du debut reserve
              bool = true ;
            }
          }
        }}
          } if (bool == true) return numRoom2; 
         
      }
    }
    }
    return 0;
   
  }
public static int trouverRoom(String typeRoom) {
    // parcourir emap des chambres et trouver une chambre de typeRom et retourner son numero
     for (Entry<Integer, Chambre> e1: main.chambres.entrySet()) {
       if ( e1.getValue().getType() == typeRoom ) {
        return e1.getKey() ;
       }  
     }return 0;
   }


public static void ajouterReservation(int IDclient ,String type, Date debut , Date fin) {
    int numRoom = checkAvailableRoomDate(type , debut , fin); //appel a la methode checkAvailableRoomDate
    if (!(numRoom == 0) ) { 
    String  numberRoom = String.valueOf(numRoom); //transformer le type de numero de la chambre en string
    String cle = type.concat(numberRoom); //former la cle en concatinant le type et le num de la chambre 
    Date[] tab = { debut , fin }; //creer un tableau avec la date de resrvation
  if (main.reservations.containsKey(cle)) {
    //ajouter la reservation
   (main.reservations.get(cle)).put(IDclient, tab);
    } else {//si la chambre nexiste pas dans la map des reservations
      HashMap<Integer, Date[]> map = new HashMap<>();
      map.put(IDclient, tab);
      main.reservations.put(cle, map);
    }
    }
    else if (numRoom == 0) {//si num de la chambre =0 
     System.out.println("Nous excusons, pas de chambres libres pour cette date"); 
    }
 }

public void anullerReservation(String ID , int numRoom, String typeRoom){
    String  numberRoom = String.valueOf(numRoom);
    String cle = typeRoom.concat(numberRoom);
    if (main.reservations.containsKey(cle)) {
        main.reservations.get(cle).remove(ID);
    } 
}
  
public void modifierReservation(Integer ID , int numRoom, String typeRoom, Date nouvDateDeb , Date nouvDateFin) {
    String  numberRoom = String.valueOf(numRoom);
    String cle = typeRoom.concat(numberRoom);
    if (main.reservations.containsKey(cle)) {
        //il faut verifier si la nouvelle date existe deja 
        HashMap<Integer,Date[]> map2 = new HashMap();
        map2=  main.reservations.get(cle);
        Date [] tab2 ;
        for (Entry<Integer, Date[]> e3: map2.entrySet()) {
            tab2= e3.getValue();
        }
        Date [] tab = { nouvDateDeb , nouvDateFin} ;
        main.reservations.get(cle).put(ID, tab);
    }
}
  


public void afficherReserv () {
    for (Entry<String, HashMap<Integer, Date[]>> e1: main.reservations.entrySet()) {
      Map <Integer , Date []> map = new HashMap () ; 
       map = e1.getValue();
      for (Entry <Integer, Date[]> e2 : map.entrySet()) {
         System.out.println( "la chambre: "+ e1.getKey()+" est reserve par:" + e2.getKey()+ " du :"+ e2.getValue()[0] +" au:"+ e2.getValue()[1] );
      }
       
    }
  }

public static void addRoom(Chambre chmbr) {
    
    if (main.chambres.containsKey(chmbr.getNumber_chambre()))  {//verifier si cette chambre existe deja avant de la creer
      System.out.println("Cette chambre existe deja !!");
    }
    else main.chambres.put(chmbr.getNumber_chambre(), chmbr);//ajouter la chambre
    //
      String type = chmbr.getType();
      int num = chmbr.getNumber_chambre();
      String numS =Integer.toString(num);
      String cle = type.concat(numS);
      System.out.println(cle);
      //ajouter la chambre a la liste des reservations
     
      main.reservations.put(cle,  new HashMap<>());
      
      
  }
/*
public void removeRoom(Chambre chmbr) {
    if (reservedRoom(chmbr.getType() , chmbr.getNumber_chambre()) == false)  {
        main.chambres.remove(chmbr.getNumber_chambre());
    } 
}
*/
public static void removeRoom(int roomNumber) {
    // Vérifier si la chambre existe dans la liste des chambres
    if (main.chambres.containsKey(roomNumber)) {
        // Supprimer la chambre de la liste des chambres
        main.chambres.remove(roomNumber);
        System.out.println("Room removed successfully!");
    } else {
        System.out.println("Room with number " + roomNumber + " does not exist!");
    }
}
public static void addClient(Client clint) {
    if (main.clients.containsKey(clint.getID())) {// verifier si le client existe deja 
        System.out.println("Ce client a deja une reservation !!");
    }else main.clients.put(clint.getID(), clint);
}


public void removeClient (Client clint ) {
    main.clients.remove(clint.getID());
}
  

public Client findClient(int ID){
    if (main.clients.containsKey(ID)) {
        return main.clients.get(ID);}
    else return (null);
    }

public Chambre findRoom(int IdRoom) {
    if (main.chambres.containsKey(IdRoom)) {
      return main.chambres.get(IdRoom);}
    else return null ;
    
    }

public static boolean reservedRoom (String type ,int numRoom) { //methode pour verifier si une chambre est deja reserve
    String  numberRoom = String.valueOf(numRoom);
    String cle = type.concat(numberRoom);
    HashMap<Integer, Date[]> map = new HashMap ();
  map = main.reservations.get(cle);
  if(map == null || map.isEmpty()) return false ;
  else return true ;
  }
public static void afficherRooms () {
    for (Map.Entry<Integer, Chambre> entry :main.chambres.entrySet()) {
            int numeroChambre = entry.getKey();
            Chambre chambre = entry.getValue();
            System.out.println("Numéro de chambre : " + numeroChambre + ", Type de chambre : " + chambre.getType());
 }} 

//Méthode pour afficher les chambres dans un JList
public static DefaultListModel<String> getListModel() {
    DefaultListModel<String> listModel = new DefaultListModel<>();
    for (Map.Entry<Integer, Chambre> entry : main.chambres.entrySet()) {
        int numeroChambre = entry.getKey();
        Chambre chambre = entry.getValue();
        listModel.addElement("Numéro de chambre : " + numeroChambre + ", Type de chambre : " + chambre.getType());
    }
    return listModel;
}


public  void afficherClients() {
    for (Map.Entry<Integer, Client> entry : main.clients.entrySet()) {
        int idClient = entry.getKey();
        Client client = entry.getValue();
        System.out.println("ID Client: " + idClient);
        System.out.println("Nom: " + client.getName());
        System.out.println("Prénom: " + client.getLastName());
        System.out.println("Email: " + client.getEmail());
        System.out.println("Numéro de téléphone: " + client.getPhonenumber());
        System.out.println("Adresse: " + client.getAdress());
        System.out.println();
    }
}
/*public void signInAdmin(String email, String password) throws ForgetPasswordException, DoesntExistException {
    Administrateur admin;
    boolean found = false;

    for (Entry<Integer, Administrateur> entry : main.administrateurs.entrySet()) {
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
        throw new DoesntExistException ();
    }
}
*/
//Method to get all clients

public void signInAdmin(String email, String password) throws ForgetPasswordException, DoesntExistException {
	Administrateur admin = null;
boolean found = false;
    
    if ("Admin@gmail.com".equals(email)) {
        found = true;
        if ("3365990-85462344".equals(password)) {
            System.out.println("Welcome back, Admin!");
        } else {
            throw new ForgetPasswordException();
        }
    }

    if (!found) {
        throw new DoesntExistException();
    }
}

public void signUpAdmin(int id ,String name, String lastName, String email, String password, String phonenumber)throws AlreadyExistException,NotAdminException{
 if (password.equals("3365990-85462344")) {
	 if (main.administrateurs.containsKey(id)) {
		 throw new AlreadyExistException();
	 }else {
		 ID= id; 
		 this.name = name ;
		 this.lastName= lastName; 
		 this.email= email ;
		 this.password= password;
		 this.phonenumber= phonenumber;
		 main.administrateurs.put(id, this);
	 }
 }else throw new NotAdminException();
}
public class MainAdmin{

public static void main(String[] args) {   
    // Création d'un nouvel administrateur
    Administrateur admin1 = new Administrateur("Admin", "Admin", "admin@example.com", "adminpassword","067436347");
    // Ajout de l'administrateur au HashMap administrateurs avec l'ID 1
    main.administrateurs.put(1, admin1);
}
}
}
