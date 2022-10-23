def main(args: Array[String]) = {
    var valores: Array[Any] = Array(1, "banana", 2.0);


    valores = valores.updated(1, "maca");

    valores.foreach(println);


    



}