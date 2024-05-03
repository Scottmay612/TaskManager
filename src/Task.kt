
open class Task(
    private var name: String = "",
    private var description: String = "",
    private var dueDate: String = ""
) {
    open fun setValues() {
        print("What is the task name? ")
        name = readln()
        print("What is the task description? ")
        description = readln()
        print("What is the due date? (mm/dd/yyyy) ")
        dueDate = readln()
    }
    open fun displayTask() {
        println("Name: $name")
        println("Description: $description")
        println("Due Date: $dueDate")
    }

    open fun taskToString(): String {
        return "$name|$description|$dueDate"
    }
}
