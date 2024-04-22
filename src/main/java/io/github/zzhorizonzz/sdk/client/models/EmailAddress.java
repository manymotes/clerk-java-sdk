package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmailAddress implements Parsable {
    /**
     * The email_address property
     */
    private String emailAddress;
    /**
     * The id property
     */
    private String id;
    /**
     * The linked_to property
     */
    private java.util.List<IdentificationLink> linkedTo;
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    private EmailAddressObject object;
    /**
     * The reserved property
     */
    private Boolean reserved;
    /**
     * The verification property
     */
    private EmailAddressVerification verification;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EmailAddress
     */
    @jakarta.annotation.Nonnull
    public static EmailAddress createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmailAddress();
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("email_address", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("linked_to", (n) -> { this.setLinkedTo(n.getCollectionOfObjectValues(IdentificationLink::createFromDiscriminatorValue)); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(EmailAddressObject::forValue)); });
        deserializerMap.put("reserved", (n) -> { this.setReserved(n.getBooleanValue()); });
        deserializerMap.put("verification", (n) -> { this.setVerification(n.getObjectValue(EmailAddressVerification::createFromDiscriminatorValue)); });
        return deserializerMap;
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
     * Gets the linked_to property value. The linked_to property
     * @return a java.util.List<IdentificationLink>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IdentificationLink> getLinkedTo() {
        return this.linkedTo;
    }
    /**
     * Gets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @return a EmailAddressObject
     */
    @jakarta.annotation.Nullable
    public EmailAddressObject getObject() {
        return this.object;
    }
    /**
     * Gets the reserved property value. The reserved property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getReserved() {
        return this.reserved;
    }
    /**
     * Gets the verification property value. The verification property
     * @return a EmailAddressVerification
     */
    @jakarta.annotation.Nullable
    public EmailAddressVerification getVerification() {
        return this.verification;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("email_address", this.getEmailAddress());
        writer.writeStringValue("id", this.getId());
        writer.writeCollectionOfObjectValues("linked_to", this.getLinkedTo());
        writer.writeEnumValue("object", this.getObject());
        writer.writeBooleanValue("reserved", this.getReserved());
        writer.writeObjectValue("verification", this.getVerification());
    }
    /**
     * Sets the email_address property value. The email_address property
     * @param value Value to set for the email_address property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.emailAddress = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the linked_to property value. The linked_to property
     * @param value Value to set for the linked_to property.
     */
    public void setLinkedTo(@jakarta.annotation.Nullable final java.util.List<IdentificationLink> value) {
        this.linkedTo = value;
    }
    /**
     * Sets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final EmailAddressObject value) {
        this.object = value;
    }
    /**
     * Sets the reserved property value. The reserved property
     * @param value Value to set for the reserved property.
     */
    public void setReserved(@jakarta.annotation.Nullable final Boolean value) {
        this.reserved = value;
    }
    /**
     * Sets the verification property value. The verification property
     * @param value Value to set for the verification property.
     */
    public void setVerification(@jakarta.annotation.Nullable final EmailAddressVerification value) {
        this.verification = value;
    }
    /**
     * Composed type wrapper for classes Admin, OTP
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class EmailAddressVerification implements ComposedTypeWrapper, Parsable {
        /**
         * Composed type representation for type Admin
         */
        private Admin admin;
        /**
         * Composed type representation for type OTP
         */
        private OTP oTP;
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a EmailAddressVerification
         */
        @jakarta.annotation.Nonnull
        public static EmailAddressVerification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final EmailAddressVerification result = new EmailAddressVerification();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            return result;
        }
        /**
         * Gets the Admin property value. Composed type representation for type Admin
         * @return a Admin
         */
        @jakarta.annotation.Nullable
        public Admin getAdmin() {
            return this.admin;
        }
        /**
         * The deserialization information for the current model
         * @return a Map<String, java.util.function.Consumer<ParseNode>>
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            if (this.getAdmin() != null) {
                return this.getAdmin().getFieldDeserializers();
            } else if (this.getOTP() != null) {
                return this.getOTP().getFieldDeserializers();
            }
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the OTP property value. Composed type representation for type OTP
         * @return a OTP
         */
        @jakarta.annotation.Nullable
        public OTP getOTP() {
            return this.oTP;
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getAdmin() != null) {
                writer.writeObjectValue(null, this.getAdmin());
            } else if (this.getOTP() != null) {
                writer.writeObjectValue(null, this.getOTP());
            }
        }
        /**
         * Sets the Admin property value. Composed type representation for type Admin
         * @param value Value to set for the Admin property.
         */
        public void setAdmin(@jakarta.annotation.Nullable final Admin value) {
            this.admin = value;
        }
        /**
         * Sets the OTP property value. Composed type representation for type OTP
         * @param value Value to set for the OTP property.
         */
        public void setOTP(@jakarta.annotation.Nullable final OTP value) {
            this.oTP = value;
        }
    }
}
