package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OrganizationWithLogo extends Organization implements Parsable {
    /**
     * The has_image property
     */
    private Boolean hasImage;
    /**
     * The image_url property
     */
    private String imageUrl;
    /**
     * The logo_url property
     * @deprecated
     * 
     */
    @Deprecated
    private String logoUrl;
    /**
     * Instantiates a new OrganizationWithLogo and sets the default values.
     */
    public OrganizationWithLogo() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a OrganizationWithLogo
     */
    @jakarta.annotation.Nonnull
    public static OrganizationWithLogo createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OrganizationWithLogo();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("has_image", (n) -> { this.setHasImage(n.getBooleanValue()); });
        deserializerMap.put("image_url", (n) -> { this.setImageUrl(n.getStringValue()); });
        deserializerMap.put("logo_url", (n) -> { this.setLogoUrl(n.getStringValue()); });
        return deserializerMap;
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
     * Gets the image_url property value. The image_url property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getImageUrl() {
        return this.imageUrl;
    }
    /**
     * Gets the logo_url property value. The logo_url property
     * @return a String
     * @deprecated
     * 
     */
    @jakarta.annotation.Nullable
    @Deprecated
    public String getLogoUrl() {
        return this.logoUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("has_image", this.getHasImage());
        writer.writeStringValue("image_url", this.getImageUrl());
        writer.writeStringValue("logo_url", this.getLogoUrl());
    }
    /**
     * Sets the has_image property value. The has_image property
     * @param value Value to set for the has_image property.
     */
    public void setHasImage(@jakarta.annotation.Nullable final Boolean value) {
        this.hasImage = value;
    }
    /**
     * Sets the image_url property value. The image_url property
     * @param value Value to set for the image_url property.
     */
    public void setImageUrl(@jakarta.annotation.Nullable final String value) {
        this.imageUrl = value;
    }
    /**
     * Sets the logo_url property value. The logo_url property
     * @param value Value to set for the logo_url property.
     * @deprecated
     * 
     */
    @Deprecated
    public void setLogoUrl(@jakarta.annotation.Nullable final String value) {
        this.logoUrl = value;
    }
}
