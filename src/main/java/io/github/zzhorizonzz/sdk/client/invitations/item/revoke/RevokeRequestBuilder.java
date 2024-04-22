package io.github.zzhorizonzz.sdk.client.invitations.item.revoke;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.sdk.client.models.ClerkErrors;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /invitations/{invitation_id}/revoke
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RevokeRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new RevokeRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RevokeRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/invitations/{invitation_id}/revoke", pathParameters);
    }
    /**
     * Instantiates a new RevokeRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public RevokeRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/invitations/{invitation_id}/revoke", rawUrl);
    }
    /**
     * Revokes the given invitation.Revoking an invitation will prevent the user from using the invitation link that was sent to them.However, it doesn't prevent the user from signing up if they follow the sign up flow.Only active (i.e. non-revoked) invitations can be revoked.
     * @return a RevokePostResponse
     */
    @jakarta.annotation.Nullable
    public RevokePostResponse post() {
        return post(null);
    }
    /**
     * Revokes the given invitation.Revoking an invitation will prevent the user from using the invitation link that was sent to them.However, it doesn't prevent the user from signing up if they follow the sign up flow.Only active (i.e. non-revoked) invitations can be revoked.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RevokePostResponse
     */
    @jakarta.annotation.Nullable
    public RevokePostResponse post(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toPostRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, RevokePostResponse::createFromDiscriminatorValue);
    }
    /**
     * Revokes the given invitation.Revoking an invitation will prevent the user from using the invitation link that was sent to them.However, it doesn't prevent the user from signing up if they follow the sign up flow.Only active (i.e. non-revoked) invitations can be revoked.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation() {
        return toPostRequestInformation(null);
    }
    /**
     * Revokes the given invitation.Revoking an invitation will prevent the user from using the invitation link that was sent to them.However, it doesn't prevent the user from signing up if they follow the sign up flow.Only active (i.e. non-revoked) invitations can be revoked.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPostRequestInformation(@jakarta.annotation.Nullable final java.util.function.Consumer<PostRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.POST, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PostRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a RevokeRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public RevokeRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new RevokeRequestBuilder(rawUrl, requestAdapter);
    }
    /**
     * Configuration for the request such as headers, query parameters, and middleware options.
     */
    @jakarta.annotation.Generated("com.microsoft.kiota")
    public class PostRequestConfiguration extends BaseRequestConfiguration {
    }
}
