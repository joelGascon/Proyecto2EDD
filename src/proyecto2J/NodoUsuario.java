/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto2J;




public class NodoUsuario {
    private String nombreUsuario;
    private String tipoPrioridad;
    private NodoDocumento primerDocumento;
    private NodoUsuario siguienteUsuario;
    
    public NodoUsuario(String u, String p){
        this.nombreUsuario = u;
        this.tipoPrioridad = p;
        this.primerDocumento = null;
        
    }


    /**
     * @return the username
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param username the username to set
     */
    public void setNombreUsuario(String username) {
        this.nombreUsuario = username;
    }

    /**
     * @return the priority
     */
    public String getTipoPrioridad() {
        return tipoPrioridad;
    }

    /**
     * @param priority the priority to set
     */
    public void setTipoPrioridad(String priority) {
        this.tipoPrioridad = priority;
    }

    /**
     * @return the fDocmuent
     */
    public NodoDocumento getPrimerDocumento() {
        return primerDocumento;
    }

    /**
     * @param fDocmuent the fDocmuent to set
     */
    public void setPrimerDocumento(NodoDocumento fDocmuent) {
        this.primerDocumento = fDocmuent;
    }

    /**
     * @return the next
     */
    public NodoUsuario getSiguienteUsuario() {
        return siguienteUsuario;
    }

    /**
     * @param next the next to set
     */
    public void setSiguienteUsuario(NodoUsuario next) {
        this.siguienteUsuario = next;
    }
    
    public void añadirUsuario(NodoUsuario user){
        NodoUsuario us = this;
        while(us.getSiguienteUsuario()!= null){
                us = us.getSiguienteUsuario();
            }
        us.setSiguienteUsuario(user);
    }
    public void añadirDocumento(String t, int s, String y, int c){
        NodoDocumento aux =  new NodoDocumento(t,s,y,c);
        if(this.getPrimerDocumento()==null){
            this.setPrimerDocumento(aux);
        }else{
            NodoDocumento doc = this.getPrimerDocumento();
            while(doc.getSiguienteDoc()!= null){
                doc = doc.getSiguienteDoc();
            }
            doc.setSiguienteDoc(aux);
        }
                
    }
    
    public void enviarAimprimir(NodoDocumento doc, MonticuloBinario printer){
        printer.añadir(doc);
        System.out.println("AÑADIDO EXITOSAMENTE A LA COLA DE IMPRESIÓN");
    }
    
    public String mostrarDocumentos(){
        String docs = "";
        NodoDocumento doc = this.getPrimerDocumento();
        while(doc != null){
            String send = "";
            if(doc.estaEnCola()){
                    send = "En espera";
                }
                docs += "---> " + doc.getTitulo() + "."+doc.getTipo() + " " + send + "\n";
                doc = doc.getSiguienteDoc();
            }
        return docs;
    }
    
    public String mostrar(String users){
        NodoUsuario us = this;
        while(us!= null){
            users += us.getNombreUsuario() + "-----" + us.getTipoPrioridad() + "\n";
            us = us.getSiguienteUsuario();
        }
        return users;
    }
}
