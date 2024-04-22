package io.github.zzhorizonzz.client.domains.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.client.models.ClerkErrors;
import io.github.zzhorizonzz.client.models.DeletedObject;
import io.github.zzhorizonzz.client.models.Domain;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /domains/{domain_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithDomainItemRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new WithDomain_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithDomainItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/domains/{domain_id}", pathParameters);
    }
    /**
     * Instantiates a new WithDomain_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithDomainItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/domains/{domain_id}", rawUrl);
    }
    /**
     * Deletes a satellite domain for the instance.It is currently not possible to delete the instance's primary domain.
     * @return a DeletedObject
     */
    @jakarta.annotation.Nullable
    public DeletedObject delete() {
        return delete(null);
    }
    /**
     * Deletes a satellite domain for the instance.It is currently not possible to delete the instance's primary domain.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DeletedObject
     */
    @jakarta.annotation.Nullable
    public DeletedObject delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("403", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeletedObject::createFromDiscriminatorValue);
    }
    /**
     * The `proxy_url` can be updated only for production instances.Update one of the instance's domains. Both primary and satellite domains can be updated.If you choose to use Clerk via proxy, use this endpoint to specify the `proxy_url`.Whenever you decide you'd rather switch to DNS setup for Clerk, simply set `proxy_url`to `null` for the domain. When you update a production instance's primary domain name,you have to make sure that you've completed all the necessary setup steps for DNS andemails to work. Expect downtime otherwise. Updating a primary domain's name will alsoupdate the instance's home origin, affecting the default application paths.
     * @param body The request body
     * @return a Domain
     */
    @jakarta.annotation.Nullable
    public Domain patch(@jakarta.annotation.Nonnull final WithDomainPatchRequestBody body) {
        return patch(body, null);
    }
    /**
     * The `proxy_url` can be updated only for production instances.Update one of the instance's domains. Both primary and satellite domains can be updated.If you choose to use Clerk via proxy, use this endpoint to specify the `proxy_url`.Whenever you decide you'd rather switch to DNS setup for Clerk, simply set `proxy_url`to `null` for the domain. When you update a production instance's primary domain name,you have to make sure that you've completed all the necessary setup steps for DNS andemails to work. Expect downtime otherwise. Updating a primary domain's name will alsoupdate the instance's home origin, affecting the default application paths.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Domain
     */
    @jakarta.annotation.Nullable
    public Domain patch(@jakarta.annotation.Nonnull final WithDomainPatchRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Domain::createFromDiscriminatorValue);
    }
    /**
     * Deletes a satellite domain for the instance.It is currently not possible to delete the instance's primary domain.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Deletes a satellite domain for the instance.It is currently not possible to delete the instance's primary domain.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.DELETE, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, DeleteRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * The `proxy_url` can be updated only for production instances.Update one of the instance's domains. Both primary and satellite domains can be updated.If you choose to use Clerk via proxy, use this endpoint to specify the `proxy_url`.Whenever you decide you'd rather switch to DNS setup for Clerk, simply set `proxy_url`to `null` for the domain. When you update a production instance's primary domain name,you have to make sure that you've completed all the necessary setup steps for DNS andemails to work. Expect downtime otherwise. Updating a primary domain's name will alsoupdate the instance's home origin, affecting the default application paths.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WithDomainPatchRequestBody body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * The `proxy_url` can be updated only for production instances.Update one of the instance's domains. Both primary and satellite domains can be updated.If you choose to use Clerk via proxy, use this endpoint to specify the `proxy_url`.Whenever you decide you'd rather switch to DNS setup for Clerk, simply set `proxy_url`to `null` for the domain. When you update a production instance's primary domain name,you have to make sure that you've completed all the necessary setup steps for DNS andemails to work. Expect downtime otherwise. Updating a primary domain's name will alsoupdate the instance's home origin, affecting the default application paths.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WithDomainPatchRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PATCH, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PatchRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "application/json", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WithDomainItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithDomainItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithDomainItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class DeleteRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
