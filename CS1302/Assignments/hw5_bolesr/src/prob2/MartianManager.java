package prob2;

import java.util.ArrayList;
import java.util.Collections;

public class MartianManager {
	
	private ArrayList<Martian> martians = new ArrayList<>();
	private ArrayList<Teleporter> teleporters = new ArrayList<>();
	
	
	public boolean addMartian(Martian m){
		
		
		//Checks for the empty array case
		if (martians.isEmpty()){
			martians.add(m);
			
			if (m instanceof GreenMartian)
				teleporters.add((Teleporter)m);
			
			return true;
		}
		
		//All other cases
		else{
			for(int i = 0; i < martians.size();i++){
				if (martians.get(i).equals(m))
					return false;
			}
			
			martians.add(m);
			
			if (m instanceof GreenMartian)
				teleporters.add((Teleporter)m);
			
			return true;
		}
	}
		
	
	

	public Object clone() throws CloneNotSupportedException{
		MartianManager clonedMManager = new MartianManager();
		ArrayList<Martian> clonedMartians = new ArrayList<Martian>();
		
		for(Martian m: martians)
			clonedMartians.add((Martian)m.clone());
		clonedMManager.setMartians(clonedMartians);
		return clonedMManager;
	}
	
	private void setMartians(ArrayList<Martian> m){
		martians = m;
	}
	
	public Martian getMartianAt(int i){
		Martian temp = null;
		if(i<martians.size())
			return martians.get(i);
		else
			return temp;
	}	
	
	public Martian getMartianClosestTo(int id){
		Martian tempMartian = null;
		ArrayList<Integer> temp = new ArrayList<>();
		for (Martian m : martians){
			if ((m.getId() - id) < 0)
					temp.add((m.getId() - id) * (-1));
			else 
				temp.add(m.getId() - id);
		}
		int minIndex = temp.indexOf(Collections.min(temp));
		tempMartian = martians.get(minIndex);
		return tempMartian;
	}
	
	public Martian getMartianWithId(int id){
		Martian temp = null;
		
		for(Martian m: martians)
			if(m.getId() == id)
				temp = m;
		
		return temp;
	}	
	
	public int getNumMartians(){
		return martians.size();
	}
	
	public int getNumTeleporters(){
		return teleporters.size();
	}
	
	public Teleporter getTeleporterAt(int i){
		Martian temp = null;
		if(i<teleporters.size()){
			temp = (Martian)teleporters.get(i);
			return (Teleporter) temp;
		}
		else
			return (Teleporter)temp;
	}
	
	public String groupSpeak(){
		StringBuilder ms = new StringBuilder();
		
		for(Martian m: martians){
			ms.append(m.speak());
			ms.append("\n");
		}
			
		return ms.toString();
	}
	
	public String groupTeleport(String dest){
		StringBuilder tp = new StringBuilder();
		GreenMartian temp = null;
		
		for(Martian m: martians){
			if(m instanceof GreenMartian){
				temp = (GreenMartian)m; 
				tp.append(temp.teleport(dest));
				tp.append("\n");
			}
		}
			
		return tp.toString();
	}
	
	public void obliterateTeleporters(){
		for (Teleporter t : teleporters)
			for (int i = 0; i < martians.size();i++)
			if (t.equals(martians.get(i)))
				martians.remove(martians.get(i));
		
		teleporters.clear();
		
	}
	
	public boolean removeMartian(int id){
		for(int i = 0; i < martians.size(); i++){
			if(martians.get(i).getId() == id){
				for(int j = 0; j < teleporters.size(); j++)
					if(((Martian)teleporters.get(j)).getId() == id)
						teleporters.remove(j);
				martians.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	public ArrayList<Martian> sortedMartians(){
		ArrayList<Martian> temp = new ArrayList<>();
		for (Martian m : martians)
			temp.add(m);
		Collections.sort(temp);
		return temp;
	}
	


}
