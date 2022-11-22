package oops
/*fun main(){
    var obj =Employee(168,"Supriya",25000,30)
    obj.display()
    var res1=obj.calculatePerDaySalary(obj.empSalary)
    var res2=obj.totalSalaryEarned(obj.noOfDaysPresent,obj.empSalary)
    println("per day salary : $res1")
    println("total salary: $res2")
}
class Employee(var empId: Int, var empName: String, var empSalary: Int,var noOfDaysPresent:Int) {
    fun display(){
        println("$empId , $empName,$empSalary,$noOfDaysPresent")
    }
    fun calculatePerDaySalary(empSalary:Int):Int{
        return empSalary/30
    }
    fun totalSalaryEarned(noOfDaysPresent: Int,empSalary:Int):Int{
        var res= noOfDaysPresent*calculatePerDaySalary(empSalary)
        return res
    }
}*/

fun main(args: Array<String>) {
    var employee=Employee(3,"Supriya")
    employee.displayEmployeeInfo()
    var employee2=Employee(8, dept = "Developer")
    employee2.displayEmployeeInfo()
}
class Employee(id:Int=1,name:String="",dept:String="Project")
{
    var id:Int=id
    var name:String=name
    var dept:String=dept
    fun displayEmployeeInfo()
    {
        println("$id $name $dept")
    }
}