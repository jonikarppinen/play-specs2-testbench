

# Play 2.4 and Specs2 testbench

## Get started

Requirements: JDK 1.8 and sbt

```
sbt test
sbt run
```

## Topics

### "Can't find a constructor for class ..."

See [this Stack Overflow question](http://stackoverflow.com/q/34159857/56285).

The recommended [Play 2.4 approach](https://www.playframework.com/documentation/2.4.x/Migration24#Dependency-Injection) of using classes and DI (instead of singletons), does not seem to work seamlessly with [Specs2, Play's default test framework](https://www.playframework.com/documentation/2.4.x/ScalaTestingWithSpecs2) in all cases.

**Solution**: cleanest way to get classes wired up also in tests seems to be
a DI test helper [along these lines](test/testhelpers/Injector.scala)


