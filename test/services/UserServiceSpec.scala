package services

import testhelpers.Injector
import org.specs2.mutable.Specification

class UserServiceSpec extends Specification {

  val service = Injector.inject[UserService]

  tag("unit")
  "UserService" should {
    "return foo" in {
      service.foo mustEqual "foo"
    }
  }

}
