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



public class OmlBinaryExpression extends OmlExpression implements IOmlBinaryExpression {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivLhsExpression KEEP=NO
  private IOmlExpression ivLhsExpression = null;
// ***** VDMTOOLS END Name=ivLhsExpression

// ***** VDMTOOLS START Name=ivOperator KEEP=NO
  private IOmlBinaryOperator ivOperator = null;
// ***** VDMTOOLS END Name=ivOperator

// ***** VDMTOOLS START Name=ivRhsExpression KEEP=NO
  private IOmlExpression ivRhsExpression = null;
// ***** VDMTOOLS END Name=ivRhsExpression


// ***** VDMTOOLS START Name=OmlBinaryExpression KEEP=NO
  public OmlBinaryExpression () throws CGException {
    try {

      ivLhsExpression = null;
      ivOperator = null;
      ivRhsExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlBinaryExpression


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("BinaryExpression");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitBinaryExpression((IOmlBinaryExpression) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlBinaryExpression KEEP=NO
  public OmlBinaryExpression (final IOmlExpression p1, final IOmlBinaryOperator p2, final IOmlExpression p3) throws CGException {

    try {

      ivLhsExpression = null;
      ivOperator = null;
      ivRhsExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setLhsExpression((IOmlExpression) p1);
      setOperator((IOmlBinaryOperator) p2);
      setRhsExpression((IOmlExpression) p3);
    }
  }
// ***** VDMTOOLS END Name=OmlBinaryExpression


// ***** VDMTOOLS START Name=OmlBinaryExpression KEEP=NO
  public OmlBinaryExpression (final IOmlExpression p1, final IOmlBinaryOperator p2, final IOmlExpression p3, final Long line, final Long column) throws CGException {

    try {

      ivLhsExpression = null;
      ivOperator = null;
      ivRhsExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setLhsExpression((IOmlExpression) p1);
      setOperator((IOmlBinaryOperator) p2);
      setRhsExpression((IOmlExpression) p3);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlBinaryExpression


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("lhs_expression");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setLhsExpression((IOmlExpression) data.get(fname));
    }
    {

      String fname = new String("operator");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setOperator((IOmlBinaryOperator) data.get(fname));
    }
    {

      String fname = new String("rhs_expression");
      Boolean cond_22 = null;
      cond_22 = new Boolean(data.containsKey(fname));
      if (cond_22.booleanValue()) 
        setRhsExpression((IOmlExpression) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getLhsExpression KEEP=NO
  public IOmlExpression getLhsExpression () throws CGException {
    return (IOmlExpression) ivLhsExpression;
  }
// ***** VDMTOOLS END Name=getLhsExpression


// ***** VDMTOOLS START Name=setLhsExpression KEEP=NO
  public void setLhsExpression (final IOmlExpression parg) throws CGException {
    ivLhsExpression = (IOmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setLhsExpression


// ***** VDMTOOLS START Name=getOperator KEEP=NO
  public IOmlBinaryOperator getOperator () throws CGException {
    return (IOmlBinaryOperator) ivOperator;
  }
// ***** VDMTOOLS END Name=getOperator


// ***** VDMTOOLS START Name=setOperator KEEP=NO
  public void setOperator (final IOmlBinaryOperator parg) throws CGException {
    ivOperator = (IOmlBinaryOperator) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setOperator


// ***** VDMTOOLS START Name=getRhsExpression KEEP=NO
  public IOmlExpression getRhsExpression () throws CGException {
    return (IOmlExpression) ivRhsExpression;
  }
// ***** VDMTOOLS END Name=getRhsExpression


// ***** VDMTOOLS START Name=setRhsExpression KEEP=NO
  public void setRhsExpression (final IOmlExpression parg) throws CGException {
    ivRhsExpression = (IOmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setRhsExpression

}
;
