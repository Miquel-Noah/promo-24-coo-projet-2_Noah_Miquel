package duckcorp.duck;

import static duckcorp.duck.DuckType.STANDARD;

/**
 * Canard en plastique standard.
 *
 * @author Roussille Philippe <roussille@3il.fr>
 */
public class StandardDuck extends Duck {

    public static final double BASE_PRICE = 25.0;

    /**
     * Constructeur de StandardDuck
     * @param qualityScore Indice de qualité
     */
    public StandardDuck(int qualityScore){
        super(STANDARD, qualityScore);
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
        return "Canard " + STANDARD.getLabel();
    }
}
