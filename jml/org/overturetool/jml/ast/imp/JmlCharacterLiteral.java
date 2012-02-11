//
// THIS FILE IS AUTOMATICALLY GENERATED!!
//
// Generated at Mon 07-Jul-2008 by the VDM++ to JAVA Code Generator
// (v8.1.1b - Fri 06-Jun-2008 09:02:11)
//
// Supported compilers:
// jdk1.4
//

// ***** VDMTOOLS START Name=HeaderComment KEEP=NO
// ***** VDMTOOLS END Name=HeaderComment

// ***** VDMTOOLS START Name=package KEEP=NO
package org.overturetool.jml.ast.imp;

// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=YES

import jp.co.csk.vdm.toolbox.VDM.*;
import java.util.*;
import org.overturetool.jml.ast.itf.*;
// ***** VDMTOOLS END Name=imports



public class JmlCharacterLiteral extends JmlLiteral implements IJmlCharacterLiteral {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivVal KEEP=NO
  private Character ivVal = null;
// ***** VDMTOOLS END Name=ivVal


// ***** VDMTOOLS START Name=JmlCharacterLiteral KEEP=NO
  public JmlCharacterLiteral () throws CGException {
    try {
      ivVal = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=JmlCharacterLiteral


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("CharacterLiteral");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IJmlVisitor pVisitor) throws CGException {
    pVisitor.visitCharacterLiteral((IJmlCharacterLiteral) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=JmlCharacterLiteral KEEP=NO
  public JmlCharacterLiteral (final Character p1) throws CGException {

    try {
      ivVal = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    setVal(p1);
  }
// ***** VDMTOOLS END Name=JmlCharacterLiteral


// ***** VDMTOOLS START Name=JmlCharacterLiteral KEEP=NO
  public JmlCharacterLiteral (final Character p1, final Long line, final Long column) throws CGException {

    try {
      ivVal = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setVal(p1);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=JmlCharacterLiteral


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("val");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setVal((Character) data.get(fname));
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getVal KEEP=NO
  public Character getVal () throws CGException {
    return ivVal;
  }
// ***** VDMTOOLS END Name=getVal


// ***** VDMTOOLS START Name=setVal KEEP=NO
  public void setVal (final Character parg) throws CGException {
    ivVal = (Character) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setVal

}
;
