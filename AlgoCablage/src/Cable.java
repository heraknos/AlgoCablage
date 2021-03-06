import java.util.LinkedList;

public class Cable {
	private LinkedList<Coord> angles;
	private int num;
	private static int numero=1;
	
	public Cable() {
		this.angles = new LinkedList<Coord>();
		num=numero;
		numero++;
	}
	public LinkedList<Coord> getAngles() {
		return angles;
	}
	
	public int getNum(){
		return num;
	}
	public void setAngles(LinkedList<Coord> angles) {
		this.angles = angles;
	}
	public void addAngle(Coord coord){
		angles.add(coord);
	}
	public void resetAngles(){
		angles.removeAll(angles);
	}
	
	public int longueur(){ //Longueur totale du cable
		int longueur=0;
		for (int i=1; i<angles.size(); i++){
			longueur+=Math.abs((angles.get(i-1).getX()-angles.get(i).getX())+(angles.get(i-1).getY()-angles.get(i).getY()));
		}
		return longueur;
	}
	
	/**
	 *Retire les angles superflux lorsque 3 angles cons�cutifs ont les m�mes valeurs de x ou y
	*/    
    public void epurerAngles(){ //Permet de r�duire la taille sans perte d'information
		for(int i=2;i<angles.size();i++){
			if(angles.get(i-2).getX() == angles.get(i-1).getX() && angles.get(i-2).getX() == angles.get(i).getX()){
				angles.remove(i-1);
				i--;
			}	
			else if(angles.get(i-2).getY() == angles.get(i-1).getY() && angles.get(i-2).getY() == angles.get(i).getY()){
				angles.remove(i-1);
				i--;
			}	
		}
	}
	
	@Override
	public String toString() {
		String chaine="";
		for(Coord point:angles){	
			chaine=chaine+"\n"+point.toString();
		}
		return "Cable [angles=" + chaine + "]";
	}
}
