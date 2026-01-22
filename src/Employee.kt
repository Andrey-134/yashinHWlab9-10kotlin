//class Employee {
//    private var fullName: String = ""
//    private var position: String = ""
//    private var salary: Int = 0
//    private var yearsOfExperience: Int = 0
//
//    fun getFullName(): String = fullName
//    fun getPosition(): String = position
//    fun getSalary(): Int = salary
//    fun getYearsOfExperience(): Int = yearsOfExperience
//
//    fun setSalary(value: Int) {
//        if (value >= 0) {
//            salary = value
//        } else {
//            println("Предупреждение: Зарплата не может быть отрицательной!")
//        }
//    }
//    fun setYearsOfExperience(value: Int) {
//        if (value in 0..50) {
//            yearsOfExperience = value
//        } else {
//            println("Предупреждение: Опыт работы должен быть от 0 до 50 лет!")
//            if (value > 50) {
//                yearsOfExperience = 50
//            } else {
//                yearsOfExperience = 0
//            }
//        }
//    }
//    fun setFullName(value: String) { fullName = value }
//    fun setPosition(value: String) { position = value }
//}

//class Employee : ReportGenerator {
//
//    override fun generateReport(): String {
//        return """
//            === ОТЧЕТ О СОТРУДНИКЕ ===
//            ФИО: $fullName
//            Должность: $position
//            Зарплата: $salary руб.
//            Опыт работы: $yearsOfExperience лет
//            ===========================
//        """.trimIndent()
//    }
//}


class Employee : ReportGenerator {

    private var currentTask: Task? = null

    fun assignTask(newTask: Task) {
        val current = currentTask
        if (current != null && !current.isCompleted) {
            println("Сотрудник $fullName уже занят задачей '${current.title}'")
        } else {
            currentTask = newTask
            println("Задача '${newTask.title}' назначена сотруднику $fullName")
        }
    }

    override fun generateReport(): String {
        val taskInfo = currentTask?.let {
            "Текущая задача: ${it.title} (Приоритет: ${it.priority}, Выполнена: ${if (it.isCompleted) "Да" else "Нет"})"
        } ?: "Текущая задача: Нет"

        return """
            === ОТЧЕТ О СОТРУДНИКЕ ===
            ФИО: $fullName
            Должность: $position
            Зарплата: $salary руб.
            Опыт работы: $yearsOfExperience лет
            $taskInfo
            ===========================
        """.trimIndent()
    }
}