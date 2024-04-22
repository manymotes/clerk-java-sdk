package io.github.zzhorizonzz.client.clients.verify;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VerifyPostRequestBody implements Parsable {
    /**
     * A JWT Token that represents the active client.
     */
    private String token;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VerifyPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static VerifyPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VerifyPostRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("token", (n) -> { this.setToken(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the token property value. A JWT Token that represents the active client.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getToken() {
        return this.token;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("token", this.getToken());
    }
    /**
     * Sets the token property value. A JWT Token that represents the active client.
     * @param value Value to set for the token property.
     */
    public void setToken(@jakarta.annotation.Nullable final String value) {
        this.token = value;
    }
}
