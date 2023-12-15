public class GetSet {

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

	public String getRStatus() {
		return RStatus;
	}

	public void setRStatus(String rStatus) {
		RStatus = rStatus;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	int Id;
	String Name;
	int Marks;
	String RStatus;
	int Year;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetSet gs=new GetSet();
		gs.setName("Devharsh");
		gs.setId(24);
		gs.setMarks(90);
		gs.setRStatus("H");
		gs.setYear(3);
		System.out.println(gs.Name);
		System.out.println(gs.Id);
		System.out.println(gs.Marks);
		System.out.println(gs.RStatus);
		System.out.println(gs.Year);
	}
	
}