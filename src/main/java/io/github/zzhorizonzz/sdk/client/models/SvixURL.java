package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SvixURL implements Parsable {
    /**
     * The svix_url property
     */
    private String svixUrl;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a SvixURL
     */
    @jakarta.annotation.Nonnull
    public static SvixURL createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SvixURL();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("svix_url", (n) -> { this.setSvixUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the svix_url property value. The svix_url property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSvixUrl() {
        return this.svixUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("svix_url", this.getSvixUrl());
    }
    /**
     * Sets the svix_url property value. The svix_url property
     * @param value Value to set for the svix_url property.
     */
    public void setSvixUrl(@jakarta.annotation.Nullable final String value) {
        this.svixUrl = value;
    }
}
