import java.util.Scanner;

public abstract class personne {
	protected String nom;
	protected String prenom;
	protected Scanner sc = new Scanner(System.in);
	
	
	public personne()
	{
		this.nom = "";
		this.prenom = "";
	}
	
	public void saisir()
	{
		System.out.println("Saisir le nom du professeur / de l'enfant ");
		this.nom = this.sc.nextLine();
		System.out.println("Saisir le prénom du professeur / de l'enfant");
		this.prenom = this.sc.nextLine();
	}
	
	
	public void afficher()
	{
		System.out.println("Le nom du professeur / de l'enfant : "+this.nom);
		System.out.println("Le prénom du professeur / de l'enfant : "+this.prenom);
	}
	
	
	public String retourner_nom()
	{
		return this.nom;
	}
	
	
	public String retourner_prenom()
	{
		return this.prenom;
	}
	
	
}
