package io.github.zzhorizonzz.client.models;

import com.microsoft.kiota.serialization.ValuedEnum;
import java.util.Objects;

@jakarta.annotation.Generated("com.microsoft.kiota")
public enum BlocklistIdentifierIdentifierType implements ValuedEnum {
    Email_address("email_address"),
    Phone_number("phone_number"),
    Web3_wallet("web3_wallet");
    public final String value;
    BlocklistIdentifierIdentifierType(final String value) {
        this.value = value;
    }
    @jakarta.annotation.Nonnull
    public String getValue() { return this.value; }
    @jakarta.annotation.Nullable
    public static BlocklistIdentifierIdentifierType forValue(@jakarta.annotation.Nonnull final String searchValue) {
        Objects.requireNonNull(searchValue);
        switch(searchValue) {
            case "email_address": return Email_address;
            case "phone_number": return Phone_number;
            case "web3_wallet": return Web3_wallet;
            default: return null;
        }
    }
}
