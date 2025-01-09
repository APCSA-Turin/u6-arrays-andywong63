package frq;

public class Sound {
  /* the array of values in this sound; guaranteed not to be null */
  private int[] samples;

  public Sound(int[] samples) {
    this.samples = samples;
  }

  public int[] getSamples() {
    return samples;
  }

  /*
   * Changes those values in this sound that have an amplitude
   * greater than limit. Values greater than limit are changed to
   * limit. Values less than -limit are changed to -limit.
   * The method returns the total number of values that were changed
   * in the array.
   *
   * PRECONDITION: limit ≥ 0
   */
  public int limitAmplitude(int limit) {
    int valuesChanged = 0;
    for (int i = 0; i < samples.length; i++) {
      if (samples[i] > limit) {
        samples[i] = limit;
        valuesChanged++;
      } else if (samples[i] < -limit) {
        samples[i] = -limit;
        valuesChanged++;
      }
    }
    return valuesChanged;
  }

  /*
   * Removes all silence from the beginning of this sound.
   * Silence is represented by a value of 0.
   *
   * PRECONDITION: samples contains at least one nonzero value
   *
   * POSTCONDITION: the length of samples reflects the removal
   * of starting silence
   */
  public void trimSilenceFromBeginning() {
    int silenceLength = 0;
    boolean checkSilence = true;
    for (int sample : samples) {
      if (checkSilence) {
        if (sample == 0) {
          silenceLength++;
        } else {
          checkSilence = false;
        }
      }
    }
    int[] newSamples = new int[samples.length - silenceLength];
    int index = 0;
    for (int i = silenceLength; i < samples.length; i++) {
      newSamples[index] = samples[i];
      index++;
    }
    samples = newSamples;
  }
}