package io.github.zzhorizonzz.sdk.client.instance;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InstancePatchRequestBody implements Parsable {
    /**
     * For browser-like stacks such as browser extensions, Electron, or Capacitor.js the instance allowed origins need to be updated with the request origin value.For Chrome extensions popup, background, or service worker pages the origin is chrome-extension://extension_uiid. For Electron apps the default origin is http://localhost:3000. For Capacitor, the origin is capacitor://localhost.
     */
    private java.util.List<String> allowedOrigins;
    /**
     * The clerk_js_version property
     */
    private String clerkJsVersion;
    /**
     * Whether the instance should operate in cookieless development mode (i.e. without third-party cookies).Deprecated: Please use `url_based_session_syncing` instead.
     * @deprecated
     * 
     */
    @Deprecated
    private Boolean cookielessDev;
    /**
     * The development_origin property
     */
    private String developmentOrigin;
    /**
     * The "enhanced_email_deliverability" feature will send emails from "verifications@clerk.dev" instead of your domain.This can be helpful if you do not have a high domain reputation.
     */
    private Boolean enhancedEmailDeliverability;
    /**
     * Whether the instance should be using the HIBP service to check passwords for breaches
     */
    private Boolean hibp;
    /**
     * The support_email property
     */
    private String supportEmail;
    /**
     * Toggles test mode for this instance, allowing the use of test email addresses and phone numbers.Defaults to true for development instances.
     */
    private Boolean testMode;
    /**
     * Whether the instance should use URL-based session syncing in development mode (i.e. without third-party cookies).
     */
    private Boolean urlBasedSessionSyncing;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InstancePatchRequestBody
     */
    @jakarta.annotation.Nonnull
    public static InstancePatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InstancePatchRequestBody();
    }
    /**
     * Gets the allowed_origins property value. For browser-like stacks such as browser extensions, Electron, or Capacitor.js the instance allowed origins need to be updated with the request origin value.For Chrome extensions popup, background, or service worker pages the origin is chrome-extension://extension_uiid. For Electron apps the default origin is http://localhost:3000. For Capacitor, the origin is capacitor://localhost.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAllowedOrigins() {
        return this.allowedOrigins;
    }
    /**
     * Gets the clerk_js_version property value. The clerk_js_version property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClerkJsVersion() {
        return this.clerkJsVersion;
    }
    /**
     * Gets the cookieless_dev property value. Whether the instance should operate in cookieless development mode (i.e. without third-party cookies).Deprecated: Please use `url_based_session_syncing` instead.
     * @return a Boolean
     * @deprecated
     * 
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public Boolean getCookielessDev() {
        return this.cookielessDev;
    }
    /**
     * Gets the development_origin property value. The development_origin property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDevelopmentOrigin() {
        return this.developmentOrigin;
    }
    /**
     * Gets the enhanced_email_deliverability property value. The "enhanced_email_deliverability" feature will send emails from "verifications@clerk.dev" instead of your domain.This can be helpful if you do not have a high domain reputation.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getEnhancedEmailDeliverability() {
        return this.enhancedEmailDeliverability;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("allowed_origins", (n) -> { this.setAllowedOrigins(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("clerk_js_version", (n) -> { this.setClerkJsVersion(n.getStringValue()); });
        deserializerMap.put("cookieless_dev", (n) -> { this.setCookielessDev(n.getBooleanValue()); });
        deserializerMap.put("development_origin", (n) -> { this.setDevelopmentOrigin(n.getStringValue()); });
        deserializerMap.put("enhanced_email_deliverability", (n) -> { this.setEnhancedEmailDeliverability(n.getBooleanValue()); });
        deserializerMap.put("hibp", (n) -> { this.setHibp(n.getBooleanValue()); });
        deserializerMap.put("support_email", (n) -> { this.setSupportEmail(n.getStringValue()); });
        deserializerMap.put("test_mode", (n) -> { this.setTestMode(n.getBooleanValue()); });
        deserializerMap.put("url_based_session_syncing", (n) -> { this.setUrlBasedSessionSyncing(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the hibp property value. Whether the instance should be using the HIBP service to check passwords for breaches
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHibp() {
        return this.hibp;
    }
    /**
     * Gets the support_email property value. The support_email property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSupportEmail() {
        return this.supportEmail;
    }
    /**
     * Gets the test_mode property value. Toggles test mode for this instance, allowing the use of test email addresses and phone numbers.Defaults to true for development instances.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTestMode() {
        return this.testMode;
    }
    /**
     * Gets the url_based_session_syncing property value. Whether the instance should use URL-based session syncing in development mode (i.e. without third-party cookies).
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUrlBasedSessionSyncing() {
        return this.urlBasedSessionSyncing;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("allowed_origins", this.getAllowedOrigins());
        writer.writeStringValue("clerk_js_version", this.getClerkJsVersion());
        writer.writeBooleanValue("cookieless_dev", this.getCookielessDev());
        writer.writeStringValue("development_origin", this.getDevelopmentOrigin());
        writer.writeBooleanValue("enhanced_email_deliverability", this.getEnhancedEmailDeliverability());
        writer.writeBooleanValue("hibp", this.getHibp());
        writer.writeStringValue("support_email", this.getSupportEmail());
        writer.writeBooleanValue("test_mode", this.getTestMode());
        writer.writeBooleanValue("url_based_session_syncing", this.getUrlBasedSessionSyncing());
    }
    /**
     * Sets the allowed_origins property value. For browser-like stacks such as browser extensions, Electron, or Capacitor.js the instance allowed origins need to be updated with the request origin value.For Chrome extensions popup, background, or service worker pages the origin is chrome-extension://extension_uiid. For Electron apps the default origin is http://localhost:3000. For Capacitor, the origin is capacitor://localhost.
     * @param value Value to set for the allowed_origins property.
     */
    public void setAllowedOrigins(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.allowedOrigins = value;
    }
    /**
     * Sets the clerk_js_version property value. The clerk_js_version property
     * @param value Value to set for the clerk_js_version property.
     */
    public void setClerkJsVersion(@jakarta.annotation.Nullable final String value) {
        this.clerkJsVersion = value;
    }
    /**
     * Sets the cookieless_dev property value. Whether the instance should operate in cookieless development mode (i.e. without third-party cookies).Deprecated: Please use `url_based_session_syncing` instead.
     * @param value Value to set for the cookieless_dev property.
     * @deprecated
     * 
     */
    @Deprecated
    public void setCookielessDev(@jakarta.annotation.Nullable final Boolean value) {
        this.cookielessDev = value;
    }
    /**
     * Sets the development_origin property value. The development_origin property
     * @param value Value to set for the development_origin property.
     */
    public void setDevelopmentOrigin(@jakarta.annotation.Nullable final String value) {
        this.developmentOrigin = value;
    }
    /**
     * Sets the enhanced_email_deliverability property value. The "enhanced_email_deliverability" feature will send emails from "verifications@clerk.dev" instead of your domain.This can be helpful if you do not have a high domain reputation.
     * @param value Value to set for the enhanced_email_deliverability property.
     */
    public void setEnhancedEmailDeliverability(@jakarta.annotation.Nullable final Boolean value) {
        this.enhancedEmailDeliverability = value;
    }
    /**
     * Sets the hibp property value. Whether the instance should be using the HIBP service to check passwords for breaches
     * @param value Value to set for the hibp property.
     */
    public void setHibp(@jakarta.annotation.Nullable final Boolean value) {
        this.hibp = value;
    }
    /**
     * Sets the support_email property value. The support_email property
     * @param value Value to set for the support_email property.
     */
    public void setSupportEmail(@jakarta.annotation.Nullable final String value) {
        this.supportEmail = value;
    }
    /**
     * Sets the test_mode property value. Toggles test mode for this instance, allowing the use of test email addresses and phone numbers.Defaults to true for development instances.
     * @param value Value to set for the test_mode property.
     */
    public void setTestMode(@jakarta.annotation.Nullable final Boolean value) {
        this.testMode = value;
    }
    /**
     * Sets the url_based_session_syncing property value. Whether the instance should use URL-based session syncing in development mode (i.e. without third-party cookies).
     * @param value Value to set for the url_based_session_syncing property.
     */
    public void setUrlBasedSessionSyncing(@jakarta.annotation.Nullable final Boolean value) {
        this.urlBasedSessionSyncing = value;
    }
}
