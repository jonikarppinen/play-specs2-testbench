package services

import javax.inject.Inject

import org.specs2.mutable.Specification

/**
 * My original approach
 */
class ReportServiceSpec @Inject()(service: ReportService) extends Specification {

  "ReportService" should {
    "Work" in {
      service.foobar mustEqual "foobar"
    }
  }

}


