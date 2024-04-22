package io.github.zzhorizonzz.client.organizations.item.invitations.bulk;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Bulk implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The email address of the new member that is going to be invited to the organization
     */
    private String emailAddress;
    /**
     * The ID of the user that invites the new member to the organization.Must be an administrator in the organization.
     */
    private String inviterUserId;
    /**
     * Metadata saved on the organization invitation, fully accessible (read/write) from the Backend API but not visible from the Frontend API.
     */
    private BulkPrivateMetadata privateMetadata;
    /**
     * Metadata saved on the organization invitation, read-only from the Frontend API and fully accessible (read/write) from the Backend API.
     */
    private BulkPublicMetadata publicMetadata;
    /**
     * Optional URL that the invitee will be redirected to once they accept the invitation by clicking the join link in the invitation email.
     */
    private String redirectUrl;
    /**
     * The role of the new member in the organization.
     */
    private String role;
    /**
     * Instantiates a new Bulk and sets the default values.
     */
    public Bulk() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Bulk
     */
    @jakarta.annotation.Nonnull
    public static Bulk createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Bulk();
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
     * Gets the email_address property value. The email address of the new member that is going to be invited to the organization
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
        deserializerMap.put("inviter_user_id", (n) -> { this.setInviterUserId(n.getStringValue()); });
        deserializerMap.put("private_metadata", (n) -> { this.setPrivateMetadata(n.getObjectValue(BulkPrivateMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("public_metadata", (n) -> { this.setPublicMetadata(n.getObjectValue(BulkPublicMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("redirect_url", (n) -> { this.setRedirectUrl(n.getStringValue()); });
        deserializerMap.put("role", (n) -> { this.setRole(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inviter_user_id property value. The ID of the user that invites the new member to the organization.Must be an administrator in the organization.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInviterUserId() {
        return this.inviterUserId;
    }
    /**
     * Gets the private_metadata property value. Metadata saved on the organization invitation, fully accessible (read/write) from the Backend API but not visible from the Frontend API.
     * @return a BulkPrivateMetadata
     */
    @jakarta.annotation.Nullable
    public BulkPrivateMetadata getPrivateMetadata() {
        return this.privateMetadata;
    }
    /**
     * Gets the public_metadata property value. Metadata saved on the organization invitation, read-only from the Frontend API and fully accessible (read/write) from the Backend API.
     * @return a BulkPublicMetadata
     */
    @jakarta.annotation.Nullable
    public BulkPublicMetadata getPublicMetadata() {
        return this.publicMetadata;
    }
    /**
     * Gets the redirect_url property value. Optional URL that the invitee will be redirected to once they accept the invitation by clicking the join link in the invitation email.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRedirectUrl() {
        return this.redirectUrl;
    }
    /**
     * Gets the role property value. The role of the new member in the organization.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRole() {
        return this.role;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("email_address", this.getEmailAddress());
        writer.writeStringValue("inviter_user_id", this.getInviterUserId());
        writer.writeObjectValue("private_metadata", this.getPrivateMetadata());
        writer.writeObjectValue("public_metadata", this.getPublicMetadata());
        writer.writeStringValue("redirect_url", this.getRedirectUrl());
        writer.writeStringValue("role", this.getRole());
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
     * Sets the email_address property value. The email address of the new member that is going to be invited to the organization
     * @param value Value to set for the email_address property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.emailAddress = value;
    }
    /**
     * Sets the inviter_user_id property value. The ID of the user that invites the new member to the organization.Must be an administrator in the organization.
     * @param value Value to set for the inviter_user_id property.
     */
    public void setInviterUserId(@jakarta.annotation.Nullable final String value) {
        this.inviterUserId = value;
    }
    /**
     * Sets the private_metadata property value. Metadata saved on the organization invitation, fully accessible (read/write) from the Backend API but not visible from the Frontend API.
     * @param value Value to set for the private_metadata property.
     */
    public void setPrivateMetadata(@jakarta.annotation.Nullable final BulkPrivateMetadata value) {
        this.privateMetadata = value;
    }
    /**
     * Sets the public_metadata property value. Metadata saved on the organization invitation, read-only from the Frontend API and fully accessible (read/write) from the Backend API.
     * @param value Value to set for the public_metadata property.
     */
    public void setPublicMetadata(@jakarta.annotation.Nullable final BulkPublicMetadata value) {
        this.publicMetadata = value;
    }
    /**
     * Sets the redirect_url property value. Optional URL that the invitee will be redirected to once they accept the invitation by clicking the join link in the invitation email.
     * @param value Value to set for the redirect_url property.
     */
    public void setRedirectUrl(@jakarta.annotation.Nullable final String value) {
        this.redirectUrl = value;
    }
    /**
     * Sets the role property value. The role of the new member in the organization.
     * @param value Value to set for the role property.
     */
    public void setRole(@jakarta.annotation.Nullable final String value) {
        this.role = value;
    }
}
