package services

import testhelpers.Injector

class UserServiceSpec extends Specification {

  val service = Injector.inject[UserService]

  "UserService" should{
    "return foo" in {
      service.foo mustEqual "foo"
    }
  }

}
