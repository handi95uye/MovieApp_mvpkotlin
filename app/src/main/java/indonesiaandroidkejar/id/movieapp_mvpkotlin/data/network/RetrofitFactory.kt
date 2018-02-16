package indonesiaandroidkejar.id.movieapp_mvpkotlin.data.network

import indonesiaandroidkejar.id.movieapp_mvpkotlin.BuildConfig
import indonesiaandroidkejar.id.movieapp_mvpkotlin.utilities.Const
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

/**
 * Created by Handy on 17/02/18.
 * akang.handy95@gmail.com
 */
class RetrofitFactory {

    fun newInstance():Retrofit {
        return  Retrofit
                .Builder()
                .baseUrl("")
                .client(createClient())
                .build()
    }

    fun createClient():OkHttpClient {
        val  interceptor = HttpLoggingInterceptor()
        if (BuildConfig.DEBUG)
        {
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        }
        else
        {
            interceptor.setLevel(HttpLoggingInterceptor.Level.NONE)
        }
        val clientBuilder =  OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .connectTimeout(Const().TIMEOUT,TimeUnit.SECONDS)
                .readTimeout(Const().TIMEOUT,TimeUnit.SECONDS)
                .writeTimeout(Const().TIMEOUT,TimeUnit.SECONDS)
        return clientBuilder.build()
    }

}