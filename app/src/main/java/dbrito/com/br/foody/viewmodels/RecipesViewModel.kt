package dbrito.com.br.foody.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import dbrito.com.br.foody.util.Constants
import dbrito.com.br.foody.util.Constants.Companion.API_KEY
import dbrito.com.br.foody.util.Constants.Companion.DEFAULT_DIET_TYPE
import dbrito.com.br.foody.util.Constants.Companion.DEFAULT_MEAL_TYPE
import dbrito.com.br.foody.util.Constants.Companion.DEFAULT_RECIPES_NUMBER
import dbrito.com.br.foody.util.Constants.Companion.QUERY_ADD_RECIPE_INFORMATION
import dbrito.com.br.foody.util.Constants.Companion.QUERY_API_KEY
import dbrito.com.br.foody.util.Constants.Companion.QUERY_DIET
import dbrito.com.br.foody.util.Constants.Companion.QUERY_FILL_INGREDIENTS
import dbrito.com.br.foody.util.Constants.Companion.QUERY_NUMBER
import dbrito.com.br.foody.util.Constants.Companion.QUERY_TYPE

class RecipesViewModel(application: Application) : AndroidViewModel(application){

     fun applyQueries(): HashMap<String, String> {
        val queries: HashMap<String, String> = HashMap()

        queries[QUERY_NUMBER] = DEFAULT_RECIPES_NUMBER
        queries[QUERY_API_KEY] = API_KEY
        queries[QUERY_TYPE] = DEFAULT_MEAL_TYPE
        queries[QUERY_DIET] = DEFAULT_DIET_TYPE
        queries[QUERY_ADD_RECIPE_INFORMATION] = "true"
        queries[QUERY_FILL_INGREDIENTS] = "true"

        return queries
    }
}