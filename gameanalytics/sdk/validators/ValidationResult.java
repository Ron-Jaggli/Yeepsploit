package com.gameanalytics.sdk.validators;

import com.gameanalytics.sdk.events.EGASdkErrorParameter;
import com.gameanalytics.sdk.events.EGASdkErrorCategory;
import com.gameanalytics.sdk.events.EGASdkErrorArea;
import com.gameanalytics.sdk.events.EGASdkErrorAction;

public class ValidationResult
{
    public EGASdkErrorAction action;
    public EGASdkErrorArea area;
    public EGASdkErrorCategory category;
    public EGASdkErrorParameter parameter;
    public String reason;
    
    public ValidationResult(final EGASdkErrorCategory category, final EGASdkErrorArea area, final EGASdkErrorAction action, final EGASdkErrorParameter parameter, final String reason) {
        this.category = category;
        this.area = area;
        this.action = action;
        this.parameter = parameter;
        this.reason = reason;
    }
}
