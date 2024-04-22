package io.github.zzhorizonzz.client.emails;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmailsPostRequestBody implements Parsable {
    /**
     * The body of the email.
     */
    private String body;
    /**
     * The ID of the email address to send to.
     */
    private String emailAddressId;
    /**
     * The email name portion of the sending email address.<br/>e.g.: `from_email_name=info` will send from info@example.com
     */
    private String fromEmailName;
    /**
     * The subject of the email.
     */
    private String subject;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EmailsPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static EmailsPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmailsPostRequestBody();
    }
    /**
     * Gets the body property value. The body of the email.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBody() {
        return this.body;
    }
    /**
     * Gets the email_address_id property value. The ID of the email address to send to.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getEmailAddressId() {
        return this.emailAddressId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("body", (n) -> { this.setBody(n.getStringValue()); });
        deserializerMap.put("email_address_id", (n) -> { this.setEmailAddressId(n.getStringValue()); });
        deserializerMap.put("from_email_name", (n) -> { this.setFromEmailName(n.getStringValue()); });
        deserializerMap.put("subject", (n) -> { this.setSubject(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the from_email_name property value. The email name portion of the sending email address.<br/>e.g.: `from_email_name=info` will send from info@example.com
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFromEmailName() {
        return this.fromEmailName;
    }
    /**
     * Gets the subject property value. The subject of the email.
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
        writer.writeStringValue("email_address_id", this.getEmailAddressId());
        writer.writeStringValue("from_email_name", this.getFromEmailName());
        writer.writeStringValue("subject", this.getSubject());
    }
    /**
     * Sets the body property value. The body of the email.
     * @param value Value to set for the body property.
     */
    public void setBody(@jakarta.annotation.Nullable final String value) {
        this.body = value;
    }
    /**
     * Sets the email_address_id property value. The ID of the email address to send to.
     * @param value Value to set for the email_address_id property.
     */
    public void setEmailAddressId(@jakarta.annotation.Nullable final String value) {
        this.emailAddressId = value;
    }
    /**
     * Sets the from_email_name property value. The email name portion of the sending email address.<br/>e.g.: `from_email_name=info` will send from info@example.com
     * @param value Value to set for the from_email_name property.
     */
    public void setFromEmailName(@jakarta.annotation.Nullable final String value) {
        this.fromEmailName = value;
    }
    /**
     * Sets the subject property value. The subject of the email.
     * @param value Value to set for the subject property.
     */
    public void setSubject(@jakarta.annotation.Nullable final String value) {
        this.subject = value;
    }
}
