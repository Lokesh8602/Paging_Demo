package  com.example.paging_demo.retrofit


import com.example.paging_demo.model.QuotesList
import retrofit2.http.GET
import retrofit2.http.Query

interface QuoteAPI {

    @GET("/quotes")
    suspend fun getQuotes(@Query("page") page: Int): QuotesList
}