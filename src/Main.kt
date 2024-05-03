//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File


// Finish write to file function at the bottom.


fun main() {
    // Declare important variables to be used later.
    val fileName = "tasks.txt"
    val personalTasks: MutableList<Task> = mutableListOf()
    val workTasks: MutableList<Task> = mutableListOf()
    val churchTasks: MutableList<Task> = mutableListOf()
    val miscellaneousTasks: MutableList<Task> = mutableListOf()
    val allTasks: MutableList<Task> = mutableListOf()
    val menuOptions = listOf("Create New Task", "View Existing Tasks", "Mark Task Completed", "Save Tasks")
    val taskTypes = listOf("Work", "Personal", "Church", "Miscellaneous")
    val taskTypesQuitOption = (taskTypes.size + 1).toString()
    val mainMenuQuitOption = (menuOptions.size + 1).toString()

    // Declare main menu choice so that it can be used in a while loop.
    var mainMenuChoice = ""

    // Begin introduction.
    println("Welcome to the task manager! ")

    // Begin main while loop for main menu.
    while (mainMenuChoice != mainMenuQuitOption) {

        // Display menu and update main menu choice.
        println("What would you like to do? ")
        for (i in menuOptions.indices) {
            println("${i + 1}. ${menuOptions[i]}")
        }
        println("$mainMenuQuitOption. Quit")

        // Update the main menu choice with user's input.
        print("Pick a number: ")
        mainMenuChoice = readln()

        // Alternate paths are made for whatever main menu choice is.
        when (mainMenuChoice) {

            // Create a task.
            "1" -> {
                // Declare the task type choice for the while loop.
                var taskTypeChoice = ""

                while (taskTypeChoice != taskTypesQuitOption) {
                    // Display task types and get their selection.
                    println()
                    println("Here are the task types: ")
                    for (i in taskTypes.indices) {
                        println("${i+1}. ${taskTypes[i]}")
                    }
                    println("$taskTypesQuitOption. Quit")

                    // Update task type choice.
                    print("Please select a number: ")
                    taskTypeChoice = readln()

                    // Alternate paths for different task choice.
                    when (taskTypeChoice) {

                        // Work task.
                        "1" -> {
                            // Instantiate a workTask object.
                            val workTask1 = WorkTask()

                            // Set the values specific for a work task.
                            workTask1.setValues()

                            // Add the task to the list of work tasks.
                            // Add the task to the list of all tasks.
                            workTasks.add(workTask1)
                            allTasks.add(workTask1)
                        }
                        // Personal task.
                        "2" -> {
                            // Instantiate a personalTask object.
                            val personalTask = PersonalTask()

                            // Set the values specific for a personal task.
                            personalTask.setValues()

                            // Add the task to the list of personal tasks.
                            // Add the task to the list of all tasks.
                            personalTasks.add(personalTask)
                            allTasks.add(personalTask)
                        }
                        // Church task.
                        "3" -> {
                            // Instantiate a churchTask object.
                            val churchTask = ChurchTask()

                            // Set the values specific for a church task.
                            churchTask.setValues()

                            // Add the task to the list of church tasks.
                            // Add the task to the list of all tasks.
                            churchTasks.add(churchTask)
                            allTasks.add(churchTask)
                        }
                        // Miscellaneous task.
                        "4" -> {
                            // Instantiate a miscellaneousTask object.
                            val miscellaneousTask = Task()

                            // Set the values specific for a miscellaneous task.
                            miscellaneousTask.setValues()

                            // Add the task to the list of miscellaneous tasks.
                            // Add the task to the list of all tasks.
                            miscellaneousTasks.add(miscellaneousTask)
                            allTasks.add(miscellaneousTask)

                        }
                    }
                }
            }
            // View existing tasks.
            "2" -> {
                // Declare the task choice variable for the while loop.
                var viewTaskChoice = ""

                while (viewTaskChoice != "3") {
                    // Display options menu.
                    println("Options:")
                    println("1. View All Tasks")
                    println("2. View Specific Type of Task")
                    println("3. Quit")

                    // Update task choice.
                    print("Select a number: ")
                    viewTaskChoice = readln()

                    // Alternate paths for which task viewing option they pick.
                    when (viewTaskChoice) {

                        // View all tasks.
                        "1" -> {
                            for (task in allTasks) {
                                task.displayTask()
                            }
                            print("Press enter to continue: ")
                            readln()
                        }
                        // View specific type of task.
                        "2" -> {
                            // Declare the specific task choice for the while loop.
                            var specificTaskChoice = ""

                            // Run the while loop until they choose the quit option.
                            while (specificTaskChoice != "5") {

                                // Display the tasks types as viewing options.
                                println("Which task type would you like to view? ")
                                for (i in menuOptions.indices) {
                                    println("${i+1}. ${menuOptions[i]}")
                                }

                                // Update the specific task choice with the user's input.
                                specificTaskChoice = readln()

                                // Alternate paths depending on the user's viewing choice.
                                when (specificTaskChoice) {

                                    // Display work tasks.
                                    "1" -> {
                                        for (task in workTasks) {
                                            task.displayTask()
                                        }
                                    }
                                    // Display personal tasks.
                                    "2" -> {
                                        for (task in personalTasks) {
                                            task.displayTask()
                                        }
                                    }
                                    // Display church tasks.
                                    "3" -> {
                                        for (task in churchTasks) {
                                            task.displayTask()
                                        }
                                    }
                                    // Display miscellaneous tasks.
                                    "4" -> {
                                        for (task in miscellaneousTasks) {
                                            task.displayTask()
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            "4" -> {
                writeToFile(fileName, "Hello")
            }
        }
    }
}

fun writeToFile(fileName: String, content: String) {
    File(fileName).writeText(content)
}

