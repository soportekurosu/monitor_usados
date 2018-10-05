package py.com.kurosu.monitor_usados.data;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface FamiliaService {
@GET Observable<FamiliaResponse> fetchFamilia(@Url String url);
}
