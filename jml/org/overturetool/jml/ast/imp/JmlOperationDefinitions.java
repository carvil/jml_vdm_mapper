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



public class JmlOperationDefinitions extends JmlDefinitionBlock implements IJmlOperationDefinitions {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivOperationList KEEP=NO
  private Vector ivOperationList = null;
// ***** VDMTOOLS END Name=ivOperationList


// ***** VDMTOOLS START Name=JmlOperationDefinitions KEEP=NO
  public JmlOperationDefinitions () throws CGException {
    try {
      ivOperationList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=JmlOperationDefinitions


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("OperationDefinitions");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IJmlVisitor pVisitor) throws CGException {
    pVisitor.visitOperationDefinitions((IJmlOperationDefinitions) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=JmlOperationDefinitions KEEP=NO
  public JmlOperationDefinitions (final Vector p1) throws CGException {

    try {
      ivOperationList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    setOperationList(p1);
  }
// ***** VDMTOOLS END Name=JmlOperationDefinitions


// ***** VDMTOOLS START Name=JmlOperationDefinitions KEEP=NO
  public JmlOperationDefinitions (final Vector p1, final Long line, final Long column) throws CGException {

    try {
      ivOperationList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setOperationList(p1);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=JmlOperationDefinitions


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("operation_list");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setOperationList((Vector) data.get(fname));
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getOperationList KEEP=NO
  public Vector getOperationList () throws CGException {
    return ivOperationList;
  }
// ***** VDMTOOLS END Name=getOperationList


// ***** VDMTOOLS START Name=setOperationList KEEP=NO
  public void setOperationList (final Vector parg) throws CGException {
    ivOperationList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setOperationList


// ***** VDMTOOLS START Name=addOperationList KEEP=NO
  public void addOperationList (final IJmlNode parg) throws CGException {
    ivOperationList.add(parg);
  }
// ***** VDMTOOLS END Name=addOperationList

}
;
