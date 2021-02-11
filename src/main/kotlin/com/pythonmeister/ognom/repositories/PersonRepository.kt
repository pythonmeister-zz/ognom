package com.pythonmeister.ognom.repositories

import com.pythonmeister.ognom.repositories.entities.Person
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "persons")
interface PersonRepository : MongoRepository<Person, ObjectId> {
    fun findByName(@Param("name") name: String): List<Person>
}