package com.noveogroup.device

/**
 * This interface represents a Device for sorting algorithms.
 */
interface Device : Comparable<Device> {
    val price: Int
}
