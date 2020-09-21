import java.util.Scanner;

public class etablissement {

	
	private int choix;
	protected String nom;
	protected String adresse;
	private classe[] tab_classe = new classe[30];
	private int nb_classe;
	private Scanner sc = new Scanner(System.in);
	
	
	public etablissement()
	{
		this.nom = "";
		this.adresse = "";
		this.nb_classe = 0;
	}
		
	
	public void saisir()
	{
		System.out.println("Saisir le nom de l'établissement : ");
		this.nom = this.sc.nextLine();
		System.out.println("Saisir l'adresse de l'établissement : ");
		this.adresse = this.sc.nextLine();
		System.out.println("Saisir le nombre de classe : ");
		this.nb_classe = this.sc.nextInt();
		this.sc.nextLine();
	}
	
	
	public void afficher()
	{
		System.out.println("Le nom de l'établissement est : "+this.nom);
		System.out.println("L'adresse de l'établissement est : "+this.adresse);
		System.out.println("Le nombre de classe est : "+this.nb_classe);
	}
	
	
	public void ajouter()
	{
		classe uneClasse = new classe();
		uneClasse.menu_classe();
		this.tab_classe[this.nb_classe] = uneClasse;
		this.nb_classe++;
	}
	
	
	public void afficher_tout()
	{
		for(int i = 0; i < this.nb_classe; i++)
		{
			this.tab_classe[i].afficher();
		}
	}
	
	
	public void consulter()
	{
		String classe;
		int i = 0;
		boolean trouve = false;
		
		System.out.println("Saisir le nom de la classe à rechercher");
		classe = sc.nextLine();
		
		while(i <= this.nb_classe && trouve == false)
		{
			if(this.tab_classe[i].retourner_classe() == classe)
				trouve = true;
			else
				i++;
		}
		if(trouve == true)
			this.tab_classe[i].afficher();
		else
			System.out.println("Aucune correspondance");
	}
	
	
	
	public void supprimer()
	{
		String classe;
		int i = 0;
		boolean trouve = false;
		
		System.out.println("Saisir le nom de la classe à supprimer");
		classe = sc.nextLine();
		
		while(i <= this.nb_classe && trouve == false)
		{
			if(this.tab_classe[i].retourner_classe() == classe)
				trouve = true;
			else
				i++;
		}
		
		if(trouve == true)
		{
			this.tab_classe[i] = this.tab_classe[this.nb_classe];
			this.nb_classe --;
		}
		
		else
			System.out.println("Aucune correspondance");
	}
	
	
	
	public void trier()
	{
		classe temp;
		
		for(int i = 0; i < this.nb_classe - 1; i++)
		{
			for(int j = i+1; j < this.nb_classe ; j++)
			{
				if(this.tab_classe[i].retourner_nb_enfant() > this.tab_classe[j].retourner_nb_enfant())
				{
					temp = this.tab_classe[i];
					this.tab_classe[i] = this.tab_classe[j];
					this.tab_classe[j] = temp;
				}
			}
		}
	}
	
	
	public void menu_etablissement()
	{
		do {
			System.out.println("**** Menu Etablissement ****");
			System.out.println("1 - Saisir l'établissement");
			System.out.println("2 - Afficher l'établissement");
			System.out.println("3 - Ajouter / Menu des classes  ");
			System.out.println("4 - Afficher toutes les classes");
			System.out.println("5 - Consulter une classe");
			System.out.println("6 - Supprimer une classe");
			System.out.println("7 - Trier");
			System.out.println("0 - Quitter");
			choix = this.sc.nextInt();
			this.sc.nextLine();
			
			switch(this.choix)
			{
				case 1: this.saisir(); break;
				case 2: this.afficher(); break;
				case 3: this.ajouter(); break;
				case 4: this.afficher_tout(); break;
				case 5: this.consulter(); break;
				case 6: this.supprimer(); break;
				case 7: this.trier(); break;
				default : System.out.println("Erreur de saisie");
			}
			
			}while(this.choix!=0);
	}

	
	
	
}
