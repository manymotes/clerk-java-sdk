package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class User implements Parsable {
    /**
     * The backup_code_enabled property
     */
    private Boolean backupCodeEnabled;
    /**
     * Flag to denote whether user is banned or not.
     */
    private Boolean banned;
    /**
     * The birthday property
     */
    private String birthday;
    /**
     * Unix timestamp of creation.
     */
    private Long createdAt;
    /**
     * If enabled, user can create organizations via FAPI.
     */
    private Boolean createOrganizationEnabled;
    /**
     * If enabled, user can delete themselves via FAPI.
     */
    private Boolean deleteSelfEnabled;
    /**
     * The email_addresses property
     */
    private java.util.List<EmailAddress> emailAddresses;
    /**
     * The external_accounts property
     */
    private java.util.List<UserExternalAccounts> externalAccounts;
    /**
     * The external_id property
     */
    private String externalId;
    /**
     * The first_name property
     */
    private String firstName;
    /**
     * The gender property
     */
    private String gender;
    /**
     * The has_image property
     */
    private Boolean hasImage;
    /**
     * The id property
     */
    private String id;
    /**
     * The image_url property
     */
    private String imageUrl;
    /**
     * Unix timestamp of the latest session activity, with day precision.
     */
    private Long lastActiveAt;
    /**
     * The last_name property
     */
    private String lastName;
    /**
     * Unix timestamp of last sign-in.
     */
    private Long lastSignInAt;
    /**
     * Flag to denote whether user is currently locked, i.e. restricted from signing in or not.
     */
    private Boolean locked;
    /**
     * The number of seconds remaining until the lockout period expires for a locked user. A null value for a locked user indicates that lockout never expires.
     */
    private Long lockoutExpiresInSeconds;
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    private UserObject object;
    /**
     * The password_enabled property
     */
    private Boolean passwordEnabled;
    /**
     * The phone_numbers property
     */
    private java.util.List<PhoneNumber> phoneNumbers;
    /**
     * The primary_email_address_id property
     */
    private String primaryEmailAddressId;
    /**
     * The primary_phone_number_id property
     */
    private String primaryPhoneNumberId;
    /**
     * The primary_web3_wallet_id property
     */
    private String primaryWeb3WalletId;
    /**
     * The private_metadata property
     */
    private UserPrivateMetadata privateMetadata;
    /**
     * The profile_image_url property
     * @deprecated
     * 
     */
    @Deprecated
    private String profileImageUrl;
    /**
     * The public_metadata property
     */
    private UserPublicMetadata publicMetadata;
    /**
     * The saml_accounts property
     */
    private java.util.List<SAMLAccount> samlAccounts;
    /**
     * The totp_enabled property
     */
    private Boolean totpEnabled;
    /**
     * The two_factor_enabled property
     */
    private Boolean twoFactorEnabled;
    /**
     * The unsafe_metadata property
     */
    private UserUnsafeMetadata unsafeMetadata;
    /**
     * Unix timestamp of last update.
     */
    private Long updatedAt;
    /**
     * The username property
     */
    private String username;
    /**
     * The number of verification attempts remaining until the user is locked. Null if account lockout is not enabled. Note: if a user is locked explicitly via the Backend API, they may still have verification attempts remaining.
     */
    private Long verificationAttemptsRemaining;
    /**
     * The web3_wallets property
     */
    private java.util.List<Web3Wallet> web3Wallets;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a User
     */
    @jakarta.annotation.Nonnull
    public static User createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new User();
    }
    /**
     * Gets the backup_code_enabled property value. The backup_code_enabled property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBackupCodeEnabled() {
        return this.backupCodeEnabled;
    }
    /**
     * Gets the banned property value. Flag to denote whether user is banned or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBanned() {
        return this.banned;
    }
    /**
     * Gets the birthday property value. The birthday property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBirthday() {
        return this.birthday;
    }
    /**
     * Gets the created_at property value. Unix timestamp of creation.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the create_organization_enabled property value. If enabled, user can create organizations via FAPI.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCreateOrganizationEnabled() {
        return this.createOrganizationEnabled;
    }
    /**
     * Gets the delete_self_enabled property value. If enabled, user can delete themselves via FAPI.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeleteSelfEnabled() {
        return this.deleteSelfEnabled;
    }
    /**
     * Gets the email_addresses property value. The email_addresses property
     * @return a java.util.List<EmailAddress>
     */
    @jakarta.annotation.Nullable
    public java.util.List<EmailAddress> getEmailAddresses() {
        return this.emailAddresses;
    }
    /**
     * Gets the external_accounts property value. The external_accounts property
     * @return a java.util.List<UserExternalAccounts>
     */
    @jakarta.annotation.Nullable
    public java.util.List<UserExternalAccounts> getExternalAccounts() {
        return this.externalAccounts;
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(36);
        deserializerMap.put("backup_code_enabled", (n) -> { this.setBackupCodeEnabled(n.getBooleanValue()); });
        deserializerMap.put("banned", (n) -> { this.setBanned(n.getBooleanValue()); });
        deserializerMap.put("birthday", (n) -> { this.setBirthday(n.getStringValue()); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getLongValue()); });
        deserializerMap.put("create_organization_enabled", (n) -> { this.setCreateOrganizationEnabled(n.getBooleanValue()); });
        deserializerMap.put("delete_self_enabled", (n) -> { this.setDeleteSelfEnabled(n.getBooleanValue()); });
        deserializerMap.put("email_addresses", (n) -> { this.setEmailAddresses(n.getCollectionOfObjectValues(EmailAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("external_accounts", (n) -> { this.setExternalAccounts(n.getCollectionOfObjectValues(UserExternalAccounts::createFromDiscriminatorValue)); });
        deserializerMap.put("external_id", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("first_name", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("gender", (n) -> { this.setGender(n.getStringValue()); });
        deserializerMap.put("has_image", (n) -> { this.setHasImage(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("image_url", (n) -> { this.setImageUrl(n.getStringValue()); });
        deserializerMap.put("last_active_at", (n) -> { this.setLastActiveAt(n.getLongValue()); });
        deserializerMap.put("last_name", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("last_sign_in_at", (n) -> { this.setLastSignInAt(n.getLongValue()); });
        deserializerMap.put("locked", (n) -> { this.setLocked(n.getBooleanValue()); });
        deserializerMap.put("lockout_expires_in_seconds", (n) -> { this.setLockoutExpiresInSeconds(n.getLongValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(UserObject::forValue)); });
        deserializerMap.put("password_enabled", (n) -> { this.setPasswordEnabled(n.getBooleanValue()); });
        deserializerMap.put("phone_numbers", (n) -> { this.setPhoneNumbers(n.getCollectionOfObjectValues(PhoneNumber::createFromDiscriminatorValue)); });
        deserializerMap.put("primary_email_address_id", (n) -> { this.setPrimaryEmailAddressId(n.getStringValue()); });
        deserializerMap.put("primary_phone_number_id", (n) -> { this.setPrimaryPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("primary_web3_wallet_id", (n) -> { this.setPrimaryWeb3WalletId(n.getStringValue()); });
        deserializerMap.put("private_metadata", (n) -> { this.setPrivateMetadata(n.getObjectValue(UserPrivateMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("profile_image_url", (n) -> { this.setProfileImageUrl(n.getStringValue()); });
        deserializerMap.put("public_metadata", (n) -> { this.setPublicMetadata(n.getObjectValue(UserPublicMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("saml_accounts", (n) -> { this.setSamlAccounts(n.getCollectionOfObjectValues(SAMLAccount::createFromDiscriminatorValue)); });
        deserializerMap.put("totp_enabled", (n) -> { this.setTotpEnabled(n.getBooleanValue()); });
        deserializerMap.put("two_factor_enabled", (n) -> { this.setTwoFactorEnabled(n.getBooleanValue()); });
        deserializerMap.put("unsafe_metadata", (n) -> { this.setUnsafeMetadata(n.getObjectValue(UserUnsafeMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getLongValue()); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        deserializerMap.put("verification_attempts_remaining", (n) -> { this.setVerificationAttemptsRemaining(n.getLongValue()); });
        deserializerMap.put("web3_wallets", (n) -> { this.setWeb3Wallets(n.getCollectionOfObjectValues(Web3Wallet::createFromDiscriminatorValue)); });
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
     * Gets the gender property value. The gender property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getGender() {
        return this.gender;
    }
    /**
     * Gets the has_image property value. The has_image property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasImage() {
        return this.hasImage;
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
     * Gets the image_url property value. The image_url property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getImageUrl() {
        return this.imageUrl;
    }
    /**
     * Gets the last_active_at property value. Unix timestamp of the latest session activity, with day precision.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getLastActiveAt() {
        return this.lastActiveAt;
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
     * Gets the last_sign_in_at property value. Unix timestamp of last sign-in.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getLastSignInAt() {
        return this.lastSignInAt;
    }
    /**
     * Gets the locked property value. Flag to denote whether user is currently locked, i.e. restricted from signing in or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getLocked() {
        return this.locked;
    }
    /**
     * Gets the lockout_expires_in_seconds property value. The number of seconds remaining until the lockout period expires for a locked user. A null value for a locked user indicates that lockout never expires.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getLockoutExpiresInSeconds() {
        return this.lockoutExpiresInSeconds;
    }
    /**
     * Gets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @return a UserObject
     */
    @jakarta.annotation.Nullable
    public UserObject getObject() {
        return this.object;
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
     * Gets the phone_numbers property value. The phone_numbers property
     * @return a java.util.List<PhoneNumber>
     */
    @jakarta.annotation.Nullable
    public java.util.List<PhoneNumber> getPhoneNumbers() {
        return this.phoneNumbers;
    }
    /**
     * Gets the primary_email_address_id property value. The primary_email_address_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrimaryEmailAddressId() {
        return this.primaryEmailAddressId;
    }
    /**
     * Gets the primary_phone_number_id property value. The primary_phone_number_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrimaryPhoneNumberId() {
        return this.primaryPhoneNumberId;
    }
    /**
     * Gets the primary_web3_wallet_id property value. The primary_web3_wallet_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrimaryWeb3WalletId() {
        return this.primaryWeb3WalletId;
    }
    /**
     * Gets the private_metadata property value. The private_metadata property
     * @return a UserPrivateMetadata
     */
    @jakarta.annotation.Nullable
    public UserPrivateMetadata getPrivateMetadata() {
        return this.privateMetadata;
    }
    /**
     * Gets the profile_image_url property value. The profile_image_url property
     * @return a String
     * @deprecated
     * 
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public String getProfileImageUrl() {
        return this.profileImageUrl;
    }
    /**
     * Gets the public_metadata property value. The public_metadata property
     * @return a UserPublicMetadata
     */
    @jakarta.annotation.Nullable
    public UserPublicMetadata getPublicMetadata() {
        return this.publicMetadata;
    }
    /**
     * Gets the saml_accounts property value. The saml_accounts property
     * @return a java.util.List<SAMLAccount>
     */
    @jakarta.annotation.Nullable
    public java.util.List<SAMLAccount> getSamlAccounts() {
        return this.samlAccounts;
    }
    /**
     * Gets the totp_enabled property value. The totp_enabled property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTotpEnabled() {
        return this.totpEnabled;
    }
    /**
     * Gets the two_factor_enabled property value. The two_factor_enabled property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getTwoFactorEnabled() {
        return this.twoFactorEnabled;
    }
    /**
     * Gets the unsafe_metadata property value. The unsafe_metadata property
     * @return a UserUnsafeMetadata
     */
    @jakarta.annotation.Nullable
    public UserUnsafeMetadata getUnsafeMetadata() {
        return this.unsafeMetadata;
    }
    /**
     * Gets the updated_at property value. Unix timestamp of last update.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getUpdatedAt() {
        return this.updatedAt;
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
     * Gets the verification_attempts_remaining property value. The number of verification attempts remaining until the user is locked. Null if account lockout is not enabled. Note: if a user is locked explicitly via the Backend API, they may still have verification attempts remaining.
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getVerificationAttemptsRemaining() {
        return this.verificationAttemptsRemaining;
    }
    /**
     * Gets the web3_wallets property value. The web3_wallets property
     * @return a java.util.List<Web3Wallet>
     */
    @jakarta.annotation.Nullable
    public java.util.List<Web3Wallet> getWeb3Wallets() {
        return this.web3Wallets;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("backup_code_enabled", this.getBackupCodeEnabled());
        writer.writeBooleanValue("banned", this.getBanned());
        writer.writeStringValue("birthday", this.getBirthday());
        writer.writeLongValue("created_at", this.getCreatedAt());
        writer.writeBooleanValue("create_organization_enabled", this.getCreateOrganizationEnabled());
        writer.writeBooleanValue("delete_self_enabled", this.getDeleteSelfEnabled());
        writer.writeCollectionOfObjectValues("email_addresses", this.getEmailAddresses());
        writer.writeCollectionOfObjectValues("external_accounts", this.getExternalAccounts());
        writer.writeStringValue("external_id", this.getExternalId());
        writer.writeStringValue("first_name", this.getFirstName());
        writer.writeStringValue("gender", this.getGender());
        writer.writeBooleanValue("has_image", this.getHasImage());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("image_url", this.getImageUrl());
        writer.writeLongValue("last_active_at", this.getLastActiveAt());
        writer.writeStringValue("last_name", this.getLastName());
        writer.writeLongValue("last_sign_in_at", this.getLastSignInAt());
        writer.writeBooleanValue("locked", this.getLocked());
        writer.writeLongValue("lockout_expires_in_seconds", this.getLockoutExpiresInSeconds());
        writer.writeEnumValue("object", this.getObject());
        writer.writeBooleanValue("password_enabled", this.getPasswordEnabled());
        writer.writeCollectionOfObjectValues("phone_numbers", this.getPhoneNumbers());
        writer.writeStringValue("primary_email_address_id", this.getPrimaryEmailAddressId());
        writer.writeStringValue("primary_phone_number_id", this.getPrimaryPhoneNumberId());
        writer.writeStringValue("primary_web3_wallet_id", this.getPrimaryWeb3WalletId());
        writer.writeObjectValue("private_metadata", this.getPrivateMetadata());
        writer.writeStringValue("profile_image_url", this.getProfileImageUrl());
        writer.writeObjectValue("public_metadata", this.getPublicMetadata());
        writer.writeCollectionOfObjectValues("saml_accounts", this.getSamlAccounts());
        writer.writeBooleanValue("totp_enabled", this.getTotpEnabled());
        writer.writeBooleanValue("two_factor_enabled", this.getTwoFactorEnabled());
        writer.writeObjectValue("unsafe_metadata", this.getUnsafeMetadata());
        writer.writeLongValue("updated_at", this.getUpdatedAt());
        writer.writeStringValue("username", this.getUsername());
        writer.writeLongValue("verification_attempts_remaining", this.getVerificationAttemptsRemaining());
        writer.writeCollectionOfObjectValues("web3_wallets", this.getWeb3Wallets());
    }
    /**
     * Sets the backup_code_enabled property value. The backup_code_enabled property
     * @param value Value to set for the backup_code_enabled property.
     */
    public void setBackupCodeEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backupCodeEnabled = value;
    }
    /**
     * Sets the banned property value. Flag to denote whether user is banned or not.
     * @param value Value to set for the banned property.
     */
    public void setBanned(@jakarta.annotation.Nullable final Boolean value) {
        this.banned = value;
    }
    /**
     * Sets the birthday property value. The birthday property
     * @param value Value to set for the birthday property.
     */
    public void setBirthday(@jakarta.annotation.Nullable final String value) {
        this.birthday = value;
    }
    /**
     * Sets the created_at property value. Unix timestamp of creation.
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final Long value) {
        this.createdAt = value;
    }
    /**
     * Sets the create_organization_enabled property value. If enabled, user can create organizations via FAPI.
     * @param value Value to set for the create_organization_enabled property.
     */
    public void setCreateOrganizationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.createOrganizationEnabled = value;
    }
    /**
     * Sets the delete_self_enabled property value. If enabled, user can delete themselves via FAPI.
     * @param value Value to set for the delete_self_enabled property.
     */
    public void setDeleteSelfEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.deleteSelfEnabled = value;
    }
    /**
     * Sets the email_addresses property value. The email_addresses property
     * @param value Value to set for the email_addresses property.
     */
    public void setEmailAddresses(@jakarta.annotation.Nullable final java.util.List<EmailAddress> value) {
        this.emailAddresses = value;
    }
    /**
     * Sets the external_accounts property value. The external_accounts property
     * @param value Value to set for the external_accounts property.
     */
    public void setExternalAccounts(@jakarta.annotation.Nullable final java.util.List<UserExternalAccounts> value) {
        this.externalAccounts = value;
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
     * Sets the gender property value. The gender property
     * @param value Value to set for the gender property.
     */
    public void setGender(@jakarta.annotation.Nullable final String value) {
        this.gender = value;
    }
    /**
     * Sets the has_image property value. The has_image property
     * @param value Value to set for the has_image property.
     */
    public void setHasImage(@jakarta.annotation.Nullable final Boolean value) {
        this.hasImage = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the image_url property value. The image_url property
     * @param value Value to set for the image_url property.
     */
    public void setImageUrl(@jakarta.annotation.Nullable final String value) {
        this.imageUrl = value;
    }
    /**
     * Sets the last_active_at property value. Unix timestamp of the latest session activity, with day precision.
     * @param value Value to set for the last_active_at property.
     */
    public void setLastActiveAt(@jakarta.annotation.Nullable final Long value) {
        this.lastActiveAt = value;
    }
    /**
     * Sets the last_name property value. The last_name property
     * @param value Value to set for the last_name property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the last_sign_in_at property value. Unix timestamp of last sign-in.
     * @param value Value to set for the last_sign_in_at property.
     */
    public void setLastSignInAt(@jakarta.annotation.Nullable final Long value) {
        this.lastSignInAt = value;
    }
    /**
     * Sets the locked property value. Flag to denote whether user is currently locked, i.e. restricted from signing in or not.
     * @param value Value to set for the locked property.
     */
    public void setLocked(@jakarta.annotation.Nullable final Boolean value) {
        this.locked = value;
    }
    /**
     * Sets the lockout_expires_in_seconds property value. The number of seconds remaining until the lockout period expires for a locked user. A null value for a locked user indicates that lockout never expires.
     * @param value Value to set for the lockout_expires_in_seconds property.
     */
    public void setLockoutExpiresInSeconds(@jakarta.annotation.Nullable final Long value) {
        this.lockoutExpiresInSeconds = value;
    }
    /**
     * Sets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final UserObject value) {
        this.object = value;
    }
    /**
     * Sets the password_enabled property value. The password_enabled property
     * @param value Value to set for the password_enabled property.
     */
    public void setPasswordEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.passwordEnabled = value;
    }
    /**
     * Sets the phone_numbers property value. The phone_numbers property
     * @param value Value to set for the phone_numbers property.
     */
    public void setPhoneNumbers(@jakarta.annotation.Nullable final java.util.List<PhoneNumber> value) {
        this.phoneNumbers = value;
    }
    /**
     * Sets the primary_email_address_id property value. The primary_email_address_id property
     * @param value Value to set for the primary_email_address_id property.
     */
    public void setPrimaryEmailAddressId(@jakarta.annotation.Nullable final String value) {
        this.primaryEmailAddressId = value;
    }
    /**
     * Sets the primary_phone_number_id property value. The primary_phone_number_id property
     * @param value Value to set for the primary_phone_number_id property.
     */
    public void setPrimaryPhoneNumberId(@jakarta.annotation.Nullable final String value) {
        this.primaryPhoneNumberId = value;
    }
    /**
     * Sets the primary_web3_wallet_id property value. The primary_web3_wallet_id property
     * @param value Value to set for the primary_web3_wallet_id property.
     */
    public void setPrimaryWeb3WalletId(@jakarta.annotation.Nullable final String value) {
        this.primaryWeb3WalletId = value;
    }
    /**
     * Sets the private_metadata property value. The private_metadata property
     * @param value Value to set for the private_metadata property.
     */
    public void setPrivateMetadata(@jakarta.annotation.Nullable final UserPrivateMetadata value) {
        this.privateMetadata = value;
    }
    /**
     * Sets the profile_image_url property value. The profile_image_url property
     * @param value Value to set for the profile_image_url property.
     * @deprecated
     * 
     */
    @Deprecated
    public void setProfileImageUrl(@jakarta.annotation.Nullable final String value) {
        this.profileImageUrl = value;
    }
    /**
     * Sets the public_metadata property value. The public_metadata property
     * @param value Value to set for the public_metadata property.
     */
    public void setPublicMetadata(@jakarta.annotation.Nullable final UserPublicMetadata value) {
        this.publicMetadata = value;
    }
    /**
     * Sets the saml_accounts property value. The saml_accounts property
     * @param value Value to set for the saml_accounts property.
     */
    public void setSamlAccounts(@jakarta.annotation.Nullable final java.util.List<SAMLAccount> value) {
        this.samlAccounts = value;
    }
    /**
     * Sets the totp_enabled property value. The totp_enabled property
     * @param value Value to set for the totp_enabled property.
     */
    public void setTotpEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.totpEnabled = value;
    }
    /**
     * Sets the two_factor_enabled property value. The two_factor_enabled property
     * @param value Value to set for the two_factor_enabled property.
     */
    public void setTwoFactorEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.twoFactorEnabled = value;
    }
    /**
     * Sets the unsafe_metadata property value. The unsafe_metadata property
     * @param value Value to set for the unsafe_metadata property.
     */
    public void setUnsafeMetadata(@jakarta.annotation.Nullable final UserUnsafeMetadata value) {
        this.unsafeMetadata = value;
    }
    /**
     * Sets the updated_at property value. Unix timestamp of last update.
     * @param value Value to set for the updated_at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final Long value) {
        this.updatedAt = value;
    }
    /**
     * Sets the username property value. The username property
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
    /**
     * Sets the verification_attempts_remaining property value. The number of verification attempts remaining until the user is locked. Null if account lockout is not enabled. Note: if a user is locked explicitly via the Backend API, they may still have verification attempts remaining.
     * @param value Value to set for the verification_attempts_remaining property.
     */
    public void setVerificationAttemptsRemaining(@jakarta.annotation.Nullable final Long value) {
        this.verificationAttemptsRemaining = value;
    }
    /**
     * Sets the web3_wallets property value. The web3_wallets property
     * @param value Value to set for the web3_wallets property.
     */
    public void setWeb3Wallets(@jakarta.annotation.Nullable final java.util.List<Web3Wallet> value) {
        this.web3Wallets = value;
    }
}
