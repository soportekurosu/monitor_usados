package py.com.kurosu.monitor_usados.data;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import py.com.kurosu.monitor_usados.model.Familia;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FamiliaFactory {
    private final static String BASE_URL="http://monitor.kurosuycia.com.py:8182/repuestos/familia_api.php";

    public static FamiliaService create(){

        Retrofit retrofit= new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
                return retrofit.create(FamiliaService.class);
    }
}
