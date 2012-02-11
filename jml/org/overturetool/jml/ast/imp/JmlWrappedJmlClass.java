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



public class JmlWrappedJmlClass extends JmlNode implements IJmlWrappedJmlClass {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivPackage KEEP=NO
  private String ivPackage = null;
// ***** VDMTOOLS END Name=ivPackage

// ***** VDMTOOLS START Name=ivRefine KEEP=NO
  private String ivRefine = null;
// ***** VDMTOOLS END Name=ivRefine

// ***** VDMTOOLS START Name=ivImportsJava KEEP=NO
  private Vector ivImportsJava = null;
// ***** VDMTOOLS END Name=ivImportsJava

// ***** VDMTOOLS START Name=ivImportsJml KEEP=NO
  private Vector ivImportsJml = null;
// ***** VDMTOOLS END Name=ivImportsJml

// ***** VDMTOOLS START Name=ivClassVal KEEP=NO
  private IJmlClass ivClassVal = null;
// ***** VDMTOOLS END Name=ivClassVal


// ***** VDMTOOLS START Name=JmlWrappedJmlClass KEEP=NO
  public JmlWrappedJmlClass () throws CGException {
    try {

      ivPackage = UTIL.ConvertToString(new String());
      ivRefine = UTIL.ConvertToString(new String());
      ivImportsJava = new Vector();
      ivImportsJml = new Vector();
      ivClassVal = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=JmlWrappedJmlClass


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("WrappedJmlClass");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IJmlVisitor pVisitor) throws CGException {
    pVisitor.visitWrappedJmlClass((IJmlWrappedJmlClass) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=JmlWrappedJmlClass KEEP=NO
  public JmlWrappedJmlClass (final String p1, final String p2, final Vector p3, final Vector p4, final IJmlClass p5) throws CGException {

    try {

      ivPackage = UTIL.ConvertToString(new String());
      ivRefine = UTIL.ConvertToString(new String());
      ivImportsJava = new Vector();
      ivImportsJml = new Vector();
      ivClassVal = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setPackage(p1);
      setRefine(p2);
      setImportsJava(p3);
      setImportsJml(p4);
      setClassVal((IJmlClass) p5);
    }
  }
// ***** VDMTOOLS END Name=JmlWrappedJmlClass


// ***** VDMTOOLS START Name=JmlWrappedJmlClass KEEP=NO
  public JmlWrappedJmlClass (final String p1, final String p2, final Vector p3, final Vector p4, final IJmlClass p5, final Long line, final Long column) throws CGException {

    try {

      ivPackage = UTIL.ConvertToString(new String());
      ivRefine = UTIL.ConvertToString(new String());
      ivImportsJava = new Vector();
      ivImportsJml = new Vector();
      ivClassVal = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setPackage(p1);
      setRefine(p2);
      setImportsJava(p3);
      setImportsJml(p4);
      setClassVal((IJmlClass) p5);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=JmlWrappedJmlClass


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("package");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setPackage(UTIL.ConvertToString(data.get(fname)));
    }
    {

      String fname = new String("refine");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setRefine(UTIL.ConvertToString(data.get(fname)));
    }
    {

      String fname = new String("imports_java");
      Boolean cond_22 = null;
      cond_22 = new Boolean(data.containsKey(fname));
      if (cond_22.booleanValue()) 
        setImportsJava((Vector) data.get(fname));
    }
    {

      String fname = new String("imports_jml");
      Boolean cond_31 = null;
      cond_31 = new Boolean(data.containsKey(fname));
      if (cond_31.booleanValue()) 
        setImportsJml((Vector) data.get(fname));
    }
    {

      String fname = new String("class_val");
      Boolean cond_40 = null;
      cond_40 = new Boolean(data.containsKey(fname));
      if (cond_40.booleanValue()) 
        setClassVal((IJmlClass) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getPackage KEEP=NO
  public String getPackage () throws CGException {
    return ivPackage;
  }
// ***** VDMTOOLS END Name=getPackage


// ***** VDMTOOLS START Name=setPackage KEEP=NO
  public void setPackage (final String parg) throws CGException {
    ivPackage = UTIL.ConvertToString(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setPackage


// ***** VDMTOOLS START Name=getRefine KEEP=NO
  public String getRefine () throws CGException {
    return ivRefine;
  }
// ***** VDMTOOLS END Name=getRefine


// ***** VDMTOOLS START Name=setRefine KEEP=NO
  public void setRefine (final String parg) throws CGException {
    ivRefine = UTIL.ConvertToString(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setRefine


// ***** VDMTOOLS START Name=getImportsJava KEEP=NO
  public Vector getImportsJava () throws CGException {
    return ivImportsJava;
  }
// ***** VDMTOOLS END Name=getImportsJava


// ***** VDMTOOLS START Name=setImportsJava KEEP=NO
  public void setImportsJava (final Vector parg) throws CGException {
    ivImportsJava = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setImportsJava


// ***** VDMTOOLS START Name=addImportsJava KEEP=NO
  public void addImportsJava (final IJmlNode parg) throws CGException {
    ivImportsJava.add(parg);
  }
// ***** VDMTOOLS END Name=addImportsJava


// ***** VDMTOOLS START Name=getImportsJml KEEP=NO
  public Vector getImportsJml () throws CGException {
    return ivImportsJml;
  }
// ***** VDMTOOLS END Name=getImportsJml


// ***** VDMTOOLS START Name=setImportsJml KEEP=NO
  public void setImportsJml (final Vector parg) throws CGException {
    ivImportsJml = (Vector) UTIL.ConvertToList(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setImportsJml


// ***** VDMTOOLS START Name=addImportsJml KEEP=NO
  public void addImportsJml (final IJmlNode parg) throws CGException {
    ivImportsJml.add(parg);
  }
// ***** VDMTOOLS END Name=addImportsJml


// ***** VDMTOOLS START Name=getClassVal KEEP=NO
  public IJmlClass getClassVal () throws CGException {
    return (IJmlClass) ivClassVal;
  }
// ***** VDMTOOLS END Name=getClassVal


// ***** VDMTOOLS START Name=setClassVal KEEP=NO
  public void setClassVal (final IJmlClass parg) throws CGException {
    ivClassVal = (IJmlClass) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setClassVal

}
;
