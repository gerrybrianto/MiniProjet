import java.util.Scanner;


public class TriCherche {
	
	private int[] tab;
	private int valeurCherchee;
	
	public TriCherche(){
		
		this.tab = new int[10];
		this.valeurCherchee = this.tab[0];
	}
	
	public TriCherche(int[] t , int x){
		
		this.tab = t;
		this.valeurCherchee = x;
	}

	public void triTab(){
		
		for(int i=0; i<=(this.tab.length-2); i++){
			
			for(int j=(this.tab.length-1); i<j; j--){
				
				if(this.tab[j]< this.tab[j-1]){
					int tmp = this.tab[j-1];
					this.tab[j-1]=this.tab[j];
					this.tab[j] = tmp;
				}
			}	
		}
	}

	public int chercheElement(int v){

		for(int i =0; i < this.tab.length;i++){
			if(this.tab[i] == v){
				return this.tab[i];
			}
		}
		return -1;
	}
	
	public void remplirTab(){
		Scanner sc = new Scanner(System.in);
		for (int i =0; i < this.tab.length;i++){
			System.out.println("Veuillez saisir une valeur :");
			int v = sc.nextInt();
			this.tab[i] = v;
		}
	}
	
	public String toString(){
		String s = "[";
		for (int i =0; i < this.tab.length;i++){
			s= s+this.tab[i]+",";
		}
		s=s+"]";
		return s;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
