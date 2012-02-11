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



public class OmlIndexForLoop extends OmlStatement implements IOmlIndexForLoop {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivIdentifier KEEP=NO
  private String ivIdentifier = null;
// ***** VDMTOOLS END Name=ivIdentifier

// ***** VDMTOOLS START Name=ivInitExpression KEEP=NO
  private IOmlExpression ivInitExpression = null;
// ***** VDMTOOLS END Name=ivInitExpression

// ***** VDMTOOLS START Name=ivLimitExpression KEEP=NO
  private IOmlExpression ivLimitExpression = null;
// ***** VDMTOOLS END Name=ivLimitExpression

// ***** VDMTOOLS START Name=ivByExpression KEEP=NO
  private IOmlExpression ivByExpression = null;
// ***** VDMTOOLS END Name=ivByExpression

// ***** VDMTOOLS START Name=ivStatement KEEP=NO
  private IOmlStatement ivStatement = null;
// ***** VDMTOOLS END Name=ivStatement


// ***** VDMTOOLS START Name=OmlIndexForLoop KEEP=NO
  public OmlIndexForLoop () throws CGException {
    try {

      ivIdentifier = UTIL.ConvertToString(new String());
      ivInitExpression = null;
      ivLimitExpression = null;
      ivByExpression = null;
      ivStatement = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlIndexForLoop


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("IndexForLoop");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitIndexForLoop((IOmlIndexForLoop) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlIndexForLoop KEEP=NO
  public OmlIndexForLoop (final String p1, final IOmlExpression p2, final IOmlExpression p3, final IOmlExpression p4, final IOmlStatement p5) throws CGException {

    try {

      ivIdentifier = UTIL.ConvertToString(new String());
      ivInitExpression = null;
      ivLimitExpression = null;
      ivByExpression = null;
      ivStatement = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setIdentifier(p1);
      setInitExpression((IOmlExpression) p2);
      setLimitExpression((IOmlExpression) p3);
      setByExpression((IOmlExpression) p4);
      setStatement((IOmlStatement) p5);
    }
  }
// ***** VDMTOOLS END Name=OmlIndexForLoop


// ***** VDMTOOLS START Name=OmlIndexForLoop KEEP=NO
  public OmlIndexForLoop (final String p1, final IOmlExpression p2, final IOmlExpression p3, final IOmlExpression p4, final IOmlStatement p5, final Long line, final Long column) throws CGException {

    try {

      ivIdentifier = UTIL.ConvertToString(new String());
      ivInitExpression = null;
      ivLimitExpression = null;
      ivByExpression = null;
      ivStatement = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setIdentifier(p1);
      setInitExpression((IOmlExpression) p2);
      setLimitExpression((IOmlExpression) p3);
      setByExpression((IOmlExpression) p4);
      setStatement((IOmlStatement) p5);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlIndexForLoop


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("identifier");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setIdentifier(UTIL.ConvertToString(data.get(fname)));
    }
    {

      String fname = new String("init_expression");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setInitExpression((IOmlExpression) data.get(fname));
    }
    {

      String fname = new String("limit_expression");
      Boolean cond_22 = null;
      cond_22 = new Boolean(data.containsKey(fname));
      if (cond_22.booleanValue()) 
        setLimitExpression((IOmlExpression) data.get(fname));
    }
    {

      String fname = new String("by_expression");
      Boolean cond_31 = null;
      cond_31 = new Boolean(data.containsKey(fname));
      if (cond_31.booleanValue()) 
        setByExpression((IOmlExpression) data.get(fname));
    }
    {

      String fname = new String("statement");
      Boolean cond_40 = null;
      cond_40 = new Boolean(data.containsKey(fname));
      if (cond_40.booleanValue()) 
        setStatement((IOmlStatement) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getIdentifier KEEP=NO
  public String getIdentifier () throws CGException {
    return ivIdentifier;
  }
// ***** VDMTOOLS END Name=getIdentifier


// ***** VDMTOOLS START Name=setIdentifier KEEP=NO
  public void setIdentifier (final String parg) throws CGException {
    ivIdentifier = UTIL.ConvertToString(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setIdentifier


// ***** VDMTOOLS START Name=getInitExpression KEEP=NO
  public IOmlExpression getInitExpression () throws CGException {
    return (IOmlExpression) ivInitExpression;
  }
// ***** VDMTOOLS END Name=getInitExpression


// ***** VDMTOOLS START Name=setInitExpression KEEP=NO
  public void setInitExpression (final IOmlExpression parg) throws CGException {
    ivInitExpression = (IOmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setInitExpression


// ***** VDMTOOLS START Name=getLimitExpression KEEP=NO
  public IOmlExpression getLimitExpression () throws CGException {
    return (IOmlExpression) ivLimitExpression;
  }
// ***** VDMTOOLS END Name=getLimitExpression


// ***** VDMTOOLS START Name=setLimitExpression KEEP=NO
  public void setLimitExpression (final IOmlExpression parg) throws CGException {
    ivLimitExpression = (IOmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setLimitExpression


// ***** VDMTOOLS START Name=getByExpression KEEP=NO
  public IOmlExpression getByExpression () throws CGException {
    return (IOmlExpression) ivByExpression;
  }
// ***** VDMTOOLS END Name=getByExpression


// ***** VDMTOOLS START Name=hasByExpression KEEP=NO
  public Boolean hasByExpression () throws CGException {
    return new Boolean(!UTIL.equals(ivByExpression, null));
  }
// ***** VDMTOOLS END Name=hasByExpression


// ***** VDMTOOLS START Name=setByExpression KEEP=NO
  public void setByExpression (final IOmlExpression parg) throws CGException {
    ivByExpression = (IOmlExpression) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setByExpression


// ***** VDMTOOLS START Name=getStatement KEEP=NO
  public IOmlStatement getStatement () throws CGException {
    return (IOmlStatement) ivStatement;
  }
// ***** VDMTOOLS END Name=getStatement


// ***** VDMTOOLS START Name=setStatement KEEP=NO
  public void setStatement (final IOmlStatement parg) throws CGException {
    ivStatement = (IOmlStatement) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setStatement

}
;
