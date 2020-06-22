//5 Ways to Iterate Over a List in Kotlin
    //Using forEach() method
    //Using for loop
    //An alternative for cycle utilizes the size of the list
    //Using forEachIndexed() method
    //Using a ListIterator and a while loop

fun main(args: Array<String>) {

    //listOf(element : T) -> output : List<T>
    val fruits = listOf("banana","mango","apple","orange")

    //Using forEach() method
    //.forEach{...} (action : ((String!) -> Unit)!) -> output : Unit
    fruits.forEach { f -> print("$f ") }
    println()

    //Using for loop
    for (f in fruits){
        print("$f ")
    }
    println()

    //An alternative for cycle utilizes the size of the list
    for (i in fruits.indices){
        print(fruits[i]+" ")
    }
    println()

    //Using forEachIndexed() method
    //.forEachIndexed{index, String -> ...} (action :  (Int, String) -> Unit) for Iterable<T> -> output : Unit
    fruits.forEachIndexed { i, s -> println("fruits[$i] = $s") }

    //Using a ListIterator and a while loop
    val it : ListIterator<String> = fruits.listIterator();
    while (it.hasNext()){
        val e = it.next()
        print("$e ")
    }
    println();
}

//output
//banana mango apple orange 
//banana mango apple orange
//banana mango apple orange
//fruits[0] = banana
//fruits[1] = mango
//fruits[2] = apple
//fruits[3] = orange
//banana mango apple orange