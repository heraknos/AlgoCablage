import java.util.List;
import java.awt.Dimension;
import java.awt.Graphics;javax.swing.JFrame;
import javax.swing.JPanel;

public class Map extends JPanel{
	private List<Obstacle> obstacles;
	private List<PointDep> pointsDep;
	private List<PointArr> pointsArr;
	private List<Cable> cables;
	private Pathfinder pathfinder;
	
	public Map(){
		 setPreferredSize(new Dimension(600, 400));
	}
	
	public List<Obstacle> getObstacles() {
		return obstacles;
	}
	public void setObstacles(List<Obstacle> obstacles) {
		this.obstacles = obstacles;
	}
	public List<PointDep> getPointsDep() {
		return pointsDep;
	}
	public void setPointsDep(List<PointDep> pointsDep) {
		this.pointsDep = pointsDep;
	}
	public List<PointArr> getPointsArr() {
		return pointsArr;
	}
	public void setPointsArr(List<PointArr> pointsArr) {
		this.pointsArr = pointsArr;
	}
	public List<Cable> getCables() {
		return cables;
	}
	public void setCables(List<Cable> cables) {
		this.cables = cables;
	}
	public Pathfinder getPathfinder() {
		return pathfinder;
	}
	public void setPathfinder(Pathfinder pathfinder) {
		this.pathfinder = pathfinder;
	}
	
	public void paintComponent(Graphics g) {
          super.paintComponent(g);
          
          for(Cable c:cables){
          	g.drawLine(c.getPointDep().getCoord().getX() , c.getPointDep().getCoord().getY() , c.getPointArr().getCoord().getX() , c.getPointArr().getCoord().getY());
          }
     }
	
}