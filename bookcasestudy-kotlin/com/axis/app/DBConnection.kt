package com.axis.app

import java.sql.Connection
import java.sql.DriverManager

class DBConnection {

    fun connect(): Connection {
        val myurl = "jdbc:mysql://localhost:3306/kotlintask"
        val connection = DriverManager.getConnection(myurl, "root", "R@ksha19")

        return connection
    }
}