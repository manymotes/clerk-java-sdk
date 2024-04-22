package io.github.zzhorizonzz.sdk.client.beta_features.instance_settings;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InstanceSettingsPatchResponse implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The enhanced_email_deliverability property
     */
    private Boolean enhancedEmailDeliverability;
    /**
     * The from_email_address property
     */
    private String fromEmailAddress;
    /**
     * The id property
     */
    private String id;
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    private InstanceSettingsPatchResponseObject object;
    /**
     * The progressive_sign_up property
     */
    private Boolean progressiveSignUp;
    /**
     * The restricted_to_allowlist property
     */
    private Boolean restrictedToAllowlist;
    /**
     * Instantiates a new InstanceSettingsPatchResponse and sets the default values.
     */
    public InstanceSettingsPatchResponse() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InstanceSettingsPatchResponse
     */
    @jakarta.annotation.Nonnull
    public static InstanceSettingsPatchResponse createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InstanceSettingsPatchResponse();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the enhanced_email_deliverability property value. The enhanced_email_deliverability property
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
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(InstanceSettingsPatchResponseObject::forValue)); });
        deserializerMap.put("progressive_sign_up", (n) -> { this.setProgressiveSignUp(n.getBooleanValue()); });
        deserializerMap.put("restricted_to_allowlist", (n) -> { this.setRestrictedToAllowlist(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the from_email_address property value. The from_email_address property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFromEmailAddress() {
        return this.fromEmailAddress;
    }
    /**
     * Gets the id property value. The id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getId() {
        return this.id;
    }
    /**
     * Gets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @return a InstanceSettingsPatchResponseObject
     */
    @jakarta.annotation.Nullable
    public InstanceSettingsPatchResponseObject getObject() {
        return this.object;
    }
    /**
     * Gets the progressive_sign_up property value. The progressive_sign_up property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getProgressiveSignUp() {
        return this.progressiveSignUp;
    }
    /**
     * Gets the restricted_to_allowlist property value. The restricted_to_allowlist property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getRestrictedToAllowlist() {
        return this.restrictedToAllowlist;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("enhanced_email_deliverability", this.getEnhancedEmailDeliverability());
        writer.writeStringValue("from_email_address", this.getFromEmailAddress());
        writer.writeStringValue("id", this.getId());
        writer.writeEnumValue("object", this.getObject());
        writer.writeBooleanValue("progressive_sign_up", this.getProgressiveSignUp());
        writer.writeBooleanValue("restricted_to_allowlist", this.getRestrictedToAllowlist());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the enhanced_email_deliverability property value. The enhanced_email_deliverability property
     * @param value Value to set for the enhanced_email_deliverability property.
     */
    public void setEnhancedEmailDeliverability(@jakarta.annotation.Nullable final Boolean value) {
        this.enhancedEmailDeliverability = value;
    }
    /**
     * Sets the from_email_address property value. The from_email_address property
     * @param value Value to set for the from_email_address property.
     */
    public void setFromEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.fromEmailAddress = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final InstanceSettingsPatchResponseObject value) {
        this.object = value;
    }
    /**
     * Sets the progressive_sign_up property value. The progressive_sign_up property
     * @param value Value to set for the progressive_sign_up property.
     */
    public void setProgressiveSignUp(@jakarta.annotation.Nullable final Boolean value) {
        this.progressiveSignUp = value;
    }
    /**
     * Sets the restricted_to_allowlist property value. The restricted_to_allowlist property
     * @param value Value to set for the restricted_to_allowlist property.
     */
    public void setRestrictedToAllowlist(@jakarta.annotation.Nullable final Boolean value) {
        this.restrictedToAllowlist = value;
    }
}
