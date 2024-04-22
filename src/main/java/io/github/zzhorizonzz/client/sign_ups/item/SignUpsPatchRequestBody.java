package io.github.zzhorizonzz.client.sign_ups.item;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SignUpsPatchRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Specifies whether a custom action has run for this sign-up attempt.This is important when your instance has been configured to require a custom action to run before converting a sign-up into a user.After executing any external business logic you deem necessary, you can mark the sign-up as ready-to-convert by setting `custom_action` to `true`.
     */
    private Boolean customAction;
    /**
     * The ID of the guest attempting to sign up as used in your external systems or your previous authentication solution.This will be copied to the resulting user when the sign-up is completed.
     */
    private String externalId;
    /**
     * Instantiates a new SignUpsPatchRequestBody and sets the default values.
     */
    public SignUpsPatchRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SignUpsPatchRequestBody
     */
    @jakarta.annotation.Nonnull
    public static SignUpsPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SignUpsPatchRequestBody();
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
     * Gets the custom_action property value. Specifies whether a custom action has run for this sign-up attempt.This is important when your instance has been configured to require a custom action to run before converting a sign-up into a user.After executing any external business logic you deem necessary, you can mark the sign-up as ready-to-convert by setting `custom_action` to `true`.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCustomAction() {
        return this.customAction;
    }
    /**
     * Gets the external_id property value. The ID of the guest attempting to sign up as used in your external systems or your previous authentication solution.This will be copied to the resulting user when the sign-up is completed.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("custom_action", (n) -> { this.setCustomAction(n.getBooleanValue()); });
        deserializerMap.put("external_id", (n) -> { this.setExternalId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("custom_action", this.getCustomAction());
        writer.writeStringValue("external_id", this.getExternalId());
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
     * Sets the custom_action property value. Specifies whether a custom action has run for this sign-up attempt.This is important when your instance has been configured to require a custom action to run before converting a sign-up into a user.After executing any external business logic you deem necessary, you can mark the sign-up as ready-to-convert by setting `custom_action` to `true`.
     * @param value Value to set for the custom_action property.
     */
    public void setCustomAction(@jakarta.annotation.Nullable final Boolean value) {
        this.customAction = value;
    }
    /**
     * Sets the external_id property value. The ID of the guest attempting to sign up as used in your external systems or your previous authentication solution.This will be copied to the resulting user when the sign-up is completed.
     * @param value Value to set for the external_id property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.externalId = value;
    }
}
