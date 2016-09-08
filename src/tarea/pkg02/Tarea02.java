
package tarea.pkg02;

/**
 *
 * @author alejandro
 */
public class Tarea02 {
 String cadena="{[(])}";
 char llaves[];
 int tam2=cadena.length();
 public void comparar(){
    int tam=cadena.length();
    int inicio=0;
    llaves = new char[tam/2];
    
    for(int j=0;j<tam/2;j++){ 
    if(cadena.charAt(inicio)=='{'||cadena.charAt(inicio)=='['||cadena.charAt(inicio)=='('){
       llaves[inicio]=cadena.charAt(inicio);
       inicio++;
     }
    }
    int con=inicio;
    
    
    
    for(int f=tam/2;f<tam;f++){
     if(cadena.charAt(f)==')'){
         if(llaves[inicio-1]=='('){
             inicio--;
       con++;
       
      }
    }
    if(cadena.charAt(f)==']'){
      if(llaves[inicio-1]=='['){
       inicio--;
       con++;
       
      }
    }
    if(cadena.charAt(f)=='}'){
      if(llaves[inicio-1]=='{'){
       inicio--;
       con++;
       
      }
    }
    }
    if(inicio==0){
      System.out.println("la cadena es simetrica");
    }
    else{System.out.println("la cadena no es simetrica");}
 }
 
 public void imprimir(){
 for(int i=0;i<tam2/2;i++){
  System.out.println(llaves[i]);
 }
 }
         
 
    public static void main(String[] args) {
       Tarea02 b=new Tarea02();
       b.comparar();
       //b.imprimir();
    }
    
}
