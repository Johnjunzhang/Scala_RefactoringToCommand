package refactoringToObserver

class Ceiling() {
  var ceilingSpeed = CeilingSpeed.Off

  def high():Unit = {
    ceilingSpeed = CeilingSpeed.High;
  }

  def medium():Unit = {
    ceilingSpeed = CeilingSpeed.Medium;
  }

  def low():Unit = {
    ceilingSpeed = CeilingSpeed.Low;
  }

  def off():Unit = {
    ceilingSpeed = CeilingSpeed.Off;
  }
}

object CeilingSpeed extends Enumeration
{
  type CeilingSpeed = Value
  val High, Medium, Low, Off = Value
}
