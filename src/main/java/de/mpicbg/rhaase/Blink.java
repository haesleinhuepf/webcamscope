package de.mpicbg.rhaase;

import org.sintef.jarduino.InvalidPinTypeException;
import org.sintef.jarduino.JArduino;
import org.sintef.jarduino.comm.Serial4JArduino;

/*
Blink
Turns on an LED on for one second, then off for one second, repeatedly.

This example code is in the public domain.
 */

public class Blink extends JArduino {

  // initialize the stepper library on pins 8 through 11:
  Stepper myStepper(stepsPerRevolution, 8, 9, 10, 11);


  public Blink(String port) {
    super(port);
  }

  @Override
  protected void setup() throws InvalidPinTypeException {
    pinMode(p12, OUTPUT);
  }

  @Override
  protected void loop() throws InvalidPinTypeException {
    digitalWrite(p12, HIGH); // set the LED on
    digitalWrite(p4, HIGH);
    delay(1000); // wait for a second
    digitalWrite(p12, LOW); // set the LED off
    digitalWrite(p4, LOW);
    delay(1000); // wait for a second
  }

  public static void main(String... args) {
    String serialPort = "COM3";
    /*if (args.length == 1) {
      serialPort = args[0];
    } else {
      serialPort = Serial4JArduino.selectSerialPort();
    }*/
    JArduino arduino = new Blink(serialPort);
    arduino.runArduinoProcess();
  }
}