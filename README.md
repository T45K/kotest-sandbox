# Reproduce

Kotest 6.0.7

```bash
./gradlew app:test --tests io.github.t45k.kotest.foo.Teset1 --tests io.github.t45k.kotest.foo.Test2
```

```
$ ./gradlew app:test --tests io.github.t45k.kotest.foo.Teset1 --tests io.github.t45k.kotest.foo.Test2
Calculating task graph as configuration cache cannot be reused because file 'app/build.gradle.kts' has changed.

BUILD SUCCESSFUL in 6s
3 actionable tasks: 2 executed, 1 up-to-date
Configuration cache entry stored.
```

Kotest 6.1.3


