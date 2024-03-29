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



public class OmlThreadDefinition extends OmlDefinitionBlock implements IOmlThreadDefinition {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivThreadSpecification KEEP=NO
  private IOmlThreadSpecification ivThreadSpecification = null;
// ***** VDMTOOLS END Name=ivThreadSpecification


// ***** VDMTOOLS START Name=OmlThreadDefinition KEEP=NO
  public OmlThreadDefinition () throws CGException {
    try {
      ivThreadSpecification = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlThreadDefinition


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("ThreadDefinition");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitThreadDefinition((IOmlThreadDefinition) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlThreadDefinition KEEP=NO
  public OmlThreadDefinition (final IOmlThreadSpecification p1) throws CGException {

    try {
      ivThreadSpecification = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    setThreadSpecification((IOmlThreadSpecification) p1);
  }
// ***** VDMTOOLS END Name=OmlThreadDefinition


// ***** VDMTOOLS START Name=OmlThreadDefinition KEEP=NO
  public OmlThreadDefinition (final IOmlThreadSpecification p1, final Long line, final Long column) throws CGException {

    try {
      ivThreadSpecification = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setThreadSpecification((IOmlThreadSpecification) p1);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlThreadDefinition


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("thread_specification");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setThreadSpecification((IOmlThreadSpecification) data.get(fname));
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getThreadSpecification KEEP=NO
  public IOmlThreadSpecification getThreadSpecification () throws CGException {
    return (IOmlThreadSpecification) ivThreadSpecification;
  }
// ***** VDMTOOLS END Name=getThreadSpecification


// ***** VDMTOOLS START Name=hasThreadSpecification KEEP=NO
  public Boolean hasThreadSpecification () throws CGException {
    return new Boolean(!UTIL.equals(ivThreadSpecification, null));
  }
// ***** VDMTOOLS END Name=hasThreadSpecification


// ***** VDMTOOLS START Name=setThreadSpecification KEEP=NO
  public void setThreadSpecification (final IOmlThreadSpecification parg) throws CGException {
    ivThreadSpecification = (IOmlThreadSpecification) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setThreadSpecification

}
;
