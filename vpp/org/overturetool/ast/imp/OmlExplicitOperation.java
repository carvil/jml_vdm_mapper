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



public class OmlExplicitOperation extends OmlOperationShape implements IOmlExplicitOperation {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivIdentifier KEEP=NO
  private String ivIdentifier = null;
// ***** VDMTOOLS END Name=ivIdentifier

// ***** VDMTOOLS START Name=ivType KEEP=NO
  private IOmlType ivType = null;
// ***** VDMTOOLS END Name=ivType

// ***** VDMTOOLS START Name=ivParameterList KEEP=NO
  private Vector ivParameterList = null;
// ***** VDMTOOLS END Name=ivParameterList

// ***** VDMTOOLS START Name=ivBody KEEP=NO
  private IOmlOperationBody ivBody = null;
// ***** VDMTOOLS END Name=ivBody

// ***** VDMTOOLS START Name=ivTrailer KEEP=NO
  private IOmlOperationTrailer ivTrailer = null;
// ***** VDMTOOLS END Name=ivTrailer


// ***** VDMTOOLS START Name=OmlExplicitOperation KEEP=NO
  public OmlExplicitOperation () throws CGException {
    try {

      ivIdentifier = UTIL.ConvertToString(new String());
      ivType = null;
      ivParameterList = new Vector();
      ivBody = null;
      ivTrailer = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlExplicitOperation


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("ExplicitOperation");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitExplicitOperation((IOmlExplicitOperation) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlExplicitOperation KEEP=NO
  public OmlExplicitOperation (final String p1, final IOmlType p2, final Vector p3, final IOmlOperationBody p4, final IOmlOperationTrailer p5) throws CGException {

    try {

      ivIdentifier = UTIL.ConvertToString(new String());
      ivType = null;
      ivParameterList = new Vector();
      ivBody = null;
      ivTrailer = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setIdentifier(p1);
      setType((IOmlType) p2);
      setParameterList(p3);
      setBody((IOmlOperationBody) p4);
      setTrailer((IOmlOperationTrailer) p5);
    }
  }
// ***** VDMTOOLS END Name=OmlExplicitOperation


// ***** VDMTOOLS START Name=OmlExplicitOperation KEEP=NO
  public OmlExplicitOperation (final String p1, final IOmlType p2, final Vector p3, final IOmlOperationBody p4, final IOmlOperationTrailer p5, final Long line, final Long column) throws CGException {

    try {

      ivIdentifier = UTIL.ConvertToString(new String());
      ivType = null;
      ivParameterList = new Vector();
      ivBody = null;
      ivTrailer = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setIdentifier(p1);
      setType((IOmlType) p2);
      setParameterList(p3);
      setBody((IOmlOperationBody) p4);
      setTrailer((IOmlOperationTrailer) p5);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlExplicitOperation


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

      String fname = new String("type");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setType((IOmlType) data.get(fname));
    }
    {

      String fname = new String("parameter_list");
      Boolean cond_22 = null;
      cond_22 = new Boolean(data.containsKey(fname));
      if (cond_22.booleanValue()) 
        setParameterList((Vector) data.get(fname));
    }
    {

      String fname = new String("body");
      Boolean cond_31 = null;
      cond_31 = new Boolean(data.containsKey(fname));
      if (cond_31.booleanValue()) 
        setBody((IOmlOperationBody) data.get(fname));
    }
    {

      String fname = new String("trailer");
      Boolean cond_40 = null;
      cond_40 = new Boolean(data.containsKey(fname));
      if (cond_40.booleanValue()) 
        setTrailer((IOmlOperationTrailer) data.get(fname));
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


// ***** VDMTOOLS START Name=getType KEEP=NO
  public IOmlType getType () throws CGException {
    return (IOmlType) ivType;
  }
// ***** VDMTOOLS END Name=getType


// ***** VDMTOOLS START Name=setType KEEP=NO
  public void setType (final IOmlType parg) throws CGException {
    ivType = (IOmlType) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setType


// ***** VDMTOOLS START Name=getParameterList KEEP=NO
  public Vector getParameterList () throws CGException {
    return ivParameterList;
  }
// ***** VDMTOOLS END Name=getParameterList


// ***** VDMTOOLS START Name=setParameterList KEEP=NO
  public void setParameterList (final Vector parg) throws CGException {
    ivParameterList = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setParameterList


// ***** VDMTOOLS START Name=addParameterList KEEP=NO
  public void addParameterList (final IOmlNode parg) throws CGException {
    ivParameterList.add(parg);
  }
// ***** VDMTOOLS END Name=addParameterList


// ***** VDMTOOLS START Name=getBody KEEP=NO
  public IOmlOperationBody getBody () throws CGException {
    return (IOmlOperationBody) ivBody;
  }
// ***** VDMTOOLS END Name=getBody


// ***** VDMTOOLS START Name=setBody KEEP=NO
  public void setBody (final IOmlOperationBody parg) throws CGException {
    ivBody = (IOmlOperationBody) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setBody


// ***** VDMTOOLS START Name=getTrailer KEEP=NO
  public IOmlOperationTrailer getTrailer () throws CGException {
    return (IOmlOperationTrailer) ivTrailer;
  }
// ***** VDMTOOLS END Name=getTrailer


// ***** VDMTOOLS START Name=setTrailer KEEP=NO
  public void setTrailer (final IOmlOperationTrailer parg) throws CGException {
    ivTrailer = (IOmlOperationTrailer) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setTrailer

}
;
