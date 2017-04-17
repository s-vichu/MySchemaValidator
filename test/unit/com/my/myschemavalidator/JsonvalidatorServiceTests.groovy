/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.my.myschemavalidator

import groovy.json.JsonSlurper

/**
 *
 * @author viswanathansrinivasan
 */
class JsonvalidatorServiceTests extends GroovyTestCase {

    void validateJsonAgainstSchema() {
        def service = new JsonvalidatorService()
        def schema = "{'type':'object','required':true,'properties':{'id':{'type':'integer'},'library_name':{'type':'string','required':true},'bookList':{'type':'array','items':{'type':'object','required':true,'properties':{'id':{'type':'integer'},'title':{'type':'string','required':true},'subTitle':{'type':'string'},'author':{'type':'string','required':true},'pageNum':{'type':'integer'},'release_date':{'type':'string','required':true}}}}}}"
        def data = "{'library_name':'SSu','bookList':[{'title':'Gokul1','subTitle':'Suyambu1','author':'Lingam1','pageNum':121,'release_date':'2016-06-22','id':1}]}"
        def jsonSlurper = new JsonSlurper()

        assertEquals service.validate(jsonSlurper.parseText(data), jsonSlurper.parseText(schema)), []
    }
}

