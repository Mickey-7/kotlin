//Kotlin List stores elements in a specified order and provides indexed access to them.
// Indices start from zero – the index of the first element – and go to lastIndex which is the (list.size - 1).
//  Key points of List:
//      Methods in List interface supports only read-only access to the list;
//          read/write access is supported through the MutableList interface.
//      Kotlin distinguishes between read-only and mutable lists.
//          Read-only lists are created with listOf() method and mutable lists with mutableListOf() method.
//      In Kotlin, the default implementation of List is ArrayList \
//          which you can think of as a resizable array.
//      MutableList is a List with list-specific write operations, for example,
//          to add or remove an element at a specific position.

fun main(args: Array<String>) {

    //The example creates a new list of words with listOf().
    // The size of the list is determined with the size attribute.
    //listOf(element : T) -> output : List<T>
    val  words = listOf("banana","cup","dog","spectacles")
    println("the list contains ${words.size} elements")
    //output
    //the list contains 4 elements
    //
    //Process finished with exit code 0

    //We can create a simple read-only List using method listOf()
    //and read-write MutableList using mutableListOf():
    val theList = listOf("one","two","three");
    println(theList);
    //mutableListOf(vararg elements : T) -> output : MutableList<T>
    val  theMutableList = mutableListOf("one", "two"," three");
    println(theMutableList);
    //output
    //[one, two, three]
    //[one, two,  three]


    //The example creates a list of numbers and computes some statistics.
    val nums = listOf(1, 15, 13, 8, 1, 19, 6, 12)
    val  len = nums.count();
    val max = nums.max();
    val min = nums.min();
    val sum = nums.sum();
    val avg = nums.average();

    val msg =   """
                max : $max, min : $min
                count : $len, sum : $sum
                avg : $avg
                """

    println(msg.trimIndent())
    //output
    //max : 19, min : 1
    //count : 8, sum : 75
    //avg : 9.375



    //Each element of a list has an index.
    // Kotlin list indexes start from zero. The last element has len-1 index.
    val words1 = listOf("pen", "cup", "dog", "person",
        "cement", "coal", "spectacles", "cup", "bread")
    val w1 = words1[0]
    println(w1)
    val w2 = words1[0]
    println(w2)
    val i1 = words1.indexOf("cup")
    println("The first index of cup is $i1")
    val i2 = words1.lastIndexOf("cup")
    println("The last index of cup is $i2")
    val i3 = words1.lastIndex
    println("The last index of the list is $i3")
    //output
    //pen
    //pen
    //The first index of cup is 1
    //The last index of cup is 7
    //The last index of the list is 8


    //The count() method returns the number of elements in the list.
    val nums1 = listOf(12, 1,2,5,4,2)
    val len1 = nums1.count()
    println("There are $len1 elements")
    val size = nums1.size
    println("The size of the list is $size")
    val n1 = nums1.count { e -> e < 0 }
    println("There are $n1 negative values")
    val n2 = nums1.count { e -> e % 2 == 0 }
    println("There are $n2 even values")
    //output
    //There are 6 elements
    //The size of the list is 6
    //There are 0 negative values
    //There are 4 even values




    //The following example creates a list of fruits.
    // We get the first and the last elements of the list
    val fruits = listOf("banana", "mango", "apple", "orange","atis","oppa")
    val  w3 = fruits.first();
    println(w3)
    val  w4 = fruits.last();
    println(w4)
    val  w5 = fruits.findLast { w -> w.startsWith("a") }
    println(w5)
    val  w6 = fruits.first { w -> w.startsWith("o") }
    println(w6)
    //output
    //banana
    //oppa
    //atis
    //orange



    //The example sorts list values in ascending and descending order, reverses list elements.
    val numsSort = listOf(10, 5, 3, 4, 2, 1, 11, 14, 12)
    val sortAsc = numsSort.sorted()
    println("sortAsc -> $sortAsc")
    val sortDesc = numsSort.sortedDescending()
    println("sortDesc -> $sortDesc")
    val revNums = numsSort.reversed()
    println("revNums -> $revNums")
    //output
    //sortAsc -> [1, 2, 3, 4, 5, 10, 11, 12, 14]
    //sortDesc -> [14, 12, 11, 10, 5, 4, 3, 2, 1]
    //revNums -> [12, 14, 11, 1, 2, 4, 3, 5, 10]


    //This example shows how to use contains() method to check if a list contains the specified elements.
    val numsContains = listOf(1, 2, 3, 7, 6, 5, 4)

    val r = numsContains.contains(4)

    if (r) {
        println("The list contains 4")
    } else {
        println("The list does not contain 4")
    }
    val r2 = numsContains.containsAll(listOf(1, 6))

    if (r2) {
        println("The list contains 1 and 6")
    } else {
        println("The list does not contain 1 and 6")
    }
    //output
    //The list contains 4
    //The list contains 1 and 6



    //A slice is a portion of a list. Slices can be created with the slice() method.
    // The method takes indexes of the elements to be picked up.
        val numSlice = listOf(1, 2, 3, 4, 5, 6)
        //             listOf(0, 1, 2, 3, 4, 5)

        val nums2 = numSlice.slice(1..3)
        println(nums2)

        val nums3 = numSlice.slice(listOf(3, 4, 5))
        println(nums3)
    //output
    //[2, 3, 4]
    //[4, 5, 6]


    //Kotlin List filter Filtering is an operation where only elements that meet certain criteria pass through.
    val fruitsFilter = listOf("banana", "mango", "apple", "orange")

    val fruits1 = fruitsFilter.filter { e -> e.length == 5 }
    fruits1.forEach { e -> print("$e ") }
    println()

    val fruits2 = fruitsFilter.filterNot { e -> e.length == 5 }
    fruits2.forEach { e -> print("$e ") }
    println()
    //output
    //mango apple
    //banana orange


    //The any() method returns true if at least one element matches the given predicate function.
    val numsAny = listOf(1,2,3,4,5,6,7,-1,-2)
    val rAny = numsAny.any { e -> e > 10 }
    if (rAny) {
        println("There is a value greater than ten")
    } else {
        println("There is no value greater than ten")
    }

    val r2Any = numsAny.any { e -> e < 0 }
    if (r2Any) {
        println("There is a negative value")
    } else {
        println("There is no negative value")
    }
    //output
    //There is no value greater than ten
    //There is a negative value



    //The all() returns true if all elements satisfy the given predicate function.



    //With the drop operations, we exclude some elements from the list.
    val numsDrop = listOf(1,2,-1,-2,3,4,5,6,7,8 ,9 ,10)
    //             listOf(0,1,2,3,4,5,6,7,8,9,10,11,12)
    val nums2Drop = numsDrop.drop(3)
    println(nums2Drop)
    val nums3Drop = numsDrop.dropLast(3)
    println(nums3Drop)
    val nums4Drop = numsDrop.sorted().dropWhile { e -> e < 0 }
    println(nums4Drop)
    val nums5Drop = numsDrop.sorted().dropLastWhile { e -> e > 0 }
    println(nums5Drop)
    //output
    //[-2, 3, 4, 5, 6, 7, 8, 9, 10]
    //[1, 2, -1, -2, 3, 4, 5, 6, 7]
    //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    //[-2, -1]

    //The setOf() method creates a new read-only set in Kotlin. A set cannot contain duplicate elements.


}