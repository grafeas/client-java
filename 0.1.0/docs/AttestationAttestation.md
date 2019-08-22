
# AttestationAttestation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pgpSignedAttestation** | [**AttestationPgpSignedAttestation**](AttestationPgpSignedAttestation.md) | A PGP signed attestation. |  [optional]
**genericSignedAttestation** | [**AttestationGenericSignedAttestation**](AttestationGenericSignedAttestation.md) | An attestation that supports multiple &#x60;Signature&#x60;s over the same attestation payload. The signatures (defined in common.proto) support a superset of public key types and IDs compared to PgpSignedAttestation. |  [optional]



