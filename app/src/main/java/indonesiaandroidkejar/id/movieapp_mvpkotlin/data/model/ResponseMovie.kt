package indonesiaandroidkejar.id.movieapp_mvpkotlin.data.model

import android.annotation.SuppressLint
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

/**
 * Created by Handy on 19/02/18.
 * akang.handy95@gmail.com
 */

@SuppressLint("ParcelCreator")
@Parcelize
data class ResponseMovie(

        @SerializedName("page")
        @Expose
        val page : Int? = null,

        @SerializedName("total_results")
        @Expose
        val totalResults : Int? = null,

        @SerializedName("total_pages")
        @Expose
        val totalPages : Int? = null,

        @SerializedName("results")
        @Expose
        val movie: List<Movies>? = null ):Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class Movies (
        @SerializedName("adult")
        @Expose
        val adult : Boolean? = null,

        @SerializedName("backdrop_path")
        @Expose
        val backdropPath : String? = null,

        @SerializedName("belongs_to_collection")
        @Expose
        val belongsTvoteCountoCollection : List<BelongsToCollection>? = null,

        @SerializedName("budget")
        @Expose
        val budget : Int? = null,

        @SerializedName("genres")
        @Expose
        val genres : List<Genre>? = null,

        @SerializedName("homepage")
        @Expose
        val homepage : String? = null,

        @SerializedName("id")
        @Expose
        val id : Int? = null,

        @SerializedName("imdb_id")
        @Expose
        val imdbId : String? =null,

        @SerializedName("original_language")
        @Expose
        val originalLanguage : String? = null,

        @SerializedName("original_title")
        @Expose
        val originalTitle : String? = null,

        @SerializedName("overview")
        @Expose
        val overview : String? = null,

        @SerializedName("popularity")
        @Expose
        val popularity : Float? = null,

        @SerializedName("poster_path")
        @Expose
        val posterPath : String? = null,

        @SerializedName("production_companies")
        @Expose
        val productionCompanies : List<ProductionCompany>? = null,

        @SerializedName("production_countries")
        @Expose
        val productionCountries : List <ProductionCountry>? = null,

        @SerializedName("release_date")
        @Expose
        val releaseDate : String? = null,

        @SerializedName("revenue")
        @Expose
        val revenue : Int? = null,

        @SerializedName("runtime")
        @Expose
        val runtime : Int? = null,

        @SerializedName("spoken_languages")
        @Expose
        val spokenLanguages : List <SpokenLanguage>? = null,

        @SerializedName("status")
        @Expose
        val status : String? = null,

        @SerializedName("tagline")
        @Expose
        val tagline : String? = null,

        @SerializedName("title")
        @Expose
        val title : String? = null,

        @SerializedName("video")
        @Expose
        val video : Boolean? = null,

        @SerializedName("vote_average")
        @Expose
        val voteAverage : Float? = null,

        @SerializedName("vote_count")
        @Expose
        val voteCount : Int? = null ) : Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class SpokenLanguage (

        @SerializedName("iso_639_1")
        @Expose
        val iso6391 : String? = null,

        @SerializedName("name")
        @Expose
        val name: String? = null ) : Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class ProductionCountry (

        @SerializedName("iso_3166_1")
        @Expose
        val iso31661 : String? = null,

        @SerializedName("name")
        @Expose
        val name: String? = null ) : Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class ProductionCompany (

        @SerializedName("name")
        @Expose
        val name: String? = null,

        @SerializedName("id")
        @Expose
        val id: Int? = null

):Parcelable


@SuppressLint("ParcelCreator")
@Parcelize
data class Genre (

        @SerializedName("name")
        @Expose
        val name : String? = null
):Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class BelongsToCollection (

        @SerializedName("id")
        @Expose
        val id : Int? = null,

        @SerializedName("name")
        @Expose
        val name : String? = null,

        @SerializedName("poster_path")
        @Expose
        val posterPath : String? = null,

        @SerializedName("backdrop_path")
        @Expose
        val backdropPath : String? = null
):Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class Images (

        @SerializedName("base_url")
        @Expose
        val baseUrl : String? = null,

        @SerializedName("secure_base_url")
        @Expose
        val secureBaseUrl : String? = null,

        @SerializedName("backdrop_sizes")
        @Expose
        val backdropSizes : List<String>? = null,

        @SerializedName("logo_sizes")
        @Expose
        val logoSizes : List<String>? = null,

        @SerializedName("poster_sizes")
        @Expose
        val posterSizes : List<String>? = null,

        @SerializedName("profile_sizes")
        @Expose
        val profileSizes : List<String>? = null,

        @SerializedName("still_sizes")
        @Expose
        val stillSizes : List <String>? = null

):Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class Configuration (

        @SerializedName("image")
        @Expose
        val images: Images? = null,

        @SerializedName("change_keys")
        @Expose
        val changeKeys : List<String>? = null
) :Parcelable