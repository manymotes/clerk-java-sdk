package io.github.zzhorizonzz.sdk.client.publicescaped;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import io.github.zzhorizonzz.sdk.client.publicescaped.interstitial.InterstitialRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /public
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PublicRequestBuilder extends BaseRequestBuilder {
    /**
     * The interstitial property
     */
    @jakarta.annotation.Nonnull
    public InterstitialRequestBuilder interstitial() {
        return new InterstitialRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new PublicRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PublicRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/public", pathParameters);
    }
    /**
     * Instantiates a new PublicRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public PublicRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/public", rawUrl);
    }
}
