import java.util.Scanner;

public class date {

	private int jour;
	private int mois;
	private int annee;
	private Scanner sc = new Scanner(System.in);
	
	public date()
	{
		this.jour = 0 ;
		this.mois = 0 ;
		this.annee = 0 ;
	}
	
	
	public date(int j,int m, int a)
	{
		this.jour = j ;
		this.mois = m ;
		this.annee = a ;
	}
	
	
	public void saisir_date()
	{
		System.out.println("Saisir le jour");
		this.jour = this.sc.nextInt();
		sc.nextLine();
		System.out.println("Saisir le mois");
		this.jour = this.sc.nextInt();
		sc.nextLine();
		System.out.println("Saisir l'année");
		this.jour = this.sc.nextInt();
		sc.nextLine();
	}
	
	
	public void afficher()
	{
		System.out.println("La jour est : "+this.jour);
		System.out.println("La mois est : "+this.mois);
		System.out.println("L'année est : "+this.annee);
	}
	
	
	public int retourner_jour()
	{
		return this.jour;
	}
	
	public int retourner_mois()
	{
		return this.mois;
	}
	
	public int retourner_annee()
	{
		return this.annee;
	}
	
}
