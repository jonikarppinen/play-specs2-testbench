package services

import org.specs2.mutable.Specification

/**
 * Workaround, using new to avoid hitting Specs2 DI limitations
 */
class ReportServiceWorkaroundSpec extends Specification {

  val service = new ReportService(new UserService, new SupportService)

  "ReportService" should {
    "Work" in {
      service.foobar mustEqual "foobar"
    }
  }

}


