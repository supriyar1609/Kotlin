package Collections

class Employee(id:Int,name: String, dept: String, salary:Double, age: Int){
    var id:Int=id
    var name:String=name
    var dept:String=dept
    var salary:Double=salary
    var age:Int=age
}

fun main(){
    var employees= mutableListOf<Employee>()
    employees.add(Employee(1,"Supriya","HR",30000.50, 25))
    employees.add(Employee(2,"Vaibhavi","CS",35000.65,24))
    employees.add(Employee(3,"Akshita","TA",45000.65,22))
    employees.add(Employee(4,"Shrvaya", "HR",85000.56,25))

    for(employee in employees)
        println("${employee.id} ${employee.name} ${employee.dept} ${employee.salary} ${employee.age}")
}