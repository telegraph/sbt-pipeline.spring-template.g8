package $package$;

public class Health {

	private final String name;
	private final String status;

	public Health(String name, String status) {
		this.name = name;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public String getStatus() {
		return status;
	}
}
