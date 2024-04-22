package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PhoneNumber implements Parsable {
    /**
     * The backup_codes property
     */
    private java.util.List<String> backupCodes;
    /**
     * The default_second_factor property
     */
    private Boolean defaultSecondFactor;
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
    private PhoneNumberObject object;
    /**
     * The phone_number property
     */
    private String phoneNumber;
    /**
     * The reserved property
     */
    private Boolean reserved;
    /**
     * The reserved_for_second_factor property
     */
    private Boolean reservedForSecondFactor;
    /**
     * The verification property
     */
    private PhoneNumberVerification verification;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PhoneNumber
     */
    @jakarta.annotation.Nonnull
    public static PhoneNumber createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PhoneNumber();
    }
    /**
     * Gets the backup_codes property value. The backup_codes property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBackupCodes() {
        return this.backupCodes;
    }
    /**
     * Gets the default_second_factor property value. The default_second_factor property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDefaultSecondFactor() {
        return this.defaultSecondFactor;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(9);
        deserializerMap.put("backup_codes", (n) -> { this.setBackupCodes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("default_second_factor", (n) -> { this.setDefaultSecondFactor(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("linked_to", (n) -> { this.setLinkedTo(n.getCollectionOfObjectValues(IdentificationLink::createFromDiscriminatorValue)); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(PhoneNumberObject::forValue)); });
        deserializerMap.put("phone_number", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("reserved", (n) -> { this.setReserved(n.getBooleanValue()); });
        deserializerMap.put("reserved_for_second_factor", (n) -> { this.setReservedForSecondFactor(n.getBooleanValue()); });
        deserializerMap.put("verification", (n) -> { this.setVerification(n.getObjectValue(PhoneNumberVerification::createFromDiscriminatorValue)); });
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
     * @return a PhoneNumberObject
     */
    @jakarta.annotation.Nullable
    public PhoneNumberObject getObject() {
        return this.object;
    }
    /**
     * Gets the phone_number property value. The phone_number property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPhoneNumber() {
        return this.phoneNumber;
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
     * Gets the reserved_for_second_factor property value. The reserved_for_second_factor property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getReservedForSecondFactor() {
        return this.reservedForSecondFactor;
    }
    /**
     * Gets the verification property value. The verification property
     * @return a PhoneNumberVerification
     */
    @jakarta.annotation.Nullable
    public PhoneNumberVerification getVerification() {
        return this.verification;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("backup_codes", this.getBackupCodes());
        writer.writeBooleanValue("default_second_factor", this.getDefaultSecondFactor());
        writer.writeStringValue("id", this.getId());
        writer.writeCollectionOfObjectValues("linked_to", this.getLinkedTo());
        writer.writeEnumValue("object", this.getObject());
        writer.writeStringValue("phone_number", this.getPhoneNumber());
        writer.writeBooleanValue("reserved", this.getReserved());
        writer.writeBooleanValue("reserved_for_second_factor", this.getReservedForSecondFactor());
        writer.writeObjectValue("verification", this.getVerification());
    }
    /**
     * Sets the backup_codes property value. The backup_codes property
     * @param value Value to set for the backup_codes property.
     */
    public void setBackupCodes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backupCodes = value;
    }
    /**
     * Sets the default_second_factor property value. The default_second_factor property
     * @param value Value to set for the default_second_factor property.
     */
    public void setDefaultSecondFactor(@jakarta.annotation.Nullable final Boolean value) {
        this.defaultSecondFactor = value;
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
    public void setObject(@jakarta.annotation.Nullable final PhoneNumberObject value) {
        this.object = value;
    }
    /**
     * Sets the phone_number property value. The phone_number property
     * @param value Value to set for the phone_number property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the reserved property value. The reserved property
     * @param value Value to set for the reserved property.
     */
    public void setReserved(@jakarta.annotation.Nullable final Boolean value) {
        this.reserved = value;
    }
    /**
     * Sets the reserved_for_second_factor property value. The reserved_for_second_factor property
     * @param value Value to set for the reserved_for_second_factor property.
     */
    public void setReservedForSecondFactor(@jakarta.annotation.Nullable final Boolean value) {
        this.reservedForSecondFactor = value;
    }
    /**
     * Sets the verification property value. The verification property
     * @param value Value to set for the verification property.
     */
    public void setVerification(@jakarta.annotation.Nullable final PhoneNumberVerification value) {
        this.verification = value;
    }
    /**
     * Composed type wrapper for classes Admin, OTP
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class PhoneNumberVerification implements ComposedTypeWrapper, Parsable {
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
         * @return a PhoneNumberVerification
         */
        @jakarta.annotation.Nonnull
        public static PhoneNumberVerification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final PhoneNumberVerification result = new PhoneNumberVerification();
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
