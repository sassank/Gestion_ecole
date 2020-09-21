
public class enfant extends personne{
	
	private int age;
	private date date_inscription;
	
	public enfant()
	{
		super(); 			//appel du constructeur parent
		this.age = 0;
		this.date_inscription = new date();
	}
		
	
	public void saisir()
	{
		super.saisir(); 		//appel du saisir parent
		System.out.println("Saisir l'âge : ");
		this.age = this.sc.nextInt();
		this.sc.nextLine();
		this.date_inscription.saisir_date();
		
	}
	
	
	public void Afficher()
	{
		super.afficher();
		System.out.println("Age : "+this.age);
		this.date_inscription.afficher();
	}
	
	
	public int retourner_age()
	{
		return this.age;
	}
	
	public date retourner_date()
	{
		return this.date_inscription;
	}
	
	
}
