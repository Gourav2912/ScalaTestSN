import java.io.{File, PrintWriter}

case class MyFileWritter(loc:String,content:String) {

  def writter()={
    val writer = new PrintWriter(new File(loc))
    writer.write(content)
    writer.close()

  }



}


