package io.github.zzhorizonzz.client.sign_in_tokens;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.client.models.ClerkErrors;
import io.github.zzhorizonzz.client.models.SignInToken;
import io.github.zzhorizonzz.client.sign_in_tokens.item.WithSignInTokenItemRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /sign_in_tokens
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SignInTokensRequestBuilder extends BaseRequestBuilder {
    /**
     * Gets an item from the io.github.zzhorizonzz.client.sign_in_tokens.item collection
     * @param sign_in_token_id The ID of the sign-in token to be revoked
     * @return a WithSignInTokenItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithSignInTokenItemRequestBuilder bySign_in_token_id(@jakarta.annotation.Nonnull final String sign_in_token_id) {
        Objects.requireNonNull(sign_in_token_id);
        final HashMap<String, Object> urlTplParams = new HashMap<String, Object>(this.pathParameters);
        urlTplParams.put("sign_in_token_id", sign_in_token_id);
        return new WithSignInTokenItemRequestBuilder(urlTplParams, requestAdapter);
    }
    /**
     * Instantiates a new Sign_in_tokensRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SignInTokensRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sign_in_tokens", pathParameters);
    }
    /**
     * Instantiates a new Sign_in_tokensRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public SignInTokensRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/sign_in_tokens", rawUrl);
    }
    /**
     * Creates a new sign-in token and associates it with the given user.By default, sign-in tokens expire in 30 days.You can optionally supply a different duration in seconds using the `expires_in_seconds` property.
     * @param body The request body
     * @return a SignInToken
     */
    @jakarta.annotation.Nullable
    public SignInToken post(@jakarta.annotation.Nonnull final SignInTokensPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Creates a new sign-in token and associates it with the given user.By default, sign-in tokens expire in 30 days.You can optionally supply a different duration in seconds using the `expires_in_seconds` property.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a SignInToken
     */
    @jakarta.annotation.Nullable
    public SignInToken post(@jakarta.annotation.Nonnull final SignInTokensPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, SignInToken::createFromDiscriminatorValue);
    }
    /**
     * Creates a new sign-in token and associates it with the given user.By default, sign-in tokens expire in 30 days.You can optionally supply a different duration in seconds using the `expires_in_seconds` property.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SignInTokensPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Creates a new sign-in token and associates it with the given user.By default, sign-in tokens expire in 30 days.You can optionally supply a different duration in seconds using the `expires_in_seconds` property.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final SignInTokensPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a SignInTokensRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public SignInTokensRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new SignInTokensRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
