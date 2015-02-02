package com.scalaapp

/**
 * Created by renex on 02/02/15.
 */
case class User(val contact: Email) {
  override def toString(): String = s"[Email:${contact.address}]"
}
