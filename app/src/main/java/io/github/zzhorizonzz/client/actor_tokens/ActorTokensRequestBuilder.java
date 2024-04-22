package io.github.zzhorizonzz.client.actor_tokens;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.client.actor_tokens.item.WithActorTokenItemRequestBuilder;
import io.github.zzhorizonzz.client.models.ActorToken;
import io.github.zzhorizonzz.client.models.ClerkErrors;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /actor_tokens
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ActorTokensRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the io.github.zzhorizonzz.client.actor_tokens.item collection
     * @param actor_token_id The ID of the actor token to be revoked.
     * @return a WithActorTokenItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithActorTokenItemRequestBuilder byActor_token_id(@jakarta.annotation.Nonnull final String actor_token_id) {
        Objects.requireNonNull(actor_token_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("actor_token_id", actor_token_id);
        return new WithActorTokenItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new Actor_tokensRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ActorTokensRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/actor_tokens", pathParameters);
    }
    /**
     * Instantiates a new Actor_tokensRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public ActorTokensRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/actor_tokens", rawUrl);
    }
    /**
     * Create an actor token that can be used to impersonate the given user.The `actor` parameter needs to include at least a "sub" key whose value is the ID of the actor (impersonating) user.
     * @param body The request body
     * @return a ActorToken
     */
    @jakarta.annotation.Nullable
    public ActorToken post(@jakarta.annotation.Nonnull final ActorTokensPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Create an actor token that can be used to impersonate the given user.The `actor` parameter needs to include at least a "sub" key whose value is the ID of the actor (impersonating) user.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a ActorToken
     */
    @jakarta.annotation.Nullable
    public ActorToken post(@jakarta.annotation.Nonnull final ActorTokensPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("402", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, ActorToken::createFromDiscriminatorValue);
    }
    /**
     * Create an actor token that can be used to impersonate the given user.The `actor` parameter needs to include at least a "sub" key whose value is the ID of the actor (impersonating) user.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ActorTokensPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Create an actor token that can be used to impersonate the given user.The `actor` parameter needs to include at least a "sub" key whose value is the ID of the actor (impersonating) user.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final ActorTokensPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a ActorTokensRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public ActorTokensRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new ActorTokensRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
