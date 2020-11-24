public class Lista {
    Nodo inicio = null;
    Nodo fin = null;

    public void insertar(int dato){
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        if (inicio == null){
            inicio = nuevo;
            fin = nuevo;
        }else{
            nuevo.anterior = fin;
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public void recorrer(){
        Nodo aux = inicio;
        while (aux != null){
            System.out.println(aux.dato + " ");
            aux = aux.siguiente;
        }
    }

    public int tamaño(){
        Nodo aux = inicio;
        int i = 0;
        while (aux != null){
            i++;
            aux = aux.siguiente;
        }
        return i;
    }

    public Nodo par(int tamaño){
        Nodo aux = inicio;
        for (int i = -1; i < tamaño; i++) {
            aux = aux.siguiente;
        }
        return  aux;
    }

    public void ordenar(int x){
        if (x <= 0){
            return;
        }else{
            int ditancia = x / 2;
            Nodo aux = inicio;
            Nodo aux2 = par(ditancia);
            while (aux2 != null){
                if (aux.dato >= aux2.dato){
                    int y = aux2.dato;
                    aux.dato = aux2.dato;
                    aux2.dato = y;
                }
                aux = aux.siguiente;
                aux2 = aux2.siguiente;
            }
            ordenar(ditancia);
        }
    }

    public void shellSort(){
        int tamaño = tamaño();
        ordenar(tamaño);
    }
}
