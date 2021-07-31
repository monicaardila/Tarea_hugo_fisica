package hugo;
import java.util.ArrayList;

public class logica {
    static double media = 0;
    static double suma = 0;
    static double suma1 = 0;
    static double raiz = 0;

    static ArrayList<Double> li = new ArrayList<Double>();
    static ArrayList<Double> li1 = new ArrayList<Double>();

    public void agregar(double x)                                                          /*metodo y paramtro */ {
        li.add(x);
    }

    public String Media() {
        for (int i = 0; i < li.size(); i++) {
            suma += li.get(i);
        }
        double media = suma / li.size();
        return "la suma es " + suma + " la media es " + media;

    }
    public String Desviacion() {     /*metodo para calcular la desviacion estándar*/

        for (int i = 0; i < li.size(); i++) {
            double resta = Math.abs(li.get(i) - media);
            li1.add(Math.pow(resta, 2));    /*li1 es cuadro a la distancia a la media ej (x-x1) pow 2,media es el resultado del metodo media ,li.get(i) es valor del conjunto de datos */
        }
        for (int x = 0; x < li1.size(); x++) {
            suma1 += li1.get(x);
        }

        double dato1=(suma1/(li1.size()));
        raiz=Math.sqrt(dato1);
        return "la suma es " + raiz;
    }
}