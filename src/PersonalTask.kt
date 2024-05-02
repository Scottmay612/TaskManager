
class PersonalTask(
    name: String = "",
    description: String = "",
    dueDate: String = "",
    private var priority: Int = 0): Task(name,description,dueDate) {
    override fun setValues() {
        super.setValues()
        print("What is the priority? (Out of ten): ")
        priority = readln().toInt()
    }
}