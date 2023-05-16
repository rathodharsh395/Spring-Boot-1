package spring.boot1.SpringBoot1;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.boot1.SpringBoot1.Flight;
import spring.boot1.SpringBoot1.FlightDao;

//controller is one stereotype annotation to mark this plain java class as controller class
//The bean of this class is auto detected and scanned by spring container 
//The controller class provides web handler method to map the request from 
@Controller
public class AppController {
	@Autowired
	private FlightDao dao;
    //displaySignUP is a web handler method
	//this method annotated with RequestMapping annotation 
	//the given annotation is class level and method level annotation
	//the RequestMapping annotation is used to map the request 
	//from client
	//by using path attribute
	//it also use some more important attributes like
	//method=RequestMethod.GET, RequestMethod.POST
	//it uses one attribute called produces=MediaType.TEXT_HTML_VALUE
	//to produce response body in that same MIME type 
	
	@RequestMapping(path="/")
	public String displayLoginPage()
	{
		
	// return "<h1>"+"welcome to wipro"+"</h1>";
		return "signup";
	}
	
	@RequestMapping(path="/signupPage", method=RequestMethod.POST)
	public String doRegiste(@RequestParam("t1")String name,@RequestParam("t2") String dob,
			@RequestParam("t3") String email,@RequestParam("t4")String city,
			@RequestParam("t5") String gender,@RequestParam("t6") String[] courses,Model m )
	{
					
		String str=  " ";
		for (String s: courses) {
			str=str+s+",";
		}
	/*	m.addAttribute("uname",name);
		m.addAttribute("udob",dob);
		m.addAttribute("uemail",email);
		m.addAttribute("ucity",city);
		m.addAttribute("uGender",gender);
		m.addAttribute("uCourses",str);
	*/
		List<String> list= new ArrayList();
		list.add(name);
		list.add(dob);
		list.add(email);
		list.add(city);
		list.add(gender);
		list.add(str);
		m.addAttribute("uerinfo",list);
		
		return "view";		
	}
	@RequestMapping(path="/showFlightPage")
	public String showFlightPage() {
		return "flightPage";
	}
	@RequestMapping(path="/addFlight")
	public String addFlight(@ModelAttribute Flight flight, Model m)
	
	{
		dao.addFlight(flight);
		
		return "viewFlight";
	}
	@RequestMapping(path="/viewFlightInTable")
	public String viewFlights(Model m) {
		List<Flight> listOfFlight = dao.getAllFlights();
		m.addAttribute("flights",listOfFlight);
		
		return "viewFlightInTabular";
	}
	
	
}