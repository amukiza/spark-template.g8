package $organization$
import $organization$.$package$.SparkSessionProvider

object Main extends App with SparkSessionProvider {
  import spark.implicits._
  Seq(1,34,4).toDF.map(_.getAs[Int]("value") * 20).show
}