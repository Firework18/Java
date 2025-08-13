import models.MaterialBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Inventario <T extends MaterialBiblioteca>{

    protected List<T> dataSource;

    public Inventario() {
        this.dataSource = new ArrayList<>();
    }

    public void add(T material){
        this.dataSource.add(material);
    }

    public T porTitulo(String titulo){
        T mat = null;
        for(T material: dataSource){
            if(material.getTitulo()!=null && material.getTitulo().equals(titulo)){
                mat = material;
                break;
            }
        }
        return mat;
    }

    public List<T> listar(){
      return this.dataSource;
    };
}
