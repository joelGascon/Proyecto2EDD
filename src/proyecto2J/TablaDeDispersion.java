/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2J;

import static java.awt.image.ImageObserver.HEIGHT;
import java.util.Arrays;
import javax.swing.JOptionPane;


public class TablaDeDispersion {
    private NodoUsuario[] registro;
    private int tamano;
    private int total;
    
    public TablaDeDispersion(){
        this.registro = new NodoUsuario[999];
        this.tamano = 999;
        total = 0;
        for (int i = 0; i < tamano; i++) {
            this.registro[i] = null;
        }
    }
        /**
     * @return the users
     */
    public NodoUsuario[] getRegistro() {
        return registro;
    }

    /**
     * @param users the users to set
     */
    public void setRegistro(NodoUsuario[] users) {
        this.registro = users;
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
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }
    
    
    public int hashFunction(String username){
        int n = 7;
        int index = 0;
        for (int i = 0; i < username.length(); i++) {      
            index = n*index + username.charAt(i); 
            if (index< 0){
                index*=-1;
            }
        }
        return index%998;
    }
    
    
    public void insertar_NodoUsuario(NodoUsuario user){
        int index = hashFunction(user.getNombreUsuario());
        if(this.getRegistro()[index]== null){
            this.getRegistro()[index] = user;
            setTotal(getTotal() + 1);
        }else{
            if (getTotal() != getTamano()){
                this.getRegistro()[index].añadirUsuario(user);
            
            }
        }
    }
    public void crearUsuario(String username, String priority){
        NodoUsuario user = new NodoUsuario(username, priority);
        int index = hashFunction(username);
        if(this.getRegistro()[index]== null){
            this.getRegistro()[index] = user;
            setTotal(getTotal() + 1);
        }else{
            if (getTotal() != getTamano()){
                this.getRegistro()[index].añadirUsuario(user);
            
            }
        }
    }
    
    public NodoUsuario buscarUsuario(String username){
        int hash = hashFunction(username);
        if(this.getRegistro()[hash]!= null && this.getRegistro()[hash].getNombreUsuario().equals(username)){
            return this.getRegistro()[hash];
        }else{
            NodoUsuario us = this.getRegistro()[hash];
            while(us != null && !us.getNombreUsuario().equals(username)){
                us = us.getSiguienteUsuario();
            }
            return us;
        }
        
    }
    
    public void imprimir_usuarios(){
        for (int i = 0; i < getTamano(); i++) {
            if(this.getRegistro()[i] != null){
                this.getRegistro()[i].mostrar("");
            }
        }
    }
    
    public void eliminar_usuario(String username){
        int hash = hashFunction(username);
        if(this.getRegistro()[hash] != null && this.getRegistro()[hash].getNombreUsuario().equals(username)){
            this.getRegistro()[hash] = new NodoUsuario("", "");
        }else{
            NodoUsuario us = this.getRegistro()[hash];
            while(us.getSiguienteUsuario() != null && !us.getSiguienteUsuario().getNombreUsuario().equals(username)){
                us = us.getSiguienteUsuario();
            }
            if(us!=null){
                us.setSiguienteUsuario(us.getSiguienteUsuario().getSiguienteUsuario());
            }
        }
        

    }
    
    public boolean eliminar_documento(NodoUsuario usuario, String title){
        
        if(usuario!= null){
            NodoDocumento doc = usuario.getPrimerDocumento();
            if(doc != null && doc.getTitulo().equals(title)){
                usuario.setPrimerDocumento(usuario.getPrimerDocumento().getSiguienteDoc());
                return true;
            }
            while(doc.getSiguienteDoc() != null && !doc.getSiguienteDoc().getTitulo().equals(title)){
                doc = doc.getSiguienteDoc();
            }
            if(doc!= null && doc.getSiguienteDoc().getTitulo().equals(title)){
                doc.setSiguienteDoc(doc.getSiguienteDoc().getSiguienteDoc());
                return true;
            }else{
                return false;
            }}else{
            return false;
        }
        
    }
    
    public NodoDocumento buscar_documento(String username, String title){
        NodoUsuario user = buscarUsuario(username);
        if (user!= null){
            NodoDocumento doc = user.getPrimerDocumento();
            
            while(doc != null && !doc.getTitulo().equals(title)){
                doc = doc.getSiguienteDoc();
            }
            return doc;
        }
        return null;
    }
    
    public String imprimir_usuarios_textarea(String print){
        for (int i = 0; i < getTamano(); i++) {
            if(getRegistro()[i] != null){
                print = getRegistro()[i].mostrar(print);
                print += getRegistro()[i].mostrarDocumentos();
            }
        }
        return print;
    }


}

