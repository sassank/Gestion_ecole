import java.util.Scanner;

public class professeur extends personne{

	private String fonction;
	private Double salaire;
	private Scanner sc = new Scanner(System.in);
	
	
	public professeur()
	{
		super();
		this.fonction = "";
		this.salaire = 0.0;
	}
		
	
	public void saisir()
	{
		super.saisir();
		System.out.println("Saisir la fonction : ");
		this.fonction = this.sc.nextLine();
		System.out.println("Saisir le salaire : ");
		this.salaire = this.sc.nextDouble();
		this.sc.nextLine();
	}
	
	
	public void afficher()
	{
		super.afficher();
		System.out.println("Fonction : "+this.fonction);
		System.out.println("Salaire : "+this.salaire);
	}
	
	public String retourner_fonction()
	{
		return this.fonction;
	}
	
	
	public double retourner_salaire()
	{
		return this.salaire;
	}

	
	
	
}
