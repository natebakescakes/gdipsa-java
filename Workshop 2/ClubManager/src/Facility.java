
public class Facility {
	private String name;
	private String description;
	
	/**
	 * @param name
	 * @param description
	 */
	public Facility(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	/**
	 * @param name
	 */
	public Facility(String name) {
		this(name, null);
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		if (this.description != null)
			return String.format("%s (%s)", this.name, this.description);
		
		return String.format("%s", name);
	}
}
