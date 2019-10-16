package grupo5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author Dell
 */
@Named(value = "pruebaManagedBeans")
@ViewScoped
public class pruebaManagedBeans implements Serializable{

    @EJB
    private FiscalizadorFacadeLocal fiscalizadorFacadeLocal;
    
    private Fiscalizador fiscalizador;
    /**
     * Creates a new instance of pruebaManagedBeans
     */
    public pruebaManagedBeans() {
    }

    @PostConstruct
    public void init(){
    fiscalizador = new Fiscalizador();
    }
    public Fiscalizador getFiscalizador() {
        return fiscalizador;
    }

    public void setFiscalizador(Fiscalizador fiscalizador) {
        this.fiscalizador = fiscalizador;
    }
    
    
    public void buscar(){
    fiscalizador = fiscalizadorFacadeLocal.find(fiscalizador.getConcedula2());
    }
    
    public void crear(){
    fiscalizadorFacadeLocal.create(fiscalizador);
    }
}
