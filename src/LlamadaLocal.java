import java.util.ArrayList;

public class LlamadaLocal {
    private int linea ;
    private int duracion;
    private int costollamada;

    ArrayList<Integer>  llamadallaslocales = new ArrayList<>();
    ArrayList<Integer>  datostotales = new ArrayList<>();

    public ArrayList<Integer> getLlamadallaslocales() {
        return llamadallaslocales;
    }

    public ArrayList<Integer> getDatostotales() {
        return datostotales;
    }

    public void setDatostotales(ArrayList<Integer> datostotales) {
        this.datostotales = datostotales;
    }

    public void setLlamadallaslocales(ArrayList<Integer> llamadallaslocales) {
        this.llamadallaslocales = llamadallaslocales;
    }

    public LlamadaLocal() {
    }

}
