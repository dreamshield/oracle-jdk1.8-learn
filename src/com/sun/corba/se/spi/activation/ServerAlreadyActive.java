package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ServerAlreadyActive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-x64-sans-NAS/jdk8u381/237/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Wednesday, June 14, 2023 2:46:18 PM BST
*/

public final class ServerAlreadyActive extends org.omg.CORBA.UserException
{
  public int serverId = (int)0;

  public ServerAlreadyActive ()
  {
    super(ServerAlreadyActiveHelper.id());
  } // ctor

  public ServerAlreadyActive (int _serverId)
  {
    super(ServerAlreadyActiveHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerAlreadyActive (String $reason, int _serverId)
  {
    super(ServerAlreadyActiveHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerAlreadyActive
