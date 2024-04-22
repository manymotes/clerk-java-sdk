package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClerkError implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The clerk_trace_id property
     */
    private String clerkTraceId;
    /**
     * The code property
     */
    private String code;
    /**
     * The long_message property
     */
    private String longMessage;
    /**
     * The message property
     */
    private String message;
    /**
     * The meta property
     */
    private ClerkErrorMeta meta;
    /**
     * Instantiates a new ClerkError and sets the default values.
     */
    public ClerkError() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ClerkError
     */
    @jakarta.annotation.Nonnull
    public static ClerkError createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ClerkError();
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
     * Gets the clerk_trace_id property value. The clerk_trace_id property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getClerkTraceId() {
        return this.clerkTraceId;
    }
    /**
     * Gets the code property value. The code property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCode() {
        return this.code;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("clerk_trace_id", (n) -> { this.setClerkTraceId(n.getStringValue()); });
        deserializerMap.put("code", (n) -> { this.setCode(n.getStringValue()); });
        deserializerMap.put("long_message", (n) -> { this.setLongMessage(n.getStringValue()); });
        deserializerMap.put("message", (n) -> { this.setMessage(n.getStringValue()); });
        deserializerMap.put("meta", (n) -> { this.setMeta(n.getObjectValue(ClerkErrorMeta::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the long_message property value. The long_message property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLongMessage() {
        return this.longMessage;
    }
    /**
     * Gets the message property value. The message property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMessage() {
        return this.message;
    }
    /**
     * Gets the meta property value. The meta property
     * @return a ClerkErrorMeta
     */
    @jakarta.annotation.Nullable
    public ClerkErrorMeta getMeta() {
        return this.meta;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("clerk_trace_id", this.getClerkTraceId());
        writer.writeStringValue("code", this.getCode());
        writer.writeStringValue("long_message", this.getLongMessage());
        writer.writeStringValue("message", this.getMessage());
        writer.writeObjectValue("meta", this.getMeta());
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
     * Sets the clerk_trace_id property value. The clerk_trace_id property
     * @param value Value to set for the clerk_trace_id property.
     */
    public void setClerkTraceId(@jakarta.annotation.Nullable final String value) {
        this.clerkTraceId = value;
    }
    /**
     * Sets the code property value. The code property
     * @param value Value to set for the code property.
     */
    public void setCode(@jakarta.annotation.Nullable final String value) {
        this.code = value;
    }
    /**
     * Sets the long_message property value. The long_message property
     * @param value Value to set for the long_message property.
     */
    public void setLongMessage(@jakarta.annotation.Nullable final String value) {
        this.longMessage = value;
    }
    /**
     * Sets the message property value. The message property
     * @param value Value to set for the message property.
     */
    public void setMessage(@jakarta.annotation.Nullable final String value) {
        this.message = value;
    }
    /**
     * Sets the meta property value. The meta property
     * @param value Value to set for the meta property.
     */
    public void setMeta(@jakarta.annotation.Nullable final ClerkErrorMeta value) {
        this.meta = value;
    }
}
