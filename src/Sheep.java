
public class Sheep extends Animal implements Cloneable {
	private String name;

	public Sheep() {
		name = "";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sheep(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getCountString() {
		return name;
	}
	
	
}
