package io.github.zzhorizonzz.client.beta_features.instance_settings;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InstanceSettingsPatchRequestBody implements Parsable {
    /**
     * The "enhanced_email_deliverability" feature will send emails from "verifications@clerk.dev" instead of your domain.This can be helpful if you do not have a high domain reputation.
     */
    private Boolean enhancedEmailDeliverability;
    /**
     * The local part of the email address from which authentication-related emails (e.g. OTP code, magic links) will be sent.Only alphanumeric values are allowed.Note that this value should contain only the local part of the address (e.g. `foo` for `foo@example.com`).
     */
    private String fromEmailAddress;
    /**
     * Enable the Progressive Sign Up algorithm. Refer to the [docs](https://clerk.com/docs/upgrade-guides/progressive-sign-up) for more info.
     */
    private Boolean progressiveSignUp;
    /**
     * Whether sign up is restricted to email addresses, phone numbers and usernames that are on the allowlist.
     */
    private Boolean restrictedToAllowlist;
    /**
     * The name of the JWT Template used to augment your session tokens. To disable this, pass an empty string.
     */
    private String sessionTokenTemplate;
    /**
     * Toggles test mode for this instance, allowing the use of test email addresses and phone numbers.Defaults to true for development instances.
     */
    private Boolean testMode;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InstanceSettingsPatchRequestBody
     */
    @jakarta.annotation.Nonnull
    public static InstanceSettingsPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InstanceSettingsPatchRequestBody();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("enhanced_email_deliverability", (n) -> { this.setEnhancedEmailDeliverability(n.getBooleanValue()); });
        deserializerMap.put("from_email_address", (n) -> { this.setFromEmailAddress(n.getStringValue()); });
        deserializerMap.put("progressive_sign_up", (n) -> { this.setProgressiveSignUp(n.getBooleanValue()); });
        deserializerMap.put("restricted_to_allowlist", (n) -> { this.setRestrictedToAllowlist(n.getBooleanValue()); });
        deserializerMap.put("session_token_template", (n) -> { this.setSessionTokenTemplate(n.getStringValue()); });
        deserializerMap.put("test_mode", (n) -> { this.setTestMode(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the from_email_address property value. The local part of the email address from which authentication-related emails (e.g. OTP code, magic links) will be sent.Only alphanumeric values are allowed.Note that this value should contain only the local part of the address (e.g. `foo` for `foo@example.com`).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFromEmailAddress() {
        return this.fromEmailAddress;
    }
    /**
     * Gets the progressive_sign_up property value. Enable the Progressive Sign Up algorithm. Refer to the [docs](https://clerk.com/docs/upgrade-guides/progressive-sign-up) for more info.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getProgressiveSignUp() {
        return this.progressiveSignUp;
    }
    /**
     * Gets the restricted_to_allowlist property value. Whether sign up is restricted to email addresses, phone numbers and usernames that are on the allowlist.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRestrictedToAllowlist() {
        return this.restrictedToAllowlist;
    }
    /**
     * Gets the session_token_template property value. The name of the JWT Template used to augment your session tokens. To disable this, pass an empty string.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSessionTokenTemplate() {
        return this.sessionTokenTemplate;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("enhanced_email_deliverability", this.getEnhancedEmailDeliverability());
        writer.writeStringValue("from_email_address", this.getFromEmailAddress());
        writer.writeBooleanValue("progressive_sign_up", this.getProgressiveSignUp());
        writer.writeBooleanValue("restricted_to_allowlist", this.getRestrictedToAllowlist());
        writer.writeStringValue("session_token_template", this.getSessionTokenTemplate());
        writer.writeBooleanValue("test_mode", this.getTestMode());
    }
    /**
     * Sets the enhanced_email_deliverability property value. The "enhanced_email_deliverability" feature will send emails from "verifications@clerk.dev" instead of your domain.This can be helpful if you do not have a high domain reputation.
     * @param value Value to set for the enhanced_email_deliverability property.
     */
    public void setEnhancedEmailDeliverability(@jakarta.annotation.Nullable final Boolean value) {
        this.enhancedEmailDeliverability = value;
    }
    /**
     * Sets the from_email_address property value. The local part of the email address from which authentication-related emails (e.g. OTP code, magic links) will be sent.Only alphanumeric values are allowed.Note that this value should contain only the local part of the address (e.g. `foo` for `foo@example.com`).
     * @param value Value to set for the from_email_address property.
     */
    public void setFromEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.fromEmailAddress = value;
    }
    /**
     * Sets the progressive_sign_up property value. Enable the Progressive Sign Up algorithm. Refer to the [docs](https://clerk.com/docs/upgrade-guides/progressive-sign-up) for more info.
     * @param value Value to set for the progressive_sign_up property.
     */
    public void setProgressiveSignUp(@jakarta.annotation.Nullable final Boolean value) {
        this.progressiveSignUp = value;
    }
    /**
     * Sets the restricted_to_allowlist property value. Whether sign up is restricted to email addresses, phone numbers and usernames that are on the allowlist.
     * @param value Value to set for the restricted_to_allowlist property.
     */
    public void setRestrictedToAllowlist(@jakarta.annotation.Nullable final Boolean value) {
        this.restrictedToAllowlist = value;
    }
    /**
     * Sets the session_token_template property value. The name of the JWT Template used to augment your session tokens. To disable this, pass an empty string.
     * @param value Value to set for the session_token_template property.
     */
    public void setSessionTokenTemplate(@jakarta.annotation.Nullable final String value) {
        this.sessionTokenTemplate = value;
    }
    /**
     * Sets the test_mode property value. Toggles test mode for this instance, allowing the use of test email addresses and phone numbers.Defaults to true for development instances.
     * @param value Value to set for the test_mode property.
     */
    public void setTestMode(@jakarta.annotation.Nullable final Boolean value) {
        this.testMode = value;
    }
}
