package io.alexcardell

package object encase {
  implicit class Encased(str: String) {
    def toKebabCase: String = aux(str, '-')

    def toSnakeCase: String = aux(str, '_')
  }

  private val separators: Vector[Char] = Vector(' ', '-', '_')

  private def isSeparator(c: Char): Boolean = separators.contains(c)

  private val camelPattern = "(?<=[a-z])(?=[A-Z])|(?<=[A-Z])(?=[A-Z][a-z])".r

  private def swapSeparator(c: Char, sep: Char): Char =
    if (isSeparator(c)) {
      sep
    } else {
      c
    }

  private def aux(s: String, sep: Char): String =
    camelPattern.replaceAllIn(s, sep.toString).toLowerCase.map(swapSeparator(_, sep))
}
