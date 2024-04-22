package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationMembershipPublicUserData implements Parsable {
    /**
     * The first_name property
     */
    private String firstName;
    /**
     * The has_image property
     */
    private Boolean hasImage;
    /**
     * The identifier property
     */
    private String identifier;
    /**
     * The image_url property
     */
    private String imageUrl;
    /**
     * The last_name property
     */
    private String lastName;
    /**
     * The profile_image_url property
     * @deprecated
     * 
     */
    @Deprecated
    private String profileImageUrl;
    /**
     * The user_id property
     */
    private String userId;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationMembershipPublicUserData
     */
    @jakarta.annotation.Nonnull
    public static OrganizationMembershipPublicUserData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationMembershipPublicUserData();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("first_name", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("has_image", (n) -> { this.setHasImage(n.getBooleanValue()); });
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getStringValue()); });
        deserializerMap.put("image_url", (n) -> { this.setImageUrl(n.getStringValue()); });
        deserializerMap.put("last_name", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("profile_image_url", (n) -> { this.setProfileImageUrl(n.getStringValue()); });
        deserializerMap.put("user_id", (n) -> { this.setUserId(n.getStringValue()); });
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
     * Gets the has_image property value. The has_image property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getHasImage() {
        return this.hasImage;
    }
    /**
     * Gets the identifier property value. The identifier property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdentifier() {
        return this.identifier;
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
     * Gets the last_name property value. The last_name property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.lastName;
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
     * Gets the user_id property value. The user_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.userId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("first_name", this.getFirstName());
        writer.writeBooleanValue("has_image", this.getHasImage());
        writer.writeStringValue("identifier", this.getIdentifier());
        writer.writeStringValue("image_url", this.getImageUrl());
        writer.writeStringValue("last_name", this.getLastName());
        writer.writeStringValue("profile_image_url", this.getProfileImageUrl());
        writer.writeStringValue("user_id", this.getUserId());
    }
    /**
     * Sets the first_name property value. The first_name property
     * @param value Value to set for the first_name property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the has_image property value. The has_image property
     * @param value Value to set for the has_image property.
     */
    public void setHasImage(@jakarta.annotation.Nullable final Boolean value) {
        this.hasImage = value;
    }
    /**
     * Sets the identifier property value. The identifier property
     * @param value Value to set for the identifier property.
     */
    public void setIdentifier(@jakarta.annotation.Nullable final String value) {
        this.identifier = value;
    }
    /**
     * Sets the image_url property value. The image_url property
     * @param value Value to set for the image_url property.
     */
    public void setImageUrl(@jakarta.annotation.Nullable final String value) {
        this.imageUrl = value;
    }
    /**
     * Sets the last_name property value. The last_name property
     * @param value Value to set for the last_name property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
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
     * Sets the user_id property value. The user_id property
     * @param value Value to set for the user_id property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.userId = value;
    }
}
