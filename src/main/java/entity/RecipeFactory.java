package entity;

/**
 * Factory for creating recipes.
 */
public interface RecipeFactory {
    /**
     * Creates a new Recipe.
     * @param name the name of the Recipe.
     * @return the new Recipe.
     */
    Recipe create(String name, String description);
}
