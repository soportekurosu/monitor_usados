package py.com.kurosu.monitor_usados.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Marca  implements Serializable {
    @SerializedName("id") public Integer id;
    @SerializedName("descripcion") public String descripcion;
}
