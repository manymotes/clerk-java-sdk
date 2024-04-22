package io.github.zzhorizonzz.sdk.client.domains;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.sdk.client.domains.item.WithDomainItemRequestBuilder;
import io.github.zzhorizonzz.sdk.client.models.ClerkErrors;
import io.github.zzhorizonzz.sdk.client.models.Domain;
import io.github.zzhorizonzz.sdk.client.models.Domains;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /domains
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DomainsRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the io.github.zzhorizonzz.client.domains.item collection
     * @param domain_id The ID of the domain that will be deleted. Must be a satellite domain.
     * @return a WithDomainItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithDomainItemRequestBuilder byDomain_id(@jakarta.annotation.Nonnull final String domain_id) {
        Objects.requireNonNull(domain_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("domain_id", domain_id);
        return new WithDomainItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new DomainsRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DomainsRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/domains", pathParameters);
    }
    /**
     * Instantiates a new DomainsRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public DomainsRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/domains", rawUrl);
    }
    /**
     * Use this endpoint to get a list of all domains for an instance.The response will contain the primary domain for the instance and any satellite domains. Each domain in the response contains information about the URLs where Clerk operates and the required CNAME targets.
     * @return a Domains
     */
    @jakarta.annotation.Nullable
    public Domains get() {
        return get(null);
    }
    /**
     * Use this endpoint to get a list of all domains for an instance.The response will contain the primary domain for the instance and any satellite domains. Each domain in the response contains information about the URLs where Clerk operates and the required CNAME targets.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Domains
     */
    @jakarta.annotation.Nullable
    public Domains get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        return this.requestAdapter.send(requestInfo, null, Domains::createFromDiscriminatorValue);
    }
    /**
     * Add a new domain for your instance.Useful in the case of multi-domain instances, allows adding satellite domains to an instance.The new domain must have a `name`. The domain name can contain the port for development instances, like `localhost:3000`.At the moment, instances can have only one primary domain, so the `is_satellite` parameter must be set to `true`.If you're planning to configure the new satellite domain to run behind a proxy, pass the `proxy_url` parameter accordingly.
     * @param body The request body
     * @return a Domain
     */
    @jakarta.annotation.Nullable
    public Domain post(@jakarta.annotation.Nonnull final DomainsPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Add a new domain for your instance.Useful in the case of multi-domain instances, allows adding satellite domains to an instance.The new domain must have a `name`. The domain name can contain the port for development instances, like `localhost:3000`.At the moment, instances can have only one primary domain, so the `is_satellite` parameter must be set to `true`.If you're planning to configure the new satellite domain to run behind a proxy, pass the `proxy_url` parameter accordingly.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Domain
     */
    @jakarta.annotation.Nullable
    public Domain post(@jakarta.annotation.Nonnull final DomainsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("402", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Domain::createFromDiscriminatorValue);
    }
    /**
     * Use this endpoint to get a list of all domains for an instance.The response will contain the primary domain for the instance and any satellite domains. Each domain in the response contains information about the URLs where Clerk operates and the required CNAME targets.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Use this endpoint to get a list of all domains for an instance.The response will contain the primary domain for the instance and any satellite domains. Each domain in the response contains information about the URLs where Clerk operates and the required CNAME targets.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.GET, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, GetRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Add a new domain for your instance.Useful in the case of multi-domain instances, allows adding satellite domains to an instance.The new domain must have a `name`. The domain name can contain the port for development instances, like `localhost:3000`.At the moment, instances can have only one primary domain, so the `is_satellite` parameter must be set to `true`.If you're planning to configure the new satellite domain to run behind a proxy, pass the `proxy_url` parameter accordingly.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DomainsPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Add a new domain for your instance.Useful in the case of multi-domain instances, allows adding satellite domains to an instance.The new domain must have a `name`. The domain name can contain the port for development instances, like `localhost:3000`.At the moment, instances can have only one primary domain, so the `is_satellite` parameter must be set to `true`.If you're planning to configure the new satellite domain to run behind a proxy, pass the `proxy_url` parameter accordingly.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final DomainsPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a DomainsRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public DomainsRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new DomainsRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
