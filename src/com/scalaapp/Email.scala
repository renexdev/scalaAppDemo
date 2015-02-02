package com.scalaapp

/**
 * A class which represents a valid email address
 * @param address A ____
 */
case class Email(val address: String) {
  var matcher = """([\w\.]+)@([\w\.]+)""".r.pattern.matcher(address)
  if(!matcher.matches()){
    throw new IllegalArgumentException("Address is invalid. Re-type it!!")
  }

}
object Email{
  implicit def stringToEmail(string: String): Email = Email(string)
}
