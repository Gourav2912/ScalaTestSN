import java.io.{File, PrintWriter}

object MyFileReader {
  def apply(loc:String)= new MyFileReader(loc)
}
case class MyFileReader(loc:String) {
  import scala.io.Source
  def read() = {
    Source.fromFile(loc).mkString  }

/* val transform= read("C:\\Users\\91950\\ScalaTestSN\\src\\main\\scala\\Abc.txt").split( " ").toList.map(x=>x.toUpperCase())
  println(transform)*/
  /*val writer = new PrintWriter(new File("Write.txt"))
writer.write(allTransform())
writer.close()*/



  /*val writer = new PrintWriter(new File("Write.txt"))
  writer.write(allTransform())
  writer.close()*/



}
