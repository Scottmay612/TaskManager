class ChurchTask(
    // Attributes for object.
    name: String = "",
    description: String = "",
    dueDate: String = "",
    private var wardInvolved: String = "",
    private var orgInvolved: String = ""
    ): Task(name, description, dueDate)
{
    override fun setValues() {
        // Override the original function and values for which ward was
        // involved and which organization was involved.

        super.setValues()
        print("Which ward is involved? ")
        wardInvolved = readln()
        print("Which organization is involved? (Young Men, Relief Society, etc.) ")
        orgInvolved = readln()
    }

    override fun displayTask() {
        // Display the task with the new values added.

        super.displayTask()
        println("Ward Involved: $wardInvolved")
        println("Organization Involved: $orgInvolved")
    }

    override fun taskToString(): String {
        // Return the task object as a string of values.
        return "$name|$description|$dueDate|$wardInvolved|$orgInvolved|"
    }
}