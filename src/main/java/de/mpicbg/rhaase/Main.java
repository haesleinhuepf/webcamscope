package de.mpicbg.rhaase;

import gnu.io.CommPortIdentifier;
import gnu.io.RXTXCommDriver;
import ij.ImagePlus;
import net.imagej.ImageJ;
import net.imglib2.Cursor;
import net.imglib2.img.Img;
import net.imglib2.img.array.ArrayImgs;
import net.imglib2.img.display.imagej.ImageJFunctions;
import net.imglib2.type.numeric.real.FloatType;

import java.util.Enumeration;
import java.util.Random;

public class Main
{
  public static void main(final String... args) throws Exception
  {
    Enumeration<CommPortIdentifier> ports = CommPortIdentifier.getPortIdentifiers();
    while(ports.hasMoreElements()) {
      System.out.println(ports.nextElement().getName());
    }

  }
}
