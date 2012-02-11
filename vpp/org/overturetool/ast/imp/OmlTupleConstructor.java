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



public class OmlTupleConstructor extends OmlExpression implements IOmlTupleConstructor {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivExpressionList KEEP=NO
  private Vector ivExpressionList = null;
// ***** VDMTOOLS END Name=ivExpressionList


// ***** VDMTOOLS START Name=OmlTupleConstructor KEEP=NO
  public OmlTupleConstructor () throws CGException {
    try {
      ivExpressionList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlTupleConstructor


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("TupleConstructor");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitTupleConstructor((IOmlTupleConstructor) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlTupleConstructor KEEP=NO
  public OmlTupleConstructor (final Vector p1) throws CGException {

    try {
      ivExpressionList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    setExpressionList(p1);
  }
// ***** VDMTOOLS END Name=OmlTupleConstructor


// ***** VDMTOOLS START Name=OmlTupleConstructor KEEP=NO
  public OmlTupleConstructor (final Vector p1, final Long line, final Long column) throws CGException {

    try {
      ivExpressionList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setExpressionList(p1);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlTupleConstructor


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("expression_list");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setExpressionList((Vector) data.get(fname));
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getExpressionList KEEP=NO
  public Vector getExpressionList () throws CGException {
    return ivExpressionList;
  }
// ***** VDMTOOLS END Name=getExpressionList


// ***** VDMTOOLS START Name=setExpressionList KEEP=NO
  public void setExpressionList (final Vector parg) throws CGException {
    ivExpressionList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setExpressionList


// ***** VDMTOOLS START Name=addExpressionList KEEP=NO
  public void addExpressionList (final IOmlNode parg) throws CGException {
    ivExpressionList.add(parg);
  }
// ***** VDMTOOLS END Name=addExpressionList

}
;
