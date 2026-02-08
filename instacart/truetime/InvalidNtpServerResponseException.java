package com.instacart.truetime;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.Metadata;
import java.io.IOException;

@Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B'\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010" }, d2 = { "Lcom/instacart/truetime/InvalidNtpServerResponseException;", "Ljava/io/IOException;", "detailMessage", "", "(Ljava/lang/String;)V", "message", "property", "actualValue", "", "expectedValue", "(Ljava/lang/String;Ljava/lang/String;FF)V", "getActualValue", "()F", "getExpectedValue", "getProperty", "()Ljava/lang/String;", "library_release" }, k = 1, mv = { 1, 8, 0 }, xi = 48)
public final class InvalidNtpServerResponseException extends IOException
{
    private final float actualValue;
    private final float expectedValue;
    private final String property;
    
    public InvalidNtpServerResponseException(final String s) {
        Intrinsics.checkNotNullParameter((Object)s, "detailMessage");
        super(s);
        this.property = "na";
        this.expectedValue = 0.0f;
        this.actualValue = 0.0f;
    }
    
    public InvalidNtpServerResponseException(String format, final String property, final float actualValue, final float expectedValue) {
        Intrinsics.checkNotNullParameter((Object)format, "message");
        Intrinsics.checkNotNullParameter((Object)property, "property");
        final StringCompanionObject instance = StringCompanionObject.INSTANCE;
        format = String.format(Locale.getDefault(), format, Arrays.copyOf(new Object[] { property, actualValue, expectedValue }, 3));
        Intrinsics.checkNotNullExpressionValue((Object)format, "format(locale, format, *args)");
        super(format);
        this.property = property;
        this.actualValue = actualValue;
        this.expectedValue = expectedValue;
    }
    
    public final float getActualValue() {
        return this.actualValue;
    }
    
    public final float getExpectedValue() {
        return this.expectedValue;
    }
    
    public final String getProperty() {
        return this.property;
    }
}
