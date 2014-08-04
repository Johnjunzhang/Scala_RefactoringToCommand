package refactoringToObserver

class Stereo() {
  var stereoStatus = false
  var cdStatus = false
  var volume = 0
  
  def on():Unit = {
    stereoStatus = true
  }

  def setCd():Unit = {
    cdStatus = true
  }

  def setVolume(volume:Int):Unit = {
    this.volume = volume
  }

  def off():Unit = {
    stereoStatus = false
    cdStatus = false
    volume = 0;
  }
}
