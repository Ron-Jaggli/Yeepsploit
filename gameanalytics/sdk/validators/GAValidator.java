package com.gameanalytics.sdk.validators;

import com.gameanalytics.sdk.GAResourceFlowType;
import com.gameanalytics.sdk.GAProgressionStatus;
import java.util.Iterator;
import org.json.JSONObject;
import com.gameanalytics.sdk.GAErrorSeverity;
import com.gameanalytics.sdk.state.GAState;
import android.text.TextUtils;
import android.util.Log;
import com.gameanalytics.sdk.utilities.GAUtilities;
import com.gameanalytics.sdk.events.EGASdkErrorParameter;
import com.gameanalytics.sdk.events.EGASdkErrorAction;
import com.gameanalytics.sdk.events.EGASdkErrorArea;
import com.gameanalytics.sdk.events.EGASdkErrorCategory;
import com.gameanalytics.sdk.logging.GALogger;
import com.gameanalytics.sdk.GAAdType;
import com.gameanalytics.sdk.GAAdAction;

public class GAValidator
{
    public static ValidationResult validateAdEvent(final GAAdAction gaAdAction, final GAAdType gaAdType, final String s, final String s2) {
        if (gaAdAction.toString().length() == 0) {
            GALogger.w("Validation fail - ad event - adAction: Ad action was unsupported value.");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.AdEvent, EGASdkErrorAction.InvalidAdAction, EGASdkErrorParameter.AdAction, "");
        }
        if (gaAdType.toString().length() == 0) {
            GALogger.w("Validation fail - ad event - adType: Ad type was unsupported value.");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.AdEvent, EGASdkErrorAction.InvalidAdType, EGASdkErrorParameter.AdType, "");
        }
        if (!validateShortString(s, false)) {
            GALogger.w("Validation fail - ad event - message: Ad SDK name cannot be above 32 characters.");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.AdEvent, EGASdkErrorAction.InvalidShortString, EGASdkErrorParameter.AdSdkName, s);
        }
        if (!validateString(s2, false)) {
            GALogger.w("Validation fail - ad event - message: Ad placement cannot be above 64 characters.");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.AdEvent, EGASdkErrorAction.InvalidString, EGASdkErrorParameter.AdPlacement, s2);
        }
        return null;
    }
    
    private static boolean validateAdNetworkName(final String s) {
        return GAUtilities.stringMatch(s, "^(mopub|fyber|ironsource|topon|hyperbid|max|aequus|admob)$");
    }
    
    private static boolean validateAdNetworkVersion(final String s) {
        return s != null && GAUtilities.stringMatch(s, "^[0-9]{0,5}(\\.[0-9]{0,5}){0,3}$");
    }
    
    public static boolean validateAppBuild(final Integer n) {
        if (n > 0) {
            return true;
        }
        Log.w("GameAnalytics", String.valueOf((Object)n) + " is not a valid version code. Check your Gradle file.");
        return false;
    }
    
    public static boolean validateAppSignature(final String s) {
        if (validateString(s, false)) {
            return true;
        }
        Log.w("GameAnalytics", s + " is not a valid app signature.");
        return false;
    }
    
    public static boolean validateAppVersion(final String s) {
        if (validateString(s, false)) {
            return true;
        }
        Log.w("GameAnalytics", s + " is not a valid version name. Check your Gradle file.");
        return false;
    }
    
    public static boolean validateArrayOfStrings(final long n, final long n2, final boolean b, String s, final String... array) {
        String s2 = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            s2 = "Array";
        }
        if (array == null) {
            GALogger.w(s2 + " validation failed: array cannot be null. ");
            return false;
        }
        if (!b && array.length == 0) {
            GALogger.w(s2 + " validation failed: array cannot be empty. ");
            return false;
        }
        if (n > 0L && array.length > n) {
            GALogger.w(s2 + " validation failed: array cannot exceed " + n + " values. It has " + array.length + " values.");
            return false;
        }
        for (int length = array.length, i = 0; i < length; ++i) {
            s = array[i];
            int length2;
            if (s == null) {
                length2 = 0;
            }
            else {
                length2 = s.length();
            }
            if (length2 == 0) {
                GALogger.w(s2 + " validation failed: contained an empty string.");
                return false;
            }
            if (n2 > 0L && length2 > n2) {
                GALogger.w(s2 + " validation failed: a string exceeded max allowed length (which is: " + n2 + "). String was: " + s);
                return false;
            }
        }
        return true;
    }
    
    public static boolean validateBuild(final String s) {
        return validateShortString(s, false);
    }
    
    public static boolean validateBundleID(final String s) {
        if (validateMediumString(s, false)) {
            return true;
        }
        Log.w("GameAnalytics", s + " is not a valid application ID. Check your Gradle file.");
        return false;
    }
    
    public static ValidationResult validateBusinessEvent(final String s, final long n, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7) {
        if (!validateCurrency(s)) {
            GALogger.w("Validation fail - business event - currency: Cannot be (null) and need to be A-Z, 3 characters and in the standard at openexchangerates.org. Failed currency: " + s);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.BusinessEvent, EGASdkErrorAction.InvalidCurrency, EGASdkErrorParameter.Currency, s);
        }
        if (n < 0L) {
            GALogger.w("Validation fail - business event - amount: Cannot be less then 0. Failed amount: " + n);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.BusinessEvent, EGASdkErrorAction.InvalidAmount, EGASdkErrorParameter.Amount, n + "");
        }
        if (!validateShortString(s2, true)) {
            GALogger.w("Validation fail - business event - cartType. Cannot be above 32 length. String: " + s2);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.BusinessEvent, EGASdkErrorAction.InvalidShortString, EGASdkErrorParameter.CartType, s2);
        }
        if (!validateEventPartLength(s3, false)) {
            GALogger.w("Validation fail - business event - itemType: Cannot be (null), empty or above 64 characters. String: " + s3);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.BusinessEvent, EGASdkErrorAction.InvalidEventPartLength, EGASdkErrorParameter.ItemType, s3);
        }
        if (!validateEventPartCharacters(s3)) {
            GALogger.w("Validation fail - business event - itemType: Cannot contain other characters than A-z, 0-9, -_., ()!?. String: " + s3);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.BusinessEvent, EGASdkErrorAction.InvalidEventPartCharacters, EGASdkErrorParameter.ItemType, s3);
        }
        if (!validateEventPartLength(s4, false)) {
            GALogger.w("Validation fail - business event - itemId. Cannot be (null), empty or above 64 characters. String: " + s4);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.BusinessEvent, EGASdkErrorAction.InvalidEventPartLength, EGASdkErrorParameter.ItemId, s4);
        }
        if (!validateEventPartCharacters(s4)) {
            GALogger.w("Validation fail - business event - itemId: Cannot contain other characters than A-z, 0-9, -_., ()!?. String: " + s4);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.BusinessEvent, EGASdkErrorAction.InvalidEventPartCharacters, EGASdkErrorParameter.ItemId, s4);
        }
        if (!TextUtils.isEmpty((CharSequence)s5) && !validateStore(s6)) {
            GALogger.w("Validation fail - business event - store: Is not one of the allowed values. String: " + s6);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.BusinessEvent, EGASdkErrorAction.InvalidStore, EGASdkErrorParameter.Store, s6);
        }
        return null;
    }
    
    public static boolean validateChannelId(final String s) {
        return validateMediumString(s, false);
    }
    
    public static boolean validateClientTs(final long n) {
        return n >= 0L && n <= 99999999999L;
    }
    
    public static boolean validateConnectionType(final String s) {
        return GAUtilities.stringMatch(s, "^(wwan|wifi|lan|offline)$");
    }
    
    public static boolean validateCurrency(final String s) {
        return !TextUtils.isEmpty((CharSequence)s) && GAUtilities.stringMatch(s, "^[A-Z]{3}$");
    }
    
    public static boolean validateCustomDimensions(final String... array) {
        return validateArrayOfStrings(20L, 32L, false, "custom dimensions", array);
    }
    
    public static ValidationResult validateDesignEvent(final String s) {
        if (!validateEventIdLength(s)) {
            GALogger.w("Validation fail - design event - eventId: Cannot be (null) or empty. Only 5 event parts allowed separated by :. Each part need to be 64 characters or less. String: " + s);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.DesignEvent, EGASdkErrorAction.InvalidEventIdLength, EGASdkErrorParameter.EventId, s);
        }
        if (!validateEventIdCharacters(s)) {
            GALogger.w("Validation fail - design event - eventId: Non valid characters. Only allowed A-z, 0-9, -_., ()!?. String: " + s);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.DesignEvent, EGASdkErrorAction.InvalidEventIdCharacters, EGASdkErrorParameter.EventId, s);
        }
        return null;
    }
    
    public static boolean validateDimension01(final String s) {
        return TextUtils.isEmpty((CharSequence)s) || GAState.hasAvailableCustomDimensions01(s);
    }
    
    public static boolean validateDimension02(final String s) {
        return TextUtils.isEmpty((CharSequence)s) || GAState.hasAvailableCustomDimensions02(s);
    }
    
    public static boolean validateDimension03(final String s) {
        return TextUtils.isEmpty((CharSequence)s) || GAState.hasAvailableCustomDimensions03(s);
    }
    
    public static boolean validateEngineVersion(final String s) {
        return s != null && GAUtilities.stringMatch(s, "^(unity|unreal|corona|marmalade|cocos2d|xamarin|lumberyard|gamemaker|defold|nativescript|cordova|construct|stencyl|godot) [0-9]{0,5}(\\.[0-9]{0,5}){0,2}$");
    }
    
    public static ValidationResult validateErrorEvent(final GAErrorSeverity gaErrorSeverity, final String s) {
        if (gaErrorSeverity.toString().length() == 0) {
            GALogger.w("Validation fail - error event - severity: Severity was unsupported value.");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ErrorEvent, EGASdkErrorAction.InvalidSeverity, EGASdkErrorParameter.Severity, "");
        }
        if (!validateLongString(s, true)) {
            GALogger.w("Validation fail - error event - message: Message cannot be above 8192 characters.");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ErrorEvent, EGASdkErrorAction.InvalidLongString, EGASdkErrorParameter.Message, s);
        }
        return null;
    }
    
    public static boolean validateEventIdCharacters(final String s) {
        return !TextUtils.isEmpty((CharSequence)s) && GAUtilities.stringMatch(s, "^[A-Za-z0-9\\s\\-_\\.\\(\\)\\!\\?]{1,64}(:[A-Za-z0-9\\s\\-_\\.\\(\\)\\!\\?]{1,64}){0,4}$");
    }
    
    public static boolean validateEventIdLength(final String s) {
        return !TextUtils.isEmpty((CharSequence)s) && GAUtilities.stringMatch(s, "^[^:]{1,64}(?::[^:]{1,64}){0,4}$");
    }
    
    public static boolean validateEventPartCharacters(final String s) {
        return GAUtilities.stringMatch(s, "^[A-Za-z0-9\\s\\-_\\.\\(\\)\\!\\?]{1,64}$");
    }
    
    public static boolean validateEventPartLength(final String s, final boolean b) {
        return validateString(s, b);
    }
    
    public static ValidationResult validateImpressionEvent(String string, final String s, final JSONObject jsonObject) {
        if (!validateAdNetworkName(string)) {
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ImpressionEvent, EGASdkErrorAction.InvalidAdNetworkName, EGASdkErrorParameter.AdNetwork, string);
        }
        if (!validateAdNetworkVersion(s)) {
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ImpressionEvent, EGASdkErrorAction.InvalidAdNetworkVersion, EGASdkErrorParameter.AdNetworkVersion, s);
        }
        if (jsonObject != null) {
            if (jsonObject.length() != 0) {
                final Iterator keys = jsonObject.keys();
                try {
                    while (keys.hasNext()) {
                        string = (String)keys.next();
                        if (jsonObject.isNull(string)) {
                            string = "Impression event field: " + string + " is empty.";
                            GALogger.e(string);
                            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ImpressionEvent, EGASdkErrorAction.ImpressionDataIsNull, EGASdkErrorParameter.ImpressionData, string);
                        }
                    }
                    return null;
                }
                catch (final Exception ex) {
                    GALogger.e("An exception occurred while validating an impression event.");
                    ex.printStackTrace();
                    return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ImpressionEvent, EGASdkErrorAction.ImpressionDataIsNull, EGASdkErrorParameter.ImpressionData, ex.getMessage());
                }
            }
        }
        return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ImpressionEvent, EGASdkErrorAction.ImpressionDataIsNull, EGASdkErrorParameter.ImpressionData, "");
    }
    
    public static boolean validateKeys(final String s, final String s2) {
        return GAUtilities.stringMatch(s, "^[A-z0-9]{32}$") && GAUtilities.stringMatch(s2, "^[A-z0-9]{40}$");
    }
    
    private static boolean validateLongString(final String s, final boolean b) {
        return (b && TextUtils.isEmpty((CharSequence)s)) || (!TextUtils.isEmpty((CharSequence)s) && s.length() <= 8192);
    }
    
    public static boolean validateMediumString(final String s, final boolean b) {
        return (b && TextUtils.isEmpty((CharSequence)s)) || (!TextUtils.isEmpty((CharSequence)s) && s.length() <= 256);
    }
    
    public static ValidationResult validateProgressionEvent(final GAProgressionStatus gaProgressionStatus, final String s, final String s2, final String s3) {
        if (gaProgressionStatus.toString().length() == 0) {
            GALogger.w("Validation fail - progression event: Invalid progression status.");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.InvalidProgressionStatus, EGASdkErrorParameter.ProgressionStatus, "");
        }
        if (!TextUtils.isEmpty((CharSequence)s3) && TextUtils.isEmpty((CharSequence)s2) && !TextUtils.isEmpty((CharSequence)s)) {
            GALogger.w("Validation fail - progression event: 03 found but 01+02 are invalid. Progression must be set as either 01, 01+02 or 01+02+03.");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.WrongProgressionOrder, EGASdkErrorParameter.Undefined, s + ":" + s2 + ":" + s3);
        }
        if (!TextUtils.isEmpty((CharSequence)s2) && TextUtils.isEmpty((CharSequence)s)) {
            GALogger.w("Validation fail - progression event: 02 found but not 01. Progression must be set as either 01, 01+02 or 01+02+03");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.WrongProgressionOrder, EGASdkErrorParameter.Undefined, s + ":" + s2 + ":" + s3);
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            GALogger.w("Validation fail - progression event: progression01 not valid. Progressions must be set as either 01, 01+02 or 01+02+03");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.WrongProgressionOrder, EGASdkErrorParameter.Undefined, s + ":" + s2 + ":" + s3);
        }
        if (!validateEventPartLength(s, false)) {
            GALogger.w("Validation fail - progression event - progression01: Cannot be (null), empty or above 64 characters. String: " + s);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.InvalidEventPartLength, EGASdkErrorParameter.Progression01, s);
        }
        if (!validateEventPartCharacters(s)) {
            GALogger.w("Validation fail - progression event - progression01: Cannot contain other characters than A-z, 0-9, -_., ()!?. String: " + s);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.InvalidEventPartCharacters, EGASdkErrorParameter.Progression01, s);
        }
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            if (!validateEventPartLength(s2, true)) {
                GALogger.w("Validation fail - progression event - progression02: Cannot be empty or above 64 characters. String: " + s2);
                return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.InvalidEventPartLength, EGASdkErrorParameter.Progression02, s2);
            }
            if (!validateEventPartCharacters(s2)) {
                GALogger.w("Validation fail - progression event - progression02: Cannot contain other characters than A-z, 0-9, -_., ()!?. String: " + s2);
                return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.InvalidEventPartCharacters, EGASdkErrorParameter.Progression02, s2);
            }
        }
        if (!TextUtils.isEmpty((CharSequence)s3)) {
            if (!validateEventPartLength(s3, true)) {
                GALogger.w("Validation fail - progression event - progression03: Cannot be empty or above 64 characters. String: " + s3);
                return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.InvalidEventPartLength, EGASdkErrorParameter.Progression03, s3);
            }
            if (!validateEventPartCharacters(s3)) {
                GALogger.w("Validation fail - progression event - progression03: Cannot contain other characters than A-z, 0-9, -_., ()!?. String: " + s3);
                return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ProgressionEvent, EGASdkErrorAction.InvalidEventPartCharacters, EGASdkErrorParameter.Progression03, s3);
            }
        }
        return null;
    }
    
    public static boolean validateResourceCurrencies(final String... array) {
        if (!validateArrayOfStrings(50L, 64L, false, "resource currencies", array)) {
            return false;
        }
        for (final String s : array) {
            if (!GAUtilities.stringMatch(s, "^[A-Za-z]+$")) {
                GALogger.w("resource currencies validation failed: a resource currency can only be A-Z, a-z. String was: " + s);
                return false;
            }
        }
        return true;
    }
    
    public static ValidationResult validateResourceEvent(final GAResourceFlowType gaResourceFlowType, final String s, final long n, final String s2, final String s3) {
        if (gaResourceFlowType.toString().length() == 0) {
            GALogger.w("Validation fail - resource event - flowType: Invalid flow type.");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.InvalidFlowType, EGASdkErrorParameter.FlowType, "");
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            GALogger.w("Validation fail - resource event - currency: Cannot be (null)");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.StringEmptyOrNull, EGASdkErrorParameter.Currency, "");
        }
        if (!GAState.hasAvailableResourceCurrency(s)) {
            GALogger.w("Validation fail - resource event - currency: Not found in list of pre-defined available resource currencies. String: " + s);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.NotFoundInAvailableCurrencies, EGASdkErrorParameter.Currency, s);
        }
        if (n <= 0L) {
            GALogger.w("Validation fail - resource event - amount: Float amount cannot be 0 or negative. Value: " + n);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.InvalidAmount, EGASdkErrorParameter.Amount, n + "");
        }
        if (TextUtils.isEmpty((CharSequence)s2)) {
            GALogger.w("Validation fail - resource event - itemType: Cannot be (null)");
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.StringEmptyOrNull, EGASdkErrorParameter.ItemType, "");
        }
        if (!validateEventPartLength(s2, false)) {
            GALogger.w("Validation fail - resource event - itemType: Cannot be (null), empty or above 64 characters. String: " + s2);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.InvalidEventPartLength, EGASdkErrorParameter.ItemType, s2);
        }
        if (!validateEventPartCharacters(s2)) {
            GALogger.w("Validation fail - resource event - itemType: Cannot contain other characters than A-z, 0-9, -_., ()!?. String: " + s2);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.InvalidEventPartCharacters, EGASdkErrorParameter.ItemType, s2);
        }
        if (!GAState.hasAvailableResourceItemType(s2)) {
            GALogger.w("Validation fail - resource event - itemType: Not found in list of pre-defined available resource itemTypes. String: " + s2);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.NotFoundInAvailableItemTypes, EGASdkErrorParameter.ItemType, s2);
        }
        if (!validateEventPartLength(s3, false)) {
            GALogger.w("Validation fail - resource event - itemId: Cannot be (null), empty or above 64 characters. String: " + s3);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.InvalidEventPartLength, EGASdkErrorParameter.ItemId, s3);
        }
        if (!validateEventPartCharacters(s3)) {
            GALogger.w("Validation fail - resource event - itemId: Cannot contain other characters than A-z, 0-9, -_., ()!?. String: " + s3);
            return new ValidationResult(EGASdkErrorCategory.EventValidation, EGASdkErrorArea.ResourceEvent, EGASdkErrorAction.InvalidEventPartCharacters, EGASdkErrorParameter.ItemId, s3);
        }
        return null;
    }
    
    public static boolean validateResourceItemTypes(final String... array) {
        if (!validateArrayOfStrings(20L, 32L, false, "resource item types", array)) {
            return false;
        }
        for (final String s : array) {
            if (!validateEventPartCharacters(s)) {
                GALogger.w("resource item types validation failed: a resource item type cannot contain other characters than A-z, 0-9, -_., ()!?. String was: " + s);
                return false;
            }
        }
        return true;
    }
    
    public static boolean validateSdkErrorEvent(final String s, final String s2, final EGASdkErrorCategory egaSdkErrorCategory, final EGASdkErrorArea egaSdkErrorArea, final EGASdkErrorAction egaSdkErrorAction) {
        if (!validateKeys(s, s2)) {
            GALogger.w("validateSdkErrorEvent failed. Game key or secret key is invalid. Can only contain characters A-z 0-9, gameKey is 32 length, gameSecret is 40 length. Failed keys - gameKey: " + s + ", secretKey: " + s2);
            return false;
        }
        if (egaSdkErrorCategory.toString().length() == 0) {
            GALogger.w("Validation fail - sdk error event - category: Category was unsupported value.");
            return false;
        }
        if (egaSdkErrorArea.toString().length() == 0) {
            GALogger.w("Validation fail - sdk error event - area: Area was unsupported value.");
            return false;
        }
        if (egaSdkErrorAction.toString().length() == 0) {
            GALogger.w("Validation fail - sdk error event - action: Action was unsupported value.");
            return false;
        }
        return true;
    }
    
    public static boolean validateSdkWrapperVersion(final String s) {
        return GAUtilities.stringMatch(s, "^(unity|unreal|corona|marmalade|cocos2d|xamarin|lumberyard|air|gamemaker|defold|nativescript|cordova|construct|stencyl|godot|flutter) [0-9]{0,5}(\\.[0-9]{0,5}){0,2}(([a,b]{0,1})|(\\-alpha|\\-beta))$");
    }
    
    public static boolean validateShortString(final String s, final boolean b) {
        return (b && TextUtils.isEmpty((CharSequence)s)) || (!TextUtils.isEmpty((CharSequence)s) && s.length() <= 32);
    }
    
    private static boolean validateStore(final String s) {
        return GAUtilities.stringMatch(s, "^(apple|google_play)$");
    }
    
    public static boolean validateString(final String s, final boolean b) {
        return (b && TextUtils.isEmpty((CharSequence)s)) || (!TextUtils.isEmpty((CharSequence)s) && s.length() <= 64);
    }
    
    public static boolean validateUserId(final String s) {
        if (!validateString(s, false)) {
            GALogger.w("Validation fail - user id: id cannot be (null), empty or above 64 characters.");
            return false;
        }
        return true;
    }
}
