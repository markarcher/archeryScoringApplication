package com.archeryScoringApp.mark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.archeryScoringApp.mark.dao.DataAccessException;
import com.archeryScoringApp.mark.domain.Archer;
import com.archeryScoringApp.mark.domain.DataTableObject;
import com.archeryScoringApp.mark.domain.User;
import com.archeryScoringApp.mark.service.ArcherService;
import com.archeryScoringApp.mark.service.UserService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class archeryAppController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private ArcherService archerService;

	@RequestMapping("/login")
	public String anythingReally(){
		System.out.println("login");
		return "login";
	}
	
	@RequestMapping("/validateLogin")
	public String validateTheUser(Model model, HttpServletRequest request, HttpSession session,
			@RequestParam("Username") String Username,
			@RequestParam("Password") String Password) throws DataAccessException{
		System.out.println(Username);
		String page = "";
		request.getSession(true);
		session.setMaxInactiveInterval(30*60);
		
		User user = null;
		try {
			user = userService.getUserByName(Username,Password);
			System.out.println("UserName is:"+ user.getUserName().toString());
		} catch (DataAccessException e) {
			System.out.println("User doesn't exist");
		}
		System.out.println(user.getRole());
			if(user.getUserName() == null){
				page = "login";
				model.addAttribute("alertLogin", "user is invalid or does not exist!");
				System.out.println("user is invalid or does not exist!");
			}else if(user.getRole().equals("ROLE_ADMIN")) {
				page = "adminPage";
			}else if(user.getRole().equals("scorer")){
				page = "home";
			}
		
		return page;
	}

	@RequestMapping("/Register")
	public String Register(Model model, HttpServletRequest request, HttpSession session,
			@RequestParam("registerUserName") String registerUserName,
			@RequestParam("registerPassword") String registerPassword,
			@RequestParam("registerRole") String registerRole){
		//*********
		System.out.println("registerRole  "+registerRole);
	if( registerUserName != "" && registerPassword != "" && !registerRole.equals("emptyRole")){
        User user = new User(registerUserName,registerPassword,registerRole);
        
		userService.setUser(user);
		
		model.addAttribute("alertRegistercompltd", "succesfully registered");
		}else{
			model.addAttribute("alertRegisterNotCompltd", "cannot complete registration");
		}
	
		return "login";
	}
	
	@RequestMapping("/Home")
	//@RequestMapping("/Archers")
	public String Archers(Model model, HttpServletRequest request, HttpSession session){
		System.out.println("your in home page");
		return "home";
	}
	
	@RequestMapping("/InputArcher")
	public String InputArcher(Model model, HttpServletRequest request, HttpSession session){
		
	return "inputArcherInfo";
	}
	
	@RequestMapping("/AddArcher")
	public String addArchers(Model model, HttpServletRequest request, HttpSession session,
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("club") String club,
			@RequestParam("email") String email){
	
	
		Boolean hasRows = archerService.checkIfTableHasRows();
		System.out.println(firstName+" "+lastName);
		System.out.println("IF archer table hasRows:"+ hasRows);
		//model.addAttribute("archerName","You've added : "+archer.getLname() );
		//model.addAttribute("archerFname", firstName);
		
		
		
	  
		Archer archer = new Archer(lastName,firstName,email,"",club);
		if(hasRows){
			List<Archer> archers = archerService.getAllArchers();
			for(Archer a: archers){
				System.out.println(a.getLname());
			}
			//Archer particularArcher = archerService.getArcher(firstName.trim().toString(),lastName.trim().toString());
			Boolean ifArcherAlreadyExist = archerService.ifArcherAlreadyExist(firstName, lastName, club, email);
			if(ifArcherAlreadyExist){
				model.addAttribute("recentlyAdded", "Archer Already Exists!");
				System.out.println("already exixst");
			}else{
				archerService.addArcher(archer);
				model.addAttribute("recentlyAdded", "You Have Recently Added Archer:");
				model.addAttribute("archerRecentlyAdded", archer);
				}
		}else{
			archerService.addArcher(archer);
			model.addAttribute("recentlyAdded", "You Have Recently Added Archer:");
			model.addAttribute("archerRecentlyAdded", archer);
		}
	return "inputArcherInfo";
	}
	
	@RequestMapping("/ListOfArchers")
	public String listOfArchers(Model model, HttpServletRequest request, HttpSession session){
			/*@,RequestParam (value = "seniorRecurve") String seniorRecurve){*/

		//System.out.println("value"+seniorRecurve);
		List<Archer> archers = archerService.getAllArchers();
		for(Archer a: archers){
			System.out.println(a.getLname());
		}
		model.addAttribute("archerList", archers);
		
		//DataTableObject dataTableObject = new DataTableObject();
		 // dataTableObject.setAaData(archers);
		
		  Gson gson = new GsonBuilder().setPrettyPrinting().create();
		  String json = gson.toJson(archers);
		  System.out.println(model.toString());
		  
		return "listOfArchers";
	}
	
	@RequestMapping("/InputScores")
	public String inputScores(Model model, HttpServletRequest request, HttpSession session){
		
		System.out.println("input scores");
		List<Archer> archers = archerService.getAllArchers();
		for(Archer a: archers){
			System.out.println(a.getLname());
		}
		
		model.addAttribute("archerList", archers);
		return "scores";
	}
}
