package com.cal.pro;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("data", dataResult());
		return "home";
	}

	public ArrayList<String> dataResult() { //dönen deðerinin türü dataResult metodunun türü olur.(önemli)
		
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("Künefe");
		ls.add("Kadayif");
		ls.add("Sütlü Nüriye");
		ls.add("Vezir Parmagi");
		
		return ls;
	}
}