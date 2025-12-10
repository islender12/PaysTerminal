## **Terminal de Pagos**

>Práctica en Java relacionada con el ambiente de mi actual Trabajo (Banco),
Simularemos el funcionamiento de un Terminal de Pagos o Punto de Venta.

### **Requerimiento**

>Desarrollar un simulador de un dispositivo POS, que procesa pagos de tarjetas de crédito
 
>Las tarjetas de crédito guardan el nombre de la entidad financiera a la que pertenecen
>(Solo Visa y Mastercard), nombre de la entidad bancaria, número de tarjeta, saldo disponible  
>asi como los datos del titular (RIF, Nombre, apellido, teléfono y Correo).  
>Cada vez que se cree una nueva tarjeta, deberán indicarse dichos datos.
  
> A la hora de abonar, el Terminal de Pago, recibirá la tarjeta con la que desea realizarse
> el pago junto con el monto a abonar y la cantidad de cuotas (1 a 6).  
  
> Si el pago es en 1 cuota, no se genera ningún recargo, de lo contrario, 
> el monto se incrementará en un 3% por cada cuota > 1   
> Ejemplo: Pagar en 4 cuotas representará un 9% de incremento

  
> El terminal de pagos, debe chequear que la tarjeta tenga saldo suficiente
> para poder efectuar el pago junto con el recargo, si hubiese.  
> En caso de éxito, debe generar y retornar un ticket donde conste los siguientes datos:
> - Nombre y Apellido del Cliente
> - Monto Total a Pagar
> - Monto de cada cuota
>   
> Si la Operación no tuvo éxito retornar el código de error correspondiente
> 
> - Código 51: Saldo Insuficiente 
> - Código 65: Supera el límite de Crédito
> - Código 57: Transacción no Permitida (tarjeta)
> - Código 58: Transacción no Permitida (Terminal)
> - Código 06: Otro Error (No puede identificarse)


### **Desarrollo**

> Desarrollar, en la clase PaysTerminal, el metodo efectuarPago(), cuyos parámetros
> lógica y valor de retorno deben deducirse según lo enunciado. 
> Desarrollar también los métodos derivados que puedan surgir.
> 
> Desarrollar el metodo main del proyecto y generar las instancias necesarias para 
> poder efectuar un pago de 10000 Bolivares en 5 Cuotas, 
> usando una tarjeta de Crédito con saldo disponible de 15000 Bolivares.


