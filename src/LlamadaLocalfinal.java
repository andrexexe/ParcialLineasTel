public class LlamadaLocalfinal {
    private int numeroLlamadas =0;
    private int numeroMinutos =0;
    private  int costoLlamada=0;


    public LlamadaLocalfinal() {
    }

    public int getNumeroLlamadas() {
        return numeroLlamadas;
    }

    public void setNumeroLlamadas(int numeroLlamadas) {
        this.numeroLlamadas = numeroLlamadas;
    }

    public int getNumeroMinutos() {
        return numeroMinutos;
    }

    public void setNumeroMinutos(int numeroMinutos) {
        this.numeroMinutos = numeroMinutos;
    }



    public int getCostoLlamada() {
        return costoLlamada;
    }

    public void setCostoLlamada(int costoLlamada) {
        this.costoLlamada = costoLlamada;
    }


    public int CostoTotalLlamadas(){

        return costoLlamada;
    }
    public int NumeroLlamadaslocal(){
        return numeroLlamadas;

    }

    public int NumeroMinutos(){
        return numeroMinutos;
    }


    public void agregarLlamadaLocal (int minutos){
        numeroLlamadas=numeroLlamadas +1;
        numeroMinutos=numeroMinutos+minutos;
        costoLlamada=costoLlamada+(minutos*60);

    }


    public void agregarLlamadadistancia (int minutos){
        numeroLlamadas=numeroLlamadas +1;
        numeroMinutos=numeroMinutos+minutos;
        costoLlamada=costoLlamada+(minutos*1200);

    }

    public void agregarLlamadacelular (int minutos){
        numeroLlamadas=numeroLlamadas +1;
        numeroMinutos=numeroMinutos+minutos;
        costoLlamada=costoLlamada+(minutos*850);

    }







    @Override
    public String toString() {
        return "Consolidado{" +
                "numeroLlamadas=" + numeroLlamadas +
                ", numeroMinutos=" + numeroMinutos +
                ", costoLlamada=" + costoLlamada +
                '}';
    }
}
