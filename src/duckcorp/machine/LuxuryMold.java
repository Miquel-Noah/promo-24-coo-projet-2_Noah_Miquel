package duckcorp.machine;

import duckcorp.duck.Duck;
import duckcorp.duck.LuxuryDuck;
import duckcorp.duck.StandardDuck;

import static duckcorp.duck.DuckType.LUXURY;

/**
 * Moule produisant des Canards de Luxe.
 *
 * TODO (Ex2) :
 *   - Faites hériter cette classe de Machine
 *   - Implémentez le constructeur sans paramètre avec un appel à super
 *   - Implémentez produceDuck(), getPurchaseCost(), getName()
 * @author Roussille Philippe <roussille@3il.fr>
 */
public class LuxuryMold extends Machine {

    public static final int PURCHASE_COST    = 800;
    public static final int CAPACITY         = 2;
    public static final int MAINTENANCE_COST = 80;

    public LuxuryMold(){
        super(LUXURY,CAPACITY,MAINTENANCE_COST);
    }

    @Override
    public Duck produceDuck() {
        return new LuxuryDuck(super.computeQuality());
    }

    @Override
    public int getPurchaseCost() {
        return PURCHASE_COST;
    }

    @Override
    public String getName() {
        return "Moule de luxe";
    }
}
