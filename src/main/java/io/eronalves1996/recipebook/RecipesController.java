package io.eronalves1996.recipebook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipesController {
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/cake")
	public String cakeRecipe() {
		return "cake";
	}
	
	@GetMapping("/chicken")
	public String chickenRecipe() {
		return "chicken";
	}
}
