// Tratamento de Exceções

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

def main(args: Array[String]) = {
      
      try {
         
         val f = new FileReader("arquivo5.txt")
         
      } catch {
         
         case ex: FileNotFoundException => {
            println("Arquivo nao encontrado")
         }
         
         case ex: IOException => {
            println("IO Exception")
         }
      }
   }





