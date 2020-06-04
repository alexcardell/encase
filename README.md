# encase

[![CircleCI](https://circleci.com/gh/alexcardell/encase.svg?style=svg)](https://circleci.com/gh/alexcardell/encase)

Scala library for text case conversions.

## Usage

```scala
import io.alexcardell.encase._

val something = "SomethingPascal".toKebabCase

assert(something == "something-pascal")
```
