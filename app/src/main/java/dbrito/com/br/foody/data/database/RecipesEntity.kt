package dbrito.com.br.foody.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import dbrito.com.br.foody.models.FoodRecipe
import dbrito.com.br.foody.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
class RecipesEntity (
    var foodRecipe: FoodRecipe
        ) {
    @PrimaryKey(autoGenerate = false)
    var id: Int = 0
}