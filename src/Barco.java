import enums.TipoEmbalaje;

public class Barco  implements ITransporte{
    /**
     *
     * @param cp
     * @return precio
     */
    @Override
    public Float costoTotal(Integer cp) {
        Float precio;
        int  codigo = 37382;
        precio = (float) ((codigo - cp) * 0.1);
        if (cp >= 36791 || cp < 34908) {
            System.out.println("Fuera de la zona ");
        }
        return precio;
    }

    /**
     *
     * @param cp
     * @param dimencionX
     * @param dimencionY
     * @param dimencionZ
     * @param peso
     * @return el tipo de enbalage
     */


    @Override
    public Integer tipoEmbalajae(Integer cp, Float dimencionX, Float dimencionY, Float dimencionZ, Float peso) {
        float totalDimencion = dimencionX + dimencionY + dimencionZ;
        if (totalDimencion <= 30 && peso <= 10) {
            return TipoEmbalaje.CajaCarton.ordinal();

        } else if (totalDimencion <= 250 && peso <= 100) {
            return TipoEmbalaje.Pallet.ordinal();

        } else {
            return TipoEmbalaje.CajaMadera.ordinal();
        }
    }

}
