LLpackage com.mcon152.recipeshare;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("VEGETARIAN")
public class VegetarianRecipe extends Recipe {
    public VegetarianRecipe() { super(); }

    public VegetarianRecipe(Long id, String title, String description, String ingredients, String instructions, Integer servings) {
        super(id, title, description, ingredients, instructions, servings);
    }

    @Entity
    @DiscriminatorValue("SOUP")
    public class SoupRecipe extends Recipe {
        private String spiceLevel;

        public SoupRecipe() {
            super();
        }

        public SoupRecipe(Long id, String title, String description, String ingredients, String instructions, Integer servings, String spiceLevel) {
            super(id, title, description, ingredients, instructions, servings);
            this.spiceLevel = spiceLevel;
        }

        public String getSpiceLevel() {
            return spiceLevel;
        }

        public void setSpiceLevel(String spiceLevel) {
            this.spiceLevel = spiceLevel;
        }
    }
}


