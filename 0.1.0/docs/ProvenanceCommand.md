
# ProvenanceCommand

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Required. Name of the command, as presented on the command line, or if the command is packaged as a Docker container, as presented to &#x60;docker pull&#x60;. |  [optional]
**env** | **List&lt;String&gt;** | Environment variables set before running this command. |  [optional]
**args** | **List&lt;String&gt;** | Command-line arguments used when executing this command. |  [optional]
**dir** | **String** | Working directory (relative to project source root) used when running this command. |  [optional]
**id** | **String** | Optional unique identifier for this command, used in wait_for to reference this command as a dependency. |  [optional]
**waitFor** | **List&lt;String&gt;** | The ID(s) of the command(s) that this command depends on. |  [optional]



