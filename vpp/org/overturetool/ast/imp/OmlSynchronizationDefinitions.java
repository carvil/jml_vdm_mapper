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



public class OmlSynchronizationDefinitions extends OmlDefinitionBlock implements IOmlSynchronizationDefinitions {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivSyncList KEEP=NO
  private Vector ivSyncList = null;
// ***** VDMTOOLS END Name=ivSyncList


// ***** VDMTOOLS START Name=OmlSynchronizationDefinitions KEEP=NO
  public OmlSynchronizationDefinitions () throws CGException {
    try {
      ivSyncList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlSynchronizationDefinitions


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("SynchronizationDefinitions");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitSynchronizationDefinitions((IOmlSynchronizationDefinitions) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlSynchronizationDefinitions KEEP=NO
  public OmlSynchronizationDefinitions (final Vector p1) throws CGException {

    try {
      ivSyncList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    setSyncList(p1);
  }
// ***** VDMTOOLS END Name=OmlSynchronizationDefinitions


// ***** VDMTOOLS START Name=OmlSynchronizationDefinitions KEEP=NO
  public OmlSynchronizationDefinitions (final Vector p1, final Long line, final Long column) throws CGException {

    try {
      ivSyncList = new Vector();
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setSyncList(p1);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlSynchronizationDefinitions


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("sync_list");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setSyncList((Vector) data.get(fname));
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getSyncList KEEP=NO
  public Vector getSyncList () throws CGException {
    return ivSyncList;
  }
// ***** VDMTOOLS END Name=getSyncList


// ***** VDMTOOLS START Name=setSyncList KEEP=NO
  public void setSyncList (final Vector parg) throws CGException {
    ivSyncList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setSyncList


// ***** VDMTOOLS START Name=addSyncList KEEP=NO
  public void addSyncList (final IOmlNode parg) throws CGException {
    ivSyncList.add(parg);
  }
// ***** VDMTOOLS END Name=addSyncList

}
;
