package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ApplicationContext context=SpringApplication.run(BootjpaexampleApplication.class, args);
	UserRepository userRepository=context.getBean(UserRepository.class);
	System.out.println("Started......");
// User user= new User();
// user.setName("RAshmi");
// user.setCity("Patna");
// user.setStatus("first jpa");
// User user1= userRepository.save(user);
// System.out.println(user1);

//create object of user
// User user1=new User();
// user1.setName("Patel");
// user1.setCity("Pune");
// user1.setStatus("Java Programmer");
// User user2=new User();
// user2.setName("Panday");
// user2.setCity("Agra");
// user2.setStatus("web Developer");
// List<User> users=List.of(user1,user2);
// Iterable<User> result=userRepository.saveAll(users);
// result.forEach(user->{
// 	System.out.println(user);
// });
// System.out.println("done");

//UPDATE THE DATA
// Optional<User> optional=userRepository.findById(52);
// User user=optional.get();
// user.setName("Rashmi Patel");
// User result=userRepository.save(user);
// System.out.println(result);

// GET THE DATA
// Iterable<User>itr=userRepository.findAll();
// itr.forEach(user->{System.out.println(user);});

//DELETE the user
// userRepository.deleteById(53);
// System.out.println("Deleted...");

//DELETE ALL USERS
// Iterable<User>alluser= userRepository.findAll();
// alluser.forEach(user->System.out.println(user));
// userRepository.deleteAll(alluser);


// List<User>users1=userRepository.findByName("Patel");
// users1.forEach(e->{System.out.println(e);});

// List<User>users=userRepository.findByNameAndCity("Patel","Pune");
// users.forEach(e->{System.out.println(e);});


// List<User>allUsers=userRepository.getAllUser();
// allUsers.forEach(e->{System.out.println(e);});


List <User>allUsers=userRepository.getUserByName("Patel","Pune");
allUsers.forEach(e->{System.out.println(e);});

System.out.println("________________________________________________");
userRepository.getAllUser().forEach(e->System.out.println(e));
	}
}
