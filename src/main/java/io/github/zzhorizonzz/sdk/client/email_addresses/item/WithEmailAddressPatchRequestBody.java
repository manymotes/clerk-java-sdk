package io.github.zzhorizonzz.sdk.client.email_addresses.item;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithEmailAddressPatchRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Set this email address as the primary email address for the user.
     */
    private Boolean primary;
    /**
     * The email address will be marked as verified.
     */
    private Boolean verified;
    /**
     * Instantiates a new WithEmailAddressPatchRequestBody and sets the default values.
     */
    public WithEmailAddressPatchRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WithEmailAddressPatchRequestBody
     */
    @jakarta.annotation.Nonnull
    public static WithEmailAddressPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WithEmailAddressPatchRequestBody();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(2);
        deserializerMap.put("primary", (n) -> { this.setPrimary(n.getBooleanValue()); });
        deserializerMap.put("verified", (n) -> { this.setVerified(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the primary property value. Set this email address as the primary email address for the user.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPrimary() {
        return this.primary;
    }
    /**
     * Gets the verified property value. The email address will be marked as verified.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getVerified() {
        return this.verified;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("primary", this.getPrimary());
        writer.writeBooleanValue("verified", this.getVerified());
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
     * Sets the primary property value. Set this email address as the primary email address for the user.
     * @param value Value to set for the primary property.
     */
    public void setPrimary(@jakarta.annotation.Nullable final Boolean value) {
        this.primary = value;
    }
    /**
     * Sets the verified property value. The email address will be marked as verified.
     * @param value Value to set for the verified property.
     */
    public void setVerified(@jakarta.annotation.Nullable final Boolean value) {
        this.verified = value;
    }
}
