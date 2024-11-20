import org.apache.spark.sql.SparkSession

object Main {


  def main(args: Array[String]): Unit = {
    println("Hello from main of class")
  }

    val spark = SparkSession.builder()
      .appName("ReadDiffFileFormatsExample")
      .master("local[*]")
      .getOrCreate()

}