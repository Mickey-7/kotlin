fun main(args: Array<String>) {

//    create blank list of User
    val list = ArrayList<User>()
//    adding Users to list
    list.add(User("Tony","Stark"));
    list.add(User("Tom","Cruise"));
    list.add(User("John","Cena"));
    list.add(User("Ramesh","Fadatare"));

//    create sortedList var to store sorted list
    //it (inside comparedBy) : output -> User
    var sorted = list.sortedWith(compareBy{it.firstName})

//     iterate then print
    for (element in sorted){
        println(element.firstName +" "+element.lastName)
    }
}