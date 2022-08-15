public class Student{
	private Integer id;
	private String name,department;
	private Integer courseId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public Student(Integer id, String name, String department, Integer courseId) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student :\n"+ "Id:"+this.id+"\nName: "+this.name+"\nDepartment : "+
				this.department+"\nCourse Id:  "+this.courseId;
	}

	
}
