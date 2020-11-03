package projectZero.pojos;

public class Users {

	private String name;
	private int age;
	private double height;
	private int weight;
	protected int weightGoal;
	protected int calorieGoal;
	
	public Users(String name, int age, double height, int weight, int weightGoal, int calorieGoal) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.weightGoal = weightGoal;
		this.calorieGoal = calorieGoal;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
