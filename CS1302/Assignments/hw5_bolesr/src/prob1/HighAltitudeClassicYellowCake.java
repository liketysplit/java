package prob1;

public class HighAltitudeClassicYellowCake extends ClassicYellowCake {

	public HighAltitudeClassicYellowCake(String cakeMix ){
		super(cakeMix);
	}
	
	public String getLiquid(){
		return "1 cup of tap water";
	}
	
	public String getOil(){
		return "1/3 cup vegetable oil";
	}
	
	public String getEggs(){
		return "3 large eggs";
	}
	
	@Override
	public String getCakeMix(){
		return cakeMix + " + 2 tbs flour";
	}
	
	@Override
	public String bake(){
		return "Bake at 375 degrees F 26 minutes";
	}
	
	
}
