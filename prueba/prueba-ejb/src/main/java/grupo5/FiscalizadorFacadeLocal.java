/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo5;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Dell
 */
@Local
public interface FiscalizadorFacadeLocal {

    void create(Fiscalizador fiscalizador);

    void edit(Fiscalizador fiscalizador);

    void remove(Fiscalizador fiscalizador);

    Fiscalizador find(Object id);

    List<Fiscalizador> findAll();

    List<Fiscalizador> findRange(int[] range);

    int count();
    
}
