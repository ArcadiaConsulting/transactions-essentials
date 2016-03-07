/**
 * Copyright (C) 2000-2016 Atomikos <info@atomikos.com>
 *
 * LICENSE CONDITIONS
 *
 * See http://www.atomikos.com/Main/WhichLicenseApplies for details.
 */

package com.atomikos.logging;

public interface Logger {
  
  void logError(String message);

  void logWarning(String message);
  
  void logNewInfo(String message);

  void logInfo(String message);

  void logTrace(String message);
  
  void logError(String message, Throwable error);

  void logWarning(String message, Throwable error);

  void logInfo(String message, Throwable error);

  void logTrace(String message, Throwable error);

  boolean isTraceEnabled();

  boolean isInfoEnabled();
  
  boolean isErrorEnabled();

}