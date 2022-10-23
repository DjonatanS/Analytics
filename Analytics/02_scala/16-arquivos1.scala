// Manipulação de Arquivos

// Criação e Gravação de Arquivo

import java.io.File
import java.io.PrintWriter

def main(args: Array[String]) = {

   // Cria o arquivo
   val arquivo = new File("linguagens.txt" ) 
   
   // Passando a referência do arquivo
   val print_Writer = new PrintWriter(arquivo) 
  
   // Gravando dados no arquivo    
   print_Writer.write("Realizando a gravação de dados no arquivo com Scala") 
  
   // Fecha o objeto 
   print_Writer.close()   



}





