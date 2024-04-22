package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.serialization.ComposedTypeWrapper;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Web3Wallet implements Parsable {
    /**
     * The id property
     */
    private String id;
    /**
     * String representing the object's type. Objects of the same type share the same value.
     */
    private Web3WalletObject object;
    /**
     * The verification property
     */
    private Web3WalletVerification verification;
    /**
     * The web3_wallet property
     */
    private String web3Wallet;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Web3Wallet
     */
    @jakarta.annotation.Nonnull
    public static Web3Wallet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Web3Wallet();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("id", (n) -> { this.setId(n.getStringValue()); });
        deserializerMap.put("object", (n) -> { this.setObject(n.getEnumValue(Web3WalletObject::forValue)); });
        deserializerMap.put("verification", (n) -> { this.setVerification(n.getObjectValue(Web3WalletVerification::createFromDiscriminatorValue)); });
        deserializerMap.put("web3_wallet", (n) -> { this.setWeb3Wallet(n.getStringValue()); });
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
     * Gets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @return a Web3WalletObject
     */
    @jakarta.annotation.Nullable
    public Web3WalletObject getObject() {
        return this.object;
    }
    /**
     * Gets the verification property value. The verification property
     * @return a Web3WalletVerification
     */
    @jakarta.annotation.Nullable
    public Web3WalletVerification getVerification() {
        return this.verification;
    }
    /**
     * Gets the web3_wallet property value. The web3_wallet property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getWeb3Wallet() {
        return this.web3Wallet;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("id", this.getId());
        writer.writeEnumValue("object", this.getObject());
        writer.writeObjectValue("verification", this.getVerification());
        writer.writeStringValue("web3_wallet", this.getWeb3Wallet());
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     */
    public void setId(@jakarta.annotation.Nullable final String value) {
        this.id = value;
    }
    /**
     * Sets the object property value. String representing the object's type. Objects of the same type share the same value.
     * @param value Value to set for the object property.
     */
    public void setObject(@jakarta.annotation.Nullable final Web3WalletObject value) {
        this.object = value;
    }
    /**
     * Sets the verification property value. The verification property
     * @param value Value to set for the verification property.
     */
    public void setVerification(@jakarta.annotation.Nullable final Web3WalletVerification value) {
        this.verification = value;
    }
    /**
     * Sets the web3_wallet property value. The web3_wallet property
     * @param value Value to set for the web3_wallet property.
     */
    public void setWeb3Wallet(@jakarta.annotation.Nullable final String value) {
        this.web3Wallet = value;
    }
    /**
     * Composed type wrapper for classes Admin, Web3Signature
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public static class Web3WalletVerification implements ComposedTypeWrapper, Parsable {
        /**
         * Composed type representation for type Admin
         */
        private Admin admin;
        /**
         * Composed type representation for type Web3Signature
         */
        private Web3Signature web3Signature;
        /**
         * Creates a new instance of the appropriate class based on discriminator value
         * @param parseNode The parse node to use to read the discriminator value and create the object
         * @return a Web3WalletVerification
         */
        @jakarta.annotation.Nonnull
        public static Web3WalletVerification createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
            Objects.requireNonNull(parseNode);
            final Web3WalletVerification result = new Web3WalletVerification();
            final ParseNode mappingValueNode = parseNode.getChildNode("");
            if (mappingValueNode != null) {
                final String mappingValue = mappingValueNode.getStringValue();
            }
            return result;
        }
        /**
         * Gets the Admin property value. Composed type representation for type Admin
         * @return a Admin
         */
        @jakarta.annotation.Nullable
        public Admin getAdmin() {
            return this.admin;
        }
        /**
         * The deserialization information for the current model
         * @return a Map<String, java.util.function.Consumer<ParseNode>>
         */
        @jakarta.annotation.Nonnull
        public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
            if (this.getAdmin() != null) {
                return this.getAdmin().getFieldDeserializers();
            } else if (this.getWeb3Signature() != null) {
                return this.getWeb3Signature().getFieldDeserializers();
            }
            return new HashMap<String, java.util.function.Consumer<ParseNode>>();
        }
        /**
         * Gets the Web3Signature property value. Composed type representation for type Web3Signature
         * @return a Web3Signature
         */
        @jakarta.annotation.Nullable
        public Web3Signature getWeb3Signature() {
            return this.web3Signature;
        }
        /**
         * Serializes information the current object
         * @param writer Serialization writer to use to serialize this model
         */
        public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
            Objects.requireNonNull(writer);
            if (this.getAdmin() != null) {
                writer.writeObjectValue(null, this.getAdmin());
            } else if (this.getWeb3Signature() != null) {
                writer.writeObjectValue(null, this.getWeb3Signature());
            }
        }
        /**
         * Sets the Admin property value. Composed type representation for type Admin
         * @param value Value to set for the Admin property.
         */
        public void setAdmin(@jakarta.annotation.Nullable final Admin value) {
            this.admin = value;
        }
        /**
         * Sets the Web3Signature property value. Composed type representation for type Web3Signature
         * @param value Value to set for the Web3Signature property.
         */
        public void setWeb3Signature(@jakarta.annotation.Nullable final Web3Signature value) {
            this.web3Signature = value;
        }
    }
}
