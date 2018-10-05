package py.com.kurosu.monitor_usados.viewmodel;
import android.databinding.BaseObservable;
import android.content.Context;

import py.com.kurosu.monitor_usados.model.Familia;

public class FamiliaViewModel extends BaseObservable {
    private Familia familia;
    private Context context;

    public FamiliaViewModel(Familia familia, Context context){
        this.familia=familia;
        this.context=context;
    }

    public String getFamiliaDescipcion(){
        return familia.descripcion;
    }

    public Integer getFamiliaId(){
        return familia.id;
    }

    public void onFamiliaClick(){
        //context.startActivity();
    }
    public void setFamilia(){
        this.familia=familia;
        notifyChange();
    }
}
