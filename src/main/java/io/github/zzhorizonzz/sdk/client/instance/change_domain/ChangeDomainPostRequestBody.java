package io.github.zzhorizonzz.sdk.client.instance.change_domain;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ChangeDomainPostRequestBody implements Parsable {
    /**
     * The new home URL of the production instance e.g. https://www.example.com
     */
    private String homeUrl;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ChangeDomainPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static ChangeDomainPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ChangeDomainPostRequestBody();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("home_url", (n) -> { this.setHomeUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the home_url property value. The new home URL of the production instance e.g. https://www.example.com
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getHomeUrl() {
        return this.homeUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("home_url", this.getHomeUrl());
    }
    /**
     * Sets the home_url property value. The new home URL of the production instance e.g. https://www.example.com
     * @param value Value to set for the home_url property.
     */
    public void setHomeUrl(@jakarta.annotation.Nullable final String value) {
        this.homeUrl = value;
    }
}
