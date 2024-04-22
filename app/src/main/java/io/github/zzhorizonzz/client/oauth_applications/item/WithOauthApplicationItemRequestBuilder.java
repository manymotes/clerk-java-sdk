package io.github.zzhorizonzz.client.oauth_applications.item;

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
import io.github.zzhorizonzz.client.models.OAuthApplication;
import io.github.zzhorizonzz.client.oauth_applications.item.rotate_secret.RotateSecretRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /oauth_applications/{oauth_application_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithOauthApplicationItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The rotate_secret property
     */
    @jakarta.annotation.Nonnull
    public RotateSecretRequestBuilder rotateSecret() {
        return new RotateSecretRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithOauth_application_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithOauthApplicationItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/oauth_applications/{oauth_application_id}", pathParameters);
    }
    /**
     * Instantiates a new WithOauth_application_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithOauthApplicationItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/oauth_applications/{oauth_application_id}", rawUrl);
    }
    /**
     * Deletes the given OAuth application.This is not reversible.
     * @return a DeletedObject
     */
    @jakarta.annotation.Nullable
    public DeletedObject delete() {
        return delete(null);
    }
    /**
     * Deletes the given OAuth application.This is not reversible.
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
     * Fetches the OAuth application whose ID matches the provided `id` in the path.
     * @return a OAuthApplication
     */
    @jakarta.annotation.Nullable
    public OAuthApplication get() {
        return get(null);
    }
    /**
     * Fetches the OAuth application whose ID matches the provided `id` in the path.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OAuthApplication
     */
    @jakarta.annotation.Nullable
    public OAuthApplication get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("403", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OAuthApplication::createFromDiscriminatorValue);
    }
    /**
     * Updates an existing OAuth application
     * @param body The request body
     * @return a OAuthApplication
     */
    @jakarta.annotation.Nullable
    public OAuthApplication patch(@jakarta.annotation.Nonnull final WithOauthApplicationPatchRequestBody body) {
        return patch(body, null);
    }
    /**
     * Updates an existing OAuth application
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OAuthApplication
     */
    @jakarta.annotation.Nullable
    public OAuthApplication patch(@jakarta.annotation.Nonnull final WithOauthApplicationPatchRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("403", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OAuthApplication::createFromDiscriminatorValue);
    }
    /**
     * Deletes the given OAuth application.This is not reversible.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Deletes the given OAuth application.This is not reversible.
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
     * Fetches the OAuth application whose ID matches the provided `id` in the path.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Fetches the OAuth application whose ID matches the provided `id` in the path.
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
     * Updates an existing OAuth application
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WithOauthApplicationPatchRequestBody body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Updates an existing OAuth application
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WithOauthApplicationPatchRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a WithOauthApplicationItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithOauthApplicationItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithOauthApplicationItemRequestBuilder(rawUrl, requestAdapter);
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
    public class GetRequestConfiguration extends BaseRequestConfiguration {
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PatchRequestConfiguration extends BaseRequestConfiguration {
    }
}
