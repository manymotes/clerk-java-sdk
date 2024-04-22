package io.github.zzhorizonzz.client.invitations;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InvitationsPostRequestBody implements Parsable {
    /**
     * The email address the invitation will be sent to
     */
    private String emailAddress;
    /**
     * Whether an invitation should be created if there is already an existing invitation for this email address, or it's claimed by another user.
     */
    private Boolean ignoreExisting;
    /**
     * Optional flag which denotes whether an email invitation should be sent to the given email address.Defaults to true.
     */
    private Boolean notifyEscaped;
    /**
     * Metadata that will be attached to the newly created invitation.The value of this property should be a well-formed JSON object.Once the user accepts the invitation and signs up, these metadata will end up in the user's public metadata.
     */
    private InvitationsPostRequestBodyPublicMetadata publicMetadata;
    /**
     * Optional URL which specifies where to redirect the user once they click the invitation link.This is only required if you have implemented a [custom flow](https://clerk.com/docs/authentication/invitations#custom-flow) and you're not using Clerk Hosted Pages or Clerk Components.
     */
    private String redirectUrl;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InvitationsPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static InvitationsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InvitationsPostRequestBody();
    }
    /**
     * Gets the email_address property value. The email address the invitation will be sent to
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("email_address", (n) -> { this.setEmailAddress(n.getStringValue()); });
        deserializerMap.put("ignore_existing", (n) -> { this.setIgnoreExisting(n.getBooleanValue()); });
        deserializerMap.put("notify", (n) -> { this.setNotify(n.getBooleanValue()); });
        deserializerMap.put("public_metadata", (n) -> { this.setPublicMetadata(n.getObjectValue(InvitationsPostRequestBodyPublicMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("redirect_url", (n) -> { this.setRedirectUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ignore_existing property value. Whether an invitation should be created if there is already an existing invitation for this email address, or it's claimed by another user.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIgnoreExisting() {
        return this.ignoreExisting;
    }
    /**
     * Gets the notify property value. Optional flag which denotes whether an email invitation should be sent to the given email address.Defaults to true.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getNotify() {
        return this.notifyEscaped;
    }
    /**
     * Gets the public_metadata property value. Metadata that will be attached to the newly created invitation.The value of this property should be a well-formed JSON object.Once the user accepts the invitation and signs up, these metadata will end up in the user's public metadata.
     * @return a InvitationsPostRequestBodyPublicMetadata
     */
    @jakarta.annotation.Nullable
    public InvitationsPostRequestBodyPublicMetadata getPublicMetadata() {
        return this.publicMetadata;
    }
    /**
     * Gets the redirect_url property value. Optional URL which specifies where to redirect the user once they click the invitation link.This is only required if you have implemented a [custom flow](https://clerk.com/docs/authentication/invitations#custom-flow) and you're not using Clerk Hosted Pages or Clerk Components.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRedirectUrl() {
        return this.redirectUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("email_address", this.getEmailAddress());
        writer.writeBooleanValue("ignore_existing", this.getIgnoreExisting());
        writer.writeBooleanValue("notify", this.getNotify());
        writer.writeObjectValue("public_metadata", this.getPublicMetadata());
        writer.writeStringValue("redirect_url", this.getRedirectUrl());
    }
    /**
     * Sets the email_address property value. The email address the invitation will be sent to
     * @param value Value to set for the email_address property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final String value) {
        this.emailAddress = value;
    }
    /**
     * Sets the ignore_existing property value. Whether an invitation should be created if there is already an existing invitation for this email address, or it's claimed by another user.
     * @param value Value to set for the ignore_existing property.
     */
    public void setIgnoreExisting(@jakarta.annotation.Nullable final Boolean value) {
        this.ignoreExisting = value;
    }
    /**
     * Sets the notify property value. Optional flag which denotes whether an email invitation should be sent to the given email address.Defaults to true.
     * @param value Value to set for the notify property.
     */
    public void setNotify(@jakarta.annotation.Nullable final Boolean value) {
        this.notifyEscaped = value;
    }
    /**
     * Sets the public_metadata property value. Metadata that will be attached to the newly created invitation.The value of this property should be a well-formed JSON object.Once the user accepts the invitation and signs up, these metadata will end up in the user's public metadata.
     * @param value Value to set for the public_metadata property.
     */
    public void setPublicMetadata(@jakarta.annotation.Nullable final InvitationsPostRequestBodyPublicMetadata value) {
        this.publicMetadata = value;
    }
    /**
     * Sets the redirect_url property value. Optional URL which specifies where to redirect the user once they click the invitation link.This is only required if you have implemented a [custom flow](https://clerk.com/docs/authentication/invitations#custom-flow) and you're not using Clerk Hosted Pages or Clerk Components.
     * @param value Value to set for the redirect_url property.
     */
    public void setRedirectUrl(@jakarta.annotation.Nullable final String value) {
        this.redirectUrl = value;
    }
}
