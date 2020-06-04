package io.alexcardell.encase

import org.scalatest._

class Spec extends FlatSpec with Matchers {

  behavior.of("toKebabCase")

  val kebabExpected = "something-pascal"

  it should "be correct for pascal case" in {
    "SomethingPascal".toKebabCase shouldBe kebabExpected
  }

  it should "be correct for camel case" in {
    "somethingPascal".toKebabCase shouldBe kebabExpected
  }

  it should "be correct for kebab case" in {
    "something-pascal".toKebabCase shouldBe kebabExpected
  }

  it should "handle single space" in {
    "Something Pascal".toKebabCase shouldBe kebabExpected
  }

  // test("trim multiple spaces") {
  //   val received = "Something  Pascal".toKebabCase
  //   assert(received == kebabExpected)
  // }

  behavior.of("toSnakeCase")

  val snakeExpected = "something_pascal"

  it should "be correct for pascal case" in {
    "SomethingPascal".toSnakeCase shouldBe snakeExpected
  }

  it should "be correct for camel case" in {
    "somethingPascal".toSnakeCase shouldBe snakeExpected
  }

  it should "be correct for snake case" in {
    "something-pascal".toSnakeCase shouldBe snakeExpected
  }

  it should "handle single space" in {
    "Something Pascal".toSnakeCase shouldBe snakeExpected
  }

  // test("trim multiple spaces") {
  //   val received = "Something  Pascal".toSnakeCase
  //   assert(received == snakeExpected)
  // }
}
