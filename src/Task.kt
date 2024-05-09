
open class Task(
    var name: String = "",
    protected var description: String = "",
    protected var dueDate: String = ""
) {
    open fun setValues() {
        // Prompts the user to enter the values for the task.

        print("What is the task name? ")
        name = readln()
        print("What is the task description? ")
        description = readln()
        print("What is the due date? (mm/dd/yyyy) ")
        dueDate = readln()
    }
    open fun displayTask() {
        // Displays the tasks in readable format.

        println("Name: $name")
        println("Description: $description")
        println("Due Date: $dueDate")
    }

    open fun taskToString(): String {
        // Returns the task object as a string.

        return "$name|$description|$dueDate|"
    }
}
