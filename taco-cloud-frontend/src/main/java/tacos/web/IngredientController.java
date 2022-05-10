package tacos.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Slf4j
@Controller
@RequestMapping("/ingredient")
public class IngredientController {
//	private final IngredientRepository ingredientRepo;
//
//	@Autowired
//	public IngredientController(IngredientRepository ingredientRepo) {
//		this.ingredientRepo = ingredientRepo;
//	}

//	@GetMapping("/add")
//	public String showAddForm(Model model) {
//		model.addAttribute("ingredient", new Ingredient(null, null, null));
//		return "addIngredient";
//	}

//	@PostMapping
//	public String addIngredient(Ingredient ingredient, Model model) {
////		ingredientRepo.save(ingredient);
//		model.addAttribute(ingredient);
//		log.info("Ingredient saved: " + ingredient);
//		return "addIngredientSuccess";
//	}
}