package com.pythonmeister.ognom.repositories.entities

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection = "person")
class Person {
    @Id var id: ObjectId? = null
    @Field var name: String? = null
}