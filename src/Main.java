import java.sql.SQLOutput;
import java.util.Scanner;






public class Main {



    /*

    public void agregarllamadalocallinea1(int minutos){
        linea1.agregarLlamadaLocal(minutos);

    }

    public int totalllamadas(){
        return linea1.NumeroLlamadaslocal();
    }

    public int totalminutos(){
        return  linea1.NumeroMinutos();
    }

    public int totalcostollamadas(){
        return linea1.CostoTotalLlamadas();

    }

    public double promedio (){
        return totalcostollamadas()/totalminutos();
    }
*/


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Variables de entrada por tecto para el menu principal y sub menus
        boolean salir= false;

        int opcion;
        int opc;
        boolean out = false;

        //Creacion objetos de tipo llamada
        //LlamadaLocal local = new LlamadaLocal();





        // Variables de las llamdas
        int minutos =0;


        LlamadaLocalfinal linea1 = new LlamadaLocalfinal();
        LlamadaLocalfinal linea2 = new LlamadaLocalfinal();
        LlamadaLocalfinal linea3 = new LlamadaLocalfinal();


        //Creacion de Menu Principal ::

        while (!salir){
            System.out.println("Empresa Telefonica Andrex.exe");
            System.out.println("Bienvenido Menu Principal");
            System.out.println(" 1.Registrar una llamada");
            System.out.println(" 2.Mostrar Informacion de cada Linea   ");
            System.out.println(" 3.Mostrar un consolidado total de cada linea ");
            System.out.println(" 4.Reiniciar el uso de la lineas telefonicas ");
            System.out.println(" 5.Salir de la empresa telefonica");

            System.out.println("Escoja una opcion por favor");
            opcion = teclado.nextInt();


            //creacion de casos de cada opcion

            switch (opcion){
                case 1:

                        //creacion de menu para ingresar una llamada en una de las linea

                        System.out.println("1. Linea N-1 ");
                        System.out.println("2. Linea N-2 ");
                        System.out.println("3. Linea N-3" );

                        System.out.println("Escoja una opcion por favor");
                        opcion = teclado.nextInt();


                        //Creacion de casos de cada Linea

                        switch (opcion){
                            case 1 :


                                System.out.println("CABINA 1 <---->LINEA 1");

                                System.out.println("Tipos de Llamada");
                                System.out.println(" 1. LLamada local");
                                System.out.println(" 2. LLamada larga distancia");
                                System.out.println(" 3. LLamada Celular.");

                                System.out.println("Escoja una opcion por favor");
                                opc= teclado.nextInt();


                                switch (opc) {
                                    case 1:

                                        System.out.println("Registro Llamda Local");

                                        System.out.println("¿Cuanto tiempo en minutos duro la llamada Local?");

                                        minutos = teclado.nextInt();

                                        linea1.agregarLlamadaLocal(minutos);
                                        System.out.println("Registro con exito ");


                                       // System.out.println("Linea1: "+ linea1.toString());

                                        //   local.Mostrarllamadalocal(1,duracion);
                                        break;
                                    case 2:
                                        System.out.println("Registro Llamada Larga Distancia");
                                        System.out.println("¿Cuanto tiempo en minutos duro la llamada Larga Distancia?");
                                        minutos = teclado.nextInt();

                                        linea1.agregarLlamadadistancia(minutos);
                                        System.out.println("Registro con exito ");


                                       // System.out.println("Linea1: "+ linea1.toString());
                                        break;
                                    case  3:
                                        System.out.println("Registro Llamada celular ");
                                        System.out.println("¿Cuanto tiempo en minutos duro la llamada a celular?");
                                        minutos = teclado.nextInt();

                                        linea1.agregarLlamadacelular(minutos);
                                        System.out.println("Registro con exito ");


                                     //   System.out.println("Linea1: "+ linea1.toString());
                                        break;

                                    default:
                                        System.out.println("Opcion Invalida intente nuevamente");

                                        break;

                                }
                                break;



                                case 2:


                                    System.out.println("CABINA 2 <---->LINEA 2");

                                    System.out.println("Tipos de Llamada");
                                    System.out.println(" 1. LLamada local");
                                    System.out.println(" 2. LLamada larga distancia");
                                    System.out.println(" 3. LLamada Celular.");

                                    System.out.println("Escoja una opcion por favor");
                                    opc= teclado.nextInt();


                                    switch (opc) {
                                        case 1:

                                            System.out.println("Registro Llamda Local");

                                            System.out.println("¿Cuanto tiempo en minutos duro la llamada Local?");

                                            minutos = teclado.nextInt();

                                            linea2.agregarLlamadaLocal(minutos);
                                            System.out.println("Registro con exito ");


                                         //   System.out.println("Linea 2: "+linea2.toString());

                                            //   local.Mostrarllamadalocal(1,duracion);
                                            break;
                                        case 2:
                                            System.out.println("Registro Llamada Larga Distancia");
                                            System.out.println("¿Cuanto tiempo en minutos duro la llamada Larga Distancia?");
                                            minutos = teclado.nextInt();

                                            linea2.agregarLlamadadistancia(minutos);
                                            System.out.println("Registro con exito ");


                                         //   System.out.println("Linea 2: "+linea2.toString());
                                            break;
                                        case  3:
                                            System.out.println("Registro Llamada celular ");
                                            System.out.println("¿Cuanto tiempo en minutos duro la llamada a celular?");
                                            minutos = teclado.nextInt();

                                            linea2.agregarLlamadacelular(minutos);
                                            System.out.println("Registro con exito ");


                                     //       System.out.println("Linea 2: "+linea2.toString());
                                            break;
                                        case 4:



                                            break;
                                        default:
                                            System.out.println("Opcion Invalida intente nuevamente");

                                            break;

                                    }
                                    break;

                            case 3:
                                System.out.println("CABINA 3 <---->LINEA 3");

                                System.out.println("Tipos de Llamada");
                                System.out.println(" 1. LLamada local");
                                System.out.println(" 2. LLamada larga distancia");
                                System.out.println(" 3. LLamsda Celular.");

                                System.out.println("Escoja una opcion por favor");
                                opc= teclado.nextInt();


                                switch (opc) {
                                    case 1:

                                        System.out.println("Registro Llamda Local");

                                        System.out.println("¿Cuanto tiempo en minutos duro la llamada Local?");

                                        minutos = teclado.nextInt();

                                        linea3.agregarLlamadaLocal(minutos);
                                        System.out.println("Registro con exito ");


                                  //      System.out.println("Linea 3:"+linea3.toString());

                                        //   local.Mostrarllamadalocal(1,duracion);
                                        break;
                                    case 2:
                                        System.out.println("Registro Llamada Larga Distancia");
                                        System.out.println("¿Cuanto tiempo en minutos duro la llamada Larga Distancia?");
                                        minutos = teclado.nextInt();

                                        linea3.agregarLlamadadistancia(minutos);
                                        System.out.println("Registro con exito ");


                                  //      System.out.println("Linea 3:"+linea3.toString());
                                        break;
                                    case  3:
                                        System.out.println("Registro Llamada celular ");
                                        System.out.println("¿Cuanto tiempo en minutos duro la llamada a celular?");
                                        minutos = teclado.nextInt();

                                        linea3.agregarLlamadacelular(minutos);
                                        System.out.println("Registro con exito ");


                                        //System.out.println("Linea 3:"+linea3.toString());
                                        break;

                                    default:
                                        System.out.println("Opcion Invalida intente nuevamente");

                                        break;

                                }
                                break;

                                 case 4:

                                        System.out.println("Salio ");
                                        salir = true;
                                        break;

                                    default:
                                        System.out.println("Opcion Invalida intente nuevamente");

                    }


                    break;

                case 2 :

                    System.out.println("Informacion detallada de cada linea");

                    System.out.println("Linea1: "+ linea1.toString());
                    System.out.println("Linea2: "+ linea2.toString());
                    System.out.println("Linea3: "+ linea3.toString());

/*
                   local.toString();
                    System.out.println(local.toString());
                    local.getLlamadallaslocales();
                    System.out.println("Array ->> "+local.getLlamadallaslocales());
*/


                 break ;

                case 3:
                    System.out.println("Consolidado de todas la lineas");
                    int costollamadatotal= linea1.CostoTotalLlamadas()+linea2.CostoTotalLlamadas()+linea3.CostoTotalLlamadas();
                    int numerodellamadas=linea1.NumeroLlamadaslocal()+linea2.NumeroLlamadaslocal()+linea3.NumeroLlamadaslocal();
                    int numeroduracion= linea1.NumeroMinutos()+linea2.NumeroMinutos()+linea3.NumeroMinutos();
                    double promedio= costollamadatotal/numeroduracion;
                    System.out.println(" Numero   total de llamadas es ---> "+  numerodellamadas + " Llamadas");
                    System.out.println(" Costo    total de llamadas es ---> "+  costollamadatotal +" pesos ");
                    System.out.println(" Duracion total de llamadas es ---> "+  numeroduracion+    " Minutos");
                    System.out.println(" Costo Promedio por minuto  es ---> " + promedio );

                    break;


                case 4:
                    //Reiniciar
                    linea1.setCostoLlamada(0);
                    linea1.setNumeroLlamadas(0);
                    linea1.setNumeroMinutos(0);
                    linea2.setCostoLlamada(0);
                    linea2.setNumeroLlamadas(0);
                    linea2.setNumeroMinutos(0);
                    linea3.setCostoLlamada(0);
                    linea3.setNumeroLlamadas(0);
                    linea3.setNumeroMinutos(0);
                    System.out.println("Reiniciado con exito !!");

                    break;

                case 5 :

                    System.out.println("Gracias por visitarnos que tenga un excelente dia");
                    salir=true;
                    break;

                default:
                    System.out.println("Opcion invalida intente nuevamente ");




            }















        }







    }
}