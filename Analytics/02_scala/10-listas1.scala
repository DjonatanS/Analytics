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

   println(" ");
   //alter maçã to maca
   frutas = frutas.updated(1, "maca");

   println(" ");

   frutas.foreach(println)
   
   
   println("Tamanho da lista: " + frutas.size);
   println("Tamanho da lista: " + frutas.length);
   println("Primeiro elemento da lista: " + frutas.head);
   println("Último elemento da lista: " + frutas.last);
   println("Lista sem o primeiro elemento: " + frutas.tail);
   println("Lista sem o último elemento: " + frutas.init);
   println("Verifica se a lista está vazia: " + frutas.isEmpty);
   println("Verifica se a lista não está vazia: " + frutas.nonEmpty);
   println("Verifica se a lista contém a string banana: " + frutas.contains("banana"));
   println("Pega o elemento da lista na posição 1: " + frutas.apply(1));
   println("Pega o elemento da lista na posição 1: " + frutas(1));

   
   
   
   }
