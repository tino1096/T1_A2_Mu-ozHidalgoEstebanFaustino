import scala.math._
import scala.io.StdIn._

object RaizCuadrada {
  def main(args: Array[String]): Unit = {
   
    println("Ingrese un numero:")
   
    var numero = readInt()
    var estimacion = numero / 2
    var estimacion2 = 0.0
    estimacion2 = estimacion
    var raiz = 0.0
    var promedio = 0.0
    var promedio2 = 0.0
    var i = 0;
    var iteracion = 0;
    
    while (i != 1) {
      iteracion = iteracion + 1;
      promedio2 = promedio
      raiz = numero / estimacion2
      promedio = (raiz + estimacion2) / 2
      estimacion2 = promedio
      if (promedio2 == promedio) {
        i = 1
      }
    }
    println(raiz, iteracion)
  }
}