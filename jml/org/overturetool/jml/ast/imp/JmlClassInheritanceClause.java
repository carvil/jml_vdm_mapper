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



public class JmlClassInheritanceClause extends JmlNode implements IJmlClassInheritanceClause {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivIdentifierList KEEP=NO
  private String ivIdentifierList = null;
// ***** VDMTOOLS END Name=ivIdentifierList


// ***** VDMTOOLS START Name=JmlClassInheritanceClause KEEP=NO
  public JmlClassInheritanceClause () throws CGException {
    try {
      ivIdentifierList = UTIL.ConvertToString(new String());
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=JmlClassInheritanceClause


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("ClassInheritanceClause");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IJmlVisitor pVisitor) throws CGException {
    pVisitor.visitClassInheritanceClause((IJmlClassInheritanceClause) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=JmlClassInheritanceClause KEEP=NO
  public JmlClassInheritanceClause (final String p1) throws CGException {

    try {
      ivIdentifierList = UTIL.ConvertToString(new String());
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    setIdentifierList(p1);
  }
// ***** VDMTOOLS END Name=JmlClassInheritanceClause


// ***** VDMTOOLS START Name=JmlClassInheritanceClause KEEP=NO
  public JmlClassInheritanceClause (final String p1, final Long line, final Long column) throws CGException {

    try {
      ivIdentifierList = UTIL.ConvertToString(new String());
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setIdentifierList(p1);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=JmlClassInheritanceClause


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("identifier_list");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setIdentifierList(UTIL.ConvertToString(data.get(fname)));
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getIdentifierList KEEP=NO
  public String getIdentifierList () throws CGException {
    return ivIdentifierList;
  }
// ***** VDMTOOLS END Name=getIdentifierList


// ***** VDMTOOLS START Name=setIdentifierList KEEP=NO
  public void setIdentifierList (final String parg) throws CGException {
    ivIdentifierList = UTIL.ConvertToString(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setIdentifierList

}
;
