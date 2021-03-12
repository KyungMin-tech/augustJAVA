package myobj.maple;

abstract public class Job {

	private String name;
	protected int level;

	abstract public void generationVillage();
	
	protected Job(String name) {
		this.name = name;
		this.level = 1;
	}

	public void levelUp() {
		++level;
	}
	
	
}
