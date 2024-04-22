package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SignUp implements Parsable {
    /**
     * The abandon_at property
     */
    private Integer abandonAt;
    /**
     * The created_session_id property
     */
    private String createdSessionId;
    /**
     * The created_user_id property
     */
    private String createdUserId;
    /**
     * The custom_action property
     */
    private Boolean customAction;
    /**
     * The email_address property
     */
    private String emailAddress;
    /**
     * The external_account property
     */
    private SignUpExternalAccount externalAccount;
    /**
     * The external_id property
     */
    private String externalId;
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
     * The missing_fields property
     */
    private java.util.List<String> missingFields;
    /**
     * The object property
     */
    private SignUpObject object;
    /**
     * The optional_fields property
     */
    private java.util.List<String> optionalFields;
    /**
     * The password_enabled property
     */
    private Boolean passwordEnabled;
    /**
     * The phone_number property
     */
    private String phoneNumber;
    /**
     * The public_metadata property
     */
    private SignUpPublicMetadata publicMetadata;
    /**
     * The required_fields property
     */
    private java.util.List<String> requiredFields;
    /**
     * The status property
     */
    private SignUpStatus status;
    /**
     * The unsafe_metadata property
     */
    private SignUpUnsafeMetadata unsafeMetadata;
    /**
     * The unverified_fields property
     */
    private java.util.List<String> unverifiedFields;
    /**
     * The username property
     */
    private String username;
    /**
     * The verifications property
     */
    private SignUpVerifications verifications;
    /**
     * The web3_wallet property
     */
    private String web3Wallet;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SignUp
     */
    @jakarta.annotation.Nonnull
    public static SignUp createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SignUp();
    }
    /**
     * Gets the abandon_at property value. The abandon_at property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAbandonAt() {
        return this.abandonAt;
    }
    /**
     * Gets the created_session_id property value. The created_session_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreatedSessionId() {
        return this.createdSessionId;
    }
    /**
     * Gets the created_user_id property value. The created_user_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreatedUserId() {
        return this.createdUserId;
    }
    /**
     * Gets the custom_action property value. The custom_action property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCustomAction() {
        return this.customAction;
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
     * Gets the external_account property value. The external_account property
     * @return a SignUpExternalAccount
     */
    @jakarta.annotation.Nullable
    public SignUpExternalAccount getExternalAccount() {
        return this.externalAccount;
    }
    /**
     * Gets the external_id property value. The external_id property
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(23);
        deserializerMap.put("abandon_at", (n) -> { this.setAbandonAt(n.getIntegerValue()); });
        deserializerMap.put("created_session_id", (n) -> { this.setCreatedSessionId(n.getStringValue()); });
        deserializerMap.put("created_user_id", (n) -> { this.setCreatedUserId(n.getStringValue()); });
        deserializerMap.put("custom_action", (n) -> { this.setCustomAction(n.getBooleanValue()); });
        deserializerMap.put("email_address", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("external_account", (n) -> { this.setExternalAccount(n.getObjectValue(SignUpExternalAccount::createFromDiscriminatorValue)); });
        deserializerMap.put("external_id", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("first_name", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("last_name", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("missing_fields", (n) -> { this.setMissingFields(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(SignUpObject::forValue)); });
        deserializerMap.put("optional_fields", (n) -> { this.setOptionalFields(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("password_enabled", (n) -> { this.setPasswordEnabled(n.getBooleanValue()); });
        deserializerMap.put("phone_number", (n) -> { this.setPhoneNumber(n.getStringValue()); });
        deserializerMap.put("public_metadata", (n) -> { this.setPublicMetadata(n.getObjectValue(SignUpPublicMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("required_fields", (n) -> { this.setRequiredFields(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(SignUpStatus::forValue)); });
        deserializerMap.put("unsafe_metadata", (n) -> { this.setUnsafeMetadata(n.getObjectValue(SignUpUnsafeMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("unverified_fields", (n) -> { this.setUnverifiedFields(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        deserializerMap.put("verifications", (n) -> { this.setVerifications(n.getObjectValue(SignUpVerifications::createFromDiscriminatorValue)); });
        deserializerMap.put("web3_wallet", (n) -> { this.setWeb3Wallet(n.getStringValue()); });
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
     * Gets the missing_fields property value. The missing_fields property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMissingFields() {
        return this.missingFields;
    }
    /**
     * Gets the object property value. The object property
     * @return a SignUpObject
     */
    @jakarta.annotation.Nullable
    public SignUpObject getObject() {
        return this.object;
    }
    /**
     * Gets the optional_fields property value. The optional_fields property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOptionalFields() {
        return this.optionalFields;
    }
    /**
     * Gets the password_enabled property value. The password_enabled property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getPasswordEnabled() {
        return this.passwordEnabled;
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
     * Gets the public_metadata property value. The public_metadata property
     * @return a SignUpPublicMetadata
     */
    @jakarta.annotation.Nullable
    public SignUpPublicMetadata getPublicMetadata() {
        return this.publicMetadata;
    }
    /**
     * Gets the required_fields property value. The required_fields property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRequiredFields() {
        return this.requiredFields;
    }
    /**
     * Gets the status property value. The status property
     * @return a SignUpStatus
     */
    @jakarta.annotation.Nullable
    public SignUpStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the unsafe_metadata property value. The unsafe_metadata property
     * @return a SignUpUnsafeMetadata
     */
    @jakarta.annotation.Nullable
    public SignUpUnsafeMetadata getUnsafeMetadata() {
        return this.unsafeMetadata;
    }
    /**
     * Gets the unverified_fields property value. The unverified_fields property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getUnverifiedFields() {
        return this.unverifiedFields;
    }
    /**
     * Gets the username property value. The username property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUsername() {
        return this.username;
    }
    /**
     * Gets the verifications property value. The verifications property
     * @return a SignUpVerifications
     */
    @jakarta.annotation.Nullable
    public SignUpVerifications getVerifications() {
        return this.verifications;
    }
    /**
     * Gets the web3_wallet property value. The web3_wallet property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWeb3Wallet() {
        return this.web3Wallet;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("abandon_at", this.getAbandonAt());
        writer.writeStringValue("created_session_id", this.getCreatedSessionId());
        writer.writeStringValue("created_user_id", this.getCreatedUserId());
        writer.writeBooleanValue("custom_action", this.getCustomAction());
        writer.writeStringValue("email_address", this.getEmailAddress());
        writer.writeObjectValue("external_account", this.getExternalAccount());
        writer.writeStringValue("external_id", this.getExternalId());
        writer.writeStringValue("first_name", this.getFirstName());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("last_name", this.getLastName());
        writer.writeCollectionOfPrimitiveValues("missing_fields", this.getMissingFields());
        writer.writeEnumValue("object", this.getObject());
        writer.writeCollectionOfPrimitiveValues("optional_fields", this.getOptionalFields());
        writer.writeBooleanValue("password_enabled", this.getPasswordEnabled());
        writer.writeStringValue("phone_number", this.getPhoneNumber());
        writer.writeObjectValue("public_metadata", this.getPublicMetadata());
        writer.writeCollectionOfPrimitiveValues("required_fields", this.getRequiredFields());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeObjectValue("unsafe_metadata", this.getUnsafeMetadata());
        writer.writeCollectionOfPrimitiveValues("unverified_fields", this.getUnverifiedFields());
        writer.writeStringValue("username", this.getUsername());
        writer.writeObjectValue("verifications", this.getVerifications());
        writer.writeStringValue("web3_wallet", this.getWeb3Wallet());
    }
    /**
     * Sets the abandon_at property value. The abandon_at property
     * @param value Value to set for the abandon_at property.
     */
    public void setAbandonAt(@jakarta.annotation.Nullable final Integer value) {
        this.abandonAt = value;
    }
    /**
     * Sets the created_session_id property value. The created_session_id property
     * @param value Value to set for the created_session_id property.
     */
    public void setCreatedSessionId(@jakarta.annotation.Nullable final String value) {
        this.createdSessionId = value;
    }
    /**
     * Sets the created_user_id property value. The created_user_id property
     * @param value Value to set for the created_user_id property.
     */
    public void setCreatedUserId(@jakarta.annotation.Nullable final String value) {
        this.createdUserId = value;
    }
    /**
     * Sets the custom_action property value. The custom_action property
     * @param value Value to set for the custom_action property.
     */
    public void setCustomAction(@jakarta.annotation.Nullable final Boolean value) {
        this.customAction = value;
    }
    /**
     * Sets the email_address property value. The email_address property
     * @param value Value to set for the email_address property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.emailAddress = value;
    }
    /**
     * Sets the external_account property value. The external_account property
     * @param value Value to set for the external_account property.
     */
    public void setExternalAccount(@jakarta.annotation.Nullable final SignUpExternalAccount value) {
        this.externalAccount = value;
    }
    /**
     * Sets the external_id property value. The external_id property
     * @param value Value to set for the external_id property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.externalId = value;
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
     * Sets the missing_fields property value. The missing_fields property
     * @param value Value to set for the missing_fields property.
     */
    public void setMissingFields(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.missingFields = value;
    }
    /**
     * Sets the object property value. The object property
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final SignUpObject value) {
        this.object = value;
    }
    /**
     * Sets the optional_fields property value. The optional_fields property
     * @param value Value to set for the optional_fields property.
     */
    public void setOptionalFields(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.optionalFields = value;
    }
    /**
     * Sets the password_enabled property value. The password_enabled property
     * @param value Value to set for the password_enabled property.
     */
    public void setPasswordEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordEnabled = value;
    }
    /**
     * Sets the phone_number property value. The phone_number property
     * @param value Value to set for the phone_number property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final String value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the public_metadata property value. The public_metadata property
     * @param value Value to set for the public_metadata property.
     */
    public void setPublicMetadata(@jakarta.annotation.Nullable final SignUpPublicMetadata value) {
        this.publicMetadata = value;
    }
    /**
     * Sets the required_fields property value. The required_fields property
     * @param value Value to set for the required_fields property.
     */
    public void setRequiredFields(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.requiredFields = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final SignUpStatus value) {
        this.status = value;
    }
    /**
     * Sets the unsafe_metadata property value. The unsafe_metadata property
     * @param value Value to set for the unsafe_metadata property.
     */
    public void setUnsafeMetadata(@jakarta.annotation.Nullable final SignUpUnsafeMetadata value) {
        this.unsafeMetadata = value;
    }
    /**
     * Sets the unverified_fields property value. The unverified_fields property
     * @param value Value to set for the unverified_fields property.
     */
    public void setUnverifiedFields(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.unverifiedFields = value;
    }
    /**
     * Sets the username property value. The username property
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
    /**
     * Sets the verifications property value. The verifications property
     * @param value Value to set for the verifications property.
     */
    public void setVerifications(@jakarta.annotation.Nullable final SignUpVerifications value) {
        this.verifications = value;
    }
    /**
     * Sets the web3_wallet property value. The web3_wallet property
     * @param value Value to set for the web3_wallet property.
     */
    public void setWeb3Wallet(@jakarta.annotation.Nullable final String value) {
        this.web3Wallet = value;
    }
}
