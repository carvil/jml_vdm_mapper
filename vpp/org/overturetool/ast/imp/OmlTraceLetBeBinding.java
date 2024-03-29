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



public class OmlTraceLetBeBinding extends OmlTraceBinding implements IOmlTraceLetBeBinding {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivBind KEEP=NO
  private IOmlBind ivBind = null;
// ***** VDMTOOLS END Name=ivBind

// ***** VDMTOOLS START Name=ivBest KEEP=NO
  private IOmlExpression ivBest = null;
// ***** VDMTOOLS END Name=ivBest


// ***** VDMTOOLS START Name=OmlTraceLetBeBinding KEEP=NO
  public OmlTraceLetBeBinding () throws CGException {
    try {

      ivBind = null;
      ivBest = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlTraceLetBeBinding


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("TraceLetBeBinding");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitTraceLetBeBinding((IOmlTraceLetBeBinding) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlTraceLetBeBinding KEEP=NO
  public OmlTraceLetBeBinding (final IOmlBind p1, final IOmlExpression p2) throws CGException {

    try {

      ivBind = null;
      ivBest = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setBind((IOmlBind) p1);
      setBest((IOmlExpression) p2);
    }
  }
// ***** VDMTOOLS END Name=OmlTraceLetBeBinding


// ***** VDMTOOLS START Name=OmlTraceLetBeBinding KEEP=NO
  public OmlTraceLetBeBinding (final IOmlBind p1, final IOmlExpression p2, final Long line, final Long column) throws CGException {

    try {

      ivBind = null;
      ivBest = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setBind((IOmlBind) p1);
      setBest((IOmlExpression) p2);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlTraceLetBeBinding


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("bind");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setBind((IOmlBind) data.get(fname));
    }
    {

      String fname = new String("best");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setBest((IOmlExpression) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getBind KEEP=NO
  public IOmlBind getBind () throws CGException {
    return (IOmlBind) ivBind;
  }
// ***** VDMTOOLS END Name=getBind


// ***** VDMTOOLS START Name=setBind KEEP=NO
  public void setBind (final IOmlBind parg) throws CGException {
    ivBind = (IOmlBind) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setBind


// ***** VDMTOOLS START Name=getBest KEEP=NO
  public IOmlExpression getBest () throws CGException {
    return (IOmlExpression) ivBest;
  }
// ***** VDMTOOLS END Name=getBest


// ***** VDMTOOLS START Name=hasBest KEEP=NO
  public Boolean hasBest () throws CGException {
    return new Boolean(!UTIL.equals(ivBest, null));
  }
// ***** VDMTOOLS END Name=hasBest


// ***** VDMTOOLS START Name=setBest KEEP=NO
  public void setBest (final IOmlExpression parg) throws CGException {
    ivBest = (IOmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setBest

}
;
