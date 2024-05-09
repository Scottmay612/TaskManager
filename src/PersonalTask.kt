
class PersonalTask(
    name: String = "",
    description: String = "",
    dueDate: String = "",
    private var priority: String = ""): Task(name,description,dueDate) {
    override fun setValues() {
        super.setValues()
        print("What is the priority? (Out of ten): ")
        priority = readln()
    }

    override fun displayTask() {
        super.displayTask()
        println("Priority Level: $priority")
    }

    override fun taskToString(): String {
        return "$name|$description|$dueDate|$priority|"
    }
}