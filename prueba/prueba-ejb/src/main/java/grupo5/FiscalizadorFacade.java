/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo5;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Dell
 */
@Stateless
public class FiscalizadorFacade extends AbstractFacade<Fiscalizador> implements FiscalizadorFacadeLocal {

    @PersistenceContext(unitName = "grupo5_prueba-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FiscalizadorFacade() {
        super(Fiscalizador.class);
    }
    
}
