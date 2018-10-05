package py.com.kurosu.monitor_usados.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Usuario implements Serializable {
    @SerializedName("id") public Integer id;
    @SerializedName("funcionario") public String funcionario;
    @SerializedName("sucursal") public String sucursal;
    @SerializedName("cargo") public String cargo;
    @SerializedName("passwd") public String passwd;
    @SerializedName("userName") public String userName;
}
