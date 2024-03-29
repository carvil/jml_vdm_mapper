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



public class OmlDefExpression extends OmlExpression implements IOmlDefExpression {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivPatternBindList KEEP=NO
  private Vector ivPatternBindList = null;
// ***** VDMTOOLS END Name=ivPatternBindList

// ***** VDMTOOLS START Name=ivExpression KEEP=NO
  private IOmlExpression ivExpression = null;
// ***** VDMTOOLS END Name=ivExpression


// ***** VDMTOOLS START Name=OmlDefExpression KEEP=NO
  public OmlDefExpression () throws CGException {
    try {

      ivPatternBindList = new Vector();
      ivExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlDefExpression


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("DefExpression");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitDefExpression((IOmlDefExpression) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlDefExpression KEEP=NO
  public OmlDefExpression (final Vector p1, final IOmlExpression p2) throws CGException {

    try {

      ivPatternBindList = new Vector();
      ivExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setPatternBindList(p1);
      setExpression((IOmlExpression) p2);
    }
  }
// ***** VDMTOOLS END Name=OmlDefExpression


// ***** VDMTOOLS START Name=OmlDefExpression KEEP=NO
  public OmlDefExpression (final Vector p1, final IOmlExpression p2, final Long line, final Long column) throws CGException {

    try {

      ivPatternBindList = new Vector();
      ivExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setPatternBindList(p1);
      setExpression((IOmlExpression) p2);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlDefExpression


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("pattern_bind_list");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setPatternBindList((Vector) data.get(fname));
    }
    {

      String fname = new String("expression");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setExpression((IOmlExpression) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getPatternBindList KEEP=NO
  public Vector getPatternBindList () throws CGException {
    return ivPatternBindList;
  }
// ***** VDMTOOLS END Name=getPatternBindList


// ***** VDMTOOLS START Name=setPatternBindList KEEP=NO
  public void setPatternBindList (final Vector parg) throws CGException {
    ivPatternBindList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setPatternBindList


// ***** VDMTOOLS START Name=addPatternBindList KEEP=NO
  public void addPatternBindList (final IOmlNode parg) throws CGException {
    ivPatternBindList.add(parg);
  }
// ***** VDMTOOLS END Name=addPatternBindList


// ***** VDMTOOLS START Name=getExpression KEEP=NO
  public IOmlExpression getExpression () throws CGException {
    return (IOmlExpression) ivExpression;
  }
// ***** VDMTOOLS END Name=getExpression


// ***** VDMTOOLS START Name=setExpression KEEP=NO
  public void setExpression (final IOmlExpression parg) throws CGException {
    ivExpression = (IOmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setExpression

}
;
