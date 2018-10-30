package cn.weilianni.shop.model;

public class User {

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", age=" + age + "]";
	}

	private String userName;
	
	private String password;
	
	private int age;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
