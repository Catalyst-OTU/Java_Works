package poly;

public class Constructor {
	
	private String name;
	private String address;
	private int age;
	private String email;

	public Constructor() {
		// TODO Auto-generated constructor stub
		
		this("Bismark", "Post", 20);
	}
	
	public Constructor(String name, String address, int age) {
		
		this("bismarko@aiti-kace.com.gh");
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public Constructor(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Constructor [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	

}
