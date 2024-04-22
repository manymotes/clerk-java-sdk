package io.github.zzhorizonzz.client.users.item;

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
import io.github.zzhorizonzz.client.models.User;
import io.github.zzhorizonzz.client.users.item.ban.BanRequestBuilder;
import io.github.zzhorizonzz.client.users.item.lock.LockRequestBuilder;
import io.github.zzhorizonzz.client.users.item.metadata.MetadataRequestBuilder;
import io.github.zzhorizonzz.client.users.item.mfa.MfaRequestBuilder;
import io.github.zzhorizonzz.client.users.item.oauth_access_tokens.OauthAccessTokensRequestBuilder;
import io.github.zzhorizonzz.client.users.item.organization_memberships.OrganizationMembershipsRequestBuilder;
import io.github.zzhorizonzz.client.users.item.profile_image.ProfileImageRequestBuilder;
import io.github.zzhorizonzz.client.users.item.unban.UnbanRequestBuilder;
import io.github.zzhorizonzz.client.users.item.unlock.UnlockRequestBuilder;
import io.github.zzhorizonzz.client.users.item.verify_password.VerifyPasswordRequestBuilder;
import io.github.zzhorizonzz.client.users.item.verify_totp.VerifyTotpRequestBuilder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Builds and executes requests for operations under /users/{user_id}
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WithUserItemRequestBuilder extends BaseRequestBuilder {
    /**
     * The ban property
     */
    @jakarta.annotation.Nonnull
    public BanRequestBuilder ban() {
        return new BanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The lock property
     */
    @jakarta.annotation.Nonnull
    public LockRequestBuilder lock() {
        return new LockRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The metadata property
     */
    @jakarta.annotation.Nonnull
    public MetadataRequestBuilder metadata() {
        return new MetadataRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The mfa property
     */
    @jakarta.annotation.Nonnull
    public MfaRequestBuilder mfa() {
        return new MfaRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The oauth_access_tokens property
     */
    @jakarta.annotation.Nonnull
    public OauthAccessTokensRequestBuilder oauthAccessTokens() {
        return new OauthAccessTokensRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The organization_memberships property
     */
    @jakarta.annotation.Nonnull
    public OrganizationMembershipsRequestBuilder organizationMemberships() {
        return new OrganizationMembershipsRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The profile_image property
     */
    @jakarta.annotation.Nonnull
    public ProfileImageRequestBuilder profileImage() {
        return new ProfileImageRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The unban property
     */
    @jakarta.annotation.Nonnull
    public UnbanRequestBuilder unban() {
        return new UnbanRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The unlock property
     */
    @jakarta.annotation.Nonnull
    public UnlockRequestBuilder unlock() {
        return new UnlockRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The verify_password property
     */
    @jakarta.annotation.Nonnull
    public VerifyPasswordRequestBuilder verifyPassword() {
        return new VerifyPasswordRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * The verify_totp property
     */
    @jakarta.annotation.Nonnull
    public VerifyTotpRequestBuilder verifyTotp() {
        return new VerifyTotpRequestBuilder(pathParameters, requestAdapter);
    }
    /**
     * Instantiates a new WithUser_ItemRequestBuilder and sets the default values.
     * @param pathParameters Path parameters for the request
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithUserItemRequestBuilder(@jakarta.annotation.Nonnull final HashMap<String, Object> pathParameters, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user_id}", pathParameters);
    }
    /**
     * Instantiates a new WithUser_ItemRequestBuilder and sets the default values.
     * @param rawUrl The raw URL to use for the request builder.
     * @param requestAdapter The request adapter to use to execute the requests.
     */
    public WithUserItemRequestBuilder(@jakarta.annotation.Nonnull final String rawUrl, @jakarta.annotation.Nonnull final RequestAdapter requestAdapter) {
        super(requestAdapter, "{+baseurl}/users/{user_id}", rawUrl);
    }
    /**
     * Delete the specified user
     * @return a DeletedObject
     */
    @jakarta.annotation.Nullable
    public DeletedObject delete() {
        return delete(null);
    }
    /**
     * Delete the specified user
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a DeletedObject
     */
    @jakarta.annotation.Nullable
    public DeletedObject delete(@jakarta.annotation.Nullable final java.util.function.Consumer<DeleteRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toDeleteRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("401", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, DeletedObject::createFromDiscriminatorValue);
    }
    /**
     * Retrieve the details of a user
     * @return a User
     */
    @jakarta.annotation.Nullable
    public User get() {
        return get(null);
    }
    /**
     * Retrieve the details of a user
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a User
     */
    @jakarta.annotation.Nullable
    public User get(@jakarta.annotation.Nullable final java.util.function.Consumer<GetRequestConfiguration> requestConfiguration) {
        final RequestInformation requestInfo = toGetRequestInformation(requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("401", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, User::createFromDiscriminatorValue);
    }
    /**
     * Update a user's attributes.You can set the user's primary contact identifiers (email address and phone numbers) by updating the `primary_email_address_id` and `primary_phone_number_id` attributes respectively.Both IDs should correspond to verified identifications that belong to the user.You can remove a user's username by setting the username attribute to null or the blank string "".This is a destructive action; the identification will be deleted forever.Usernames can be removed only if they are optional in your instance settings and there's at least one other identifier which can be used for authentication.This endpoint allows changing a user's password. When passing the `password` parameter directly you have two further options.You can ignore the password policy checks for your instance by setting the `skip_password_checks` parameter to `true`.You can also choose to sign the user out of all their active sessions on any device once the password is updated. Just set `sign_out_of_other_sessions` to `true`.
     * @param body The request body
     * @return a User
     */
    @jakarta.annotation.Nullable
    public User patch(@jakarta.annotation.Nonnull final WithUserPatchRequestBody body) {
        return patch(body, null);
    }
    /**
     * Update a user's attributes.You can set the user's primary contact identifiers (email address and phone numbers) by updating the `primary_email_address_id` and `primary_phone_number_id` attributes respectively.Both IDs should correspond to verified identifications that belong to the user.You can remove a user's username by setting the username attribute to null or the blank string "".This is a destructive action; the identification will be deleted forever.Usernames can be removed only if they are optional in your instance settings and there's at least one other identifier which can be used for authentication.This endpoint allows changing a user's password. When passing the `password` parameter directly you have two further options.You can ignore the password policy checks for your instance by setting the `skip_password_checks` parameter to `true`.You can also choose to sign the user out of all their active sessions on any device once the password is updated. Just set `sign_out_of_other_sessions` to `true`.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a User
     */
    @jakarta.annotation.Nullable
    public User patch(@jakarta.annotation.Nonnull final WithUserPatchRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
        Objects.requireNonNull(body);
        final RequestInformation requestInfo = toPatchRequestInformation(body, requestConfiguration);
        final HashMap<String, ParsableFactory<? extends Parsable>> errorMapping = new HashMap<String, ParsableFactory<? extends Parsable>>();
        errorMapping.put("400", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("401", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("404", ClerkErrors::createFromDiscriminatorValue);
        errorMapping.put("422", ClerkErrors::createFromDiscriminatorValue);
        return this.requestAdapter.send(requestInfo, errorMapping, User::createFromDiscriminatorValue);
    }
    /**
     * Delete the specified user
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toDeleteRequestInformation() {
        return toDeleteRequestInformation(null);
    }
    /**
     * Delete the specified user
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
     * Retrieve the details of a user
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toGetRequestInformation() {
        return toGetRequestInformation(null);
    }
    /**
     * Retrieve the details of a user
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
     * Update a user's attributes.You can set the user's primary contact identifiers (email address and phone numbers) by updating the `primary_email_address_id` and `primary_phone_number_id` attributes respectively.Both IDs should correspond to verified identifications that belong to the user.You can remove a user's username by setting the username attribute to null or the blank string "".This is a destructive action; the identification will be deleted forever.Usernames can be removed only if they are optional in your instance settings and there's at least one other identifier which can be used for authentication.This endpoint allows changing a user's password. When passing the `password` parameter directly you have two further options.You can ignore the password policy checks for your instance by setting the `skip_password_checks` parameter to `true`.You can also choose to sign the user out of all their active sessions on any device once the password is updated. Just set `sign_out_of_other_sessions` to `true`.
     * @param body The request body
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WithUserPatchRequestBody body) {
        return toPatchRequestInformation(body, null);
    }
    /**
     * Update a user's attributes.You can set the user's primary contact identifiers (email address and phone numbers) by updating the `primary_email_address_id` and `primary_phone_number_id` attributes respectively.Both IDs should correspond to verified identifications that belong to the user.You can remove a user's username by setting the username attribute to null or the blank string "".This is a destructive action; the identification will be deleted forever.Usernames can be removed only if they are optional in your instance settings and there's at least one other identifier which can be used for authentication.This endpoint allows changing a user's password. When passing the `password` parameter directly you have two further options.You can ignore the password policy checks for your instance by setting the `skip_password_checks` parameter to `true`.You can also choose to sign the user out of all their active sessions on any device once the password is updated. Just set `sign_out_of_other_sessions` to `true`.
     * @param body The request body
     * @param requestConfiguration Configuration for the request such as headers, query parameters, and middleware options.
     * @return a RequestInformation
     */
    @jakarta.annotation.Nonnull
    public RequestInformation toPatchRequestInformation(@jakarta.annotation.Nonnull final WithUserPatchRequestBody body, @jakarta.annotation.Nullable final java.util.function.Consumer<PatchRequestConfiguration> requestConfiguration) {
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
     * @return a WithUserItemRequestBuilder
     */
    @jakarta.annotation.Nonnull
    public WithUserItemRequestBuilder withUrl(@jakarta.annotation.Nonnull final String rawUrl) {
        Objects.requireNonNull(rawUrl);
        return new WithUserItemRequestBuilder(rawUrl, requestAdapter);
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
