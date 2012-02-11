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



public class JmlQuantifierDeclaration extends JmlNode implements IJmlQuantifierDeclaration {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivBound KEEP=NO
  private IJmlBoundModifiers ivBound = null;
// ***** VDMTOOLS END Name=ivBound

// ***** VDMTOOLS START Name=ivType KEEP=NO
  private IJmlType ivType = null;
// ***** VDMTOOLS END Name=ivType

// ***** VDMTOOLS START Name=ivVars KEEP=NO
  private Vector ivVars = null;
// ***** VDMTOOLS END Name=ivVars


// ***** VDMTOOLS START Name=JmlQuantifierDeclaration KEEP=NO
  public JmlQuantifierDeclaration () throws CGException {
    try {

      ivBound = null;
      ivType = null;
      ivVars = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=JmlQuantifierDeclaration


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("QuantifierDeclaration");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IJmlVisitor pVisitor) throws CGException {
    pVisitor.visitQuantifierDeclaration((IJmlQuantifierDeclaration) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=JmlQuantifierDeclaration KEEP=NO
  public JmlQuantifierDeclaration (final IJmlBoundModifiers p1, final IJmlType p2, final Vector p3) throws CGException {

    try {

      ivBound = null;
      ivType = null;
      ivVars = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setBound((IJmlBoundModifiers) p1);
      setType((IJmlType) p2);
      setVars(p3);
    }
  }
// ***** VDMTOOLS END Name=JmlQuantifierDeclaration


// ***** VDMTOOLS START Name=JmlQuantifierDeclaration KEEP=NO
  public JmlQuantifierDeclaration (final IJmlBoundModifiers p1, final IJmlType p2, final Vector p3, final Long line, final Long column) throws CGException {

    try {

      ivBound = null;
      ivType = null;
      ivVars = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setBound((IJmlBoundModifiers) p1);
      setType((IJmlType) p2);
      setVars(p3);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=JmlQuantifierDeclaration


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("bound");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setBound((IJmlBoundModifiers) data.get(fname));
    }
    {

      String fname = new String("type");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setType((IJmlType) data.get(fname));
    }
    {

      String fname = new String("vars");
      Boolean cond_22 = null;
      cond_22 = new Boolean(data.containsKey(fname));
      if (cond_22.booleanValue()) 
        setVars((Vector) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getBound KEEP=NO
  public IJmlBoundModifiers getBound () throws CGException {
    return (IJmlBoundModifiers) ivBound;
  }
// ***** VDMTOOLS END Name=getBound


// ***** VDMTOOLS START Name=hasBound KEEP=NO
  public Boolean hasBound () throws CGException {
    return new Boolean(!UTIL.equals(ivBound, null));
  }
// ***** VDMTOOLS END Name=hasBound


// ***** VDMTOOLS START Name=setBound KEEP=NO
  public void setBound (final IJmlBoundModifiers parg) throws CGException {
    ivBound = (IJmlBoundModifiers) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setBound


// ***** VDMTOOLS START Name=getType KEEP=NO
  public IJmlType getType () throws CGException {
    return (IJmlType) ivType;
  }
// ***** VDMTOOLS END Name=getType


// ***** VDMTOOLS START Name=setType KEEP=NO
  public void setType (final IJmlType parg) throws CGException {
    ivType = (IJmlType) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setType


// ***** VDMTOOLS START Name=getVars KEEP=NO
  public Vector getVars () throws CGException {
    return ivVars;
  }
// ***** VDMTOOLS END Name=getVars


// ***** VDMTOOLS START Name=setVars KEEP=NO
  public void setVars (final Vector parg) throws CGException {
    ivVars = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setVars


// ***** VDMTOOLS START Name=addVars KEEP=NO
  public void addVars (final String parg) throws CGException {
    ivVars.add(parg);
  }
// ***** VDMTOOLS END Name=addVars

}
;