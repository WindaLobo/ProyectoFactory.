import enums.TipoTransporte;

public class FactorySencilla {
    /**
     *
     * @param type
     * @return
     * @throws Exception
     */
    public static ITransporte getProducto(TipoTransporte type) throws Exception {

        switch (type) {
            case Bicicleta:
                return new Bicicleta();

           case Camion:
                return new Camion();
            case Barco:
                return new Barco();

            default:
                return null;
        }
    }
}