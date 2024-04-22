package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InstanceRestrictions implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The allowlist property
     */
    private Boolean allowlist;
    /**
     * The block_email_subaddresses property
     */
    private Boolean blockEmailSubaddresses;
    /**
     * The blocklist property
     */
    private Boolean blocklist;
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    private InstanceRestrictionsObject object;
    /**
     * Instantiates a new InstanceRestrictions and sets the default values.
     */
    public InstanceRestrictions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InstanceRestrictions
     */
    @jakarta.annotation.Nonnull
    public static InstanceRestrictions createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InstanceRestrictions();
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
     * Gets the allowlist property value. The allowlist property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowlist() {
        return this.allowlist;
    }
    /**
     * Gets the block_email_subaddresses property value. The block_email_subaddresses property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlockEmailSubaddresses() {
        return this.blockEmailSubaddresses;
    }
    /**
     * Gets the blocklist property value. The blocklist property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getBlocklist() {
        return this.blocklist;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("allowlist", (n) -> { this.setAllowlist(n.getBooleanValue()); });
        deserializerMap.put("block_email_subaddresses", (n) -> { this.setBlockEmailSubaddresses(n.getBooleanValue()); });
        deserializerMap.put("blocklist", (n) -> { this.setBlocklist(n.getBooleanValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(InstanceRestrictionsObject::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @return a InstanceRestrictionsObject
     */
    @jakarta.annotation.Nullable
    public InstanceRestrictionsObject getObject() {
        return this.object;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("allowlist", this.getAllowlist());
        writer.writeBooleanValue("block_email_subaddresses", this.getBlockEmailSubaddresses());
        writer.writeBooleanValue("blocklist", this.getBlocklist());
        writer.writeEnumValue("object", this.getObject());
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
     * Sets the allowlist property value. The allowlist property
     * @param value Value to set for the allowlist property.
     */
    public void setAllowlist(@jakarta.annotation.Nullable final Boolean value) {
        this.allowlist = value;
    }
    /**
     * Sets the block_email_subaddresses property value. The block_email_subaddresses property
     * @param value Value to set for the block_email_subaddresses property.
     */
    public void setBlockEmailSubaddresses(@jakarta.annotation.Nullable final Boolean value) {
        this.blockEmailSubaddresses = value;
    }
    /**
     * Sets the blocklist property value. The blocklist property
     * @param value Value to set for the blocklist property.
     */
    public void setBlocklist(@jakarta.annotation.Nullable final Boolean value) {
        this.blocklist = value;
    }
    /**
     * Sets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final InstanceRestrictionsObject value) {
        this.object = value;
    }
}
