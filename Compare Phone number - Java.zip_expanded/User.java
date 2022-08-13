public class User {
	private String name,username,password;
    private long phoneNumber;
    
    public long getPhoneNumber() {
		return phoneNumber;
	}
	public User(String name, String username, String password, long phoneNumber) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	boolean flag = false;
	public boolean comparePhoneNumber(User user)	{
		if(this.phoneNumber==user.phoneNumber)
			flag=true;
		
        return flag;

	}
	
}