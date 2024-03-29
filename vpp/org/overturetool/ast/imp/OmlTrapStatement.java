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



public class OmlTrapStatement extends OmlStatement implements IOmlTrapStatement {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivPatternBind KEEP=NO
  private IOmlPatternBind ivPatternBind = null;
// ***** VDMTOOLS END Name=ivPatternBind

// ***** VDMTOOLS START Name=ivWithPart KEEP=NO
  private IOmlStatement ivWithPart = null;
// ***** VDMTOOLS END Name=ivWithPart

// ***** VDMTOOLS START Name=ivInPart KEEP=NO
  private IOmlStatement ivInPart = null;
// ***** VDMTOOLS END Name=ivInPart


// ***** VDMTOOLS START Name=OmlTrapStatement KEEP=NO
  public OmlTrapStatement () throws CGException {
    try {

      ivPatternBind = null;
      ivWithPart = null;
      ivInPart = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlTrapStatement


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("TrapStatement");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitTrapStatement((IOmlTrapStatement) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlTrapStatement KEEP=NO
  public OmlTrapStatement (final IOmlPatternBind p1, final IOmlStatement p2, final IOmlStatement p3) throws CGException {

    try {

      ivPatternBind = null;
      ivWithPart = null;
      ivInPart = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setPatternBind((IOmlPatternBind) p1);
      setWithPart((IOmlStatement) p2);
      setInPart((IOmlStatement) p3);
    }
  }
// ***** VDMTOOLS END Name=OmlTrapStatement


// ***** VDMTOOLS START Name=OmlTrapStatement KEEP=NO
  public OmlTrapStatement (final IOmlPatternBind p1, final IOmlStatement p2, final IOmlStatement p3, final Long line, final Long column) throws CGException {

    try {

      ivPatternBind = null;
      ivWithPart = null;
      ivInPart = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setPatternBind((IOmlPatternBind) p1);
      setWithPart((IOmlStatement) p2);
      setInPart((IOmlStatement) p3);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlTrapStatement


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("pattern_bind");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setPatternBind((IOmlPatternBind) data.get(fname));
    }
    {

      String fname = new String("with_part");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setWithPart((IOmlStatement) data.get(fname));
    }
    {

      String fname = new String("in_part");
      Boolean cond_22 = null;
      cond_22 = new Boolean(data.containsKey(fname));
      if (cond_22.booleanValue()) 
        setInPart((IOmlStatement) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getPatternBind KEEP=NO
  public IOmlPatternBind getPatternBind () throws CGException {
    return (IOmlPatternBind) ivPatternBind;
  }
// ***** VDMTOOLS END Name=getPatternBind


// ***** VDMTOOLS START Name=setPatternBind KEEP=NO
  public void setPatternBind (final IOmlPatternBind parg) throws CGException {
    ivPatternBind = (IOmlPatternBind) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setPatternBind


// ***** VDMTOOLS START Name=getWithPart KEEP=NO
  public IOmlStatement getWithPart () throws CGException {
    return (IOmlStatement) ivWithPart;
  }
// ***** VDMTOOLS END Name=getWithPart


// ***** VDMTOOLS START Name=setWithPart KEEP=NO
  public void setWithPart (final IOmlStatement parg) throws CGException {
    ivWithPart = (IOmlStatement) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setWithPart


// ***** VDMTOOLS START Name=getInPart KEEP=NO
  public IOmlStatement getInPart () throws CGException {
    return (IOmlStatement) ivInPart;
  }
// ***** VDMTOOLS END Name=getInPart


// ***** VDMTOOLS START Name=setInPart KEEP=NO
  public void setInPart (final IOmlStatement parg) throws CGException {
    ivInPart = (IOmlStatement) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setInPart

}
;
