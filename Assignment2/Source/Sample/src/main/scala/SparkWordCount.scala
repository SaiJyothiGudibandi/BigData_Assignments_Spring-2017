import org.apache.spark.{SparkContext, SparkConf}

object SparkWordCount {

  def main(args: Array[String]) {

    System.setProperty("hadoop.home.dir","C:\\Users\\saijy\\Documents\\HADOOP");

    val sparkConf = new SparkConf().setAppName("SparkWordCount").setMaster("local[*]")

    val sc=new SparkContext(sparkConf)

    val textFile=sc.textFile("input")

    val count=textFile.flatMap(line => line.split(" .\n")).map(word=>(word,1)).cache()

    val output=count.reduceByKey(_+_, 1)
    output.sortBy(_._1).coalesce(1).saveAsTextFile("output")


    val op=output.collect()

    var str:String="Sentences:Count \n"
    op.foreach{case (word,count)=>{

      str+=word+" : "+count+"\n"


    }}

    println(str)

  }

}
