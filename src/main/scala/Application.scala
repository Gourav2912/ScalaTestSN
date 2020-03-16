object Application extends App {

 val tranobj = new Transform
  val content= tranobj.allTransform


  MyFileWritter("C:\\Users\\91950\\ScalaTestSN\\src\\main\\scala\\output.txt",content).writter()
 

}
