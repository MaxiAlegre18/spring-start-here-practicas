package com.aprendizaje.spring.cap5.ex4_prototypeScopedBeanWithStereotype;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

/*
 * Le indicamos a Spring que cada vez que se requiera un Bean de tipo CommentRepository, se cree uno nuevo y no se utilice
 * uno ya existente del context.
 */
@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentRepository {

}
