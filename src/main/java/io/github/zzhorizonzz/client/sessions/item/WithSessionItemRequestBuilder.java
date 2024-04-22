package io.github.zzhorizonzz.client.sessions.item;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.client.models.ClerkErrors;
import io.github.zzhorizonzz.client.models.Session;
import io.github.zzhorizonzz.client.sessions.item.revoke.RevokeRequestBuilder;
import io.github.zzhorizonzz.client.sessions.item.tokens.TokensRequestBuilder;
import io.github.zzhorizonzz.client.sessions.item.verify.VerifyRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /sessions/{session_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithSessionItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The revoke property
     */
    @jakarta.annotation.Nonnull
    public RevokeRequestBuilder revoke() {
        return new RevokeRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The tokens property
     */
    @jakarta.annotation.Nonnull
    public TokensRequestBuilder tokens() {
        return new TokensRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The verify property
     */
    @jakarta.annotation.Nonnull
    public VerifyRequestBuilder verify() {
        return new VerifyRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithSession_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSessionItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sessions/{session_id}", pathParameters);
    }
    /**
     * Instantiates a new WithSession_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithSessionItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sessions/{session_id}", rawUrl);
    }
    /**
     * Retrieve the details of a session
     * @return a Session
     */
    @jakarta.annotation.Nullable
    public Session get() {
        return get(null);
    }
    /**
     * Retrieve the details of a session
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Session
     */
    @jakarta.annotation.Nullable
    public Session get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("401", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Session::createFromDiscriminatorValue);
    }
    /**
     * Retrieve the details of a session
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the details of a session
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
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a WithSessionItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithSessionItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithSessionItemRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
}
