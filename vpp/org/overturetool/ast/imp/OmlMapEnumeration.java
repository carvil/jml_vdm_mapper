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



public class OmlMapEnumeration extends OmlExpression implements IOmlMapEnumeration {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivMapletList KEEP=NO
  private Vector ivMapletList = null;
// ***** VDMTOOLS END Name=ivMapletList


// ***** VDMTOOLS START Name=OmlMapEnumeration KEEP=NO
  public OmlMapEnumeration () throws CGException {
    try {
      ivMapletList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlMapEnumeration


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("MapEnumeration");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitMapEnumeration((IOmlMapEnumeration) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlMapEnumeration KEEP=NO
  public OmlMapEnumeration (final Vector p1) throws CGException {

    try {
      ivMapletList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    setMapletList(p1);
  }
// ***** VDMTOOLS END Name=OmlMapEnumeration


// ***** VDMTOOLS START Name=OmlMapEnumeration KEEP=NO
  public OmlMapEnumeration (final Vector p1, final Long line, final Long column) throws CGException {

    try {
      ivMapletList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setMapletList(p1);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlMapEnumeration


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("maplet_list");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setMapletList((Vector) data.get(fname));
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getMapletList KEEP=NO
  public Vector getMapletList () throws CGException {
    return ivMapletList;
  }
// ***** VDMTOOLS END Name=getMapletList


// ***** VDMTOOLS START Name=setMapletList KEEP=NO
  public void setMapletList (final Vector parg) throws CGException {
    ivMapletList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setMapletList


// ***** VDMTOOLS START Name=addMapletList KEEP=NO
  public void addMapletList (final IOmlNode parg) throws CGException {
    ivMapletList.add(parg);
  }
// ***** VDMTOOLS END Name=addMapletList

}
;
