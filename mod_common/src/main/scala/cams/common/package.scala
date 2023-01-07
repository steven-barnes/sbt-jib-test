package cams

import org.slf4j.LoggerFactory

package object common {

  private val logger = LoggerFactory.getLogger("cams")

  def log(msg: Any): Unit = {
    logger.debug(msg.toString)
  }
}
