package io.github.zzhorizonzz.client.users.item.metadata;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MetadataPatchRequestBody implements Parsable {
    /**
     * Metadata saved on the user that is only visible to your backend.The new object will be merged with the existing value.
     */
    private MetadataPatchRequestBodyPrivateMetadata privateMetadata;
    /**
     * Metadata saved on the user, that is visible to both your frontend and backend.The new object will be merged with the existing value.
     */
    private MetadataPatchRequestBodyPublicMetadata publicMetadata;
    /**
     * Metadata saved on the user, that can be updated from both the Frontend and Backend APIs.The new object will be merged with the existing value.Note: Since this data can be modified from the frontend, it is not guaranteed to be safe.
     */
    private MetadataPatchRequestBodyUnsafeMetadata unsafeMetadata;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MetadataPatchRequestBody
     */
    @jakarta.annotation.Nonnull
    public static MetadataPatchRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MetadataPatchRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("private_metadata", (n) -> { this.setPrivateMetadata(n.getObjectValue(MetadataPatchRequestBodyPrivateMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("public_metadata", (n) -> { this.setPublicMetadata(n.getObjectValue(MetadataPatchRequestBodyPublicMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("unsafe_metadata", (n) -> { this.setUnsafeMetadata(n.getObjectValue(MetadataPatchRequestBodyUnsafeMetadata::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the private_metadata property value. Metadata saved on the user that is only visible to your backend.The new object will be merged with the existing value.
     * @return a MetadataPatchRequestBodyPrivateMetadata
     */
    @jakarta.annotation.Nullable
    public MetadataPatchRequestBodyPrivateMetadata getPrivateMetadata() {
        return this.privateMetadata;
    }
    /**
     * Gets the public_metadata property value. Metadata saved on the user, that is visible to both your frontend and backend.The new object will be merged with the existing value.
     * @return a MetadataPatchRequestBodyPublicMetadata
     */
    @jakarta.annotation.Nullable
    public MetadataPatchRequestBodyPublicMetadata getPublicMetadata() {
        return this.publicMetadata;
    }
    /**
     * Gets the unsafe_metadata property value. Metadata saved on the user, that can be updated from both the Frontend and Backend APIs.The new object will be merged with the existing value.Note: Since this data can be modified from the frontend, it is not guaranteed to be safe.
     * @return a MetadataPatchRequestBodyUnsafeMetadata
     */
    @jakarta.annotation.Nullable
    public MetadataPatchRequestBodyUnsafeMetadata getUnsafeMetadata() {
        return this.unsafeMetadata;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("private_metadata", this.getPrivateMetadata());
        writer.writeObjectValue("public_metadata", this.getPublicMetadata());
        writer.writeObjectValue("unsafe_metadata", this.getUnsafeMetadata());
    }
    /**
     * Sets the private_metadata property value. Metadata saved on the user that is only visible to your backend.The new object will be merged with the existing value.
     * @param value Value to set for the private_metadata property.
     */
    public void setPrivateMetadata(@jakarta.annotation.Nullable final MetadataPatchRequestBodyPrivateMetadata value) {
        this.privateMetadata = value;
    }
    /**
     * Sets the public_metadata property value. Metadata saved on the user, that is visible to both your frontend and backend.The new object will be merged with the existing value.
     * @param value Value to set for the public_metadata property.
     */
    public void setPublicMetadata(@jakarta.annotation.Nullable final MetadataPatchRequestBodyPublicMetadata value) {
        this.publicMetadata = value;
    }
    /**
     * Sets the unsafe_metadata property value. Metadata saved on the user, that can be updated from both the Frontend and Backend APIs.The new object will be merged with the existing value.Note: Since this data can be modified from the frontend, it is not guaranteed to be safe.
     * @param value Value to set for the unsafe_metadata property.
     */
    public void setUnsafeMetadata(@jakarta.annotation.Nullable final MetadataPatchRequestBodyUnsafeMetadata value) {
        this.unsafeMetadata = value;
    }
}
