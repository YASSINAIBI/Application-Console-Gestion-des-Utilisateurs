package breifOne;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int input;
		int id = 1;
		boolean Quit = false;
		Scanner scanner = new Scanner(System.in);

		ArrayList<Utilisateur> listOfUser = new ArrayList<Utilisateur>();
		ArrayList<Utilisateur> listOfManager = new ArrayList<Utilisateur>();
		ArrayList<String> listOfProfils = new ArrayList<>();

		while(Quit != true) {
			System.out.println("1- utilisateurs");
			System.out.println("2- manager");
			System.out.println("3- profile");
			System.out.println("4- Quit");
			input = scanner.nextInt();

			switch(input) {
				case 1:
					System.out.println("1- ajouter une utilisateur");
					System.out.println("2- affichier tous les utilisateurs");
					System.out.println("3- annuler");
					int	SelectedUser = scanner.nextInt();

					switch(SelectedUser) {
						case 1:
							Utilisateur utilisateur = new Utilisateur();
							Profil profil = new Profil();

							int SelectedProfile;
							
							System.out.println("entrer votre profile: ");
							System.out.println("1- Chef de projet (CP): ");
							System.out.println("2- Manager (MN): ");
							System.out.println("3- Directeur de projet (DP): ");
							System.out.println("4- Directeur des ressources humaines (DRH): ");
							System.out.println("5- Directeur général (DG): ");

							SelectedProfile = scanner.nextInt();
							switch(SelectedProfile) {
								case 1:
									utilisateur.setProfil("CP");
									profil.setLibelle("CP");
								break;
								
								case 2:
									utilisateur.setProfil("MN");
									profil.setLibelle("MN");
								break;
								
								case 3:
									utilisateur.setProfil("DP");
									profil.setLibelle("DP");
								break;
								
								case 4:
									utilisateur.setProfil("DHR");
									profil.setLibelle("DHR");
								break;
								
								case 5:
									utilisateur.setProfil("DG");
									profil.setLibelle("DG");
								break;
							}
							//
							profil.setId(id);
							
							System.out.println("entrer votre login");
							String login = scanner.next();
							utilisateur.setlogin(login);
							
							System.out.println("entrer votre motDePass");
							String motDePass = scanner.next();
							utilisateur.setMotDePass(motDePass);
							//
							profil.setCode(motDePass);

							System.out.println("entrer votre service");
							String service = scanner.next();
							utilisateur.setService(service);
							
							System.out.println("entrer votre matrucile");
							String matrucile = scanner.next();
							utilisateur.setMatricule(matrucile);
							
							System.out.println("entrer votre nom");
							String nom = scanner.next();
							utilisateur.setNom(nom);
							
							System.out.println("entrer votre prenom");
							String prenom = scanner.next();
							utilisateur.setPrenom(prenom);
							
							System.out.println("entrer votre email");
							String email = scanner.next();
							utilisateur.setEmail(email);
							
							System.out.println("entrer votre numero de telephone");
							int telephone = scanner.nextInt();
							utilisateur.setTelephone(telephone);
							
							System.out.println("entrer votre salaire");
							double salaire = scanner.nextDouble();
							utilisateur.setSalaire(salaire);

							if(utilisateur.getProfil().contains("MN")) {
								listOfManager.add(utilisateur);
							}

							listOfUser.add(utilisateur);
							
							listOfProfils.add("the profile id is: " + id + "\nprofil: " + profil.getLibelle() + "\n"  + utilisateur.affiche());

							id++;
						break;
						
						case 2:
							for(String object:listOfProfils) {
								System.out.println(object);
							}
						break;

						case 3:

						break;
					}

				break;
				
				case 2:
					for(Utilisateur object:listOfManager) {
						System.out.println(object.affiche());
					}
				break;
				
				case 3:
					
				break;

				case 4:
					System.out.println("God bye");
					Quit = true;
				break;
			}
		}
	}
}
