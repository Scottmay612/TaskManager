
class PersonalTask(
    // Attributes for object.
    name: String = "",
    description: String = "",
    dueDate: String = "",
    private var priority: String = ""): Task(name,description,dueDate) {

    // Override set values function to include priority.
    override fun setValues() {
        super.setValues()
        print("What is the priority? (Out of ten): ")
        priority = readln()
    }

    // Override display task to include priority.
    override fun displayTask() {
        super.displayTask()
        println("Priority Level: $priority")
    }

    // Return the parts of the task as a string.
    override fun taskToString(): String {
        return "$name|$description|$dueDate|$priority|"
    }
}