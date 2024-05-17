package hotel;

import java.util.Calendar;
import java.util.HashMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Client extends User{
	private String Adress;
    public static int idClient;
    private HashMap<Integer,String> Commentaire = new HashMap<>();
public Client(String name, String lastName, String email, String password, String phonenumber, String Adress) {
	super(name, lastName, email, password, phonenumber);
	idClient++;
	this.Adress=Adress;
}
/*public Client() {
	
}
*/
public String getAdress() {
	return Adress;
}

public void setAdress(String adress) {
	Adress = adress;
}
public void saisirReservation(int anneed,int moisd,int jourd,int anneef,int moisf,int jourf, String typeChambre, int nombrePersonnes, String typePersonne) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Entrez l'année de debut de la réservation  : ");
    anneed = scanner.nextInt();
    System.out.println("Entrez le mois de debut de la réservation  : ");
    moisd = scanner.nextInt();
    System.out.println("Entrez le jour de debut de la réservation  : ");
    jourd=scanner.nextInt();
    System.out.println("Entrez l'année de fin de la réservation  : ");
    anneef = scanner.nextInt();
    System.out.println("Entrez le mois de fin de la réservation  : ");
    moisf = scanner.nextInt();
    System.out.println("Entrez le jour de fin de la réservation  : ");
    jourf = scanner.nextInt();
    System.out.println("Entrez le type de chambre : ");
    typeChambre = scanner.nextLine();
    System.out.println("Entrez le nombre de personnes : ");
    nombrePersonnes = scanner.nextInt();
    scanner.nextLine(); 
    System.out.println("Entrez le type de personne (adultes, enfants) : ");
    typePersonne = scanner.nextLine();
    
}

public void leaveComment(int idClient,String c) {
            Commentaire.put(idClient,c);
	System.out.println("le commentaire du client sur l'hotel est" + c);
}
public void getReservations(int idClient) {
            main.clients.get(idClient);
	main.inforeservation.get(idClient);
}
@Override
public  void signUpClient(int id, String name, String lastName, String email, String password,String phonenumber,
		String Adress) throws AlreadyExistException {
	// TODO Auto-generated method stub
	if (main.clients.containsKey(id)){
		 
	    throw new AlreadyExistException();
	   
	  }else {
		  idClient=id;
          this.name= name ; 
          this.lastName = lastName ;
          this.email = email ;
          this.password = password; 
          this.phonenumber=phonenumber;
          this.Adress=Adress;
	    main.clients.put(ID,this);}
	
}
/*
public  static void signInClient(String email, String password) throws ForgetPasswordException, DoesntExistException {
	
    boolean found = false;
    
    if("amira@example.com".equals(email) ) {
    	found=true;
    	if("password123".equals(password)) {
    		 System.out.println("Welcome back"); 
             
         } else {
         	
             throw new ForgetPasswordException(); 
             
         }
     }
 
if (!found) {
    throw new DoesntExistException();
    
}
    }
*/
public static void signInClient(String email, String password) throws ForgetPasswordException, DoesntExistException {
    boolean found = false;

    for (Map.Entry<Integer, Client> entry : main.clients.entrySet()) {
        Client client = entry.getValue();
        if (client.getEmail().equals(email)) {
            found = true;
            if (client.getPassword().equals(password)) {
                System.out.println("Welcome back, " + client.getName());
                return;
            } else {
                throw new ForgetPasswordException();
            }
        }
    }

    if (!found) {
        throw new DoesntExistException();
    }
}
public void modifierReservation(int IDclient ,Date ancDateDeb , Date ancDateFin , String typeRoom, Date nouvDateDeb , Date nouvDateFin) {
    Calendar cal = Calendar.getInstance();//pour recuperer la date actuelle 
      int year = cal.get(Calendar.YEAR);
      int month = cal.get(Calendar.MONTH) + 1; 
      int day = cal.get(Calendar.DAY_OF_MONTH);
      Date dateActuelle = new Date (day , month , year );
    if (ancDateDeb.compareDate(ancDateDeb, dateActuelle) == -1) {//verifier si la date de reservation c passé
    for (Entry<String, HashMap<Integer, Date[]>> e1: main.reservations.entrySet()) {
      if (e1.getKey().startsWith(typeRoom)){ 
        //alors chercher l'encienne date 
        HashMap <Integer , Date []> map = new HashMap <>() ; 
         map = e1.getValue();
         for (Entry<Integer,Date[]> e2: map.entrySet()){
                //recuperer les dates 
                Date [] tab = e2.getValue() ;
         if ((tab[0] == ancDateDeb ) && (tab[1] == ancDateFin )) {//si je trouve la date ancienne
           map.remove(e2.getKey());//supprimer lancienne reservation
            //ajouter la nouvelle resrvation
           Administrateur.ajouterReservation( IDclient , typeRoom,nouvDateDeb , nouvDateFin);
          }
         }
      }
      
    }

  } else System.out.println("c trop tard");
    }
/*
public void anullerReservation(String ID , int numRoom, String typeRoom , Date actuelDate){
    String  numberRoom = String.valueOf(numRoom);
    String cle = typeRoom.concat(numberRoom);
    if (main.reservations.containsKey(cle)) { //Si la reservation existe  
      //verifier la date 
      for (Entry<String, HashMap<String, Date[]>> e1: main.reservations.entrySet()) {//parcourir la hashmap externe 
          if ( e1.getKey().startsWith(typeRoom)){ //si la cle commence par le type de la chambre demande
          Map <String , Date []> map = new HashMap () ; 
          map = e1.getValue();//mettre la hashmap interne dans une hashmap intermediere 
          Date [] tab = map.get(ID); //recuperer le tableau de date 
              //verifier si la date de reservation nest pas encore depasse
                if (compareDate (tab[0] , actuelDate) == -1) {// si oui
                  main.reservations.get(cle).remove(ID);//supprimer reservation
                }
              }
              }
    } 
    
    }
*/
public void anullerReservation(int IDclient , String typeRoom , Date dateDeb , Date dateFin ){
    Calendar cal = Calendar.getInstance();//pour recuperer la date actuelle 
      int year = cal.get(Calendar.YEAR);
      int month = cal.get(Calendar.MONTH) + 1; 
      int day = cal.get(Calendar.DAY_OF_MONTH);
      Date dateActuelle = new Date (day , month , year );
      if (dateDeb.compareDate(dateDeb, dateActuelle) == -1) {//verifier si la date de reservation c passé
      for (Entry<String, HashMap<Integer, Date[]>> e1: main.reservations.entrySet()) {
        if (e1.getKey().startsWith(typeRoom)){ 
          //alors chercher la date 
          HashMap <Integer , Date []> map = new HashMap <>() ; 
           map = e1.getValue();
           for (Entry<Integer,Date[]> e2: map.entrySet()){
                  //recuperer les dates 
                  Date [] tab = e2.getValue() ;
           if ((tab[0] == dateDeb ) && (tab[1] == dateFin )) {//si je trouve la date ancienne
             map.remove(e2.getKey());//supprimer la reservation
            System.out.println("supp avec succes");  
            }
           }
        }
        
      }
 
    } else System.out.println("c trop tard");
      }



}