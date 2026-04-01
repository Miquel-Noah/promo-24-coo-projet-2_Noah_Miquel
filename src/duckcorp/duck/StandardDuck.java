package duckcorp.duck;

import static duckcorp.duck.DuckType.STANDARD;

/**
 * Canard en plastique standard.
 *
 * @author Roussille Philippe <roussille@3il.fr>
 */
public class StandardDuck extends Duck {

    public static final double BASE_PRICE = 25.0;

    public StandardDuck(int qualityScore){
        super(STANDARD, qualityScore);
    }

    @Override
    public double getBasePrice() {
        return BASE_PRICE;
    }

    @Override
    public String describe() {
        return "Canard " + STANDARD.getLabel();
    }
}
