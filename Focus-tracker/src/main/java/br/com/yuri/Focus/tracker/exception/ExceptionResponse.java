package br.com.yuri.Focus.tracker.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {}
