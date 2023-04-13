package ejerciciolista.pq2;
/**
 * Author :  Vinni vinni_@yahoo.com
 */
public class Lista {
    public Nodo nodoPrincipal;

    /**
     * Adiciona un nodo al final de la lista
     * @param nodo Nodo
     */
    public void adicionarNodoInicial(Nodo nodo){
        if (this.nodoPrincipal==null){
            this.nodoPrincipal=nodo;
        }else{
            nodo.siguienteNodo=this.nodoPrincipal;
            this.nodoPrincipal=nodo;
        }



    }
    public void adicionarNodoFinal(Nodo nodo){
        if (nodo != null){
            //si nodo tiene algo esta lleno sino no existe lista 
            if (nodoPrincipal == null){
                this.nodoPrincipal = nodo;
            }else{
                Nodo aux = this.nodoPrincipal;
                while(aux.siguienteNodo != null){
                    aux = aux.siguienteNodo;
                }
                aux.siguienteNodo = nodo;
            }
           
        }
    }

       
        

       /*  if (nodo != null){
            //si nodo tiene algo esta lleno sino no existe lista 
            if (nodoPrincipal == null){
                this.nodoPrincipal = nodo;
            }else{
                this.nodoPrincipal.siguienteNodo = nodo;
            }if(this.nodoPrincipal.siguienteNodo == null){
                this.nodoPrincipal.siguienteNodo=nodo;
            }else
            this.nodoPrincipal.siguienteNodo=nodo;*/
            
            
           

        
    
    

    
    /**
     * imprime toda la lista
     */
    public void imprimir(){
        
        Nodo nodoaux;
        nodoaux=this.nodoPrincipal;
        while(nodoaux!=null){
            System.out.println(nodoaux.informacion);
            nodoaux=nodoaux.siguienteNodo;
            
        }


    }
    /**
     * borra el primer nodo de la lista y la reorganiza, El nodo nodo 2 queda de primero.
     * Si solo hay uno queda vacia
     */
    public void borrarPrimero(){
        Nodo nodo=this.nodoPrincipal;
    	if(nodo!=null) {
    		nodo=null;
    		this.nodoPrincipal=this.nodoPrincipal.siguienteNodo;
        }

    }
    /**
     * Borra el ultimo nodo de la lista y reorganiza. EL penultimo nodo queda de primero 
     * Si solo hay uno queda vacia
     */
    public void borrarUltimo(){
        Nodo nodo=this.nodoPrincipal.siguienteNodo;
        if(nodo!=null){
            nodo=null;
        }

    }
    /**
     * borra el nodo de la posicion
     */
    public void borrarNodoIntermedio(int posicion){

    }
}
