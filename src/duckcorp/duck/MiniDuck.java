package duckcorp.duck;

import static duckcorp.duck.DuckType.MINI;

/**
 * Canard en plastique miniature.
 *
 * TODO (Ex1) :
 *   - Faites hériter cette classe de Duck
 *   - Implémentez le constructeur MiniDuck(int qualityScore) avec un appel à super
 *   - Implémentez getBasePrice() et describe()
 * @author Roussille Philippe <roussille@3il.fr>
 */
public class MiniDuck extends Duck{

    public static final double BASE_PRICE = 12.0;

    /**
     * Constructeur de MiniDuck
     * @param qualityScore, Indice de qualité
     */
    public MiniDuck(int qualityScore){
        super(MINI,qualityScore);
    }

    /**
     * @return le prix de base du canard
     */
    @Override
    public double getBasePrice() {
        return BASE_PRICE;
    }

    /**
     * @return le type de canards
     */
    @Override
    public String describe() {
        return " Canard " + MINI.getLabel();
    }
}
