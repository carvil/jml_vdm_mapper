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
package org.overturetool.ast.imp;

// ***** VDMTOOLS END Name=package

// ***** VDMTOOLS START Name=imports KEEP=YES

import jp.co.csk.vdm.toolbox.VDM.*;
import java.util.*;
import org.overturetool.ast.itf.*;
// ***** VDMTOOLS END Name=imports



public class OmlSetRangeExpression extends OmlExpression implements IOmlSetRangeExpression {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivLower KEEP=NO
  private IOmlExpression ivLower = null;
// ***** VDMTOOLS END Name=ivLower

// ***** VDMTOOLS START Name=ivUpper KEEP=NO
  private IOmlExpression ivUpper = null;
// ***** VDMTOOLS END Name=ivUpper


// ***** VDMTOOLS START Name=OmlSetRangeExpression KEEP=NO
  public OmlSetRangeExpression () throws CGException {
    try {

      ivLower = null;
      ivUpper = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlSetRangeExpression


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("SetRangeExpression");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitSetRangeExpression((IOmlSetRangeExpression) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlSetRangeExpression KEEP=NO
  public OmlSetRangeExpression (final IOmlExpression p1, final IOmlExpression p2) throws CGException {

    try {

      ivLower = null;
      ivUpper = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setLower((IOmlExpression) p1);
      setUpper((IOmlExpression) p2);
    }
  }
// ***** VDMTOOLS END Name=OmlSetRangeExpression


// ***** VDMTOOLS START Name=OmlSetRangeExpression KEEP=NO
  public OmlSetRangeExpression (final IOmlExpression p1, final IOmlExpression p2, final Long line, final Long column) throws CGException {

    try {

      ivLower = null;
      ivUpper = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setLower((IOmlExpression) p1);
      setUpper((IOmlExpression) p2);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlSetRangeExpression


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("lower");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setLower((IOmlExpression) data.get(fname));
    }
    {

      String fname = new String("upper");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setUpper((IOmlExpression) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getLower KEEP=NO
  public IOmlExpression getLower () throws CGException {
    return (IOmlExpression) ivLower;
  }
// ***** VDMTOOLS END Name=getLower


// ***** VDMTOOLS START Name=setLower KEEP=NO
  public void setLower (final IOmlExpression parg) throws CGException {
    ivLower = (IOmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setLower


// ***** VDMTOOLS START Name=getUpper KEEP=NO
  public IOmlExpression getUpper () throws CGException {
    return (IOmlExpression) ivUpper;
  }
// ***** VDMTOOLS END Name=getUpper


// ***** VDMTOOLS START Name=setUpper KEEP=NO
  public void setUpper (final IOmlExpression parg) throws CGException {
    ivUpper = (IOmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setUpper

}
;
