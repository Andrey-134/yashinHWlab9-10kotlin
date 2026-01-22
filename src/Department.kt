//abstract class Department {
//    abstract val departmentName: String
//    abstract fun printDepartmentGoal()
//}
//
//class DevelopmentDepartment(override val departmentName: String = "Отдел разработки") : Department() {
//   override fun printDepartmentGoal() {
//        println("$departmentName: Писать чистый и эффективный код")
//   }
//}
//
//class TestingDepartment(override val departmentName: String = "Отдел тестирования") : Department() {
//    override fun printDepartmentGoal() {
//        println("$departmentName: Находить и устранять все баги")
//    }
//
//    abstract class Department : ReportGenerator {
//    }
//
//    class DevelopmentDepartment : Department() {
//
//        override fun generateReport(): String {
//            return "Отчет отдела: $departmentName \nЦель: Разработка качественного ПО"
//        }
//    }
//
//    class TestingDepartment : Department() {
//
//        override fun generateReport(): String {
//            return "Отчет отдела: $departmentName\nЦель: Обеспечение качества продукта"
//        }
//    }
//}