package com.cs388group6.packer

import java.io.Serializable
class Item (
    var name: String? = null,
    var weight: String? = null,
    var image: String? = null,
    var category: String? = null,
    var userID: String? = null,
    var itemID: String? = null
) : Serializable