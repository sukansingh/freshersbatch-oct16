package com.spring.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xoriant")
public class AdvertisementController 
{
	boolean loginStatus=false;
	List <PostAdd> postList = new CopyOnWriteArrayList<PostAdd>();
	PostAdd pp1=null;
	PostAdd pp2=null;
	@RequestMapping(value="/login/{uname}/{pass}", method=RequestMethod.GET)
	public String login(@PathVariable(value="uname") String username,@PathVariable(value="pass") String password)
	{
		User u = new User(username, password);
		if(username.equals(password))
		{
			loginStatus=true;
			return "login Successfull "+username;
		}
		else
		{
			
			return "failed";
		}
	}
	
	@RequestMapping(headers={"auth_token"}, value="/logout", method=RequestMethod.DELETE)
	public String logout(@RequestHeader String auth_token)
	{
		if(auth_token.isEmpty()) //equals("true")
			return "failed to logout";
		else
		{
			
			return "Logout Succcessfully....";
		}
	}
	
	//get All Categories
	@RequestMapping(value="/categories", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<String> getAllCategory()
	{
		//PostAdd pa = new PostAdd(1,"open","Laptop Sale", "Sukan", "Hardware", "intel core 3", 2, "a.jpg", "b.jpg");
		//PostAdd pa2 = new PostAdd(2,"open","Laptop Sale", "Sukan", "Soft", "intel core 3", 2, "a.jpg", "b.jpg");
		 pp1 = new PostAdd(1,"open","Laptop Sale", "Sukan", "Hardware", "intel core 3", 2, "a.jpg", "b.jpg");
		 pp2 = new PostAdd(2,"open","Laptop Sale", "Sukan", "Soft", "intel core 3", 2, "a.jpg", "b.jpg");
		 postList.add(pp1);
		 postList.add(pp2);
		List <String> l = new ArrayList<String>();
		l.add(pp1.getCategory());
		l.add(pp2.getCategory());
		
		return l;
	}
	
	//postAdd
	@RequestMapping(value="/postAdd", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public PostAdd postAdd(@RequestBody PostAdd pa)
	{
			postList.add(pa);
			System.out.println("Add Posted..."+pa);
			return pa;
	}
	
	//Update existing advertise
	@RequestMapping(value="/postAdd", method=RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public PostAdd updatePostAdd(@RequestBody PostAdd pa)
	{
	
			System.out.println("Add Posted..."+pa);
			return pa;
	}
	
	//All Ad by Logged In User
	@RequestMapping(value="/posts/{uname}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<PostAdd> posts(@PathVariable(value="uname") String username)
	{
		System.out.println("param username : "+username+" | "+loginStatus);
		List<PostAdd> l = new ArrayList<PostAdd>();
		if(loginStatus==true)
		{
			System.out.println("pp1 username : "+pp1.getName());
			if(pp1.getName().equals(username))
			{
				l.add(pp1);
			}
			if(pp2.getName().equals(username))
			{
				l.add(pp2);
			}
		}
		return l;
		
	}
	
	//Delete Specific Ad
	@RequestMapping(value="/post/{uname}/{title}", method=RequestMethod.DELETE, produces=MediaType.APPLICATION_JSON_VALUE)
	public String post(@PathVariable(value="uname") String username, @PathVariable(value="title") String title)
	{
		if(loginStatus==true)
		{
			for(PostAdd p : postList)
			{
				if(p.getTitle().equals(title))
				{
					postList.remove(p);
				}
			}
			
		}
		
		return null;
		
	}
}
