package io.github.zzhorizonzz.sdk.client.users;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UsersPostRequestBody implements Parsable {
    /**
     * If Backup Codes are configured on the instance, you can provide them to enable it on the newly created user without the need to reset them.You must provide the backup codes in plain format or the corresponding bcrypt digest.
     */
    private java.util.List<String> backupCodes;
    /**
     * A custom date/time denoting _when_ the user signed up to the application, specified in RFC3339 format (e.g. `2012-10-20T07:15:20.902Z`).
     */
    private String createdAt;
    /**
     * Email addresses to add to the user.Must be unique across your instance.The first email address will be set as the user's primary email address.
     */
    private java.util.List<String> emailAddress;
    /**
     * The ID of the user as used in your external systems or your previous authentication solution.Must be unique across your instance.
     */
    private String externalId;
    /**
     * The first name to assign to the user
     */
    private String firstName;
    /**
     * The last name to assign to the user
     */
    private String lastName;
    /**
     * The plaintext password to give the user.Must be at least 8 characters long, and can not be in any list of hacked passwords.
     */
    private String password;
    /**
     * In case you already have the password digests and not the passwords, you can use them for the newly created user via this property.The digests should be generated with one of the supported algorithms.The hashing algorithm can be specified using the `password_hasher` property.
     */
    private String passwordDigest;
    /**
     * The hashing algorithm that was used to generate the password digest.The algorithms we support at the moment are [bcrypt](https://en.wikipedia.org/wiki/Bcrypt), [bcrypt_sha256_django](https://docs.djangoproject.com/en/4.0/topics/auth/passwords/),[md5](https://en.wikipedia.org/wiki/MD5), pbkdf2_sha256, [pbkdf2_sha256_django](https://docs.djangoproject.com/en/4.0/topics/auth/passwords/),[phpass](https://www.openwall.com/phpass/), [scrypt_firebase](https://firebaseopensource.com/projects/firebase/scrypt/),[sha256](https://en.wikipedia.org/wiki/SHA-2)and the [argon2](https://argon2.online/) variants argon2i and argon2id.If you need support for any particular hashing algorithm, [please let us know](https://clerk.com/support).Note: for password hashers considered insecure (at this moment MD5 and SHA256), the corresponding user password hashes will be transparently migrated to Bcrypt (a secure hasher) upon the user's first successful password sign in.Insecure schemes are marked with `(insecure)` in the list below.Each of the supported hashers expects the incoming digest to be in a particular format. Specifically:**bcrypt:** The digest should be of the following form:`$<algorithm version>$<cost>$<salt & hash>`**bcrypt_sha256_django:** This is the Django-specific variant of Bcrypt, using SHA256 hashing function. The format should be as follows (as exported from Django):`bcrypt_sha256$$<algorithm version>$<cost>$<salt & hash>`**md5** (insecure): The digest should follow the regular form e.g.:`5f4dcc3b5aa765d61d8327deb882cf99`**pbkdf2_sha256:** This is the PBKDF2 algorithm using the SHA256 hashing function. The format should be as follows:`pbkdf2_sha256$<iterations>$<salt>$<hash>`Note: Both the salt and the hash are expected to be base64-encoded.**pbkdf2_sha256_django:** This is the Django-specific variant of PBKDF2 and the digest should have the following format (as exported from Django):`pbkdf2_sha256$<iterations>$<salt>$<hash>`Note: The salt is expected to be un-encoded, the hash is expected base64-encoded.**pbkdf2_sha1:** This is similar to pkbdf2_sha256_django, but with two differences:1. uses sha1 instead of sha2562. accepts the hash as a hex-encoded stringThe format is the following:`pbkdf2_sha1$<iterations>$<salt>$<hash-as-hex-string>`**phpass:** Portable public domain password hashing framework for use in PHP applications. Digests hashed with phpass have the following sections:The format is the following:`$P$<rounds><salt><encoded-checksum>`- $P$ is the prefix used to identify phpass hashes.- rounds is a single character encoding a 6-bit integer representing the number of rounds used.- salt is eight characters drawn from [./0-9A-Za-z], providing a 48-bit salt.- checksum is 22 characters drawn from the same set, encoding the 128-bit checksum with MD5.**scrypt_firebase:** The Firebase-specific variant of scrypt.The value is expected to have 6 segments separated by the $ character and include the following information:_hash:_ The actual Base64 hash. This can be retrieved when exporting the user from Firebase._salt:_ The salt used to generate the above hash. Again, this is given when exporting the user._signer key:_ The base64 encoded signer key._salt separator:_ The base64 encoded salt separator._rounds:_ The number of rounds the algorithm needs to run._memory cost:_ The cost of the algorithm runThe first 2 (hash and salt) are per user and can be retrieved when exporting the user from Firebase.The other 4 values (signer key, salt separator, rounds and memory cost) are project-wide settings and can be retrieved from the project's password hash parameters.Once you have all these, you can combine it in the following format and send this as the digest in order for Clerk to accept it:`<hash>$<salt>$<signer key>$<salt separator>$<rounds>$<memory cost>`**argon2i:** Algorithms in the argon2 family generate digests that encode the following information:_version (v):_ The argon version, version 19 is assumed_memory (m):_ The memory used by the algorithm (in kibibytes)_iterations (t):_ The number of iterations to perform_parallelism (p):_ The number of threads to useParts are demarcated by the `$` character, with the first part identifying the algorithm variant.The middle part is a comma-separated list of the encoding options (memory, iterations, parallelism).The final part is the actual digest.`$argon2i$v=19$m=4096,t=3,p=1$4t6CL3P7YiHBtwESXawI8Hm20zJj4cs7/4/G3c187e0$m7RQFczcKr5bIR0IIxbpO2P0tyrLjf3eUW3M3QSwnLc`**argon2id:** See the previous algorithm for an explanation of the formatting.For the argon2id case, the value of the algorithm in the first part of the digest is `argon2id`:`$argon2id$v=19$m=64,t=4,p=8$Z2liZXJyaXNo$iGXEpMBTDYQ8G/71tF0qGjxRHEmR3gpGULcE93zUJVU`**sha256** (insecure): The digest should be a 64-length hex string, e.g.:`9f86d081884c7d659a2feaa0c55ad015a3bf4f1b2b0b822cd15d6c15b0f00a08`
     */
    private UsersPostRequestBodyPasswordHasher passwordHasher;
    /**
     * Phone numbers to add to the user.Must be unique across your instance.The first phone number will be set as the user's primary phone number.
     */
    private java.util.List<String> phoneNumber;
    /**
     * Metadata saved on the user, that is only visible to your Backend API
     */
    private UsersPostRequestBodyPrivateMetadata privateMetadata;
    /**
     * Metadata saved on the user, that is visible to both your Frontend and Backend APIs
     */
    private UsersPostRequestBodyPublicMetadata publicMetadata;
    /**
     * When set to `true` all password checks are skipped.It is recommended to use this method only when migrating plaintext passwords to Clerk.Upon migration the user base should be prompted to pick stronger password.
     */
    private Boolean skipPasswordChecks;
    /**
     * When set to `true`, `password` is not required anymore when creating the user and can be omitted.This is useful when you are trying to create a user that doesn't have a password, in an instance that is using passwords.Please note that you cannot use this flag if password is the only way for a user to sign into your instance.
     */
    private Boolean skipPasswordRequirement;
    /**
     * In case TOTP is configured on the instance, you can provide the secret to enable it on the newly created user without the need to reset it.Please note that currently the supported options are:* Period: 30 seconds* Code length: 6 digits* Algorithm: SHA1
     */
    private String totpSecret;
    /**
     * Metadata saved on the user, that can be updated from both the Frontend and Backend APIs.Note: Since this data can be modified from the frontend, it is not guaranteed to be safe.
     */
    private UsersPostRequestBodyUnsafeMetadata unsafeMetadata;
    /**
     * The username to give to the user.It must be unique across your instance.
     */
    private String username;
    /**
     * Web3 wallets to add to the user.Must be unique across your instance.The first wallet will be set as the user's primary wallet.
     */
    private java.util.List<String> web3Wallet;
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UsersPostRequestBody
     */
    @jakarta.annotation.Nonnull
    public static UsersPostRequestBody createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UsersPostRequestBody();
    }
    /**
     * Gets the backup_codes property value. If Backup Codes are configured on the instance, you can provide them to enable it on the newly created user without the need to reset them.You must provide the backup codes in plain format or the corresponding bcrypt digest.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getBackupCodes() {
        return this.backupCodes;
    }
    /**
     * Gets the created_at property value. A custom date/time denoting _when_ the user signed up to the application, specified in RFC3339 format (e.g. `2012-10-20T07:15:20.902Z`).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Gets the email_address property value. Email addresses to add to the user.Must be unique across your instance.The first email address will be set as the user's primary email address.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getEmailAddress() {
        return this.emailAddress;
    }
    /**
     * Gets the external_id property value. The ID of the user as used in your external systems or your previous authentication solution.Must be unique across your instance.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(18);
        deserializerMap.put("backup_codes", (n) -> { this.setBackupCodes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("created_at", (n) -> { this.setCreatedAt(n.getStringValue()); });
        deserializerMap.put("email_address", (n) -> { this.setEmailAddress(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("external_id", (n) -> { this.setExternalId(n.getStringValue()); });
        deserializerMap.put("first_name", (n) -> { this.setFirstName(n.getStringValue()); });
        deserializerMap.put("last_name", (n) -> { this.setLastName(n.getStringValue()); });
        deserializerMap.put("password", (n) -> { this.setPassword(n.getStringValue()); });
        deserializerMap.put("password_digest", (n) -> { this.setPasswordDigest(n.getStringValue()); });
        deserializerMap.put("password_hasher", (n) -> { this.setPasswordHasher(n.getEnumValue(UsersPostRequestBodyPasswordHasher::forValue)); });
        deserializerMap.put("phone_number", (n) -> { this.setPhoneNumber(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("private_metadata", (n) -> { this.setPrivateMetadata(n.getObjectValue(UsersPostRequestBodyPrivateMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("public_metadata", (n) -> { this.setPublicMetadata(n.getObjectValue(UsersPostRequestBodyPublicMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("skip_password_checks", (n) -> { this.setSkipPasswordChecks(n.getBooleanValue()); });
        deserializerMap.put("skip_password_requirement", (n) -> { this.setSkipPasswordRequirement(n.getBooleanValue()); });
        deserializerMap.put("totp_secret", (n) -> { this.setTotpSecret(n.getStringValue()); });
        deserializerMap.put("unsafe_metadata", (n) -> { this.setUnsafeMetadata(n.getObjectValue(UsersPostRequestBodyUnsafeMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("username", (n) -> { this.setUsername(n.getStringValue()); });
        deserializerMap.put("web3_wallet", (n) -> { this.setWeb3Wallet(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the first_name property value. The first name to assign to the user
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getFirstName() {
        return this.firstName;
    }
    /**
     * Gets the last_name property value. The last name to assign to the user
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getLastName() {
        return this.lastName;
    }
    /**
     * Gets the password property value. The plaintext password to give the user.Must be at least 8 characters long, and can not be in any list of hacked passwords.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPassword() {
        return this.password;
    }
    /**
     * Gets the password_digest property value. In case you already have the password digests and not the passwords, you can use them for the newly created user via this property.The digests should be generated with one of the supported algorithms.The hashing algorithm can be specified using the `password_hasher` property.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPasswordDigest() {
        return this.passwordDigest;
    }
    /**
     * Gets the password_hasher property value. The hashing algorithm that was used to generate the password digest.The algorithms we support at the moment are [bcrypt](https://en.wikipedia.org/wiki/Bcrypt), [bcrypt_sha256_django](https://docs.djangoproject.com/en/4.0/topics/auth/passwords/),[md5](https://en.wikipedia.org/wiki/MD5), pbkdf2_sha256, [pbkdf2_sha256_django](https://docs.djangoproject.com/en/4.0/topics/auth/passwords/),[phpass](https://www.openwall.com/phpass/), [scrypt_firebase](https://firebaseopensource.com/projects/firebase/scrypt/),[sha256](https://en.wikipedia.org/wiki/SHA-2)and the [argon2](https://argon2.online/) variants argon2i and argon2id.If you need support for any particular hashing algorithm, [please let us know](https://clerk.com/support).Note: for password hashers considered insecure (at this moment MD5 and SHA256), the corresponding user password hashes will be transparently migrated to Bcrypt (a secure hasher) upon the user's first successful password sign in.Insecure schemes are marked with `(insecure)` in the list below.Each of the supported hashers expects the incoming digest to be in a particular format. Specifically:**bcrypt:** The digest should be of the following form:`$<algorithm version>$<cost>$<salt & hash>`**bcrypt_sha256_django:** This is the Django-specific variant of Bcrypt, using SHA256 hashing function. The format should be as follows (as exported from Django):`bcrypt_sha256$$<algorithm version>$<cost>$<salt & hash>`**md5** (insecure): The digest should follow the regular form e.g.:`5f4dcc3b5aa765d61d8327deb882cf99`**pbkdf2_sha256:** This is the PBKDF2 algorithm using the SHA256 hashing function. The format should be as follows:`pbkdf2_sha256$<iterations>$<salt>$<hash>`Note: Both the salt and the hash are expected to be base64-encoded.**pbkdf2_sha256_django:** This is the Django-specific variant of PBKDF2 and the digest should have the following format (as exported from Django):`pbkdf2_sha256$<iterations>$<salt>$<hash>`Note: The salt is expected to be un-encoded, the hash is expected base64-encoded.**pbkdf2_sha1:** This is similar to pkbdf2_sha256_django, but with two differences:1. uses sha1 instead of sha2562. accepts the hash as a hex-encoded stringThe format is the following:`pbkdf2_sha1$<iterations>$<salt>$<hash-as-hex-string>`**phpass:** Portable public domain password hashing framework for use in PHP applications. Digests hashed with phpass have the following sections:The format is the following:`$P$<rounds><salt><encoded-checksum>`- $P$ is the prefix used to identify phpass hashes.- rounds is a single character encoding a 6-bit integer representing the number of rounds used.- salt is eight characters drawn from [./0-9A-Za-z], providing a 48-bit salt.- checksum is 22 characters drawn from the same set, encoding the 128-bit checksum with MD5.**scrypt_firebase:** The Firebase-specific variant of scrypt.The value is expected to have 6 segments separated by the $ character and include the following information:_hash:_ The actual Base64 hash. This can be retrieved when exporting the user from Firebase._salt:_ The salt used to generate the above hash. Again, this is given when exporting the user._signer key:_ The base64 encoded signer key._salt separator:_ The base64 encoded salt separator._rounds:_ The number of rounds the algorithm needs to run._memory cost:_ The cost of the algorithm runThe first 2 (hash and salt) are per user and can be retrieved when exporting the user from Firebase.The other 4 values (signer key, salt separator, rounds and memory cost) are project-wide settings and can be retrieved from the project's password hash parameters.Once you have all these, you can combine it in the following format and send this as the digest in order for Clerk to accept it:`<hash>$<salt>$<signer key>$<salt separator>$<rounds>$<memory cost>`**argon2i:** Algorithms in the argon2 family generate digests that encode the following information:_version (v):_ The argon version, version 19 is assumed_memory (m):_ The memory used by the algorithm (in kibibytes)_iterations (t):_ The number of iterations to perform_parallelism (p):_ The number of threads to useParts are demarcated by the `$` character, with the first part identifying the algorithm variant.The middle part is a comma-separated list of the encoding options (memory, iterations, parallelism).The final part is the actual digest.`$argon2i$v=19$m=4096,t=3,p=1$4t6CL3P7YiHBtwESXawI8Hm20zJj4cs7/4/G3c187e0$m7RQFczcKr5bIR0IIxbpO2P0tyrLjf3eUW3M3QSwnLc`**argon2id:** See the previous algorithm for an explanation of the formatting.For the argon2id case, the value of the algorithm in the first part of the digest is `argon2id`:`$argon2id$v=19$m=64,t=4,p=8$Z2liZXJyaXNo$iGXEpMBTDYQ8G/71tF0qGjxRHEmR3gpGULcE93zUJVU`**sha256** (insecure): The digest should be a 64-length hex string, e.g.:`9f86d081884c7d659a2feaa0c55ad015a3bf4f1b2b0b822cd15d6c15b0f00a08`
     * @return a UsersPostRequestBodyPasswordHasher
     */
    @jakarta.annotation.Nullable
    public UsersPostRequestBodyPasswordHasher getPasswordHasher() {
        return this.passwordHasher;
    }
    /**
     * Gets the phone_number property value. Phone numbers to add to the user.Must be unique across your instance.The first phone number will be set as the user's primary phone number.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getPhoneNumber() {
        return this.phoneNumber;
    }
    /**
     * Gets the private_metadata property value. Metadata saved on the user, that is only visible to your Backend API
     * @return a UsersPostRequestBodyPrivateMetadata
     */
    @jakarta.annotation.Nullable
    public UsersPostRequestBodyPrivateMetadata getPrivateMetadata() {
        return this.privateMetadata;
    }
    /**
     * Gets the public_metadata property value. Metadata saved on the user, that is visible to both your Frontend and Backend APIs
     * @return a UsersPostRequestBodyPublicMetadata
     */
    @jakarta.annotation.Nullable
    public UsersPostRequestBodyPublicMetadata getPublicMetadata() {
        return this.publicMetadata;
    }
    /**
     * Gets the skip_password_checks property value. When set to `true` all password checks are skipped.It is recommended to use this method only when migrating plaintext passwords to Clerk.Upon migration the user base should be prompted to pick stronger password.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSkipPasswordChecks() {
        return this.skipPasswordChecks;
    }
    /**
     * Gets the skip_password_requirement property value. When set to `true`, `password` is not required anymore when creating the user and can be omitted.This is useful when you are trying to create a user that doesn't have a password, in an instance that is using passwords.Please note that you cannot use this flag if password is the only way for a user to sign into your instance.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getSkipPasswordRequirement() {
        return this.skipPasswordRequirement;
    }
    /**
     * Gets the totp_secret property value. In case TOTP is configured on the instance, you can provide the secret to enable it on the newly created user without the need to reset it.Please note that currently the supported options are:* Period: 30 seconds* Code length: 6 digits* Algorithm: SHA1
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getTotpSecret() {
        return this.totpSecret;
    }
    /**
     * Gets the unsafe_metadata property value. Metadata saved on the user, that can be updated from both the Frontend and Backend APIs.Note: Since this data can be modified from the frontend, it is not guaranteed to be safe.
     * @return a UsersPostRequestBodyUnsafeMetadata
     */
    @jakarta.annotation.Nullable
    public UsersPostRequestBodyUnsafeMetadata getUnsafeMetadata() {
        return this.unsafeMetadata;
    }
    /**
     * Gets the username property value. The username to give to the user.It must be unique across your instance.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUsername() {
        return this.username;
    }
    /**
     * Gets the web3_wallet property value. Web3 wallets to add to the user.Must be unique across your instance.The first wallet will be set as the user's primary wallet.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getWeb3Wallet() {
        return this.web3Wallet;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfPrimitiveValues("backup_codes", this.getBackupCodes());
        writer.writeStringValue("created_at", this.getCreatedAt());
        writer.writeCollectionOfPrimitiveValues("email_address", this.getEmailAddress());
        writer.writeStringValue("external_id", this.getExternalId());
        writer.writeStringValue("first_name", this.getFirstName());
        writer.writeStringValue("last_name", this.getLastName());
        writer.writeStringValue("password", this.getPassword());
        writer.writeStringValue("password_digest", this.getPasswordDigest());
        writer.writeEnumValue("password_hasher", this.getPasswordHasher());
        writer.writeCollectionOfPrimitiveValues("phone_number", this.getPhoneNumber());
        writer.writeObjectValue("private_metadata", this.getPrivateMetadata());
        writer.writeObjectValue("public_metadata", this.getPublicMetadata());
        writer.writeBooleanValue("skip_password_checks", this.getSkipPasswordChecks());
        writer.writeBooleanValue("skip_password_requirement", this.getSkipPasswordRequirement());
        writer.writeStringValue("totp_secret", this.getTotpSecret());
        writer.writeObjectValue("unsafe_metadata", this.getUnsafeMetadata());
        writer.writeStringValue("username", this.getUsername());
        writer.writeCollectionOfPrimitiveValues("web3_wallet", this.getWeb3Wallet());
    }
    /**
     * Sets the backup_codes property value. If Backup Codes are configured on the instance, you can provide them to enable it on the newly created user without the need to reset them.You must provide the backup codes in plain format or the corresponding bcrypt digest.
     * @param value Value to set for the backup_codes property.
     */
    public void setBackupCodes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backupCodes = value;
    }
    /**
     * Sets the created_at property value. A custom date/time denoting _when_ the user signed up to the application, specified in RFC3339 format (e.g. `2012-10-20T07:15:20.902Z`).
     * @param value Value to set for the created_at property.
     */
    public void setCreatedAt(@jakarta.annotation.Nullable final String value) {
        this.createdAt = value;
    }
    /**
     * Sets the email_address property value. Email addresses to add to the user.Must be unique across your instance.The first email address will be set as the user's primary email address.
     * @param value Value to set for the email_address property.
     */
    public void setEmailAddress(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.emailAddress = value;
    }
    /**
     * Sets the external_id property value. The ID of the user as used in your external systems or your previous authentication solution.Must be unique across your instance.
     * @param value Value to set for the external_id property.
     */
    public void setExternalId(@jakarta.annotation.Nullable final String value) {
        this.externalId = value;
    }
    /**
     * Sets the first_name property value. The first name to assign to the user
     * @param value Value to set for the first_name property.
     */
    public void setFirstName(@jakarta.annotation.Nullable final String value) {
        this.firstName = value;
    }
    /**
     * Sets the last_name property value. The last name to assign to the user
     * @param value Value to set for the last_name property.
     */
    public void setLastName(@jakarta.annotation.Nullable final String value) {
        this.lastName = value;
    }
    /**
     * Sets the password property value. The plaintext password to give the user.Must be at least 8 characters long, and can not be in any list of hacked passwords.
     * @param value Value to set for the password property.
     */
    public void setPassword(@jakarta.annotation.Nullable final String value) {
        this.password = value;
    }
    /**
     * Sets the password_digest property value. In case you already have the password digests and not the passwords, you can use them for the newly created user via this property.The digests should be generated with one of the supported algorithms.The hashing algorithm can be specified using the `password_hasher` property.
     * @param value Value to set for the password_digest property.
     */
    public void setPasswordDigest(@jakarta.annotation.Nullable final String value) {
        this.passwordDigest = value;
    }
    /**
     * Sets the password_hasher property value. The hashing algorithm that was used to generate the password digest.The algorithms we support at the moment are [bcrypt](https://en.wikipedia.org/wiki/Bcrypt), [bcrypt_sha256_django](https://docs.djangoproject.com/en/4.0/topics/auth/passwords/),[md5](https://en.wikipedia.org/wiki/MD5), pbkdf2_sha256, [pbkdf2_sha256_django](https://docs.djangoproject.com/en/4.0/topics/auth/passwords/),[phpass](https://www.openwall.com/phpass/), [scrypt_firebase](https://firebaseopensource.com/projects/firebase/scrypt/),[sha256](https://en.wikipedia.org/wiki/SHA-2)and the [argon2](https://argon2.online/) variants argon2i and argon2id.If you need support for any particular hashing algorithm, [please let us know](https://clerk.com/support).Note: for password hashers considered insecure (at this moment MD5 and SHA256), the corresponding user password hashes will be transparently migrated to Bcrypt (a secure hasher) upon the user's first successful password sign in.Insecure schemes are marked with `(insecure)` in the list below.Each of the supported hashers expects the incoming digest to be in a particular format. Specifically:**bcrypt:** The digest should be of the following form:`$<algorithm version>$<cost>$<salt & hash>`**bcrypt_sha256_django:** This is the Django-specific variant of Bcrypt, using SHA256 hashing function. The format should be as follows (as exported from Django):`bcrypt_sha256$$<algorithm version>$<cost>$<salt & hash>`**md5** (insecure): The digest should follow the regular form e.g.:`5f4dcc3b5aa765d61d8327deb882cf99`**pbkdf2_sha256:** This is the PBKDF2 algorithm using the SHA256 hashing function. The format should be as follows:`pbkdf2_sha256$<iterations>$<salt>$<hash>`Note: Both the salt and the hash are expected to be base64-encoded.**pbkdf2_sha256_django:** This is the Django-specific variant of PBKDF2 and the digest should have the following format (as exported from Django):`pbkdf2_sha256$<iterations>$<salt>$<hash>`Note: The salt is expected to be un-encoded, the hash is expected base64-encoded.**pbkdf2_sha1:** This is similar to pkbdf2_sha256_django, but with two differences:1. uses sha1 instead of sha2562. accepts the hash as a hex-encoded stringThe format is the following:`pbkdf2_sha1$<iterations>$<salt>$<hash-as-hex-string>`**phpass:** Portable public domain password hashing framework for use in PHP applications. Digests hashed with phpass have the following sections:The format is the following:`$P$<rounds><salt><encoded-checksum>`- $P$ is the prefix used to identify phpass hashes.- rounds is a single character encoding a 6-bit integer representing the number of rounds used.- salt is eight characters drawn from [./0-9A-Za-z], providing a 48-bit salt.- checksum is 22 characters drawn from the same set, encoding the 128-bit checksum with MD5.**scrypt_firebase:** The Firebase-specific variant of scrypt.The value is expected to have 6 segments separated by the $ character and include the following information:_hash:_ The actual Base64 hash. This can be retrieved when exporting the user from Firebase._salt:_ The salt used to generate the above hash. Again, this is given when exporting the user._signer key:_ The base64 encoded signer key._salt separator:_ The base64 encoded salt separator._rounds:_ The number of rounds the algorithm needs to run._memory cost:_ The cost of the algorithm runThe first 2 (hash and salt) are per user and can be retrieved when exporting the user from Firebase.The other 4 values (signer key, salt separator, rounds and memory cost) are project-wide settings and can be retrieved from the project's password hash parameters.Once you have all these, you can combine it in the following format and send this as the digest in order for Clerk to accept it:`<hash>$<salt>$<signer key>$<salt separator>$<rounds>$<memory cost>`**argon2i:** Algorithms in the argon2 family generate digests that encode the following information:_version (v):_ The argon version, version 19 is assumed_memory (m):_ The memory used by the algorithm (in kibibytes)_iterations (t):_ The number of iterations to perform_parallelism (p):_ The number of threads to useParts are demarcated by the `$` character, with the first part identifying the algorithm variant.The middle part is a comma-separated list of the encoding options (memory, iterations, parallelism).The final part is the actual digest.`$argon2i$v=19$m=4096,t=3,p=1$4t6CL3P7YiHBtwESXawI8Hm20zJj4cs7/4/G3c187e0$m7RQFczcKr5bIR0IIxbpO2P0tyrLjf3eUW3M3QSwnLc`**argon2id:** See the previous algorithm for an explanation of the formatting.For the argon2id case, the value of the algorithm in the first part of the digest is `argon2id`:`$argon2id$v=19$m=64,t=4,p=8$Z2liZXJyaXNo$iGXEpMBTDYQ8G/71tF0qGjxRHEmR3gpGULcE93zUJVU`**sha256** (insecure): The digest should be a 64-length hex string, e.g.:`9f86d081884c7d659a2feaa0c55ad015a3bf4f1b2b0b822cd15d6c15b0f00a08`
     * @param value Value to set for the password_hasher property.
     */
    public void setPasswordHasher(@jakarta.annotation.Nullable final UsersPostRequestBodyPasswordHasher value) {
        this.passwordHasher = value;
    }
    /**
     * Sets the phone_number property value. Phone numbers to add to the user.Must be unique across your instance.The first phone number will be set as the user's primary phone number.
     * @param value Value to set for the phone_number property.
     */
    public void setPhoneNumber(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.phoneNumber = value;
    }
    /**
     * Sets the private_metadata property value. Metadata saved on the user, that is only visible to your Backend API
     * @param value Value to set for the private_metadata property.
     */
    public void setPrivateMetadata(@jakarta.annotation.Nullable final UsersPostRequestBodyPrivateMetadata value) {
        this.privateMetadata = value;
    }
    /**
     * Sets the public_metadata property value. Metadata saved on the user, that is visible to both your Frontend and Backend APIs
     * @param value Value to set for the public_metadata property.
     */
    public void setPublicMetadata(@jakarta.annotation.Nullable final UsersPostRequestBodyPublicMetadata value) {
        this.publicMetadata = value;
    }
    /**
     * Sets the skip_password_checks property value. When set to `true` all password checks are skipped.It is recommended to use this method only when migrating plaintext passwords to Clerk.Upon migration the user base should be prompted to pick stronger password.
     * @param value Value to set for the skip_password_checks property.
     */
    public void setSkipPasswordChecks(@jakarta.annotation.Nullable final Boolean value) {
        this.skipPasswordChecks = value;
    }
    /**
     * Sets the skip_password_requirement property value. When set to `true`, `password` is not required anymore when creating the user and can be omitted.This is useful when you are trying to create a user that doesn't have a password, in an instance that is using passwords.Please note that you cannot use this flag if password is the only way for a user to sign into your instance.
     * @param value Value to set for the skip_password_requirement property.
     */
    public void setSkipPasswordRequirement(@jakarta.annotation.Nullable final Boolean value) {
        this.skipPasswordRequirement = value;
    }
    /**
     * Sets the totp_secret property value. In case TOTP is configured on the instance, you can provide the secret to enable it on the newly created user without the need to reset it.Please note that currently the supported options are:* Period: 30 seconds* Code length: 6 digits* Algorithm: SHA1
     * @param value Value to set for the totp_secret property.
     */
    public void setTotpSecret(@jakarta.annotation.Nullable final String value) {
        this.totpSecret = value;
    }
    /**
     * Sets the unsafe_metadata property value. Metadata saved on the user, that can be updated from both the Frontend and Backend APIs.Note: Since this data can be modified from the frontend, it is not guaranteed to be safe.
     * @param value Value to set for the unsafe_metadata property.
     */
    public void setUnsafeMetadata(@jakarta.annotation.Nullable final UsersPostRequestBodyUnsafeMetadata value) {
        this.unsafeMetadata = value;
    }
    /**
     * Sets the username property value. The username to give to the user.It must be unique across your instance.
     * @param value Value to set for the username property.
     */
    public void setUsername(@jakarta.annotation.Nullable final String value) {
        this.username = value;
    }
    /**
     * Sets the web3_wallet property value. Web3 wallets to add to the user.Must be unique across your instance.The first wallet will be set as the user's primary wallet.
     * @param value Value to set for the web3_wallet property.
     */
    public void setWeb3Wallet(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.web3Wallet = value;
    }
}
