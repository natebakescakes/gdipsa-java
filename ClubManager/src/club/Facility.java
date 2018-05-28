package club;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.description);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Facility other = (Facility) obj;
		if (this.name != other.name)
			return false;
		
		return true;
	}
}
