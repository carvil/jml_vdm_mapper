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



public class JmlVoidType extends JmlType implements IJmlVoidType {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp


// ***** VDMTOOLS START Name=identity KEEP=NO
  public String identity () throws CGException {
    return new String("VoidType");
  }
// ***** VDMTOOLS END Name=identity


// ***** VDMTOOLS START Name=accept KEEP=NO
  public void accept (final IJmlVisitor pVisitor) throws CGException {
    pVisitor.visitVoidType((IJmlVoidType) this);
  }
// ***** VDMTOOLS END Name=accept


// ***** VDMTOOLS START Name=JmlVoidType KEEP=NO
  public JmlVoidType () throws CGException {}
// ***** VDMTOOLS END Name=JmlVoidType


// ***** VDMTOOLS START Name=JmlVoidType KEEP=NO
  public JmlVoidType (final Long line, final Long column) throws CGException {
    setPosition(line, column);
  }
// ***** VDMTOOLS END Name=JmlVoidType


// ***** VDMTOOLS START Name=init KEEP=NO
  public void init (final HashMap var_1_1) throws CGException {}
// ***** VDMTOOLS END Name=init

}
;
