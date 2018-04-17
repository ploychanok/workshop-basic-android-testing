package workshop.testing.data.model;

import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

public class RecipeTest {

    @Test
    public void water(){

        //Arrange
        InputStream stream = RecipeTest.class.getResourceAsStream("/recipes/water.txt");

        //Action
        Recipe recipe = Recipe.readFromStream(stream);

        //Assert
        assertNotNull(recipe);
        assertEquals("water",recipe.id);
        assertEquals("Water", recipe.title);
        assertEquals("Put glass under tap. Open tap. Close tap. Drink.",recipe.description);

    }

}