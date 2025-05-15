package day14;

public class student {

	private int id;
	private String name;
	private int rollno;

	public void setname(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getRollno() {
		return rollno;
	}
	student(int id, String name, int rollno){
	this.id=id;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", rollno=" + rollno + "]";
	}
	
		
	}

