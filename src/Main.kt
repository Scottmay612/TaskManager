//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.File


fun main() {
    // Declare important variables to be used later.
    val fileName = "tasks.txt"

    val taskLines = loadTasksFromFile(fileName)
    val personalTasks: MutableList<Task> = personalStringToObject(taskLines)
    val workTasks: MutableList<Task> = workStringToObject(taskLines)
    val churchTasks: MutableList<Task> = churchStringToObject(taskLines)
    val miscellaneousTasks: MutableList<Task> = miscStringToObject(taskLines)

    // Menus that are commonly used.
    val menuOptions = listOf(
        "Create New Task",
        "View Existing Tasks",
        "Delete Task",
        "Save Tasks",
        )
    val taskTypes = listOf(
        "Work",
        "Personal",
        "Church",
        "Miscellaneous")

    // Quit index for the commonly used menus.
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
                    println("$taskTypesQuitOption. Return to Main Menu")

                    // Update task type choice.
                    print("Pick a number: ")
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
                        }
                    }
                }
            }
            // View existing tasks.
            "2" -> {
                // Declare the task choice variable for the while loop.
                var viewTaskChoice = ""

                while (viewTaskChoice != taskTypesQuitOption) {
                    // Display options menu.
                    println("Which type of task would you like to view?")
                    for (i in taskTypes.indices) {
                        println("${i+1}. ${taskTypes[i]}")
                    }
                    println("$taskTypesQuitOption. Return to Main Menu")

                    // Update task choice.
                    print("Select a number: ")
                    viewTaskChoice = readln()

                    println()

                    when (viewTaskChoice) {

                        // Display work tasks.
                        "1" -> {
                            println("Here are your work tasks:")
                            for (task in workTasks) {
                                task.displayTask()
                                println()
                            }
                            print("Press enter to continue:")
                            readln()
                        }
                        // Display personal tasks.
                        "2" -> {
                            println("Here are your personal tasks:")
                            for (task in personalTasks) {
                                task.displayTask()
                                println()
                            }
                            print("Press enter to continue:")
                            readln()
                        }

                        // Display church tasks.
                        "3" -> {
                            println("Here are your church tasks:")
                            for (task in churchTasks) {
                                task.displayTask()
                                println()
                            }
                            print("Press enter to continue:")
                            readln()
                        }
                        // Display miscellaneous tasks.
                        "4" -> {
                            println("Here are your miscellaneous tasks:")
                            for (task in miscellaneousTasks) {
                                task.displayTask()
                                println()
                            }
                            print("Press enter to continue:")
                            readln()
                        }
                    }
                }
            }
            // Delete task from the list.
            "3" -> {
                var deleteTaskChoice = ""

                while (deleteTaskChoice != taskTypesQuitOption) {
                    println("Which type of task would you like to delete?")
                    for (i in taskTypes.indices) {
                        println("${i+1}. ${taskTypes[i]}")
                    }
                    println("$taskTypesQuitOption. Return to Main Menu")
                    print("Pick a number: ")
                    deleteTaskChoice = readln()

                    println()

                    when (deleteTaskChoice) {
                        // Display work tasks.
                        "1" -> {
                            println("Which one would you like to delete? ")
                            for (i in workTasks.indices) {
                                println("${i+1}. ${workTasks[i].name}")
                            }
                            print("Pick a number: ")
                            val specificTaskDelete = readln().toInt()

                            workTasks.removeAt(specificTaskDelete - 1)
                            println()

                        }
                        // Display personal tasks.
                        "2" -> {
                            println()
                            println("Which one would you like to delete? ")
                            for (i in personalTasks.indices) {
                                println("${i+1}. ${personalTasks[i].name}")
                            }
                            print("Pick a number: ")
                            val specificTaskDelete = readln().toInt()

                            personalTasks.removeAt(specificTaskDelete - 1)
                            println()
                        }

                        // Display church tasks.
                        "3" -> {
                            println()
                            println("Which one would you like to delete? ")
                            for (i in personalTasks.indices) {
                                println("${i+1}. ${personalTasks[i].name}")
                            }
                            print("Pick a number: ")
                            val specificTaskDelete = readln().toInt()

                            personalTasks.removeAt(specificTaskDelete - 1)
                            println()
                        }
                        // Display miscellaneous tasks.
                        "4" -> {
                            println()
                            println("Which one would you like to delete? ")
                            for (i in miscellaneousTasks.indices) {
                                println("${i+1}. ${miscellaneousTasks[i].name}")
                            }
                            print("Pick a number: ")
                            val specificTaskDelete = readln().toInt()

                            miscellaneousTasks.removeAt(specificTaskDelete - 1)
                            println()
                        }
                    }
                    if (deleteTaskChoice != "5") {
                        println("Task Deleted!")
                        Thread.sleep(2000)
                    }
                }
            }
            // Save the tasks.
            "4" -> {
                // Create a list to hold task strings for each category.
                val taskStringList: MutableList<String> = mutableListOf()

                // Generate strings of tasks from each task list.
                val workString = makeStringOfTasks(workTasks)
                val personalString = makeStringOfTasks(personalTasks)
                val churchString = makeStringOfTasks(churchTasks)
                val miscellaneousString = makeStringOfTasks(miscellaneousTasks)

                // Add the generated task strings to the list.
                taskStringList.add(workString)
                taskStringList.add(personalString)
                taskStringList.add(churchString)
                taskStringList.add(miscellaneousString)

                // Write the combined task list to a file.
                writeToFile(fileName, taskStringList)
                println("Tasks Saved!")
                Thread.sleep(3000)
            }

        }
        // Add new line to the end for organization.
        println()
    }
}

fun writeToFile(fileName: String, taskList: List<String>) {
    // Create a PrintWriter to write to the specified file.
    File(fileName).printWriter().use { out ->
        // Iterate over each task in the list.
        taskList.forEach { value ->
            // Write the current task to the file, followed by a newline.
            out.println(value)
        }
    } // 'use' ensures the PrintWriter is automatically closed.
}


fun makeStringOfTasks(taskList: List<Task>): String {
    // Initialize an empty string to store the concatenated task descriptions
    var objectString = ""

    // Iterate through each task in the taskList
    for (task in taskList) {
        // Append the result of calling task.taskToString() to the objectString
        objectString += task.taskToString()
    }

    // Return the combined string representation of all tasks
    return objectString
}

fun loadTasksFromFile(fileName: String): List<String> {
    // Get the file lines from the task file and return them as a list of strings.
    val file = File(fileName)
    val lines = file.readLines()
    return lines
}

fun miscStringToObject(taskLines: List<String>): MutableList<Task> {
    // Deserialize the miscellaneous task strings into objects.

    val miscTasks: MutableList<Task> = mutableListOf()
    try {
        // Get string of tasks.
        val miscTaskLines = taskLines[3]

        // Split the list at vertical bars to split into correct parts.
        val miscLineList = miscTaskLines.split("|")

        // Divide the total parts by the amount in the task.
        val taskAmount = miscLineList.size / 3

        // Declare the indexes/order for each part of the task.
        var nameIndex = 0
        var descriptionIndex = 1
        var dueDateIndex = 2

        // Create a new task object and assign it's correlating parts.
        for (i in 0..< taskAmount) {
            val miscTask = Task(
                miscLineList[nameIndex],
                miscLineList[descriptionIndex],
                miscLineList[dueDateIndex])

            // Increase each index by the amount of parts there are in object.
            // This is for the next loop.
            nameIndex += 3
            descriptionIndex += 3
            dueDateIndex += 3

            // Add the task the list of task objects.
            miscTasks.add(miscTask)
        }

    } catch (e: Exception) {
        return miscTasks
    }


    // Return the list of task objects.
    return miscTasks
}
fun personalStringToObject(taskLines: List<String>): MutableList<Task> {
    // Deserialize the personal task strings into objects.

    val personalTasks: MutableList<Task> = mutableListOf()
    try {
        // Get string of tasks.
        val personalTaskLines = taskLines[1]

        // Split the list at vertical bars to split into correct parts.
        val personalLineList = personalTaskLines.split("|")

        // Divide the total parts by the amount in the task.
        val taskAmount = personalLineList.size / 4

        // Declare the indexes/order for each part of the task.
        var nameIndex = 0
        var descriptionIndex = 1
        var dueDateIndex = 2
        var priorityIndex = 3

        // Create a new task object and assign it's correlating parts.
        for (i in 0..< taskAmount) {
            val personalTask = PersonalTask(
                personalLineList[nameIndex],
                personalLineList[descriptionIndex],
                personalLineList[dueDateIndex],
                personalLineList[priorityIndex])

            // Increase each index by the amount of parts there are in object.
            // This is for the next loop.
            nameIndex += 4
            descriptionIndex += 4
            dueDateIndex += 4
            priorityIndex += 4

            // Add the task the list of task objects.
            personalTasks.add(personalTask)
        }

    } catch (e: Exception) {
        return personalTasks
    }


    // Return the list of task objects.
    return personalTasks
}

fun churchStringToObject(taskLines: List<String>): MutableList<Task> {
    // Deserialize the church task strings into objects.

    val churchTasks: MutableList<Task> = mutableListOf()

    try {
        // Get string of tasks.
        val churchTaskLines = taskLines[2]

        // Split the list at vertical bars to split into correct parts.
        val churchLineList = churchTaskLines.split("|")

        // Divide the total parts by the amount in the task.
        val taskAmount = churchLineList.size / 4

        // Declare the indexes/order for each part of the task.
        var nameIndex = 0
        var descriptionIndex = 1
        var dueDateIndex = 2
        var priorityIndex = 3

        // Create a new task object and assign it's correlating parts.
        for (i in 0..< taskAmount) {
            val churchTask = ChurchTask(
                churchLineList[nameIndex],
                churchLineList[descriptionIndex],
                churchLineList[dueDateIndex],
                churchLineList[priorityIndex])

            // Increase each index by the amount of parts there are in object.
            // This is for the next loop.
            nameIndex += 4
            descriptionIndex += 4
            dueDateIndex += 4
            priorityIndex += 4

            // Add the task the list of task objects.
            churchTasks.add(churchTask)
        }

    } catch (e: Exception) {
        return churchTasks
    }

    // Return the list of task objects.
    return churchTasks
}
fun workStringToObject(taskLines: List<String>): MutableList<Task> {
    // Deserialize the work task strings into objects.

    val workTasks: MutableList<Task> = mutableListOf()
    try {
        // Get string of tasks.
        val workTaskLines = taskLines[0]

        // Split the list at vertical bars to split into correct parts.
        val taskLineList = workTaskLines.split("|")

        // Divide the total parts by the amount in the task.
        val taskAmount = taskLineList.size / 5

        // Declare the indexes/order for each part of the task.
        var nameIndex = 0
        var descriptionIndex = 1
        var dueDateIndex = 2
        var priorityIndex = 3
        var peopleInvolvedIndex = 4

        // Save the string of people involved.
        val peopleString = taskLineList[peopleInvolvedIndex]

        // Rewrite the string of people involved so that it is a list data type.
        val firstList: List<String> = peopleString.substring(1, peopleString.length - 1).split(",")

        // Add each of those people to a mutable list.
        val peopleList: MutableList<String> = mutableListOf()
        for (item in firstList) {
            peopleList.add(item)
        }

        // Create a new task object and assign it's correlating parts.
        for (i in 0..< taskAmount) {
            val workTask = WorkTask(
                taskLineList[nameIndex],
                taskLineList[descriptionIndex],
                taskLineList[dueDateIndex],
                taskLineList[priorityIndex],
                peopleList
            )

            // Increase each index by the amount of parts there are in object.
            // This is for the next loop.
            nameIndex += 5
            descriptionIndex += 5
            dueDateIndex += 5
            priorityIndex += 5
            peopleInvolvedIndex += 5

            // Add the task the list of task objects.
            workTasks.add(workTask)
        }
    } catch (e: Exception) {
        return workTasks
    }

    // Return the list of task objects.
    return workTasks
}




