public class Gestor {
    public Equiposbasketball equipos[];
	public Equiposbasketball equiposOrdenado[];
	
	public void ordenaBubbleSort()
    {
        this.equiposOrdenado = this.equipos;
        int longitud = equiposOrdenado.length;
        for (int i = 0; i < longitud - 1; i++)
            for (int j = 0; j < longitud - i - 1; j++)
                if (equiposOrdenado[j].posicion < equiposOrdenado[j + 1].posicion) {
                    // swap arr[j+1] and arr[j]
                    Equiposbasketball temp = equiposOrdenado[j];
                    equiposOrdenado[j] = equiposOrdenado[j + 1];
                    equiposOrdenado[j + 1] = temp;
                }

}



    
}
