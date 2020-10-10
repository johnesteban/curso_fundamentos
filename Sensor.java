
public class Sensor
{
   public static Sensor[] sensores;
   private int estado;
   
   public Sensor(){
       this(0);
    }
   public Sensor(int e){
       this.estado=e;
    }
   public void setEstado(int e){
       this.estado=e;
    }
   public int getEstado(){
       return this.estado;
    }
   public String toString(){
       String cadena="Ocupado";
       if(this.estado==0){
           cadena="Libre";
        }
        return cadena;
    }
   public static String sensorLibre(){
       String numcadena="";
       for(int i=0;i<sensores.length;i++){
           if(sensores[i]==null){
                numcadena+=i+","; 
            }
       }
      numcadena=numcadena.substring(0,numcadena.length()-1);
      return numcadena;
   }
   public static String sensoresEstado(){
       String numcadena="";
       for(int i=0;i<sensores.length;i++){
           if(sensores[i]==null){
               numcadena+=i+"-Libre\n";
            }
            else{
            numcadena+=i+"-Ocupado\n";
           }
        }
        numcadena=numcadena.substring(0,numcadena.length()-1);
        return numcadena;
    }
}
