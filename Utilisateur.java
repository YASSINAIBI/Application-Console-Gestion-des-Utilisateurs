package breifOne;

public class Utilisateur extends personne {
	private String profil;
	private String motDePass;
	private String service;
	private String login;

	public String getProfil() {
		return profil;
	}
	public void setProfil(String profil) {
		this.profil = profil;
	}
	public String getMotDePass() {
		return motDePass;
	}
	public void setMotDePass(String motDePass) {
		this.motDePass = motDePass;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	
	public String getLogin() {
		return login;
	}

	public void setlogin(String login) {
		this.login = login;
	}

	public double calculerSalaire() {
		if(getProfil().contains("MN")) {
			return getSalaire() + getSalaire() * 0.08;
		}
		else if(getProfil().contains("DG")) {
			return getSalaire() + getSalaire() * 0.15;
		}
		return getSalaire();
	}

	public String affiche() {
		return "Utilisateur [\n Profil: " + getProfil() + "\n Login: " + "\n MotDePass: " + getMotDePass() + "\n Service: " + getService()
				+ "\n Matricule: " + getMatricule() + "\n Nom: " + getNom() + "\n Prenom: " + getPrenom()
				+ "\n Email: " + getEmail() + "\n Telephone: " + getTelephone() + "\n Salaire: " + calculerSalaire() + " DH";
	}
}

