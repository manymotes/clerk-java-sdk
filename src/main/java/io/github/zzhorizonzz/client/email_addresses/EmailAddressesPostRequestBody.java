package io.github.zzhorizonzz.client.email_addresses;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmailAddressesPostRequestBody implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The new email address. Must adhere to the RFC 5322 specification for email address format.
     */
    private String emailAddress;
    /**
     * Create this email address as the primary email address for the user.Default: false, unless it is the first email address.
     */
    private Boolean primary;
    /**
     * The ID representing the user
     */
    private String userId;
    /**
     * When created, the email address will be marked as verified.
     */
    private Boolean verified;
    /**
     * Instantiates a new EmailAddressesPostRequestBody and sets the default values.
     */
    public EmailAddressesPostRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EmailAddressesPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static EmailAddressesPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmailAddressesPostRequestBody();
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
     * Gets the email_address property value. The new email address. Must adhere to the RFC 5322 specification for email address format.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmailAddress() {
        return this.emailAddress;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("email_address", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("primary", (n) -> { this.setPrimary(n.getBooleanValue()); });
        deserializerMap.put("user_id", (n) -> { this.setUserId(n.getStringValue()); });
        deserializerMap.put("verified", (n) -> { this.setVerified(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the primary property value. Create this email address as the primary email address for the user.Default: false, unless it is the first email address.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPrimary() {
        return this.primary;
    }
    /**
     * Gets the user_id property value. The ID representing the user
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Gets the verified property value. When created, the email address will be marked as verified.
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
        writer.writeStringValue("email_address", this.getEmailAddress());
        writer.writeBooleanValue("primary", this.getPrimary());
        writer.writeStringValue("user_id", this.getUserId());
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
     * Sets the email_address property value. The new email address. Must adhere to the RFC 5322 specification for email address format.
     * @param value Value to set for the email_address property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.emailAddress = value;
    }
    /**
     * Sets the primary property value. Create this email address as the primary email address for the user.Default: false, unless it is the first email address.
     * @param value Value to set for the primary property.
     */
    public void setPrimary(@jakarta.annotation.Nullable final Boolean value) {
        this.primary = value;
    }
    /**
     * Sets the user_id property value. The ID representing the user
     * @param value Value to set for the user_id property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
    /**
     * Sets the verified property value. When created, the email address will be marked as verified.
     * @param value Value to set for the verified property.
     */
    public void setVerified(@jakarta.annotation.Nullable final Boolean value) {
        this.verified = value;
    }
}
