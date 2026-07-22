package actividad6.pkg4;

public class ProfesorTitular extends Profesor {
    int años = 0;
    @Override
    protected void imprimir(){
        System.out.println("Es un profesor titular");
    }
    @Override
    protected void imprimirAños(){
        System.out.println("Años = " + años);
    }
}
