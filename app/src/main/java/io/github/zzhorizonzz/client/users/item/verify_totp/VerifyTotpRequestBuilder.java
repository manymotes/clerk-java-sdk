package io.github.zzhorizonzz.client.users.item.verify_totp;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.client.models.ClerkErrors;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /users/{user_id}/verify_totp
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VerifyTotpRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new Verify_totpRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VerifyTotpRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user_id}/verify_totp", pathParameters);
    }
    /**
     * Instantiates a new Verify_totpRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public VerifyTotpRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user_id}/verify_totp", rawUrl);
    }
    /**
     * Verify that the provided TOTP or backup code is valid for the user.Verifying a backup code will result it in being consumed (i.e. it willbecome invalid).Useful for custom auth flows and re-verification.
     * @param body The request body
     * @return a VerifyTotpPostResponse
     */
    @jakarta.annotation.Nullable
    public VerifyTotpPostResponse post(@jakarta.annotation.Nonnull final VerifyTotpPostRequestBody body) {
        return post(body, null);
    }
    /**
     * Verify that the provided TOTP or backup code is valid for the user.Verifying a backup code will result it in being consumed (i.e. it willbecome invalid).Useful for custom auth flows and re-verification.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a VerifyTotpPostResponse
     */
    @jakarta.annotation.Nullable
    public VerifyTotpPostResponse post(@jakarta.annotation.Nonnull final VerifyTotpPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPostRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("500", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, VerifyTotpPostResponse::createFromDiscriminatorValue);
    }
    /**
     * Verify that the provided TOTP or backup code is valid for the user.Verifying a backup code will result it in being consumed (i.e. it willbecome invalid).Useful for custom auth flows and re-verification.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final VerifyTotpPostRequestBody body) {
        return toPostRequestInformation(body, null);
    }
    /**
     * Verify that the provided TOTP or backup code is valid for the user.Verifying a backup code will result it in being consumed (i.e. it willbecome invalid).Useful for custom auth flows and re-verification.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nonnull final VerifyTotpPostRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
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
     * @return a VerifyTotpRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public VerifyTotpRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new VerifyTotpRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
