package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

/**
 * String representing the object's type. Objects of the same type share the same value.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public enum Web3WalletObject implements ValuedEnum {
    Web3_wallet("web3_wallet");
    public final String value;
    Web3WalletObject(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static Web3WalletObject forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "web3_wallet": return Web3_wallet;
            default: return null;
        }
    }
}
