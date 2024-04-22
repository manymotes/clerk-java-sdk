package io.github.zzhorizonzz.sdk.client.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Web3SignatureStrategy implements ValuedEnum {
    Web3_metamask_signature("web3_metamask_signature");
    public final String value;
    Web3SignatureStrategy(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Web3SignatureStrategy forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "web3_metamask_signature": return Web3_metamask_signature;
            default: return null;
        }
    }
}
