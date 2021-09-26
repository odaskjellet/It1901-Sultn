package core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;

public class RecipeTest {
    public Recipe recipe;

    @BeforeEach
    public void setUp() {
        Ingredient ing = new Ingredient("Eggs", 2.0, "pcs");
        List<Ingredient> ings = new ArrayList<Ingredient>(Arrays.asList(ing));
        List<String> instr = new ArrayList<String>(Arrays.asList( 
            "Fry guanciale in a pan.",
            "Cook pasta.",
            "Make slurry of eggs, parmigiano, and pepper.",
            "Add al dente pasta to frying pan along with slurry",
            "Stir constantly",
            "Add salt to taste"));
        
        recipe = new Recipe("Carbonara", 123, ings, instr);
    }


    @Test
    public void testTest() {
        assertTrue(true);
    }

    @Test
    @DisplayName("Testing setName() and getName()")
    public void testName() {
        String newName = "Pasta carbonara";
        recipe.setName(newName);
        String checkName = recipe.getName();
        Assertions.assertEquals(newName, checkName);        
    }

    @Test
    @DisplayName("Testing id")
    public void testId() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> recipe.setId(-1));
        assertEquals("ID cannot be negative.", exception.getMessage());
    }
}