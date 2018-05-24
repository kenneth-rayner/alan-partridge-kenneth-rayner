object Partridge extends App {

  def checkForWord(inputArray: Array[String]): String = {

    val words = List("Partridge", "PearTree", "Chat", "Dan", "Toblerone", "Lynn", "AlphaPapa", "Nomad")
    val numExMarks = inputArray.count((x: String) => words contains x)
    if (numExMarks == 0) {
      "Lynn, I've pierced my foot on a spike!!"
    }
    else {
      s"Mine's a pint${"!" * numExMarks}"
    }
  }
}