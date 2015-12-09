package services

import javax.inject.Inject

class ReportService @Inject()(userService: UserService, supportService: SupportService) {
  def foobar = userService.foo + supportService.bar
}

