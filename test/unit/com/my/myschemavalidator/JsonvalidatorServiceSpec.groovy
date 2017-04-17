package com.my.myschemavalidator

import grails.test.mixin.TestFor
import groovy.json.JsonSlurper
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
class JsonvalidatorServiceSpec extends Specification {
    def transactional = false
    def JsonvalidatorService


    def setup() {
    }

    def cleanup() {
    }

    void testValidate() {
        def schema = "{'type':'object','required':true,'properties':{'id':{'type':'integer'},'library_name':{'type':'string','required':true},'bookList':{'type':'array','items':{'type':'object','required':true,'properties':{'id':{'type':'integer'},'title':{'type':'string','required':true},'subTitle':{'type':'string'},'author':{'type':'string','required':true},'pageNum':{'type':'integer'},'release_date':{'type':'string','required':true}}}}}}"
        def data = "{'library_name':'SSu','bookList':[{'title':'Gokul1','subTitle':'Suyambu1','author':'Lingam1','pageNum':121,'release_date':'2016-06-22','id':1}]}"
        def jsonSlurper = new JsonSlurper()

        assertEquals JsonvalidatorService.validate(jsonSlurper.parseText(data), jsonSlurper.parseText(schema)), []
    }
}
