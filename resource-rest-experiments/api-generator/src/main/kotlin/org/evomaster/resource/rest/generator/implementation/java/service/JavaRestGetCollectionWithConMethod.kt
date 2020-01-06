package org.evomaster.resource.rest.generator.implementation.java.service

import org.evomaster.resource.rest.generator.implementation.java.SpringAnnotation
import org.evomaster.resource.rest.generator.model.RestMethod
import org.evomaster.resource.rest.generator.model.ServiceClazz

/**
 * created by manzh on 2019-08-15
 */
class JavaRestGetCollectionWithConMethod(specification: ServiceClazz, method : RestMethod) : JavaRestMethod(specification, method){


    override fun getReturn(): String? = "ResponseEntity<List<${specification.dto.name}>>"

    override fun getTags(): List<String> = listOf(
            "@${SpringAnnotation.REQUEST_MAPPING.getText(mapOf("value" to "${specification.pathWithId}", "method" to "RequestMethod.GET", "produces" to "MediaType.APPLICATION_JSON"))}"
    )
}