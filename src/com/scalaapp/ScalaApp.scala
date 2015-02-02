package com.scalaapp

/**
 * Created by renex on 02/02/15.
 */
object ScalaApp {
  def main (args: Array[String]) {
    val user: User = User("reneczech@gmail.com")
    val nullable: Option[User] = Some(user)
    nullable.map((user: User) =>{
      print("Found user. %s".format(user)
      )
    })
    print(
      """
        |Hello, this is a sample Scala application.|
        |
        |Find more info at the website
        |
        |
      """.stripMargin)
  }
}
