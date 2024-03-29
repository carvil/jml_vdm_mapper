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



public class JmlField extends JmlNode implements IJmlField {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivId KEEP=NO
  private String ivId = null;
// ***** VDMTOOLS END Name=ivId

// ***** VDMTOOLS START Name=ivType KEEP=NO
  private IJmlType ivType = null;
// ***** VDMTOOLS END Name=ivType


// ***** VDMTOOLS START Name=JmlField KEEP=NO
  public JmlField () throws CGException {
    try {

      ivId = UTIL.ConvertToString(new String());
      ivType = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=JmlField


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("Field");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IJmlVisitor pVisitor) throws CGException {
    pVisitor.visitField((IJmlField) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=JmlField KEEP=NO
  public JmlField (final String p1, final IJmlType p2) throws CGException {

    try {

      ivId = UTIL.ConvertToString(new String());
      ivType = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setId(p1);
      setType((IJmlType) p2);
    }
  }
// ***** VDMTOOLS END Name=JmlField


// ***** VDMTOOLS START Name=JmlField KEEP=NO
  public JmlField (final String p1, final IJmlType p2, final Long line, final Long column) throws CGException {

    try {

      ivId = UTIL.ConvertToString(new String());
      ivType = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setId(p1);
      setType((IJmlType) p2);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=JmlField


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("id");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setId(UTIL.ConvertToString(data.get(fname)));
    }
    {

      String fname = new String("type");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setType((IJmlType) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getId KEEP=NO
  public String getId () throws CGException {
    return ivId;
  }
// ***** VDMTOOLS END Name=getId


// ***** VDMTOOLS START Name=setId KEEP=NO
  public void setId (final String parg) throws CGException {
    ivId = UTIL.ConvertToString(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setId


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

}
;
