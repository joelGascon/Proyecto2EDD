/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2J;

import javax.swing.JOptionPane;


public class MonticuloBinario {
    private NodoDocumento[] monticuloBinario;
    private int tamano;
    private int capacidad;

    public MonticuloBinario() {
        this.capacidad = 100;
        this.tamano = 0;
        this.monticuloBinario = new NodoDocumento[capacidad];
    }

    /**
     * @return the monticuloBinario
     */
    public NodoDocumento[] getMonticuloBinario() {
        return monticuloBinario;
    }

    /**
     * @param monticuloBinario the monticuloBinario to set
     */
    public void setMonticuloBinario(NodoDocumento[] monticuloBinario) {
        this.monticuloBinario = monticuloBinario;
    }

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

public void añadir(NodoDocumento doc) {
    if (getTamano() == getCapacidad()) {
        JOptionPane.showMessageDialog(null, "NÚMERO MÁXIMO DE DOCUMENTOS EN LA COLA");
    }else{
            setTamano(getTamano() + 1);
    int currentIndex = getTamano() - 1;
            getMonticuloBinario()[currentIndex] = doc;

    while (currentIndex != 0 && getMonticuloBinario()[indicePadre(currentIndex)].getTiempo_impresion() > getMonticuloBinario()[currentIndex].getTiempo_impresion()) {
        intercambiar(currentIndex, indicePadre(currentIndex));
        currentIndex = indicePadre(currentIndex);
    }
}}


public void heapify(int index) {
    int smallest = index;
    int leftChild = indiceIzquierdo(index);
    int rightChild = indiceDerecho(index);

    if (leftChild < getTamano() && getMonticuloBinario()[leftChild].getTiempo_impresion() < getMonticuloBinario()[smallest].getTiempo_impresion()) {
        smallest = leftChild;
    }

    if (rightChild < getTamano() && getMonticuloBinario()[rightChild].getTiempo_impresion() < getMonticuloBinario()[smallest].getTiempo_impresion()) {
        smallest = rightChild;
    }

    if (smallest != index) {
        intercambiar(index, smallest);
        heapify(smallest);
    }
}
 public void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        NodoDocumento currentDocument = getMonticuloBinario()[index];

        while (index > 0 && getMonticuloBinario()[parentIndex].getTiempo_impresion() > currentDocument.getTiempo_impresion()) {
            getMonticuloBinario()[index] = getMonticuloBinario()[parentIndex];
            index = parentIndex;
            parentIndex = (index - 1) / 2;
        }

        getMonticuloBinario()[index] = currentDocument;
    }

private int indicePadre(int index) {
    return (index - 1) / 2;
}

public int indiceIzquierdo(int index) {
    return (2 * index) + 1;
}

public int indiceDerecho(int index) {
    return (2 * index) + 2;
}

private void intercambiar(int index1, int index2) {
    NodoDocumento temp = getMonticuloBinario()[index1];
        getMonticuloBinario()[index1] = getMonticuloBinario()[index2];
        getMonticuloBinario()[index2] = temp;
}

public NodoDocumento eliminarMin() {
    if (getTamano() == 0) {
        return null;
    }

    if (getTamano() == 1) {
            setTamano(getTamano() - 1);
        return getMonticuloBinario()[0];
    }

    NodoDocumento root = getMonticuloBinario()[0];
        getMonticuloBinario()[0] = getMonticuloBinario()[getTamano() - 1];
        setTamano(getTamano() - 1);
    heapify(0);

    return root;
}


public String print(String binaryPrint){
    NodoDocumento aux = this.eliminarMin();
    if(aux!= null){
        binaryPrint += aux.getTitulo() + "." + aux.getTipo()+ "\n";
        binaryPrint = print(binaryPrint);
        this.añadir(aux);}
    return binaryPrint;
}



}


