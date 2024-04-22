package io.github.zzhorizonzz.client.users.item;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithUserPatchRequestBody implements Parsable {
    /**
     * If Backup Codes are configured on the instance, you can provide them to enable it on the specific user without the need to reset them.You must provide the backup codes in plain format or the corresponding bcrypt digest.
     */
    private java.util.List<String> backupCodes;
    /**
     * A custom date/time denoting _when_ the user signed up to the application, specified in RFC3339 format (e.g. `2012-10-20T07:15:20.902Z`).
     */
    private String createdAt;
    /**
     * If true, the user can create organizations with the Frontend API.
     */
    private Boolean createOrganizationEnabled;
    /**
     * If true, the user can delete themselves with the Frontend API.
     */
    private Boolean deleteSelfEnabled;
    /**
     * The ID of the user as used in your external systems or your previous authentication solution.Must be unique across your instance.
     */
    private String externalId;
    /**
     * The first name to assign to the user
     */
    private String firstName;
    /**
     * The last name to assign to the user
     */
    private String lastName;
    /**
     * If set to `true`, the user will be notified that their primary email address has changed.By default, no notification is sent.
     */
    private Boolean notifyPrimaryEmailAddressChanged;
    /**
     * The plaintext password to give the user.Must be at least 8 characters long, and can not be in any list of hacked passwords.
     */
    private String password;
    /**
     * The ID of the email address to set as primary.It must be verified, and present on the current user.
     */
    private String primaryEmailAddressId;
    /**
     * The ID of the phone number to set as primary.It must be verified, and present on the current user.
     */
    private String primaryPhoneNumberId;
    /**
     * The ID of the web3 wallets to set as primary.It must be verified, and present on the current user.
     */
    private String primaryWeb3WalletId;
    /**
     * Metadata saved on the user, that is only visible to your Backend API
     */
    private WithUserPatchRequestBodyPrivateMetadata privateMetadata;
    /**
     * The ID of the image to set as the user's profile image
     */
    private String profileImageId;
    /**
     * Metadata saved on the user, that is visible to both your Frontend and Backend APIs
     */
    private WithUserPatchRequestBodyPublicMetadata publicMetadata;
    /**
     * Set to `true` to sign out the user from all their active sessions once their password is updated. This parameter can only be used when providing a `password`.
     */
    private Boolean signOutOfOtherSessions;
    /**
     * Set it to `true` if you're updating the user's password and want to skip any password policy settings check. This parameter can only be used when providing a `password`.
     */
    private Boolean skipPasswordChecks;
    /**
     * In case TOTP is configured on the instance, you can provide the secret to enable it on the specific user without the need to reset it.Please note that currently the supported options are:* Period: 30 seconds* Code length: 6 digits* Algorithm: SHA1
     */
    private String totpSecret;
    /**
     * Metadata saved on the user, that can be updated from both the Frontend and Backend APIs.Note: Since this data can be modified from the frontend, it is not guaranteed to be safe.
     */
    private WithUserPatchRequestBodyUnsafeMetadata unsafeMetadata;
    /**
     * The username to give to the user.It must be unique across your instance.
     */
    private String username;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WithUserPatchRequestBody
     */
    @jakarta.annotation.Nonnull
    public static WithUserPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WithUserPatchRequestBody();
    }
    /**
     * Gets the backup_codes property value. If Backup Codes are configured on the instance, you can provide them to enable it on the specific user without the need to reset them.You must provide the backup codes in plain format or the corresponding bcrypt digest.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBackupCodes() {
        return this.backupCodes;
    }
    /**
     * Gets the created_at property value. A custom date/time denoting _when_ the user signed up to the application, specified in RFC3339 format (e.g. `2012-10-20T07:15:20.902Z`).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the create_organization_enabled property value. If true, the user can create organizations with the Frontend API.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getCreateOrganizationEnabled() {
        return this.createOrganizationEnabled;
    }
    /**
     * Gets the delete_self_enabled property value. If true, the user can delete themselves with the Frontend API.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeleteSelfEnabled() {
        return this.deleteSelfEnabled;
    }
    /**
     * Gets the external_id property value. The ID of the user as used in your external systems or your previous authentication solution.Must be unique across your instance.
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(20);
        deserializerMap.put("backup_codes", (n) -> { this.setBackupCodes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getStringValue()); });
        deserializerMap.put("create_organization_enabled", (n) -> { this.setCreateOrganizationEnabled(n.getBooleanValue()); });
        deserializerMap.put("delete_self_enabled", (n) -> { this.setDeleteSelfEnabled(n.getBooleanValue()); });
        deserializerMap.put("external_id", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("first_name", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("last_name", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("notify_primary_email_address_changed", (n) -> { this.setNotifyPrimaryEmailAddressChanged(n.getBooleanValue()); });
        deserializerMap.put("password", (n) -> { this.setPassword(n.getStringValue()); });
        deserializerMap.put("primary_email_address_id", (n) -> { this.setPrimaryEmailAddressId(n.getStringValue()); });
        deserializerMap.put("primary_phone_number_id", (n) -> { this.setPrimaryPhoneNumberId(n.getStringValue()); });
        deserializerMap.put("primary_web3_wallet_id", (n) -> { this.setPrimaryWeb3WalletId(n.getStringValue()); });
        deserializerMap.put("private_metadata", (n) -> { this.setPrivateMetadata(n.getObjectValue(WithUserPatchRequestBodyPrivateMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("profile_image_id", (n) -> { this.setProfileImageId(n.getStringValue()); });
        deserializerMap.put("public_metadata", (n) -> { this.setPublicMetadata(n.getObjectValue(WithUserPatchRequestBodyPublicMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("sign_out_of_other_sessions", (n) -> { this.setSignOutOfOtherSessions(n.getBooleanValue()); });
        deserializerMap.put("skip_password_checks", (n) -> { this.setSkipPasswordChecks(n.getBooleanValue()); });
        deserializerMap.put("totp_secret", (n) -> { this.setTotpSecret(n.getStringValue()); });
        deserializerMap.put("unsafe_metadata", (n) -> { this.setUnsafeMetadata(n.getObjectValue(WithUserPatchRequestBodyUnsafeMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the first_name property value. The first name to assign to the user
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Gets the last_name property value. The last name to assign to the user
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Gets the notify_primary_email_address_changed property value. If set to `true`, the user will be notified that their primary email address has changed.By default, no notification is sent.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getNotifyPrimaryEmailAddressChanged() {
        return this.notifyPrimaryEmailAddressChanged;
    }
    /**
     * Gets the password property value. The plaintext password to give the user.Must be at least 8 characters long, and can not be in any list of hacked passwords.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPassword() {
        return this.password;
    }
    /**
     * Gets the primary_email_address_id property value. The ID of the email address to set as primary.It must be verified, and present on the current user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrimaryEmailAddressId() {
        return this.primaryEmailAddressId;
    }
    /**
     * Gets the primary_phone_number_id property value. The ID of the phone number to set as primary.It must be verified, and present on the current user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrimaryPhoneNumberId() {
        return this.primaryPhoneNumberId;
    }
    /**
     * Gets the primary_web3_wallet_id property value. The ID of the web3 wallets to set as primary.It must be verified, and present on the current user.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPrimaryWeb3WalletId() {
        return this.primaryWeb3WalletId;
    }
    /**
     * Gets the private_metadata property value. Metadata saved on the user, that is only visible to your Backend API
     * @return a WithUserPatchRequestBodyPrivateMetadata
     */
    @jakarta.annotation.Nullable
    public WithUserPatchRequestBodyPrivateMetadata getPrivateMetadata() {
        return this.privateMetadata;
    }
    /**
     * Gets the profile_image_id property value. The ID of the image to set as the user's profile image
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getProfileImageId() {
        return this.profileImageId;
    }
    /**
     * Gets the public_metadata property value. Metadata saved on the user, that is visible to both your Frontend and Backend APIs
     * @return a WithUserPatchRequestBodyPublicMetadata
     */
    @jakarta.annotation.Nullable
    public WithUserPatchRequestBodyPublicMetadata getPublicMetadata() {
        return this.publicMetadata;
    }
    /**
     * Gets the sign_out_of_other_sessions property value. Set to `true` to sign out the user from all their active sessions once their password is updated. This parameter can only be used when providing a `password`.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSignOutOfOtherSessions() {
        return this.signOutOfOtherSessions;
    }
    /**
     * Gets the skip_password_checks property value. Set it to `true` if you're updating the user's password and want to skip any password policy settings check. This parameter can only be used when providing a `password`.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSkipPasswordChecks() {
        return this.skipPasswordChecks;
    }
    /**
     * Gets the totp_secret property value. In case TOTP is configured on the instance, you can provide the secret to enable it on the specific user without the need to reset it.Please note that currently the supported options are:* Period: 30 seconds* Code length: 6 digits* Algorithm: SHA1
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTotpSecret() {
        return this.totpSecret;
    }
    /**
     * Gets the unsafe_metadata property value. Metadata saved on the user, that can be updated from both the Frontend and Backend APIs.Note: Since this data can be modified from the frontend, it is not guaranteed to be safe.
     * @return a WithUserPatchRequestBodyUnsafeMetadata
     */
    @jakarta.annotation.Nullable
    public WithUserPatchRequestBodyUnsafeMetadata getUnsafeMetadata() {
        return this.unsafeMetadata;
    }
    /**
     * Gets the username property value. The username to give to the user.It must be unique across your instance.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUsername() {
        return this.username;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("backup_codes", this.getBackupCodes());
        writer.writeStringValue("created_at", this.getCreatedAt());
        writer.writeBooleanValue("create_organization_enabled", this.getCreateOrganizationEnabled());
        writer.writeBooleanValue("delete_self_enabled", this.getDeleteSelfEnabled());
        writer.writeStringValue("external_id", this.getExternalId());
        writer.writeStringValue("first_name", this.getFirstName());
        writer.writeStringValue("last_name", this.getLastName());
        writer.writeBooleanValue("notify_primary_email_address_changed", this.getNotifyPrimaryEmailAddressChanged());
        writer.writeStringValue("password", this.getPassword());
        writer.writeStringValue("primary_email_address_id", this.getPrimaryEmailAddressId());
        writer.writeStringValue("primary_phone_number_id", this.getPrimaryPhoneNumberId());
        writer.writeStringValue("primary_web3_wallet_id", this.getPrimaryWeb3WalletId());
        writer.writeObjectValue("private_metadata", this.getPrivateMetadata());
        writer.writeStringValue("profile_image_id", this.getProfileImageId());
        writer.writeObjectValue("public_metadata", this.getPublicMetadata());
        writer.writeBooleanValue("sign_out_of_other_sessions", this.getSignOutOfOtherSessions());
        writer.writeBooleanValue("skip_password_checks", this.getSkipPasswordChecks());
        writer.writeStringValue("totp_secret", this.getTotpSecret());
        writer.writeObjectValue("unsafe_metadata", this.getUnsafeMetadata());
        writer.writeStringValue("username", this.getUsername());
    }
    /**
     * Sets the backup_codes property value. If Backup Codes are configured on the instance, you can provide them to enable it on the specific user without the need to reset them.You must provide the backup codes in plain format or the corresponding bcrypt digest.
     * @param value Value to set for the backup_codes property.
     */
    public void setBackupCodes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backupCodes = value;
    }
    /**
     * Sets the created_at property value. A custom date/time denoting _when_ the user signed up to the application, specified in RFC3339 format (e.g. `2012-10-20T07:15:20.902Z`).
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final String value) {
        this.createdAt = value;
    }
    /**
     * Sets the create_organization_enabled property value. If true, the user can create organizations with the Frontend API.
     * @param value Value to set for the create_organization_enabled property.
     */
    public void setCreateOrganizationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.createOrganizationEnabled = value;
    }
    /**
     * Sets the delete_self_enabled property value. If true, the user can delete themselves with the Frontend API.
     * @param value Value to set for the delete_self_enabled property.
     */
    public void setDeleteSelfEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.deleteSelfEnabled = value;
    }
    /**
     * Sets the external_id property value. The ID of the user as used in your external systems or your previous authentication solution.Must be unique across your instance.
     * @param value Value to set for the external_id property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the first_name property value. The first name to assign to the user
     * @param value Value to set for the first_name property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the last_name property value. The last name to assign to the user
     * @param value Value to set for the last_name property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the notify_primary_email_address_changed property value. If set to `true`, the user will be notified that their primary email address has changed.By default, no notification is sent.
     * @param value Value to set for the notify_primary_email_address_changed property.
     */
    public void setNotifyPrimaryEmailAddressChanged(@jakarta.annotation.Nullable final Boolean value) {
        this.notifyPrimaryEmailAddressChanged = value;
    }
    /**
     * Sets the password property value. The plaintext password to give the user.Must be at least 8 characters long, and can not be in any list of hacked passwords.
     * @param value Value to set for the password property.
     */
    public void setPassword(@jakarta.annotation.Nullable final String value) {
        this.password = value;
    }
    /**
     * Sets the primary_email_address_id property value. The ID of the email address to set as primary.It must be verified, and present on the current user.
     * @param value Value to set for the primary_email_address_id property.
     */
    public void setPrimaryEmailAddressId(@jakarta.annotation.Nullable final String value) {
        this.primaryEmailAddressId = value;
    }
    /**
     * Sets the primary_phone_number_id property value. The ID of the phone number to set as primary.It must be verified, and present on the current user.
     * @param value Value to set for the primary_phone_number_id property.
     */
    public void setPrimaryPhoneNumberId(@jakarta.annotation.Nullable final String value) {
        this.primaryPhoneNumberId = value;
    }
    /**
     * Sets the primary_web3_wallet_id property value. The ID of the web3 wallets to set as primary.It must be verified, and present on the current user.
     * @param value Value to set for the primary_web3_wallet_id property.
     */
    public void setPrimaryWeb3WalletId(@jakarta.annotation.Nullable final String value) {
        this.primaryWeb3WalletId = value;
    }
    /**
     * Sets the private_metadata property value. Metadata saved on the user, that is only visible to your Backend API
     * @param value Value to set for the private_metadata property.
     */
    public void setPrivateMetadata(@jakarta.annotation.Nullable final WithUserPatchRequestBodyPrivateMetadata value) {
        this.privateMetadata = value;
    }
    /**
     * Sets the profile_image_id property value. The ID of the image to set as the user's profile image
     * @param value Value to set for the profile_image_id property.
     */
    public void setProfileImageId(@jakarta.annotation.Nullable final String value) {
        this.profileImageId = value;
    }
    /**
     * Sets the public_metadata property value. Metadata saved on the user, that is visible to both your Frontend and Backend APIs
     * @param value Value to set for the public_metadata property.
     */
    public void setPublicMetadata(@jakarta.annotation.Nullable final WithUserPatchRequestBodyPublicMetadata value) {
        this.publicMetadata = value;
    }
    /**
     * Sets the sign_out_of_other_sessions property value. Set to `true` to sign out the user from all their active sessions once their password is updated. This parameter can only be used when providing a `password`.
     * @param value Value to set for the sign_out_of_other_sessions property.
     */
    public void setSignOutOfOtherSessions(@jakarta.annotation.Nullable final Boolean value) {
        this.signOutOfOtherSessions = value;
    }
    /**
     * Sets the skip_password_checks property value. Set it to `true` if you're updating the user's password and want to skip any password policy settings check. This parameter can only be used when providing a `password`.
     * @param value Value to set for the skip_password_checks property.
     */
    public void setSkipPasswordChecks(@jakarta.annotation.Nullable final Boolean value) {
        this.skipPasswordChecks = value;
    }
    /**
     * Sets the totp_secret property value. In case TOTP is configured on the instance, you can provide the secret to enable it on the specific user without the need to reset it.Please note that currently the supported options are:* Period: 30 seconds* Code length: 6 digits* Algorithm: SHA1
     * @param value Value to set for the totp_secret property.
     */
    public void setTotpSecret(@jakarta.annotation.Nullable final String value) {
        this.totpSecret = value;
    }
    /**
     * Sets the unsafe_metadata property value. Metadata saved on the user, that can be updated from both the Frontend and Backend APIs.Note: Since this data can be modified from the frontend, it is not guaranteed to be safe.
     * @param value Value to set for the unsafe_metadata property.
     */
    public void setUnsafeMetadata(@jakarta.annotation.Nullable final WithUserPatchRequestBodyUnsafeMetadata value) {
        this.unsafeMetadata = value;
    }
    /**
     * Sets the username property value. The username to give to the user.It must be unique across your instance.
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
}
