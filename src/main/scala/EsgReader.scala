import Main.spark


object EsgReader extends App {


     val csvDf = spark.read.option("header", "true").csv("src/main/resources/Data/esgdata.csv")

      csvDf.printSchema()
}
