public abstract class A {
    private String name="Parrent";
	private String gender="unknown";
	
	public A(String nm, String gen){
		this.name=nm;
		this.gender=gen;
		System.out.println("A");
	}
	
	//abstract method
	public abstract void work();
	
	@Override
	public String toString(){
		return "Name="+this.name+"::Gender="+this.gender;
	}

	public void changeName(String newName) {
		this.name = newName;
	}	
}
