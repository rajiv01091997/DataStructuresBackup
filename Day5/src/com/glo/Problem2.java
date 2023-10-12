package com.glo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class User
{
	private String username;
	private String email;
	private Optional<Integer> age;
	
	
	public User(String username, String email, Optional<Integer> age) {
		super();
		this.username = username;
		this.email = email;
		this.age = age;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Optional<Integer> getAge() {
		return age;
	}


	public void setAge(Optional<Integer> age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", age=" + age + "]";
	}
	
	
}

class UserRepository
{
	
	 
	public Optional<User> getUserByUserName(String name,List<User> userList)
	{
	
		
		Optional<User> user =Optional.empty();
		for(User u:userList)
		{
			if(u.getUsername().equalsIgnoreCase(name))
				user=Optional.ofNullable(u);
		}
		return user;
	
	}
	
	public Optional<User> updateUserAge(String name,int age,List<User> userList)
	{
		Optional<User> user =Optional.empty();
		if(age<=0)
			return user;
		for(User u:userList)
		{
			if(u.getUsername().equalsIgnoreCase(name))
			{
				u.setAge(Optional.ofNullable(age));
				user=Optional.ofNullable(u);
				break;
			}
		}
		return user;
		
	}
	
	
}

public class Problem2 {

	public static void main(String[] args) {
		
       ArrayList<User> list=new ArrayList<>();
       list.add(new User("Rajiv","rajiv01091997@gmail.com", Optional.of(24)));
       list.add(new User("Niraj","niraj110@gmail.com", Optional.of(20)));
       list.add(new User("Rakesh","rakesh123@gmail.com", Optional.of(23)));
       list.add(new User("Aman","aman234@gmail.com", Optional.of(27)));
       list.add(new User("Roshan","roshan234@gmail.com", Optional.of(22)));
       
       UserRepository repo=new UserRepository();
       System.out.println(repo.getUserByUserName("Niraj", list));
       System.out.println(repo.updateUserAge("niraj", -8, list));
       
       System.out.println(list);
       

	}

}
