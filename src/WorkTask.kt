class WorkTask(
    // Attributes for object.
    name: String = "",
    description: String = "",
    dueDate: String = "",
    private var priority: String = "",
    private var peopleInvolved: MutableList<String> = mutableListOf()
): Task(name, description, dueDate) {

    // Override the setValues function to include priority and people involved.
    override fun setValues() {
        super.setValues()
        print("What is the priority? (Out of ten): ")
        priority = readln()
        var person = ""
        println("Who is involved? (type 'q' to quit) ")
        var count = 1

        // Add people involved to a list of people.
        while (person != "q") {
            print("$count. ")
            person = readln()
            if (person != "q") {
                peopleInvolved.add(person)
            }
            count++
        }
    }

    // Override display task function to show priority and people involved.
    override fun displayTask() {
        super.displayTask()
        println("Priority: $priority")
        println("People involved:")
        for (i in peopleInvolved.indices) {
            println("${i+1}. ${peopleInvolved[i]}")
        }
    }


    // Override the task to string function to match the attributes of Work class.
    override fun taskToString(): String {
        return "$name|$description|$dueDate|$priority|$peopleInvolved|"

    }
}