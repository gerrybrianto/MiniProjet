
public class TestTricherche {

	private int[] tab;
	private int x;
	
	public TestTricherche(){
		this.tab = new int[10];
		this.x = 1;
	}
	public TestTricherche(int[] tab, int x){
		this.tab = tab;
		this.x = x;
	}
	public boolean verifTri(int []tab){
		for(int i=0 ; i<this.tab.length; i++){
			if(tab[i]>tab[i+1])
				return false;
			else
				return true;
		}
		return false;
	}
	public boolean verifEntier(){
		for (int i=0 ; i<this.tab.length ; i++){
			if (this.tab[i])
				return true;
		}
		return false;
	}
	public boolean verifValNull(int []tab){
		for(int i=0 ; i<this.tab.length ;i++){
			if(tab[i]==0)
				return true;
		}
		return false;
	}
	
	public boolean elementExist(int []tab,int x)
	{
		for(int i=0 ; i<this.tab.length ; i++){
			if(tab[i]==x)
				return true;
		}
		return false;
	}
	
	public boolean verifTailleTab(int []tab)
	{
		int count =0;
		for(int i=0 ; i<this.tab.length ; i++){
				count++;
		}
		
		if(count!=this.tab.length)
			return false;
		else 
			return true;
	}
}
