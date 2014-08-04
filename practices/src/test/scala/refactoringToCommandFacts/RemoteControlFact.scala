package movingFeaturesFacts

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, FunSpec}
import refactoringToObserver._

@RunWith(classOf[JUnitRunner])
class RemoteControlFact extends FunSpec with Matchers {
  describe("RemoteControlFact") {
    it("should_turn_on_light_when_press_first_on_button") {
      val light = new Light();
      val remoteControl = new RemoteControl(light, null, null);
      remoteControl.on(1);
      light.status should be(true)
    }

    it("should_turn_off_light_when_press_first_off_button") {
      val light = new Light();
      val remoteControl = new RemoteControl(light, null, null);
      remoteControl.off(1);
      light.status should be(false)
    }

    it("should_turn_on_ceiling_when_press_second_on_button") {
      val ceiling = new Ceiling();
      val remoteControl = new RemoteControl(null, ceiling, null);
      remoteControl.on(2);
      ceiling.ceilingSpeed should be(CeilingSpeed.High)
    }

    it("should_turn_off_ceiling_when_press_second_off_button") {
      val ceiling = new Ceiling();
      val remoteControl = new RemoteControl(null, ceiling, null);
      remoteControl.off(2);
      ceiling.ceilingSpeed should be(CeilingSpeed.Off)
    }

    it("should_turn_on_stereo_when_press_third_on_button") {
      val stereo = new Stereo();
      val remoteControl = new RemoteControl(null, null, stereo);
      remoteControl.on(3);
      stereo.stereoStatus should be(true)
      stereo.cdStatus should be(true)
      stereo.volume should be(11)
    }

    it("should_turn_off_stereo_when_press_third_off_button") {
      val stereo = new Stereo();
      val remoteControl = new RemoteControl(null, null, stereo);
      remoteControl.off(3);
      stereo.stereoStatus should be(false)
      stereo.cdStatus should be(false)
      stereo.volume should be(0)
    }
  }
}
