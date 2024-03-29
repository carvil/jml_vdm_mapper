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



public class OmlSeqConcPattern extends OmlPattern implements IOmlSeqConcPattern {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivLhsPattern KEEP=NO
  private IOmlPattern ivLhsPattern = null;
// ***** VDMTOOLS END Name=ivLhsPattern

// ***** VDMTOOLS START Name=ivRhsPattern KEEP=NO
  private IOmlPattern ivRhsPattern = null;
// ***** VDMTOOLS END Name=ivRhsPattern


// ***** VDMTOOLS START Name=OmlSeqConcPattern KEEP=NO
  public OmlSeqConcPattern () throws CGException {
    try {

      ivLhsPattern = null;
      ivRhsPattern = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=OmlSeqConcPattern


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("SeqConcPattern");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IOmlVisitor pVisitor) throws CGException {
    pVisitor.visitSeqConcPattern((IOmlSeqConcPattern) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=OmlSeqConcPattern KEEP=NO
  public OmlSeqConcPattern (final IOmlPattern p1, final IOmlPattern p2) throws CGException {

    try {

      ivLhsPattern = null;
      ivRhsPattern = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setLhsPattern((IOmlPattern) p1);
      setRhsPattern((IOmlPattern) p2);
    }
  }
// ***** VDMTOOLS END Name=OmlSeqConcPattern


// ***** VDMTOOLS START Name=OmlSeqConcPattern KEEP=NO
  public OmlSeqConcPattern (final IOmlPattern p1, final IOmlPattern p2, final Long line, final Long column) throws CGException {

    try {

      ivLhsPattern = null;
      ivRhsPattern = null;
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setLhsPattern((IOmlPattern) p1);
      setRhsPattern((IOmlPattern) p2);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=OmlSeqConcPattern


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    {

      String fname = new String("lhs_pattern");
      Boolean cond_4 = null;
      cond_4 = new Boolean(data.containsKey(fname));
      if (cond_4.booleanValue()) 
        setLhsPattern((IOmlPattern) data.get(fname));
    }
    {

      String fname = new String("rhs_pattern");
      Boolean cond_13 = null;
      cond_13 = new Boolean(data.containsKey(fname));
      if (cond_13.booleanValue()) 
        setRhsPattern((IOmlPattern) data.get(fname));
    }
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getLhsPattern KEEP=NO
  public IOmlPattern getLhsPattern () throws CGException {
    return (IOmlPattern) ivLhsPattern;
  }
// ***** VDMTOOLS END Name=getLhsPattern


// ***** VDMTOOLS START Name=setLhsPattern KEEP=NO
  public void setLhsPattern (final IOmlPattern parg) throws CGException {
    ivLhsPattern = (IOmlPattern) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setLhsPattern


// ***** VDMTOOLS START Name=getRhsPattern KEEP=NO
  public IOmlPattern getRhsPattern () throws CGException {
    return (IOmlPattern) ivRhsPattern;
  }
// ***** VDMTOOLS END Name=getRhsPattern


// ***** VDMTOOLS START Name=setRhsPattern KEEP=NO
  public void setRhsPattern (final IOmlPattern parg) throws CGException {
    ivRhsPattern = (IOmlPattern) UTIL.clone(parg);
  }
// ***** VDMTOOLS END Name=setRhsPattern

}
;
