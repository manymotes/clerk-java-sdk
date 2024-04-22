package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SAMLAccount implements Parsable {
    /**
     * The active property
     */
    private Boolean active;
    /**
     * The email_address property
     */
    private String emailAddress;
    /**
     * The first_name property
     */
    private String firstName;
    /**
     * The id property
     */
    private String id;
    /**
     * The last_name property
     */
    private String lastName;
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    private SAMLAccountObject object;
    /**
     * The provider property
     */
    private String provider;
    /**
     * The provider_user_id property
     */
    private String providerUserId;
    /**
     * The verification property
     */
    private SAMLAccountVerification verification;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SAMLAccount
     */
    @jakarta.annotation.Nonnull
    public static SAMLAccount createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SAMLAccount();
    }
    /**
     * Gets the active property value. The active property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getActive() {
        return this.active;
    }
    /**
     * Gets the email_address property value. The email_address property
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("active", (n) -> { this.setActive(n.getBooleanValue()); });
        deserializerMap.put("email_address", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("first_name", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("last_name", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(SAMLAccountObject::forValue)); });
        deserializerMap.put("provider", (n) -> { this.setProvider(n.getStringValue()); });
        deserializerMap.put("provider_user_id", (n) -> { this.setProviderUserId(n.getStringValue()); });
        deserializerMap.put("verification", (n) -> { this.setVerification(n.getObjectValue(SAMLAccountVerification::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the first_name property value. The first_name property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
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
     * Gets the last_name property value. The last_name property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Gets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @return a SAMLAccountObject
     */
    @jakarta.annotation.Nullable
    public SAMLAccountObject getObject() {
        return this.object;
    }
    /**
     * Gets the provider property value. The provider property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProvider() {
        return this.provider;
    }
    /**
     * Gets the provider_user_id property value. The provider_user_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProviderUserId() {
        return this.providerUserId;
    }
    /**
     * Gets the verification property value. The verification property
     * @return a SAMLAccountVerification
     */
    @jakarta.annotation.Nullable
    public SAMLAccountVerification getVerification() {
        return this.verification;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("active", this.getActive());
        writer.writeStringValue("email_address", this.getEmailAddress());
        writer.writeStringValue("first_name", this.getFirstName());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("last_name", this.getLastName());
        writer.writeEnumValue("object", this.getObject());
        writer.writeStringValue("provider", this.getProvider());
        writer.writeStringValue("provider_user_id", this.getProviderUserId());
        writer.writeObjectValue("verification", this.getVerification());
    }
    /**
     * Sets the active property value. The active property
     * @param value Value to set for the active property.
     */
    public void setActive(@jakarta.annotation.Nullable final Boolean value) {
        this.active = value;
    }
    /**
     * Sets the email_address property value. The email_address property
     * @param value Value to set for the email_address property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.emailAddress = value;
    }
    /**
     * Sets the first_name property value. The first_name property
     * @param value Value to set for the first_name property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the last_name property value. The last_name property
     * @param value Value to set for the last_name property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final SAMLAccountObject value) {
        this.object = value;
    }
    /**
     * Sets the provider property value. The provider property
     * @param value Value to set for the provider property.
     */
    public void setProvider(@jakarta.annotation.Nullable final String value) {
        this.provider = value;
    }
    /**
     * Sets the provider_user_id property value. The provider_user_id property
     * @param value Value to set for the provider_user_id property.
     */
    public void setProviderUserId(@jakarta.annotation.Nullable final String value) {
        this.providerUserId = value;
    }
    /**
     * Sets the verification property value. The verification property
     * @param value Value to set for the verification property.
     */
    public void setVerification(@jakarta.annotation.Nullable final SAMLAccountVerification value) {
        this.verification = value;
    }
}
