package jcalculador;

import java.util.ArrayList;

/**
 *
 * @author KevinPC
 */

public class Operaciones {
    private String numero1 = "";
    private String numero2 = "";
    private String signo = "";
    private Double resultado = 0.0;
    private String respuesta = "";
    private ArrayList<String> memoriaNumeros = new ArrayList<>();
    private Double promedio;
    
    public Operaciones(){
    }

    public String getNumero1() {
        return numero1;
    }

    public String getNumero2() {
        return numero2;
    }

    public String getSigno() {
        return signo;
    }

    public String getRespuesta() {
        return respuesta;
    }
    
    public void setSigno(String signo) {
        this.signo = signo;
    }

    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }
    
    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }

    public void setResultado(Double numero1) {
        this.resultado = numero1;
    }

    public ArrayList<String> getMemoriaNumeros() {
        return memoriaNumeros;
    }

    public void setMemoriaNumeros(ArrayList<String> memoriaNumeros) {
        this.memoriaNumeros = memoriaNumeros;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }
    
    
    
    
    public String resultadoOperacion(){
        switch(signo) {
            case "+":
                //System.out.println(resultado);
                //System.out.println(numero1);
                resultado = Double.parseDouble(numero1)+Double.parseDouble(numero2);
                //System.out.println(resultado);
                break;
            case "-":
                resultado = Double.parseDouble(numero1)-Double.parseDouble(numero2);
                //System.out.println(resultado);
                break;
            case "*":
                resultado = Double.parseDouble(numero1)*Double.parseDouble(numero2);
                //System.out.println(resultado);
                break;
            case "/":
                resultado = Double.parseDouble(numero1)/Double.parseDouble(numero2);
                //System.out.println(resultado);
                break;
        }
        respuesta = resultado.toString();
        setNumero1(respuesta);
        return respuesta;
    }
    
    public double promNumeros(){
        double sumas = 0;
        for (int i = 0; i < memoriaNumeros.size(); i++) {
            double numero = Double.parseDouble(memoriaNumeros.get(i));
            sumas += numero;
        }
        setPromedio(sumas / memoriaNumeros.size());
        return getPromedio();
    }
    
    public Boolean esPrimo(String numero) {
        Boolean esPrimoActual = true;
        Double numero1 = Double.parseDouble(numero);
        if(numero1<2) {
            esPrimoActual = false;
        } else {
            for(int x=2; x*x<=numero1; x++) {
                if( numero1%x==0 ){
                    esPrimoActual = false;
                    break;
                }
            }
        }
        return esPrimoActual;
    }
    
    
    public void borrarJuego(){
        this.resultado = 0.0;
        this. numero1 = "";
        this.signo = "";
        this.respuesta = "";
    }

}
