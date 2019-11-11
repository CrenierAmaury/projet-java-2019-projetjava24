package unite;

import java.util.HashMap;
import java.util.Map;

public class Plateau{
	
	private int[] cases = {0,1,2,3,4,5,6,7,8,9};

	
	private Map<String, Integer> position;
   
   // arriver � limiter le nombre de cases et � faire les getters setters en cons�quences
   public Plateau() 
   {
	   this.position = new HashMap<>();
   }
   
   public void setPosition(String name,int cases) 
   {
	   position.put(name,cases);
   }
   
   public int getPosition(String name) 
   {
	   return position.get(name);
	   
   }
   
   public void monte(int choixDeplacer,String name, int cases) {/*GUI event*/
		System.out.println(Direction.HAUT.getMsg() +choixDeplacer+" cases");
		position.replace(name, cases + (10*choixDeplacer)) ;
		//monte d'une disaine par unit� de choixdeplacer
	}
	
	public void descend(int choixDeplacer,String name, int cases) {/*GUI event*/
		System.out.println(Direction.BAS.getMsg()+choixDeplacer+" cases");
		position.replace(name, cases - (10*choixDeplacer)) ;
		//descend d'une disaine par unit� de choixdeplacer
	}
	
	public void tourneDroite(int choixDeplacer,String name, int cases) {/*GUI event*/
		System.out.println(Direction.DROITE.getMsg()+choixDeplacer+" cases");
		position.replace(name, cases + choixDeplacer) ;
	}
	
	public void tourneGauche(int choixDeplacer,String name, int cases) {/*GUI event*/
		System.out.println(Direction.GAUCHE.getMsg()+choixDeplacer+" cases");
		position.replace(name, cases - choixDeplacer) ;
	}
    

//elements visuel du plateau
  
  

}
