package tacos;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@RequiredArgsConstructor
@NoArgsConstructor(force = true)
public class Ingredient {
	private final String id;
	private final String name;
	private final Type type;

	public static enum Type {
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}
}