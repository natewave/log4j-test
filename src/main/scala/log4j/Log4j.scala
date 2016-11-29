package log4jtest

import com.typesafe.scalalogging.Logger
import org.slf4j.LoggerFactory


object Log4j extends App {
  println("before log4j")

  val logger = Logger(LoggerFactory.getLogger(this.getClass))

  try {
    logger.debug("[+] Here goes my debug message.")
  } catch { case e: Exception =>
    println(s"[-] logger exception: ${e.getMessage}")
  }

  println("[+] after log4j")
}

