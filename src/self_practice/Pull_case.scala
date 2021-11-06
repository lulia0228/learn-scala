package self_practice

object Pull_case {
  def main(args: Array[String]): Unit = {
    val spark: Any = SparkSession.
      builder().
      enableHiveSupport().
      appName("peifu_quality").
      config(sparkConf).
      getOrCreate()

    val spark = Spark
  }

}


