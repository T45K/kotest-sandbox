# Reproduce

```bash
./gradlew app:test --tests io.github.t45k.kotest.foo.Teset1 --tests io.github.t45k.kotest.foo.Test2
```

## Kotest 6.0.7

```
$ ./gradlew app:test --tests io.github.t45k.kotest.foo.Teset1 --tests io.github.t45k.kotest.foo.Test2
Calculating task graph as configuration cache cannot be reused because file 'app/build.gradle.kts' has changed.

BUILD SUCCESSFUL in 6s
3 actionable tasks: 2 executed, 1 up-to-date
Configuration cache entry stored.
```

## Kotest 6.1.3

```
$ ./gradlew app:test --tests io.github.t45k.kotest.foo.Teset1 --tests io.github.t45k.kotest.foo.Test2
Calculating task graph as configuration cache cannot be reused because file 'app/build.gradle.kts' has changed.
> Task :app:test FAILED

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':app:test'.
> No tests found for given includes: [io.github.t45k.kotest.foo.Teset1, io.github.t45k.kotest.foo.Test2](--tests filter)

* Try:
> Run with --scan to get full insights from a Build Scan (powered by Develocity).

BUILD FAILED in 9s
3 actionable tasks: 2 executed, 1 up-to-date
Configuration cache entry stored.
```


