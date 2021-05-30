/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareafuncionesrecursivas;

/**
 *
 * @author oscar
 */
public class func {
    
    public static int factorial(int num){
	if(num == 0){
	return 1;
	}
	else
	return num * factorial(num-1);
	}
    
    
   
    public int Sumatoria(int n){
        int resultado = 0;
        if(n==1){
            resultado = 1;
        }else{
            if(n>1){
                resultado = n + Sumatoria(n-1);
            }else{
                
            }
        }
        
        return resultado;
    }
    
    public int Potencia(int x, int n){
        int resultado = 0;
        if(n==0){
            resultado = 1;
        }else{
            if(n==1){
                resultado = x;
            }else{
                if(x==0){
                    resultado = 0;
                }else{
                    if(n>1){
                        resultado = x*(Potencia(x, n-1));
                    }
                }
            }
        }
        return resultado;
    }
    
    public int Multiplicacion(int m, int n){
        int resultado = 0;
        if(n==0||m==0){
            resultado = 0;
        }else{
            if(n==1){
                resultado = m;
            }else{
                if(m==1){
                    resultado = n;
                }else{
                    if(n>1){
                        resultado = m + Multiplicacion(m, n-1);
                    }
                }
            }
        }
        return resultado;
    }
    
    
     public int Division(int m, int n){
        int resultado = 0;
        if(n==0||m==0){
            resultado = 0;
        }else{
            if(m==n){
                resultado = 1;
            
            }else{
                     if(m>n){
                        resultado = 1 + Division(m-n,n) ;
                    }
                }
            }
        
        return resultado;
    }
    
    
     public int potencia2(int x, int n){
        
        if(n==1){
            return x;
        }else{
            return Multiplicacion(x,potencia2(x,n-1));
            }
        
        
    }
     
     
     public String Palindromo(String datosEntrada,int i, int d){
         if(i>=d){
            return "Palindromo";
        }else{
            if(datosEntrada.charAt(i)==datosEntrada.charAt(d)){
                return Palindromo(datosEntrada, i+1, d-1);
            }else{
                return "No palindromo";
            }
        }
     }

     public String Reversible(String datos,int i){
         if(i==0){
             return "" + datos.charAt(0);
        }else{
            return datos.charAt(i)+Reversible(datos, i-1);
        }
     }
     
     
     
     public int For(int i, String msg) {
         if(i==0){
            return 0;
         }else{
             System.out.println(msg);
             i--;
             return For(i,msg);
         }
    }
    
     public int Fobonacci(int n) {
         if(n==0){
            return 0;
         }else{
             if(n==1){
                 return 1;
             }else
             return Fobonacci(n-2)+Fobonacci(n-1);
         }
    }
     
    public int torresHanoi(int n, int origen,  int auxiliar, int destino){
        if(n==1)
            System.out.println("mover disco de " + origen + " a " + destino);
        else{
            torresHanoi(n-1, origen, destino, auxiliar);
            System.out.println("mover disco de "+ origen + " a " + destino);
            torresHanoi(n-1, auxiliar, origen, destino);
           
        }
        return 0;
    }
}
     
     
     
    
    
    
    

