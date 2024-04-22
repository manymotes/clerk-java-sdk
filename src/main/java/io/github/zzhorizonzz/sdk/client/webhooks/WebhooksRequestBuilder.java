package io.github.zzhorizonzz.sdk.client.webhooks;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.RequestAdapter;
import io.github.zzhorizonzz.sdk.client.webhooks.svix_url.SvixUrlRequestBuilder;
import io.github.zzhorizonzz.sdk.client.webhooks.svix.SvixRequestBuilder;
import java.util.HashMap;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /webhooks
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WebhooksRequestBuilder extends BaseRequestBuilder {
    /**
     * The svix property
     */
    @jakarta.annotation.Nonnull
    public SvixRequestBuilder svix() {
        return new SvixRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The svix_url property
     */
    @jakarta.annotation.Nonnull
    public SvixUrlRequestBuilder svixUrl() {
        return new SvixUrlRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WebhooksRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WebhooksRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/webhooks", pathParameters);
    }
    /**
     * Instantiates a new WebhooksRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WebhooksRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/webhooks", rawUrl);
    }
}
