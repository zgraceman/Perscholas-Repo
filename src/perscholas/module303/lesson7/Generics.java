package perscholas.module303.lesson7;

class GenericsStuff <DataTypeOne, DataTypeTwo>{
	
	DataTypeOne valueOne;
	DataTypeTwo valueTwo;
	
	GenericsStuff() {}
	
	GenericsStuff(DataTypeOne v1, DataTypeTwo v2) {
		this.valueOne = v1;
		this.valueTwo = v2;
	}
	
	public <Obj> void genericsMethod (Obj data) {
		System.out.println("Data Passed: " + data);
	}
	public DataTypeOne getValueOne() {
		return valueOne;
	}

	 public void setValueOne(DataTypeOne valueOne) {
		 this.valueOne = valueOne;
	 }

	public DataTypeTwo getValueTwo() {
	     return valueTwo;
	}

	public void setValueTwo(DataTypeTwo valueTwo) {
	     this.valueTwo = valueTwo;
	}

}

public class Generics {
	
	public static void main(String[] args) {
		
		GenericsStuff obj = new GenericsStuff();
		obj.genericsMethod(true);
		obj.genericsMethod("String data");
		obj.genericsMethod(89);
		
		GenericsStuff<String, Integer> obj2 = new GenericsStuff("Per Scholas", 11025);
		System.out.println(obj2.getValueOne());
		System.out.println(obj2.getValueTwo());
	}
}
