
public class Vehiculo
{
    public static Vehiculo[] vehiculos;
    public static int cantidad=0;
    private String placa;
    private String marca;
    private String color;
    private int valorComercial;
    
    public Vehiculo(){
        this(null,null,null,0);
    }
    public Vehiculo(String p,String m,String c){
       this(p,m,c,30000000);
    }
    public Vehiculo(String p,String m, String c, int v){
        this.placa=p;
        this.marca=m;
        this.color=c;
        this.valorComercial=v;
        cantidad++;
    }
    public void setPlaca(String p){
        this.placa=p;
    }
    public String getPlaca(){
        return this.placa;
    }
    public void setMarca(String m){
        this.marca=m;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setColor(String c){
        this.color=c;
    }
    public String getColor(){
        return this.color;
    }
    public void setvalorComercial(int v){
        this.valorComercial=v;
    }
    public int getvalorComercial(){
        return this.valorComercial;
    }
    public String toString(){
        return "Placa: "+this.getPlaca()+", Marca: "+this.getMarca()+", Color: "+this.getColor()+", Valor comercial: "+this.getvalorComercial();
    }
    
    public static String toStringVehiculos(){
        String cadena="";
        for(int i=0;i<vehiculos.length;i++){
            if(vehiculos[i]!=null){
                cadena+="El vehiculo en la posicion "+i+" tiene la siguiente informacion: "+vehiculos[i].toString()+"\n";
            }
        }
        return cadena;
    }
    public static int cantidadVehiculos(){
        return Vehiculo.cantidad;
    }
    public static String toStringColor(String color){
        String cadena="";
        for(int i=0;i<vehiculos.length;i++){
         if((vehiculos[i]!=null) && (vehiculos[i].getColor().equalsIgnoreCase(color))){
            cadena+="El vehiculo en la posicion "+i+" tiene la siguiente informacion: "+vehiculos[i].toString()+"\n";
           }
        }
        return cadena;
      }
    public static String ordenarValor(){
     String cadena="";
     Vehiculo temp;
     int n =vehiculos.length;
       for(int i=1;i<n;i++){
       for(int j=0;j<n-i;j++){
       if((vehiculos[j]!=null) && (vehiculos[j].getvalorComercial()>vehiculos[j+1].getvalorComercial())){
       temp=vehiculos[j];
       vehiculos[j]=vehiculos[j+1];
       vehiculos[j+1]=temp;

      }
      }
     }
     for(int i=0; i<n; i++){
      cadena+=vehiculos[i];
     }
     return cadena;
    }
}
        
  
