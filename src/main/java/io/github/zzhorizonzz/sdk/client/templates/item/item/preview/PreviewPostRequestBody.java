package io.github.zzhorizonzz.sdk.client.templates.item.item.preview;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PreviewPostRequestBody implements Parsable {
    /**
     * The template body before variable interpolation
     */
    private String body;
    /**
     * The local part of the From email address that will be used for emails.For example, in the address 'hello@example.com', the local part is 'hello'.Applicable only to email templates.
     */
    private String fromEmailName;
    /**
     * The email subject.Applicable only to email templates.
     */
    private String subject;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PreviewPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static PreviewPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PreviewPostRequestBody();
    }
    /**
     * Gets the body property value. The template body before variable interpolation
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBody() {
        return this.body;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(3);
        deserializerMap.put("body", (n) -> { this.setBody(n.getStringValue()); });
        deserializerMap.put("from_email_name", (n) -> { this.setFromEmailName(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the from_email_name property value. The local part of the From email address that will be used for emails.For example, in the address 'hello@example.com', the local part is 'hello'.Applicable only to email templates.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFromEmailName() {
        return this.fromEmailName;
    }
    /**
     * Gets the subject property value. The email subject.Applicable only to email templates.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSubject() {
        return this.subject;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("body", this.getBody());
        writer.writeStringValue("from_email_name", this.getFromEmailName());
        writer.writeStringValue("subject", this.getSubject());
    }
    /**
     * Sets the body property value. The template body before variable interpolation
     * @param value Value to set for the body property.
     */
    public void setBody(@jakarta.annotation.Nullable final String value) {
        this.body = value;
    }
    /**
     * Sets the from_email_name property value. The local part of the From email address that will be used for emails.For example, in the address 'hello@example.com', the local part is 'hello'.Applicable only to email templates.
     * @param value Value to set for the from_email_name property.
     */
    public void setFromEmailName(@jakarta.annotation.Nullable final String value) {
        this.fromEmailName = value;
    }
    /**
     * Sets the subject property value. The email subject.Applicable only to email templates.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.subject = value;
    }
}
