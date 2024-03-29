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



public class JmlMethodSpecifications extends JmlNode implements IJmlMethodSpecifications {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivSpecs KEEP=NO
  private IJmlSpecs ivSpecs = null;
// ***** VDMTOOLS END Name=ivSpecs

// ***** VDMTOOLS START Name=ivAlso KEEP=NO
  private IJmlSpecs ivAlso = null;
// ***** VDMTOOLS END Name=ivAlso


// ***** VDMTOOLS START Name=JmlMethodSpecifications KEEP=NO
  public JmlMethodSpecifications () throws CGException {
    try {

      ivSpecs = null;
      ivAlso = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=JmlMethodSpecifications


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("MethodSpecifications");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IJmlVisitor pVisitor) throws CGException {
    pVisitor.visitMethodSpecifications((IJmlMethodSpecifications) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=JmlMethodSpecifications KEEP=NO
  public JmlMethodSpecifications (final IJmlSpecs p1, final IJmlSpecs p2) throws CGException {

    try {

      ivSpecs = null;
      ivAlso = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setSpecs((IJmlSpecs) p1);
      setAlso((IJmlSpecs) p2);
    }
  }
// ***** VDMTOOLS END Name=JmlMethodSpecifications


// ***** VDMTOOLS START Name=JmlMethodSpecifications KEEP=NO
  public JmlMethodSpecifications (final IJmlSpecs p1, final IJmlSpecs p2, final Long line, final Long column) throws CGException {

    try {

      ivSpecs = null;
      ivAlso = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setSpecs((IJmlSpecs) p1);
      setAlso((IJmlSpecs) p2);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=JmlMethodSpecifications


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("specs");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setSpecs((IJmlSpecs) data.get(fname));
    }
    {

      String fname = new String("also");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setAlso((IJmlSpecs) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getSpecs KEEP=NO
  public IJmlSpecs getSpecs () throws CGException {
    return (IJmlSpecs) ivSpecs;
  }
// ***** VDMTOOLS END Name=getSpecs


// ***** VDMTOOLS START Name=setSpecs KEEP=NO
  public void setSpecs (final IJmlSpecs parg) throws CGException {
    ivSpecs = (IJmlSpecs) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setSpecs


// ***** VDMTOOLS START Name=getAlso KEEP=NO
  public IJmlSpecs getAlso () throws CGException {
    return (IJmlSpecs) ivAlso;
  }
// ***** VDMTOOLS END Name=getAlso


// ***** VDMTOOLS START Name=setAlso KEEP=NO
  public void setAlso (final IJmlSpecs parg) throws CGException {
    ivAlso = (IJmlSpecs) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setAlso

}
;
