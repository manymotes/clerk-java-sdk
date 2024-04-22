package io.github.zzhorizonzz.client.blocklist_identifiers;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.client.blocklist_identifiers.item.WithIdentifierItemRequestBuilder;
import io.github.zzhorizonzz.client.models.BlocklistIdentifier;
import io.github.zzhorizonzz.client.models.BlocklistIdentifiers;
import io.github.zzhorizonzz.client.models.ClerkErrors;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /blocklist_identifiers
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class BlocklistIdentifiersRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the io.github.zzhorizonzz.client.blocklist_identifiers.item collection
     * @param identifier_id The ID of the identifier to delete from the block-list
     * @return a WithIdentifierItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithIdentifierItemRequestBuilder byIdentifier_id(@jakarta.annotation.Nonnull final String identifier_id) {
        Objects.requireNonNull(identifier_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("identifier_id", identifier_id);
        return new WithIdentifierItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new Blocklist_identifiersRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BlocklistIdentifiersRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/blocklist_identifiers", pathParameters);
    }
    /**
     * Instantiates a new Blocklist_identifiersRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public BlocklistIdentifiersRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/blocklist_identifiers", rawUrl);
    }
    /**
     * Get a list of all identifiers which are not allowed to access an instance
     * @return a BlocklistIdentifiers
     */
    @jakarta.annotation.Nullable
    public BlocklistIdentifiers get() {
        return get(null);
    }
    /**
     * Get a list of all identifiers which are not allowed to access an instance
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a BlocklistIdentifiers
     */
    @jakarta.annotation.Nullable
    public BlocklistIdentifiers get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("401", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("402", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BlocklistIdentifiers::createFromDiscriminatorValue);
    }
    /**
     * Create an identifier that is blocked from accessing an instance
     * @param body The request body
     * @return a BlocklistIdentifier
     */
    @jakarta.annotation.Nullable
    public BlocklistIdentifier post(@jakarta.annotation.Nonnull final BlocklistIdentifiersPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Create an identifier that is blocked from accessing an instance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a BlocklistIdentifier
     */
    @jakarta.annotation.Nullable
    public BlocklistIdentifier post(@jakarta.annotation.Nonnull final BlocklistIdentifiersPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("402", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, BlocklistIdentifier::createFromDiscriminatorValue);
    }
    /**
     * Get a list of all identifiers which are not allowed to access an instance
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Get a list of all identifiers which are not allowed to access an instance
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
     * Create an identifier that is blocked from accessing an instance
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BlocklistIdentifiersPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create an identifier that is blocked from accessing an instance
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final BlocklistIdentifiersPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a BlocklistIdentifiersRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public BlocklistIdentifiersRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new BlocklistIdentifiersRequestBuilder(rawUrl, requestAdapter);
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
