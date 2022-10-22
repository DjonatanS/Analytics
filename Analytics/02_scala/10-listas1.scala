// Listas

// Listas em Scala são objetos imutáveis e devem ter dados do mesmo tipo

def main(args: Array[String]) = {

   // Cria uma lista de strings
   var frutas: List[String] = List("banana", "maçã", "laranja");

   // Cria uma lista de inteiros
   val numeros: List[Int] = List(1, 2, 3);

   // Cria uma variável escalar
   val nums = Nil;

   // Cria uma lista de strings com inferência de tipo
   val frutas2 = List("banana", "maca", "laranja");

   //Recendo qualquer tipo de dado:
   val mix: List[Any] = List(1, "banana", 2.0);

   frutas.foreach(println);
   //alter maçã to maca
   frutas = frutas.updated(1, "maca");
   
   frutas.foreach(println);



   


}
