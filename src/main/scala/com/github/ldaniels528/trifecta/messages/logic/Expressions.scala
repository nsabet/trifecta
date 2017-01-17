package com.github.ldaniels528.trifecta.messages.logic

/**
 * Conditional Expressions
 * @author lawrence.daniels@gmail.com
 */
object Expressions {

  sealed trait Expression

  case class AND(a: Expression, b: Expression) extends Expression {
    override def toString = s"$a and $b"
  }

  case class NOT(expr: Expression) extends Expression {
    override def toString = s"not $expr"
  }

  case class OR(a: Expression, b: Expression) extends Expression {
    override def toString = s"$a or $b"
  }

  case class EQ(field: String, value: String) extends Expression {
    override def toString = s"$field == $value"
  }

  case class GE(field: String, value: String) extends Expression {
    override def toString = s"$field >=$value"
  }

  case class GT(field: String, value: String) extends Expression {
    override def toString = s"$field > $value"
  }

  case class KEY_EQ(value: String) extends Expression {
    override def toString = s"key is $value"
  }

  case class LE(field: String, value: String) extends Expression {
    override def toString = s"$field <= $value"
  }

  case class LIKE(field: String, pattern: String) extends Expression {
    override def toString = s"$field like '$pattern'"
  }

  case class LT(field: String, value: String) extends Expression {
    override def toString = s"$field < $value"
  }

  case class MATCHES(field: String, pattern: String) extends Expression {
    override def toString = s"$field matches '$pattern'"
  }

  case class NE(field: String, value: String) extends Expression {
    override def toString = s"$field != $value"
  }

}
