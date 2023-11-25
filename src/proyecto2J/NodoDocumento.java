/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2J;


public class NodoDocumento {
    private NodoDocumento siguienteDoc;
    private String titulo
;    private int tamano;
    private String tipo;
    private int tiempo_impresion;
    private boolean enCola;
    
    public NodoDocumento(String t, int s, String y, int c){
        this.titulo = t;
        this.tamano = s;
        this.tipo = y;

        this.tiempo_impresion = c;
        this.enCola = false;
    }

    /**
     * @return the next
     */
    public NodoDocumento getSiguienteDoc() {
        return siguienteDoc;
    }

    /**
     * @param next the next to set
     */
    public void setSiguienteDoc(NodoDocumento next) {
        this.siguienteDoc = next;
    }

    /**
     * @return the title
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param title the title to set
     */
    public void setTitulo(String title) {
        this.titulo = title;
    }

    /**
     * @return the size
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param size the size to set
     */
    public void setTamano(int size) {
        this.tamano = size;
    }

    /**
     * @return the type
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param type the type to set
     */
    public void setTipo(String type) {
        this.tipo = type;
    }

    /**
     * @return the left
     */


    /**
     * @return the time
     */
    public int getTiempo_impresion() {
        return tiempo_impresion;
    }

    /**
     * @param time the time to set
     */
    public void setTiempo_impresion(int time) {
        this.tiempo_impresion = time;
    }

    /**
     * @return the enviado
     */
    public boolean estaEnCola() {
        return enCola;
    }

    /**
     * @param enviado the enviado to set
     */
    public void setEnCola(boolean enviado) {
        this.enCola = enviado;
    }
    
    
}
