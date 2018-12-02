package $organization$.$package$

import org.apache.spark.sql.SparkSession

trait SparkSessionProvider {
  implicit lazy val spark: SparkSession = {
    SparkSession
      .builder()
      .master("local[2]")
      .appName("spark-apps")
      .getOrCreate()
  }
}