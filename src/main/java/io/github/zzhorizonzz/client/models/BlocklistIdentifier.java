package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BlocklistIdentifier implements Parsable {
    /**
     * Unix timestamp of creation
     */
    private Long createdAt;
    /**
     * The id property
     */
    private String id;
    /**
     * An email address, email domain, phone number or web3 wallet.
     */
    private String identifier;
    /**
     * The identifier_type property
     */
    private BlocklistIdentifierIdentifierType identifierType;
    /**
     * The instance_id property
     */
    private String instanceId;
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    private BlocklistIdentifierObject object;
    /**
     * Unix timestamp of last update.
     */
    private Long updatedAt;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a BlocklistIdentifier
     */
    @jakarta.annotation.Nonnull
    public static BlocklistIdentifier createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BlocklistIdentifier();
    }
    /**
     * Gets the created_at property value. Unix timestamp of creation
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getCreatedAt() {
        return this.createdAt;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getLongValue()); });
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("identifier", (n) -> { this.setIdentifier(n.getStringValue()); });
        deserializerMap.put("identifier_type", (n) -> { this.setIdentifierType(n.getEnumValue(BlocklistIdentifierIdentifierType::forValue)); });
        deserializerMap.put("instance_id", (n) -> { this.setInstanceId(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(BlocklistIdentifierObject::forValue)); });
        deserializerMap.put("updated_at", (n) -> { this.setUpdatedAt(n.getLongValue()); });
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
     * Gets the identifier property value. An email address, email domain, phone number or web3 wallet.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getIdentifier() {
        return this.identifier;
    }
    /**
     * Gets the identifier_type property value. The identifier_type property
     * @return a BlocklistIdentifierIdentifierType
     */
    @jakarta.annotation.Nullable
    public BlocklistIdentifierIdentifierType getIdentifierType() {
        return this.identifierType;
    }
    /**
     * Gets the instance_id property value. The instance_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getInstanceId() {
        return this.instanceId;
    }
    /**
     * Gets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @return a BlocklistIdentifierObject
     */
    @jakarta.annotation.Nullable
    public BlocklistIdentifierObject getObject() {
        return this.object;
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
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("created_at", this.getCreatedAt());
        writer.writeStringValue("id", this.getId());
        writer.writeStringValue("identifier", this.getIdentifier());
        writer.writeEnumValue("identifier_type", this.getIdentifierType());
        writer.writeStringValue("instance_id", this.getInstanceId());
        writer.writeEnumValue("object", this.getObject());
        writer.writeLongValue("updated_at", this.getUpdatedAt());
    }
    /**
     * Sets the created_at property value. Unix timestamp of creation
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final Long value) {
        this.createdAt = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the identifier property value. An email address, email domain, phone number or web3 wallet.
     * @param value Value to set for the identifier property.
     */
    public void setIdentifier(@jakarta.annotation.Nullable final String value) {
        this.identifier = value;
    }
    /**
     * Sets the identifier_type property value. The identifier_type property
     * @param value Value to set for the identifier_type property.
     */
    public void setIdentifierType(@jakarta.annotation.Nullable final BlocklistIdentifierIdentifierType value) {
        this.identifierType = value;
    }
    /**
     * Sets the instance_id property value. The instance_id property
     * @param value Value to set for the instance_id property.
     */
    public void setInstanceId(@jakarta.annotation.Nullable final String value) {
        this.instanceId = value;
    }
    /**
     * Sets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final BlocklistIdentifierObject value) {
        this.object = value;
    }
    /**
     * Sets the updated_at property value. Unix timestamp of last update.
     * @param value Value to set for the updated_at property.
     */
    public void setUpdatedAt(@jakarta.annotation.Nullable final Long value) {
        this.updatedAt = value;
    }
}
