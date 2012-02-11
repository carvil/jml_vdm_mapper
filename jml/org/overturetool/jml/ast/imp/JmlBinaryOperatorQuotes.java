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



public class JmlBinaryOperatorQuotes implements IJmlBinaryOperatorQuotes {

// ***** VDMTOOLS START Name=vdmComp KEEP=NO
  static UTIL.VDMCompare vdmComp = new UTIL.VDMCompare();
// ***** VDMTOOLS END Name=vdmComp




































// ***** VDMTOOLS START Name=qmap KEEP=NO
  private static HashMap qmap = new HashMap();
// ***** VDMTOOLS END Name=qmap


// ***** VDMTOOLS START Name=static KEEP=NO
  static {
    try {

      JmlBinaryOperatorQuotes.qmap = new HashMap();
      JmlBinaryOperatorQuotes.qmap.put(IQUNION, new String("<UNION>"));
      JmlBinaryOperatorQuotes.qmap.put(IQMINUS, new String("<MINUS>"));
      JmlBinaryOperatorQuotes.qmap.put(IQLOR, new String("<LOR>"));
      JmlBinaryOperatorQuotes.qmap.put(IQSUBTYPE, new String("<SUBTYPE>"));
      JmlBinaryOperatorQuotes.qmap.put(IQEQUIV, new String("<EQUIV>"));
      JmlBinaryOperatorQuotes.qmap.put(IQPLUSEQ, new String("<PLUSEQ>"));
      JmlBinaryOperatorQuotes.qmap.put(IQNOTINSET, new String("<NOTINSET>"));
      JmlBinaryOperatorQuotes.qmap.put(IQEQ, new String("<EQ>"));
      JmlBinaryOperatorQuotes.qmap.put(IQG, new String("<G>"));
      JmlBinaryOperatorQuotes.qmap.put(IQNE, new String("<NE>"));
      JmlBinaryOperatorQuotes.qmap.put(IQIMPLYBACK, new String("<IMPLYBACK>"));
      JmlBinaryOperatorQuotes.qmap.put(IQMINUSEQ, new String("<MINUSEQ>"));
      JmlBinaryOperatorQuotes.qmap.put(IQINSET, new String("<INSET>"));
      JmlBinaryOperatorQuotes.qmap.put(IQPROPERSUBSET, new String("<PROPERSUBSET>"));
      JmlBinaryOperatorQuotes.qmap.put(IQDOMRESTTO, new String("<DOMRESTTO>"));
      JmlBinaryOperatorQuotes.qmap.put(IQRNGRESTTO, new String("<RNGRESTTO>"));
      JmlBinaryOperatorQuotes.qmap.put(IQLAND, new String("<LAND>"));
      JmlBinaryOperatorQuotes.qmap.put(IQNOTEQUIV, new String("<NOTEQUIV>"));
      JmlBinaryOperatorQuotes.qmap.put(IQGE, new String("<GE>"));
      JmlBinaryOperatorQuotes.qmap.put(IQDIVIDE, new String("<DIVIDE>"));
      JmlBinaryOperatorQuotes.qmap.put(IQMULEQ, new String("<MULEQ>"));
      JmlBinaryOperatorQuotes.qmap.put(IQCONCAT, new String("<CONCAT>"));
      JmlBinaryOperatorQuotes.qmap.put(IQINTER, new String("<INTER>"));
      JmlBinaryOperatorQuotes.qmap.put(IQL, new String("<L>"));
      JmlBinaryOperatorQuotes.qmap.put(IQLE, new String("<LE>"));
      JmlBinaryOperatorQuotes.qmap.put(IQREMEQ, new String("<REMEQ>"));
      JmlBinaryOperatorQuotes.qmap.put(IQINSTANCEOF, new String("<INSTANCEOF>"));
      JmlBinaryOperatorQuotes.qmap.put(IQDIVEQ, new String("<DIVEQ>"));
      JmlBinaryOperatorQuotes.qmap.put(IQSUBSET, new String("<SUBSET>"));
      JmlBinaryOperatorQuotes.qmap.put(IQREMAIN, new String("<REMAIN>"));
      JmlBinaryOperatorQuotes.qmap.put(IQPLUS, new String("<PLUS>"));
      JmlBinaryOperatorQuotes.qmap.put(IQMUNION, new String("<MUNION>"));
      JmlBinaryOperatorQuotes.qmap.put(IQIMPLY, new String("<IMPLY>"));
      JmlBinaryOperatorQuotes.qmap.put(IQCOMP, new String("<COMP>"));
      JmlBinaryOperatorQuotes.qmap.put(IQMULTIPLY, new String("<MULTIPLY>"));
    }
    catch (Throwable e){

      e.printStackTrace(System.out);
      System.out.println(e.getMessage());
    }
  }
// ***** VDMTOOLS END Name=static


// ***** VDMTOOLS START Name=JmlBinaryOperatorQuotes KEEP=NO
  public JmlBinaryOperatorQuotes () throws CGException {}
// ***** VDMTOOLS END Name=JmlBinaryOperatorQuotes


// ***** VDMTOOLS START Name=getQuoteName KEEP=NO
  static public String getQuoteName (final Long pid) throws CGException {
    return UTIL.ConvertToString(qmap.get(pid));
  }
// ***** VDMTOOLS END Name=getQuoteName


// ***** VDMTOOLS START Name=validQuote KEEP=NO
  static public Boolean validQuote (final Long pid) throws CGException {

    Boolean rexpr_2 = null;
    rexpr_2 = new Boolean(qmap.containsKey(pid));
    return rexpr_2;
  }
// ***** VDMTOOLS END Name=validQuote

}
;
