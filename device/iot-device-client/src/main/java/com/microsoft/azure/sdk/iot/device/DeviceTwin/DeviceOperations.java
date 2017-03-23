// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See LICENSE file in the project root for full license information.

package com.microsoft.azure.sdk.iot.device.DeviceTwin;

public enum DeviceOperations
{
    DEVICE_OPERATION_TWIN_GET_REQUEST,
    DEVICE_OPERATION_TWIN_GET_RESPONSE,
    DEVICE_OPERATION_TWIN_UPDATE_REPORTED_PROPERTIES_REQUEST,
    DEVICE_OPERATION_TWIN_UPDATE_REPORTED_PROPERTIES_RESPONSE,
    DEVICE_OPERATION_TWIN_SUBSCRIBE_DESIRED_PROPERTIES_REQUEST,
    DEVICE_OPERATION_TWIN_SUBSCRIBE_DESIRED_PROPERTIES_RESPONSE,
    DEVICE_OPERATION_METHOD_SUBSCRIBE_REQUEST,
    DEVICE_OPERATION_METHOD_SUBSCRIBE_RESPONSE,
    DEVICE_OPERATION_METHOD_RECEIVE_REQUEST,
    DEVICE_OPERATION_METHOD_SEND_RESPONSE,
    DEVICE_OPERATION_UNKNOWN
}
