package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Admin implements Parsable {
    /**
     * The attempts property
     */
    private Integer attempts;
    /**
     * The expire_at property
     */
    private Integer expireAt;
    /**
     * The status property
     */
    private AdminStatus status;
    /**
     * The strategy property
     */
    private AdminStrategy strategy;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Admin
     */
    @jakarta.annotation.Nonnull
    public static Admin createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Admin();
    }
    /**
     * Gets the attempts property value. The attempts property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAttempts() {
        return this.attempts;
    }
    /**
     * Gets the expire_at property value. The expire_at property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getExpireAt() {
        return this.expireAt;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("attempts", (n) -> { this.setAttempts(n.getIntegerValue()); });
        deserializerMap.put("expire_at", (n) -> { this.setExpireAt(n.getIntegerValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(AdminStatus::forValue)); });
        deserializerMap.put("strategy", (n) -> { this.setStrategy(n.getEnumValue(AdminStrategy::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the status property value. The status property
     * @return a AdminStatus
     */
    @jakarta.annotation.Nullable
    public AdminStatus getStatus() {
        return this.status;
    }
    /**
     * Gets the strategy property value. The strategy property
     * @return a AdminStrategy
     */
    @jakarta.annotation.Nullable
    public AdminStrategy getStrategy() {
        return this.strategy;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("attempts", this.getAttempts());
        writer.writeIntegerValue("expire_at", this.getExpireAt());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeEnumValue("strategy", this.getStrategy());
    }
    /**
     * Sets the attempts property value. The attempts property
     * @param value Value to set for the attempts property.
     */
    public void setAttempts(@jakarta.annotation.Nullable final Integer value) {
        this.attempts = value;
    }
    /**
     * Sets the expire_at property value. The expire_at property
     * @param value Value to set for the expire_at property.
     */
    public void setExpireAt(@jakarta.annotation.Nullable final Integer value) {
        this.expireAt = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final AdminStatus value) {
        this.status = value;
    }
    /**
     * Sets the strategy property value. The strategy property
     * @param value Value to set for the strategy property.
     */
    public void setStrategy(@jakarta.annotation.Nullable final AdminStrategy value) {
        this.strategy = value;
    }
}
