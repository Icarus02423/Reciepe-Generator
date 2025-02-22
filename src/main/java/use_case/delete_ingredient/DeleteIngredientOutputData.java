package use_case.delete_ingredient;

import entity.Ingredient;

import java.util.List;

/**
 * The output data for the Delete Ingredient Use Case.
 */
public class DeleteIngredientOutputData {

    private final List<Ingredient> ingredients;
    private final Ingredient ingredient;
    private final boolean useCaseFailed;

    public DeleteIngredientOutputData(List<Ingredient> ingredients, Ingredient ingredient, boolean useCaseFailed) {
        this.ingredients = ingredients;
        this.ingredient = ingredient;
        this.useCaseFailed = useCaseFailed;
    }

    List<Ingredient> getIngredients() {return ingredients;}

    Ingredient getIngredient() {
        return ingredient;
    }

    boolean getUseCaseFailed() {
        return useCaseFailed;
    }
}
