package services

import testhelpers.Injector
import org.specs2.mutable.Specification

/**
 * Using a DI helper (Injector) for tests,
 * as suggested in http://stackoverflow.com/q/34159857/56285
 */
class ReportServiceInjectorSpec extends Specification {

  val service = Injector.inject[ReportService]

  "ReportService" should {
    "Work" in {
      service.foobar mustEqual "foobar"
    }
  }

}


