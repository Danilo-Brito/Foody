package dbrito.com.br.foody.models


import com.google.gson.annotations.SerializedName

data class FoodReciipe(
    @SerializedName("results")
    val results: List<Result>,
)