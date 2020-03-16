
case class Transform() {

  def allTransform={
    MyFileReader("C:\\Users\\91950\\ScalaTestSN\\src\\main\\scala\\Abc.txt").read().split( " ").toList.map(x=>x.toUpperCase()).mkString( " ")
  }

}

object Transform{
  def apply()= new Transform
}

