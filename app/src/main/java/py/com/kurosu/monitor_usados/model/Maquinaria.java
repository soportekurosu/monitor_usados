package py.com.kurosu.monitor_usados.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;

public class Maquinaria implements Serializable {
    @SerializedName("id") public Integer id;
    @SerializedName("cliente") public String cliente;
    @SerializedName("fecha_registro") public Date fecha;
    @SerializedName("fecha_negocio") public Date fechaNegocio;
    @SerializedName("estado") public String estado;
    @SerializedName("intencion") public String intencion;
    @SerializedName("HP") public int hp;
    @SerializedName("horas_maq") public int horas_maq;
    @SerializedName("anho") public int anho;
    @SerializedName("precio") public int precio;
    @SerializedName("otros_equipos") public String otros_equipos;
    @SerializedName("notas") public String notas;
}
