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



public class OmlSetForLoop extends OmlStatement implements IOmlSetForLoop {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivPattern KEEP=NO
  private IOmlPattern ivPattern = null;
// ***** VDMTOOLS END Name=ivPattern

// ***** VDMTOOLS START Name=ivExpression KEEP=NO
  private IOmlExpression ivExpression = null;
// ***** VDMTOOLS END Name=ivExpression

// ***** VDMTOOLS START Name=ivStatement KEEP=NO
  private IOmlStatement ivStatement = null;
// ***** VDMTOOLS END Name=ivStatement


// ***** VDMTOOLS START Name=OmlSetForLoop KEEP=NO
  public OmlSetForLoop () throws CGException {
    try {

      ivPattern = null;
      ivExpression = null;
      ivStatement = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlSetForLoop


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("SetForLoop");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitSetForLoop((IOmlSetForLoop) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlSetForLoop KEEP=NO
  public OmlSetForLoop (final IOmlPattern p1, final IOmlExpression p2, final IOmlStatement p3) throws CGException {

    try {

      ivPattern = null;
      ivExpression = null;
      ivStatement = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setPattern((IOmlPattern) p1);
      setExpression((IOmlExpression) p2);
      setStatement((IOmlStatement) p3);
    }
  }
// ***** VDMTOOLS END Name=OmlSetForLoop


// ***** VDMTOOLS START Name=OmlSetForLoop KEEP=NO
  public OmlSetForLoop (final IOmlPattern p1, final IOmlExpression p2, final IOmlStatement p3, final Long line, final Long column) throws CGException {

    try {

      ivPattern = null;
      ivExpression = null;
      ivStatement = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setPattern((IOmlPattern) p1);
      setExpression((IOmlExpression) p2);
      setStatement((IOmlStatement) p3);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlSetForLoop


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("pattern");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setPattern((IOmlPattern) data.get(fname));
    }
    {

      String fname = new String("expression");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setExpression((IOmlExpression) data.get(fname));
    }
    {

      String fname = new String("statement");
      Boolean cond_22 = null;
      cond_22 = new Boolean(data.containsKey(fname));
      if (cond_22.booleanValue()) 
        setStatement((IOmlStatement) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getPattern KEEP=NO
  public IOmlPattern getPattern () throws CGException {
    return (IOmlPattern) ivPattern;
  }
// ***** VDMTOOLS END Name=getPattern


// ***** VDMTOOLS START Name=setPattern KEEP=NO
  public void setPattern (final IOmlPattern parg) throws CGException {
    ivPattern = (IOmlPattern) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setPattern


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
