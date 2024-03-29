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



public class JmlBody extends JmlNode implements IJmlBody {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp

// ***** VDMTOOLS START Name=ivBody KEEP=NO
  private String ivBody = null;
// ***** VDMTOOLS END Name=ivBody


// ***** VDMTOOLS START Name=JmlBody KEEP=NO
  public JmlBody () throws CGException {
    try {
      ivBody = UTIL.ConvertToString(new String());
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=JmlBody


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("Body");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IJmlVisitor pVisitor) throws CGException {
    pVisitor.visitBody((IJmlBody) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=JmlBody KEEP=NO
  public JmlBody (final String p1) throws CGException {

    try {
      ivBody = UTIL.ConvertToString(new String());
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    setBody(p1);
  }
// ***** VDMTOOLS END Name=JmlBody


// ***** VDMTOOLS START Name=JmlBody KEEP=NO
  public JmlBody (final String p1, final Long line, final Long column) throws CGException {

    try {
      ivBody = UTIL.ConvertToString(new String());
    }
    catch (Exception e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
    {

      setBody(p1);
      setPosition(line, column);
    }
  }
// ***** VDMTOOLS END Name=JmlBody


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap data) throws CGException {

    String fname = new String("body");
    Boolean cond_4 = null;
    cond_4 = new Boolean(data.containsKey(fname));
    if (cond_4.booleanValue()) 
      setBody(UTIL.ConvertToString(data.get(fname)));
  }
// ***** VDMTOOLS END Name=init


// ***** VDMTOOLS START Name=getBody KEEP=NO
  public String getBody () throws CGException {
    return ivBody;
  }
// ***** VDMTOOLS END Name=getBody


// ***** VDMTOOLS START Name=setBody KEEP=NO
  public void setBody (final String parg) throws CGException {
    ivBody = UTIL.ConvertToString(UTIL.clone(parg));
  }
// ***** VDMTOOLS END Name=setBody

}
;
