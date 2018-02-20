package indonesiaandroidkejar.id.movieapp_mvpkotlin.di.module

import android.app.Application
import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import indonesiaandroidkejar.id.movieapp_mvpkotlin.data.network.RetrofitService
import indonesiaandroidkejar.id.movieapp_mvpkotlin.di.scope.ApplicationContext
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Handy on 18/02/18.
 * akang.handy95@gmail.com
 */
@Module
class AppModule (val app: Application) {

    @Provides
    fun provideApplication() : Application = app


    @Provides
    @ApplicationContext
    fun provideAppContext() : Context = app

    @Provides
    @Singleton
    fun provideGson() : Gson {
        val gson = GsonBuilder()
                .setDateFormat("yyyy-MM-dd")
                .create()
        return gson
    }

    @Provides
    @Singleton
    fun provideOkHttpClient() : OkHttpClient {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

        val okHttp = OkHttpClient
                    .Builder()
                .addInterceptor(loggingInterceptor)
                .build()
        return okHttp
    }

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient , gson: Gson) : Retrofit {
        val retrofit = Retrofit
                    .Builder()
                    .baseUrl("https://api.themoviedb.org/3/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .build()
        return retrofit
    }

    @Provides
    @Singleton
    fun provideApiService(retrofit: Retrofit) : RetrofitService = retrofit.create(RetrofitService::class.java)


}