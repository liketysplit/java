package prob2;

public class Sales{

	protected int id;
	protected double sales;
	protected int week;

	public Sales(int id, double sales, int week){
		this.id = id;
		this.sales = sales;
		this.week = week;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	@Override
	public String toString(){
		return String.format("\nsales = %f, id = %d, week = %d", getSales(), getId(), getWeek());
	}
}