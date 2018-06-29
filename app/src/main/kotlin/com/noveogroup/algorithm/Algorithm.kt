package com.noveogroup.algorithm

import com.noveogroup.device.Device

/**
 * This interface represents sorting algorithm.
 */
interface Algorithm {

    /**
     * Sorts `devices` by price.
     * @param devices array of devices.
     * @param ascendingSort true for ascending sort, false for descending sort.
     */
    fun sort(devices: Array<Device>, ascendingSort: Boolean)
}
