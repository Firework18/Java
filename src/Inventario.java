import models.MaterialBiblioteca;
import models.Prestable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Inventario <T extends MaterialBiblioteca>{

    protected List<T> dataSource;

    public Inventario() {
        this.dataSource = new ArrayList<>();
    }

    public void add(T material){
        this.dataSource.add(material);
    }

    public T porTitulo(String titulo) throws MaterialNoEncontradoException {
//        T mat = null;
//        for(T material: dataSource){
//            if(material.getTitulo()!=null && material.getTitulo().equals(titulo)){
//                mat = material;
//                break;
//            }
//        }

        return dataSource.stream().filter(m->m.getTitulo().equalsIgnoreCase(titulo)).findFirst().orElseThrow(()->new MaterialNoEncontradoException("Material no encontrado: "+titulo));

        //return mat;
    }

    public List<T> porAnio(int anio){
//        T mat = null;
//        for(T material : dataSource){
//            if(material.getAnioPublicacion()==anio){
//                mat = material;
//                break;
//            }
//        }
        return dataSource.stream().filter(m->m.getAnioPublicacion() == anio).collect(Collectors.toList());

        //return mat;


    }

    public List<T> listar(){
      return this.dataSource;
    }

    public long contarPrestables() {
        return dataSource.stream().filter(m -> m instanceof Prestable).count();
    }


}
