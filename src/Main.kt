//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val personalTasks: MutableList<Task> = mutableListOf()
    val workTasks: MutableList<Task> = mutableListOf()
    val taskTypes = listOf("Work", "Personal", "Church", "Miscellaneous")
    println("Welcome to the task manager! ")
    println("Here are the task types: ")
    for (i in taskTypes.indices) {
        println("${i+1}. ${taskTypes[i]}")
    }
    print("Please select a number: ")
    var taskTypeChoice = readlnOrNull()
    when (taskTypeChoice) {
        "1" -> {
            val workTask1 = WorkTask()
            workTask1.setValues()
            workTask1.displayTask()
            workTasks.add(workTask1)
        }
        "2" -> {
            val personalTask = PersonalTask()
            personalTask.setValues()
            personalTask.displayTask()
            personalTasks.add(personalTask)
        }
    }
}

