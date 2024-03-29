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



public class JmlThrowExpression extends JmlNode implements IJmlThrowExpression {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivException KEEP=NO
  private String ivException = null;
// ***** VDMTOOLS END Name=ivException

// ***** VDMTOOLS START Name=ivParams KEEP=NO
  private Vector ivParams = null;
// ***** VDMTOOLS END Name=ivParams


// ***** VDMTOOLS START Name=JmlThrowExpression KEEP=NO
  public JmlThrowExpression () throws CGException {
    try {

      ivException = UTIL.ConvertToString(new String());
      ivParams = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=JmlThrowExpression


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("ThrowExpression");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IJmlVisitor pVisitor) throws CGException {
    pVisitor.visitThrowExpression((IJmlThrowExpression) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=JmlThrowExpression KEEP=NO
  public JmlThrowExpression (final String p1, final Vector p2) throws CGException {

    try {

      ivException = UTIL.ConvertToString(new String());
      ivParams = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setException(p1);
      setParams(p2);
    }
  }
// ***** VDMTOOLS END Name=JmlThrowExpression


// ***** VDMTOOLS START Name=JmlThrowExpression KEEP=NO
  public JmlThrowExpression (final String p1, final Vector p2, final Long line, final Long column) throws CGException {

    try {

      ivException = UTIL.ConvertToString(new String());
      ivParams = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setException(p1);
      setParams(p2);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=JmlThrowExpression


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("exception");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setException(UTIL.ConvertToString(data.get(fname)));
    }
    {

      String fname = new String("params");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setParams((Vector) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getException KEEP=NO
  public String getException () throws CGException {
    return ivException;
  }
// ***** VDMTOOLS END Name=getException


// ***** VDMTOOLS START Name=setException KEEP=NO
  public void setException (final String parg) throws CGException {
    ivException = UTIL.ConvertToString(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setException


// ***** VDMTOOLS START Name=getParams KEEP=NO
  public Vector getParams () throws CGException {
    return ivParams;
  }
// ***** VDMTOOLS END Name=getParams


// ***** VDMTOOLS START Name=setParams KEEP=NO
  public void setParams (final Vector parg) throws CGException {
    ivParams = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setParams


// ***** VDMTOOLS START Name=addParams KEEP=NO
  public void addParams (final IJmlNode parg) throws CGException {
    ivParams.add(parg);
  }
// ***** VDMTOOLS END Name=addParams

}
;
