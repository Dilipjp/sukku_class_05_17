package debug;


class Cat{
	int age;
	String name;
	String preference;
	
	public Cat(String name) {
		this.name = name;
		
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}
}



public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat1 = new Cat("John");
		cat1.setPreference("SUperCat");
		cat1.setAge(3);
		
		
		Cat cat2 = new Cat("Wick");
		cat2.setPreference("ViolontCat");
		cat2.getPreference();
		System.out.println(cat2.getAge());
		
		Cat[] cats = new Cat[2];
		cats[0] = cat1;
		cats[1]  = cat2;
		

	}

}
