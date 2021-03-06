package org.bambucha.watson.connection

import java.nio.charset.Charset

import akka.util.ByteString

trait Token {
  def value: ByteString
}

object Tokens {

  val defaultCharset = Charset.forName("UTF8")

  case object Space extends Token {
    override val value = ByteString(0x20)
  }

  case object Colon extends Token {
    override val value = ByteString(0x3a)
  }

  case object Null extends Token {
    override val value = ByteString(0x00)
  }

  case object CRLF extends Token {
    override val value = ByteString(0x0D, 0x0A)
  }
}
