package py.com.kurosu.monitor_usados.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import py.com.kurosu.monitor_usados.model.Familia;

public class FamiliaResponse {
    @SerializedName("results") private List<Familia> familiaList;

    public List<Familia> getFamiliaList() {
        return familiaList;
    }
    public void setFamiliaList(List<Familia> listFamilia){
        this.familiaList=familiaList;
    }
}
