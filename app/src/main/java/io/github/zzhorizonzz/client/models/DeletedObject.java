package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeletedObject implements Parsable {
    /**
     * The deleted property
     */
    private Boolean deleted;
    /**
     * The id property
     */
    private String id;
    /**
     * The object property
     */
    private String object;
    /**
     * The slug property
     */
    private String slug;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeletedObject
     */
    @jakarta.annotation.Nonnull
    public static DeletedObject createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeletedObject();
    }
    /**
     * Gets the deleted property value. The deleted property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDeleted() {
        return this.deleted;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("deleted", (n) -> { this.setDeleted(n.getBooleanValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getStringValue()); });
        deserializerMap.put("slug", (n) -> { this.setSlug(n.getStringValue()); });
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
     * Gets the object property value. The object property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getObject() {
        return this.object;
    }
    /**
     * Gets the slug property value. The slug property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSlug() {
        return this.slug;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("deleted", this.getDeleted());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("object", this.getObject());
        writer.writeStringValue("slug", this.getSlug());
    }
    /**
     * Sets the deleted property value. The deleted property
     * @param value Value to set for the deleted property.
     */
    public void setDeleted(@jakarta.annotation.Nullable final Boolean value) {
        this.deleted = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the object property value. The object property
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final String value) {
        this.object = value;
    }
    /**
     * Sets the slug property value. The slug property
     * @param value Value to set for the slug property.
     */
    public void setSlug(@jakarta.annotation.Nullable final String value) {
        this.slug = value;
    }
}
