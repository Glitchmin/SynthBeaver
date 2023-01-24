import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;
import java.util.function.Function;

import static java.lang.Math.ceil;

public class SoundGeneration {
    public static void main(String[] args) {
        try {
            // Set the sample rate and number of channels
            float sampleRate = 44100;
            int channels = 1;
            AudioFormat audioFormat = new AudioFormat(sampleRate, 8, channels, true, true);

            // Open a new audio stream
            DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
            SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);
            line.open(audioFormat);
            line.start();

            // Set the duration of the sound
            int duration = 30;

            // Create a buffer to hold the audio samples
            byte[] buffer = new byte[(int) (sampleRate * duration)];

            // Generate the samples
//            double timeLength = (double) buffer.length / sampleRate;
//            System.out.println("timeLength: " + timeLength);
//            for (int i = 0; i < buffer.length; i++) {
//                double time = (double) i / sampleRate;
//
////                double frequency = 440 + 220 * (floor(time*5)%2) + 50 * Math.sin(time * 2 * Math.PI);
////                double frequency = 440 + 50 * Math.sin(time * 2 * Math.PI);
//                double frequency = 440 + 2000 * Math.pow(time - timeLength/2, 2)/timeLength;
//                // + 300 * Math.sin(time * 2 * Math.PI);
//                if(i % (sampleRate/10) == 0)
//                {
//                    System.out.println("frequency = " + frequency + " | time = " + (time - timeLength/2));
//                }
//                double angle = i / (sampleRate / (frequency)) * 2.0 * Math.PI;
//                buffer[i] = (byte) (Math.sin(angle) * 127);
//            }

            Function<Double, Double> surfed = x -> Math.sin(x); //sin
//                Function<Double, Double> surfed = (Math.ceil(waveArg/Math.PI) * 127); //square
//                Function<Double, Double> surfed = (((Math.abs(waveArg % (Math.PI * 2) - Math.PI) - Math.PI/2)/Math.PI*2)* 127); //tooth
//                Function<Double, Double> surfed = ((Math.pow(90,  (-Math.abs((Math.abs(waveArg % (Math.PI * 2) - Math.PI)) ))) * 2 -1 )* 127); //peak

//                Function<Double, Double> freqFun =  time -> 440 + 2000 * Math.pow(time - (double) duration / 2, 2) / duration; //up-down square curve
//                Function<Double, Double> freqFun =  time -> 440 + 2000 + 2000 * Math.sin(time * Math.PI * 2); //sinus of freqs
//                Function<Double, Double> freqFun =  time -> 440 + 2000 + 2000 * Math.sin(time * time * Math.PI * 2 ); //speeding up sinus of freqs
//                Function<Double, Double> freqFun =  time -> 440 + 2000 + 900 * Math.sin(time * time * Math.PI * 2) + 800 * Math.sin(time * 2 * Math.PI * 2); //combined
//                Function<Double, Double> freqFun =  time -> 440 + 1000 * (ceil(time) % 3);
//            Function<Double, Double> freqFunction = time -> (40 + (1000 + 500 * Math.sin(time * time * Math.PI * 2) + 400 * Math.sin(time * 2 * Math.PI * 2)) * ((ceil(time) % 3 + 1) / 2)); //combined
            Function<Double, Double> ceilsFun =  time -> 440 + 1000 * (ceil(time) % 3);
            Function<Double, Double> combinedFun = time -> (40 + (1000 + 500 * Math.sin(time * time * Math.PI * 2) + 400 * Math.sin(time * 2 * Math.PI * 2)) * ((ceil(time) % 3 + 1) / 2)); //combined
            Function<Double, Double> freqFun = x -> ceilsFun.apply(x) + combinedFun.apply(x);

//            Function<Double, Double> amplitude = x -> 127.0;
//            Function<Double, Double> amplitude = t -> {
//                if (t / (duration) * 127 > 127) {
//                    System.out.println("ampl = " + t / (duration) * 127);
//                }
//                return  t / (duration) * 127;
//            };

            Function<Double, Double> amplitude = t -> {
//                return  Math.sin(t) * 127;
                return  Math.sin(t)  * Math.min(1, ceil(t* 4) % 4) * 127.0;
//                return  127.0;
            };


            double waveArg = 0;
            for (int i = 0; i < buffer.length; i++) {
                double time = (double) i / sampleRate;
                waveArg += 1 / sampleRate * freqFun.apply(time + 5);
//                if (i % (sampleRate / 10) == 0) {
//                    System.out.println("frequency = " + frequency);
//                }
                buffer[i] = (byte) (surfed.apply(waveArg).doubleValue() * amplitude.apply(time));
            }
            // Write the samples to the audio stream
            line.write(buffer, 0, buffer.length);

            // Close the audio stream
            line.drain();
            line.stop();
            line.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}