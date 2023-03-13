package SetExamples;

public class Cars {
	
	
	
	private String model;
	private Integer year;
	private String brend;
	private String color;
	private CarType type;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getBrend() {
		return brend;
	}
	public void setBrend(String brend) {
		this.brend = brend;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public CarType getType() {
		return type;
	}
	public void setType(CarType type) {
		this.type = type;
	}
	
	public Cars(String model, Integer year, String brend, String color, CarType type) {
		super();
		this.model = model;
		this.year = year;
		this.brend = brend;
		this.color = color;
		this.type = type;
	}
	
	public Cars() {
		super();
	}
	@Override
	public String toString() {
		return "Cars [model=" + model + ", year=" + year + ", brend=" + brend + ", color=" + color + ", type=" + type
				+ "]";
	}
	

}
