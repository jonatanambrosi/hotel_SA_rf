/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Cargoservicios;

/**
 *
 * @author Usuario 9
 */
@Stateless
public class CargoserviciosFacade extends AbstractFacade<Cargoservicios> {

    @PersistenceContext(unitName = "com.enlinea_SANANDRES_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CargoserviciosFacade() {
        super(Cargoservicios.class);
    }
    
}
