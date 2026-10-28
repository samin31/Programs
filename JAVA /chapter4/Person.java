package chapter4;
	class Person {
	    String name = "Alex";
	    int age = 25;
	    String city = "New York";

	    void showDetails() {
	        System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
	    }

	    public static void main(String[] args) {
	        Person p = new Person();
	        p.showDetails();
	}
}
