package org.omg.CosNaming;


/**
* org/omg/CosNaming/NamingContextExt.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-x64-sans-NAS/jdk8u381/237/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Wednesday, June 14, 2023 2:46:18 PM BST
*/


/** 
 * <code>NamingContextExt</code> is the extension of <code>NamingContext</code>
 * which
 * contains a set of name bindings in which each name is unique and is
 * part of Interoperable Naming Service.
 * Different names can be bound to an object in the same or different
 * contexts at the same time. Using <tt>NamingContextExt</tt>, you can use
 * URL-based names to bind and resolve. <p>
 * 
 * See <a href="http://www.omg.org/technology/documents/formal/naming_service.htm">
 * CORBA COS 
 * Naming Specification.</a>
 */
public interface NamingContextExt extends NamingContextExtOperations, org.omg.CosNaming.NamingContext, org.omg.CORBA.portable.IDLEntity 
{
} // interface NamingContextExt
