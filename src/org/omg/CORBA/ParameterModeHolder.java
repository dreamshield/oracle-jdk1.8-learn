package org.omg.CORBA;

/**
* org/omg/CORBA/ParameterModeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-x64-sans-NAS/jdk8u381/237/corba/src/share/classes/org/omg/PortableInterceptor/CORBAX.idl
* Wednesday, June 14, 2023 2:46:18 PM BST
*/


/**
   * Enumeration of parameter modes for Parameter.  Possible vaues:
   * <ul>
   *   <li>PARAM_IN - Represents an "in" parameter.</li>
   *   <li>PARAM_OUT - Represents an "out" parameter.</li>
   *   <li>PARAM_INOUT - Represents an "inout" parameter.</li>
   * </ul>
   */
public final class ParameterModeHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.CORBA.ParameterMode value = null;

  public ParameterModeHolder ()
  {
  }

  public ParameterModeHolder (org.omg.CORBA.ParameterMode initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.CORBA.ParameterModeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.CORBA.ParameterModeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.CORBA.ParameterModeHelper.type ();
  }

}
