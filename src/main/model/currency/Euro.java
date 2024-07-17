package src.main.model.currency;

import static src.main.constants.Constant.SYMBOL_EUR;

/**
 * Clase que representa la divisa Euro, heredando de la clase Currency.
 */
public class Euro extends Currency {

    private final char currencySymbol;

    /**
     * Constructor que inicializa el nombre y el valor en dólares estadounidenses (USD),
     * y asigna el símbolo de la divisa Euro.
     *
     * @param name       El nombre de la divisa
     * @param valueInUSD El valor de la divisa en dólares estadounidenses (USD)
     */
    public Euro(String name, double valueInUSD) {
        super(name, valueInUSD);
        this.currencySymbol = SYMBOL_EUR;
    }

    /**
     * Obtiene el símbolo de la divisa Euro.
     * @return el símbolo de la divisa Euro
     */
    public char getCurrencySymbol() {
        return currencySymbol;
    }
}
