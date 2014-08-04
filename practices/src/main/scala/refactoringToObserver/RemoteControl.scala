package refactoringToObserver

class RemoteControl(light: Light, ceiling: Ceiling, stereo: Stereo) {
  def on(slot: Int):Unit = {
    if (slot == 1)
      light.on();
    if (slot == 2)
      ceiling.high();
    if (slot == 3)
    {
      stereo.on();
      stereo.setCd();
      stereo.setVolume(11);
    }
  }

  def off(slot: Int):Unit = {
    if (slot == 1)
      light.off();
    if (slot == 2)
      ceiling.off();
    if (slot == 3)
      stereo.off();
  }
}
