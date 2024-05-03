class ChurchTask(
    name: String = "",
    description: String = "",
    dueDate: String = "",
    private var wardInvolved: String = "",
    private var orgInvolved: String = ""
    ): Task(name, description, dueDate) {
    override fun setValues() {
        super.setValues()
        print("Which ward is involved? ")
        wardInvolved = readln()
        print("Which organization is involved? (Young Men, Relief Society, etc.) ")
        orgInvolved = readln()
    }

    override fun displayTask() {
        super.displayTask()
        println("Ward Involved: $wardInvolved")
        println("Organization Involved: $orgInvolved")
    }
    }