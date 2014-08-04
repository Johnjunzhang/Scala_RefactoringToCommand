package refactoringToObserver

class Light() {
  var status = false
  
  def on():Unit = {
    status = true;
  }
  
  def off():Unit = {
    status = false;
  }
}
