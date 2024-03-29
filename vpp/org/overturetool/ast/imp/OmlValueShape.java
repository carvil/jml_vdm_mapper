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



public class OmlValueShape extends OmlNode implements IOmlValueShape {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivPattern KEEP=NO
  private IOmlPattern ivPattern = null;
// ***** VDMTOOLS END Name=ivPattern

// ***** VDMTOOLS START Name=ivType KEEP=NO
  private IOmlType ivType = null;
// ***** VDMTOOLS END Name=ivType

// ***** VDMTOOLS START Name=ivExpression KEEP=NO
  private IOmlExpression ivExpression = null;
// ***** VDMTOOLS END Name=ivExpression


// ***** VDMTOOLS START Name=OmlValueShape KEEP=NO
  public OmlValueShape () throws CGException {
    try {

      ivPattern = null;
      ivType = null;
      ivExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlValueShape


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("ValueShape");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitValueShape((IOmlValueShape) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlValueShape KEEP=NO
  public OmlValueShape (final IOmlPattern p1, final IOmlType p2, final IOmlExpression p3) throws CGException {

    try {

      ivPattern = null;
      ivType = null;
      ivExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setPattern((IOmlPattern) p1);
      setType((IOmlType) p2);
      setExpression((IOmlExpression) p3);
    }
  }
// ***** VDMTOOLS END Name=OmlValueShape


// ***** VDMTOOLS START Name=OmlValueShape KEEP=NO
  public OmlValueShape (final IOmlPattern p1, final IOmlType p2, final IOmlExpression p3, final Long line, final Long column) throws CGException {

    try {

      ivPattern = null;
      ivType = null;
      ivExpression = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setPattern((IOmlPattern) p1);
      setType((IOmlType) p2);
      setExpression((IOmlExpression) p3);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlValueShape


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

      String fname = new String("type");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setType((IOmlType) data.get(fname));
    }
    {

      String fname = new String("expression");
      Boolean cond_22 = null;
      cond_22 = new Boolean(data.containsKey(fname));
      if (cond_22.booleanValue()) 
        setExpression((IOmlExpression) data.get(fname));
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


// ***** VDMTOOLS START Name=getType KEEP=NO
  public IOmlType getType () throws CGException {
    return (IOmlType) ivType;
  }
// ***** VDMTOOLS END Name=getType


// ***** VDMTOOLS START Name=hasType KEEP=NO
  public Boolean hasType () throws CGException {
    return new Boolean(!UTIL.equals(ivType, null));
  }
// ***** VDMTOOLS END Name=hasType


// ***** VDMTOOLS START Name=setType KEEP=NO
  public void setType (final IOmlType parg) throws CGException {
    ivType = (IOmlType) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setType


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
