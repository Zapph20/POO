/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAR;

/**
 *
 * @author Axel Yamir CT
 */
class Venta {
    int id;
    String descripción;
    int cantidad;
    double precio;
    double importe;

    public Venta() {
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    public void eliminarUno(){
        ListaVentas.eliminar(0);
    }
    //public String generarCodigo(int c){
       // String codigo="";
        //int canti = getDescripción().length();
       // if(canti>0){
                //codigo+="001"+c;}
       // else{
      //  return codigo;  
  //  }
    
}
