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



public class OmlInstanceVariableDefinitions extends OmlDefinitionBlock implements IOmlInstanceVariableDefinitions {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivVariablesList KEEP=NO
  private Vector ivVariablesList = null;
// ***** VDMTOOLS END Name=ivVariablesList


// ***** VDMTOOLS START Name=OmlInstanceVariableDefinitions KEEP=NO
  public OmlInstanceVariableDefinitions () throws CGException {
    try {
      ivVariablesList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlInstanceVariableDefinitions


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("InstanceVariableDefinitions");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitInstanceVariableDefinitions((IOmlInstanceVariableDefinitions) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlInstanceVariableDefinitions KEEP=NO
  public OmlInstanceVariableDefinitions (final Vector p1) throws CGException {

    try {
      ivVariablesList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    setVariablesList(p1);
  }
// ***** VDMTOOLS END Name=OmlInstanceVariableDefinitions


// ***** VDMTOOLS START Name=OmlInstanceVariableDefinitions KEEP=NO
  public OmlInstanceVariableDefinitions (final Vector p1, final Long line, final Long column) throws CGException {

    try {
      ivVariablesList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setVariablesList(p1);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlInstanceVariableDefinitions


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("variables_list");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setVariablesList((Vector) data.get(fname));
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getVariablesList KEEP=NO
  public Vector getVariablesList () throws CGException {
    return ivVariablesList;
  }
// ***** VDMTOOLS END Name=getVariablesList


// ***** VDMTOOLS START Name=setVariablesList KEEP=NO
  public void setVariablesList (final Vector parg) throws CGException {
    ivVariablesList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setVariablesList


// ***** VDMTOOLS START Name=addVariablesList KEEP=NO
  public void addVariablesList (final IOmlNode parg) throws CGException {
    ivVariablesList.add(parg);
  }
// ***** VDMTOOLS END Name=addVariablesList

}
;
