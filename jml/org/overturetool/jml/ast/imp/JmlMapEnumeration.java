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



public class JmlMapEnumeration extends JmlExpression implements IJmlMapEnumeration {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivList KEEP=NO
  private Vector ivList = null;
// ***** VDMTOOLS END Name=ivList


// ***** VDMTOOLS START Name=JmlMapEnumeration KEEP=NO
  public JmlMapEnumeration () throws CGException {
    try {
      ivList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=JmlMapEnumeration


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("MapEnumeration");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IJmlVisitor pVisitor) throws CGException {
    pVisitor.visitMapEnumeration((IJmlMapEnumeration) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=JmlMapEnumeration KEEP=NO
  public JmlMapEnumeration (final Vector p1) throws CGException {

    try {
      ivList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    setList(p1);
  }
// ***** VDMTOOLS END Name=JmlMapEnumeration


// ***** VDMTOOLS START Name=JmlMapEnumeration KEEP=NO
  public JmlMapEnumeration (final Vector p1, final Long line, final Long column) throws CGException {

    try {
      ivList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setList(p1);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=JmlMapEnumeration


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("list");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setList((Vector) data.get(fname));
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getList KEEP=NO
  public Vector getList () throws CGException {
    return ivList;
  }
// ***** VDMTOOLS END Name=getList


// ***** VDMTOOLS START Name=setList KEEP=NO
  public void setList (final Vector parg) throws CGException {
    ivList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setList


// ***** VDMTOOLS START Name=addList KEEP=NO
  public void addList (final IJmlNode parg) throws CGException {
    ivList.add(parg);
  }
// ***** VDMTOOLS END Name=addList

}
;
