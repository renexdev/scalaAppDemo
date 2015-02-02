package com.scalaapp

import org.scalatest.FunSuite

/**
 * Created by renex on 02/02/15.
 */
class EmailTest extends FunSuite {
  test("Email with valid address"){
    val email: Email = Email("reneczech@gmail.com")
    assert(email.address != null)
  }
  test("Email with invalid address"){
    intercept[IllegalArgumentException]{
      Email("reneczech")
    }
  }
}
