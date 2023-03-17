````mermaid
classDiagram

      ITransporte <|.. Bicicleta: implements
            ITransporte <|.. Camion : implements
              ITransporte <|.. Barco : implements
      class ITransporte{
     + Float costoTotal(Integer cp) 
    +Integer tipoEmbalaje (Integer cp,Float dimencionX,Float dimencionY, dimen-cionZ,Float peso)
    }
      <<Interface>>ITransporte
      App "1" *--> "1..*" factorySencilla : association
           class App{
        +objecto transporte :ITransporte()
        +main()
      }
      class factorySencilla
       factorySencilla:  +ITransporte getProducto(TipoTransporte type)
         
      factorySencilla "1"*-->"1..*" ITransporte : association
      class Bicicleta{
      +Float costoTotal(Integer cp)
     + Integer tipoEmbalajae(Integer cp, Float dimencionX, Float dimencionY, Float dimencionZ, Float peso)}
      
      
      class Camion{
     + Float costoTotal(Integer cp) 
     + Integer tipoEmbalajae(Integer cp, Float dimencionX, Float dimencionY, Float dimencionZ, Float peso)} 
    class Barco{
     + Float costoTotal(Integer cp) 
     + Integer tipoEmbalajae(Integer cp, Float dimencionX, Float dimencionY, Float dimencionZ, Float peso)} 
  
      

````
### Proyecto Factory

   > Ejemplo de Factory , en el que vamos a paquetizar el código, para poder reutilizarlo. Y creo un JavaDoc completo.

    Utilizó Intefaz (ITransporte) que implementa varias clases.
    En el FactorySencilla utilizo la static  ITransporte en donde retorna el tipo de transporte.
    Realizó un throws Exception FactorySencilla  en tener el control de posible errores.
    El  la app instancio el objecto  ITransporte Transporte para impletar el tipo de transporte git 


