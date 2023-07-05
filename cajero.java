/**
  * NAME:
  * DATE:
  * FILE:
  * COMMENTS:
  */
import java.util.Scanner;

public class cajero 
{
   public static void main(String[] args)
   {
      // declare variables
      String raptor_prompt_variable_zzyz = null;
      int moneda10 = 0;
      int moneda5 = 0;
      int horas = 0;
      int pago = 0;
      int moneda1 = 0;
      int moneda2 = 0;
      int cambio = 0;
      int opcion = 0;
      int costo = 0;
      Scanner lee =new Scanner(System.in);
      
      costo = 0;
      horas = 0;
     System.out.println("¿Cuantas horas utilizaste el estacionamiento?");
      horas = lee.nextInt();
      costo = horas * 17;
      if (costo > 999)
      {
         costo = 999;
      }
     /* else
      {
      }*/
      pago = 0;
      opcion = 0;
      while	(!(pago >= costo))
      {
         System.out.println("Debes: $" + (costo - pago) + ".Elige la opción para tu forma de pago:1)$100, 2)$50, 3)$20, 4)$10, 5)$5, 6)$2, 7)$1");
         opcion = lee.nextInt();
         if (opcion == 1)
         {
            pago = pago + 100;
         }
         else
         {
            if (opcion == 2)
            {
               pago = pago + 50;
            }
            else
            {
               if (opcion == 3)
               {
                  pago = pago + 20;
               }
               else
               {
                  if (opcion == 4)
                  {
                     pago = pago + 10;
                  }
                  else
                  {
                     if (opcion == 5)
                     {
                        pago = pago + 5;
                     }
                     else
                     {
                        if (opcion == 6)
                        {
                           pago = pago + 2;
                        }
                        else
                        {
                           if (opcion == 7)
                           {
                              pago = pago + 1;
                           }
                           else
                           {
                              System.out.println("opcion incorrecta");
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      cambio = 0;
      moneda10 = 0;
      moneda5 = 0;
      moneda2 = 0;
      moneda1 = 0;
      cambio = pago - costo;
      if (cambio > 0)
      {
         moneda10 = cambio / 10;
         cambio = cambio % 10;
      }
      else
      {
      }
      if (cambio > 0)
      {
         moneda5 = cambio / 5;
         cambio = cambio % 5;
      }
      else
      {
      }
      if (cambio > 0)
      {
         moneda2 = cambio / 2;
         cambio = cambio % 2;
      }
      else
      {
      }
      if (cambio > 0)
      {
         moneda1 = cambio / 1;
         cambio = cambio % 1;
      }
      else
      {
      }
      System.out.println("cambio: " + moneda10 + "moneda(s) de10" + moneda5 + "moneda(s) de 5" +  moneda2 + "moneda(s) de 2" + moneda1 + "moneda(s) de1");
   } // close main
} // close cajero
