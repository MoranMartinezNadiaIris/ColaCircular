
public class colacircular <T> {
		private T Esquina [];
		private int Inicio; 
		private int Fin; 
		private boolean extraido;
		private boolean insertado;
		    public colacircular(int N) {
		         Esquina = (T[]) new Object [N];
		         
		       Inicio=0;
		       
		       Fin=Inicio;
		    }
		    public boolean colaLlena(){
		        if(Inicio==Fin)
		            if(!extraido)
		                return true;
		            else
		                return false;
		        else
		            return false;
		    }
		     public void encolar(T Num)throws ExcepcionColaLLena {
		      if(colaVacia()){
		           Inicio=0;
		          Fin=Inicio;
		      }
		      if(colaLlena()){
		            throw new ExcepcionColaLLena();
		        }
		       Esquina [Fin] = Num; 
		        if(Fin==Esquina.length-1){
		                Fin=0;
		        }else{
		                Fin++;
		            extraido=false;
		            insertado=true;
		        }
		     }
		     public boolean colaVacia(){
		        if(Inicio==Fin)
		            if(!insertado)
		                return true;
		            else
		                return false;
		        else
		            return false;
		    }
		      public T sacar()throws ExcepcionColaVacia{
		        if(colaVacia()){
		            throw new ExcepcionColaVacia();
		        }
		         extraido=true;
		            insertado=false;
		            if(Inicio==Esquina.length-1){
		                Inicio=0;
		                return Esquina[Esquina.length-1];
		            }
		            else{
		                Inicio++;
		                return Esquina[Inicio-1];
		            }
		    }
		}
