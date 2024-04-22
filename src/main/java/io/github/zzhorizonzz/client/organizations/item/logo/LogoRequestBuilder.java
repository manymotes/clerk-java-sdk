package io.github.zzhorizonzz.client.organizations.item.logo;

import com.microsoft.kiota.BaseRequestBuilder;
import com.microsoft.kiota.BaseRequestConfiguration;
import com.microsoft.kiota.HttpMethod;
import com.microsoft.kiota.MultipartBody;
import com.microsoft.kiota.RequestAdapter;
import com.microsoft.kiota.RequestInformation;
import com.microsoft.kiota.RequestOption;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParsableFactory;
import io.github.zzhorizonzz.client.models.ClerkErrors;
import io.github.zzhorizonzz.client.models.Organization;
import io.github.zzhorizonzz.client.models.OrganizationWithLogo;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /organizations/{organization_id}/logo
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class LogoRequestBuilder extends BaseRequestBuilder {
    /**
     * Instantiates a new LogoRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LogoRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/{organization_id}/logo", pathParameters);
    }
    /**
     * Instantiates a new LogoRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public LogoRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/organizations/{organization_id}/logo", rawUrl);
    }
    /**
     * Delete the organization's logo.
     * @return a Organization
     */
    @jakarta.annotation.Nullable
    public Organization delete() {
        return delete(null);
    }
    /**
     * Delete the organization's logo.
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a Organization
     */
    @jakarta.annotation.Nullable
    public Organization delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, Organization::createFromDiscriminatorValue);
    }
    /**
     * Set or replace an organization's logo, by uploading an image file.This endpoint uses the `multipart/form-data` request content type and accepts a file of image type.The file size cannot exceed 10MB.Only the following file content types are supported: `image/jpeg`, `image/png`, `image/gif`, `image/webp`, `image/x-icon`, `image/vnd.microsoft.icon`.
     * @param body The request body
     * @return a OrganizationWithLogo
     */
    @jakarta.annotation.Nullable
    public OrganizationWithLogo put(@jakarta.annotation.Nonnull final MultipartBody body) {
        return put(body, null);
    }
    /**
     * Set or replace an organization's logo, by uploading an image file.This endpoint uses the `multipart/form-data` request content type and accepts a file of image type.The file size cannot exceed 10MB.Only the following file content types are supported: `image/jpeg`, `image/png`, `image/gif`, `image/webp`, `image/x-icon`, `image/vnd.microsoft.icon`.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a OrganizationWithLogo
     */
    @jakarta.annotation.Nullable
    public OrganizationWithLogo put(@jakarta.annotation.Nonnull final MultipartBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPutRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("403", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("413", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, OrganizationWithLogo::createFromDiscriminatorValue);
    }
    /**
     * Delete the organization's logo.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete the organization's logo.
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
     * Set or replace an organization's logo, by uploading an image file.This endpoint uses the `multipart/form-data` request content type and accepts a file of image type.The file size cannot exceed 10MB.Only the following file content types are supported: `image/jpeg`, `image/png`, `image/gif`, `image/webp`, `image/x-icon`, `image/vnd.microsoft.icon`.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final MultipartBody body) {
        return toPutRequestInformation(body, null);
    }
    /**
     * Set or replace an organization's logo, by uploading an image file.This endpoint uses the `multipart/form-data` request content type and accepts a file of image type.The file size cannot exceed 10MB.Only the following file content types are supported: `image/jpeg`, `image/png`, `image/gif`, `image/webp`, `image/x-icon`, `image/vnd.microsoft.icon`.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPutRequestInformation(@jakarta.annotation.Nonnull final MultipartBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PutRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = new RequestInformation(HttpMethod.PUT, urlTemplate, pathParameters);
        requestInfo.configure(requestConfiguration, PutRequestConfiguration::new);
        requestInfo.headers.tryAdd("Accept", "application/json");
        requestInfo.setContentFromParsable(requestAdapter, "multipart/form-data", body);
        return requestInfo;
    }
    /**
     * Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
     * @param rawUrl The raw URL to use for the request builder.
     * @return a LogoRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public LogoRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new LogoRequestBuilder(rawUrl, requestAdapter);
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
    public class PutRequestConfiguration extends BaseRequestConfiguration {
    }
}
