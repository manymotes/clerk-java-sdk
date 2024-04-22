package io.github.zzhorizonzz.client.sign_ups;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import io.github.zzhorizonzz.client.sign_ups.item.SignUpsItemRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /sign_ups
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SignUpsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the io.github.zzhorizonzz.client.sign_ups.item collection
     * @param id The ID of the sign-up to update
     * @return a SignUpsItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SignUpsItemRequestBuilder byId(@jakarta.annotation.Nonnull final String id) {
        Objects.requireNonNull(id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("id", id);
        return new SignUpsItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new Sign_upsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SignUpsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sign_ups", pathParameters);
    }
    /**
     * Instantiates a new Sign_upsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SignUpsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sign_ups", rawUrl);
    }
}
