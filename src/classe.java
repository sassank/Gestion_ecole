import java.util.Scanner;

public class classe {

	private int choix;
	private int num;
	private String nom;
	private enfant[] tab_enfant = new enfant[30];
	private int nb_enfant;
	protected professeur le_professeur;
	private Scanner sc = new Scanner(System.in);
	
	
	public classe()
	{
		super();
		this.nom = "";
		this.num = 0;
		this.nb_enfant = 0;
		this.le_professeur = new professeur();
	}
		
	
	public void saisir()
	{
		System.out.println("Saisir le nom de la classe : ");
		this.nom = this.sc.nextLine();
		System.out.println("Saisir le numéro de la classe : ");
		this.num = this.sc.nextInt();
		this.sc.nextLine();
		this.le_professeur.saisir();
	}
	
	
	public void afficher()
	{
		System.out.println("Le nom de la classe : "+this.nom);
		System.out.println("le numéro de la classe : "+this.num);
		System.out.println("Le nombre d'enfant : "+this.nb_enfant);
		this.le_professeur.afficher();
	}
	
	public void ajouter()
	{
		if(this.nb_enfant < 30)
		{
			enfant eleve = new enfant();
			eleve.saisir();
			this.tab_enfant[this.nb_enfant] = eleve;
			this.nb_enfant++;
		}
		else
			System.out.println("Classe pleine");
	}
	
	
	public void consulter()
	{
		String nom;
		int i = 0;
		boolean trouve = false;
		
		System.out.println("Saisir le nom de l'enfant à rechercher");
		nom = sc.nextLine();
		
		while(i <= this.nb_enfant && trouve == false)
		{
			if(this.tab_enfant[i].retourner_nom() == nom)
				trouve = true;
			else
				i++;
		}
		if(trouve == true)
			this.tab_enfant[i].afficher();
		else
			System.out.println("Aucune correspondance");
	}
	
	
	
	public void afficher_tout()
	{
		for(int i = 0; i < this.nb_enfant; i++)
		{
			this.tab_enfant[i].afficher();
		}
	}
	
	
	
	public void supprimer()
	{
		String nom;
		int i = 0;
		boolean trouve = false;
		
		System.out.println("Saisir le nom de l'enfant à supprimer");
		nom = sc.nextLine();
		
		while(i <= this.nb_enfant && trouve == false)
		{
			if(this.tab_enfant[i].retourner_nom() == nom)
				trouve = true;
			else
				i++;
		}
		
		if(trouve == true)
		{
			this.tab_enfant[i] = this.tab_enfant[this.nb_enfant];
			this.nb_enfant --;
		}
		
		else
			System.out.println("Aucune correspondance");
	}
	
	
	
	public void trier()
	{
		enfant temp;
		
		for(int i = 0; i < this.nb_enfant - 1; i++)
		{
			for(int j = i+1; j < this.nb_enfant ; j++)
			{
				if(this.tab_enfant[i].retourner_age() > this.tab_enfant[j].retourner_age())
				{
					temp = this.tab_enfant[i];
					this.tab_enfant[i] = this.tab_enfant[j];
					this.tab_enfant[j] = temp;
				}
			}
		}
	}
	
	
	public int retourner_numClasse()
	{
		return this.num;
	}
	
	
	public String retourner_classe()
	{
		return this.nom;
	}
	
	public int retourner_nb_enfant()
	{
		return this.nb_enfant;
	}
	
	
	public void menu_classe()
	{
		do {
			System.out.println("**** Menu Classe ****");
			System.out.println("1 - Saisir la classe");
			System.out.println("2 - Afficher la classe");
			System.out.println("3 - Ajouter un enfant");
			System.out.println("4 - Consulter un nom d'enfant");
			System.out.println("5 - afficher tous les enfants");
			System.out.println("6 - Supprimer un nom d'enfant");
			System.out.println("7 - Trier");
			System.out.println("0 - Quitter");
			choix = this.sc.nextInt();
			this.sc.nextLine();
			
			switch(this.choix)
			{
				case 1: this.saisir(); break;
				case 2: this.afficher(); break;
				case 3: this.ajouter(); break;
				case 4: this.consulter(); break;
				case 5: this.afficher_tout(); break;
				case 6: this.supprimer(); break;
				case 7: this.trier(); break;
				default : System.out.println("Erreur de saisie");
			}
			
			}while(choix!=0);
	}
	
	
	
}
