//fun main() {
//    val employee = Employee()
//
//    employee.setFullName("Яшин Андрей ")
//    employee.setPosition("Полицейский")
//
//    employee.setSalary(-5000)
//    employee.setYearsOfExperience(60)
//
//    employee.setSalary(50000)
//    employee.setYearsOfExperience(5)
//    println("ФИО: ${employee.getFullName()}")
//    println("Должность: ${employee.getPosition()}")
//    println("Зарплата: ${employee.getSalary()}")
//    println("Опыт: ${employee.getYearsOfExperience()} лет")
//}

//fun main() {
//    val task1 = Task(
//        title = "Задача 1",
//        description = "Описание",
//        priority = Priority.HIGH,
//        isCompleted = false
//    )
//    val task2 = Task(
//        "Задача 1",
//        "Описание",
//        Priority.HIGH,
//        false
//    )
//
//    val task3 = Task(
//        "Задача 2",
//        "Другое описание",
//        Priority.LOW,
//        true
//    )
//
//    println("Свойства task1:")
//    println("  title: ${task1.title}")
//    println("  description: ${task1.description}")
//    println("  priority: ${task1.priority}")
//    println("  isCompleted: ${task1.isCompleted}")
//    println("\ntask1 == task2: ${task1 == task2}")
//    println("task1 == task3: ${task1 == task3}")
//    println("\nХеши: ${task1.hashCode()}, ${task2.hashCode()}, ${task3.hashCode()}")
//
//    println("\ntask1: $task1")
//
//    val task4 = task1.copy(
//        priority = Priority.MEDIUM,
//        isCompleted = true
//    )
//    println("\nКопия task4: $task4")
//}

//fun main() {
//    println("\n Демонстрация наследования ")
//
//    val devDept = DevelopmentDepartment()
//    val testDept = TestingDepartment()
//
//    devDept.printDepartmentGoal()
//    testDept.printDepartmentGoal()
//}

//fun main() {
//    println("\n=== Демонстрация полиморфизма ===")
//
//    val employee = Employee().apply {
//        setFullName("Анна Петрова")
//        setPosition("Тестировщик")
//        setSalary(45000)
//        setYearsOfExperience(3)
//    }
//
//    val devDept = DevelopmentDepartment()
//    val testDept = TestingDepartment()
//
//    val reportGenerators: List<ReportGenerator> = listOf(employee, devDept, testDept)
//
//    for (generator in reportGenerators) {
//        println(generator.generateReport())
//        println()
//    }
//}


fun main() {
    println("=== ИНТЕГРИРОВАННАЯ ДЕМОНСТРАЦИЯ ===\n")

    // Создаем сотрудника
    val employee = Employee().apply {
        setFullName("Сергей Сидоров")
        setPosition("Team Lead")
        setSalary(120000)
        setYearsOfExperience(8)
    }

    // Создаем отдел
    val department = DevelopmentDepartment()

    // Создаем задачи
    val task1 = Task("Проектирование", "Спроектировать новую архитектуру", Priority.HIGH)
    val task2 = Task("Code Review", "Проверить код младших разработчиков", Priority.MEDIUM)
    val task3 = Task("Встреча", "Провести планёрку", Priority.LOW)

    // Назначаем задачи
    employee.assignTask(task1)
    employee.assignTask(task2)  // Должно вывести сообщение о занятости

    // Завершаем первую задачу
    task1.isCompleted = true
    employee.assignTask(task3)  // Теперь можно назначить новую

    // Выводим отчеты
    println("\n=== СВОДНЫЕ ОТЧЕТЫ ===")
    println(employee.generateReport())
    println()
    println(department.generateReport())

    // Демонстрация полиморфизма
    println("\n=== ПОЛИМОРФНЫЙ ВЫЗОВ ===")
    val entities: List<ReportGenerator> = listOf(employee, department)
    entities.forEach { println(it.generateReport() + "\n") }
}