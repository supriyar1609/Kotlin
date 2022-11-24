package com.axis.dbconnection

import java.sql.DriverManager

//model class
//data class User(val id:Int, val name:String)

val dbConnection =DbConnection()
val connection= dbConnection.connect()

fun main(args: Array<String>) {
    val myurl = "jdbc:mysql://localhost:3306/kotlindb" //localhost is the database name
    val connection = DriverManager.getConnection(myurl, "root", "supriya97")
    println("connection estlabished successfully")

    //insert query -Create
    val stmt = connection.createStatement()
        val res=stmt.executeUpdate("insert into users values(3,'Deepti')")
    if (res > 0) {
        println("successfully inserted record into users db !!!")
    } else {
        println("Insert Not sucessful")
    }

}






