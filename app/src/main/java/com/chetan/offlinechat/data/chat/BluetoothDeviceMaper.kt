package com.chetan.offlinechat.data.chat

import android.annotation.SuppressLint
import android.bluetooth.BluetoothDevice
import com.chetan.offlinechat.domain.chat.BluetoothDeviceDomain

@SuppressLint("MissingPermission")
fun BluetoothDevice.toBluetoothDeviceDomain(): BluetoothDeviceDomain {
    return BluetoothDeviceDomain(
        name = name,
        address = address
    )
}