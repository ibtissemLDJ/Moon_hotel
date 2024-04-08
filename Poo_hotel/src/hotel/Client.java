package hotel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class Client extends User{
	private String Adress;
    public static int idClient;
    private HashMap<Integer,Reservation> inforeservation = new HashMap<>();
    private HashMap<String, Client> clients = new HashMap<>();
    private HashMap<Integer,String> Commentaire = new HashMap<>();
public Client(String name, String lastName, String email, String password, String phonenumber, String Adress) {
	super(name, lastName, email, password, phonenumber);
	idClient++;
	this.Adress=Adress;
}

public String getAdress() {
	return Adress;
}

public void setAdress(String adress) {
	Adress = adress;
}
public void saisirReservation(int anneed,int moisd,int jourd,int anneef,int moisf,int jourf, String typeChambre, int nombrePersonnes, String typePersonne) {
    // Utilisation d'un scanner pour saisir les informations
    Scanner scanner = new Scanner(System.in);

    // Saisie des informations de la réservation
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
    scanner.nextLine(); // Ignorer la fin de la ligne
    System.out.println("Entrez le type de personne (adultes, enfants) : ");
    typePersonne = scanner.nextLine();
    
}

public void leaveComment(int idClient,String c) {
            Commentaire.put(idClient,c);
	System.out.println("le commentaire du client sur l'hotel est" + c);
}
public void getReservations(int idClient) {
            clients.get(idClient);
	inforeservation.get(idClient);
}
@Override
public void signUpClient(int id, String name, String lastName, String email, String password, String phonenumber, String adress) {
    // Votre code pour la méthode signUpClient
    if (clients.containsKey(id)) {
        throw new AlreadyExistException();
    } else {
    	Client client = new Client(ID, name, lastName, email, password, phonenumber, adress);
        clients.put(ID, client);
    }
}

@Override
public void signInClient(String email, String password) throws ForgetPasswordException, DoesntExistException {
	// TODO Auto-generated method stub
	Client client;
    boolean found = false;

    for (Map.Entry<Integer, Client> entry : clients.entrySet()) {
        client = entry.getValue();
        if (client.getEmail().equals(email)) { 
            found = true;
            if (client.getPassword().equals(password)) { 
                System.out.println("Welcome back, " + client.getName()); 
                break;
            } else {
                throw new ForgetPasswordException(); 
            }
        }
    }

    if (!found) {
        throw new DoesntExistException();
    }

}


}
