fun main() {
    val employee = Employee()

    employee.setFullName("Иван Иванов")
    employee.setPosition("Разработчик")

    employee.setSalary(-5000)
    employee.setYearsOfExperience(60)

    employee.setSalary(50000)
    employee.setYearsOfExperience(5)
    println("ФИО: ${employee.getFullName()}")
    println("Должность: ${employee.getPosition()}")
    println("Зарплата: ${employee.getSalary()}")
    println("Опыт: ${employee.getYearsOfExperience()} лет")
}