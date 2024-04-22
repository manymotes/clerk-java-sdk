package io.github.zzhorizonzz.sdk.client.proxy_checks;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.sdk.client.models.ClerkErrors;
import io.github.zzhorizonzz.sdk.client.models.ProxyCheck;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /proxy_checks
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProxyChecksRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new Proxy_checksRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProxyChecksRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/proxy_checks", pathParameters);
    }
    /**
     * Instantiates a new Proxy_checksRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ProxyChecksRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/proxy_checks", rawUrl);
    }
    /**
     * This endpoint can be used to validate that a proxy-enabled domain is operational.It tries to verify that the proxy URL provided in the parameters maps to a functional proxy that can reach the Clerk Frontend API.You can use this endpoint before you set a proxy URL for a domain. This way you can ensure that switching to proxy-basedconfiguration will not lead to downtime for your instance.The `proxy_url` parameter allows for testing proxy configurations for domains that don't have a proxy URL yet, or operate ona different proxy URL than the one provided. It can also be used to re-validate a domain that is already configured to work with a proxy.
     * @param body The request body
     * @return a ProxyCheck
     */
    @jakarta.annotation.Nullable
    public ProxyCheck post(@jakarta.annotation.Nonnull final ProxyChecksPostRequestBody body) {
        return post(body, null);
    }
    /**
     * This endpoint can be used to validate that a proxy-enabled domain is operational.It tries to verify that the proxy URL provided in the parameters maps to a functional proxy that can reach the Clerk Frontend API.You can use this endpoint before you set a proxy URL for a domain. This way you can ensure that switching to proxy-basedconfiguration will not lead to downtime for your instance.The `proxy_url` parameter allows for testing proxy configurations for domains that don't have a proxy URL yet, or operate ona different proxy URL than the one provided. It can also be used to re-validate a domain that is already configured to work with a proxy.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ProxyCheck
     */
    @jakarta.annotation.Nullable
    public ProxyCheck post(@jakarta.annotation.Nonnull final ProxyChecksPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ProxyCheck::createFromDiscriminatorValue);
    }
    /**
     * This endpoint can be used to validate that a proxy-enabled domain is operational.It tries to verify that the proxy URL provided in the parameters maps to a functional proxy that can reach the Clerk Frontend API.You can use this endpoint before you set a proxy URL for a domain. This way you can ensure that switching to proxy-basedconfiguration will not lead to downtime for your instance.The `proxy_url` parameter allows for testing proxy configurations for domains that don't have a proxy URL yet, or operate ona different proxy URL than the one provided. It can also be used to re-validate a domain that is already configured to work with a proxy.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ProxyChecksPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * This endpoint can be used to validate that a proxy-enabled domain is operational.It tries to verify that the proxy URL provided in the parameters maps to a functional proxy that can reach the Clerk Frontend API.You can use this endpoint before you set a proxy URL for a domain. This way you can ensure that switching to proxy-basedconfiguration will not lead to downtime for your instance.The `proxy_url` parameter allows for testing proxy configurations for domains that don't have a proxy URL yet, or operate ona different proxy URL than the one provided. It can also be used to re-validate a domain that is already configured to work with a proxy.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ProxyChecksPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a ProxyChecksRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ProxyChecksRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ProxyChecksRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
