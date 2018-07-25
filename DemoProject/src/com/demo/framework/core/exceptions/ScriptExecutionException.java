package com.demo.framework.core.exceptions;

import com.demo.framework.core.scenarioResult.ScenarioResultObject;

@SuppressWarnings("serial")
public class ScriptExecutionException extends RuntimeException {
	ScenarioResultObject obj = new ScenarioResultObject();
    public ScriptExecutionException(String message) {
        super(message);
         obj.setReasonIfFailed(message);
    }

    public ScriptExecutionException(String message, Exception cause) {
        super(message, cause);
        obj.setReasonIfFailed(message);
    }
}
