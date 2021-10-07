package common

import org.scalatest.OptionValues
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

trait BaseScalaSpec extends AnyWordSpec with Matchers with OptionValues with ScalaFutures
