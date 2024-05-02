class WorkTask(
    name: String = "",
    description: String = "",
    dueDate: String = "",
    var priority: String = "",
    var peopleInvolved: MutableList<String> = mutableListOf()
): Task(name, description, dueDate) {
    override fun setValues() {
        super.setValues()
        print("What is the priority? (Out of ten): ")
        priority = readln()
        var person = ""
        println("Who is involved? (type 'q' to quit) ")
        var count = 1
        while (person != "q") {
            print("$count. ")
            person = readln()
            if (person != "q") {
                peopleInvolved.add(person)
            }
            count++
        }
    }

    override fun displayTask() {
        super.displayTask()
        println("Priority: $priority")
        println("People involved:")
        for (i in peopleInvolved.indices) {
            println("${i+1}. ${peopleInvolved[i]}")
        }
    }
}