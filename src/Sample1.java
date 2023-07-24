

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sample1 {
	

	private int age;
	

	private String name;
	
	public Sample1(String name, int age) {
		super();
        this.name = name;
        this.age = age;
	}
	
	@Override
    public String toString() {
 
        return "name: "+ this.name +" | age: "+ this.age;
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

	public static void main(String[] args){
		 List<Sample1> emp = new ArrayList<Sample1>();
		 emp.add(new Sample1("Jhon",35));
		 emp.add(new Sample1("Albert",50));
		 emp.add(new Sample1("Henry",25));
		 emp.add(new Sample1("Nick",47));
		 emp.add(new Sample1("Kumar",32));
		 emp.add(new Sample1("Anand",56));
		 emp.add(new Sample1("Aravind",48));
		 emp.add(new Sample1("Smith",31));

		 List<Sample1> tempList = emp.stream().filter(e -> e.getAge() > 40)
		 .collect(Collectors.toList());
		 
		 tempList.forEach(e -> System.out.println("Name: " + e.getName() + "Age: " + e.getAge()));
		 
		}
}
