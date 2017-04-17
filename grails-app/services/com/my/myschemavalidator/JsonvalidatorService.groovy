package com.my.myschemavalidator


class JsonvalidatorService {

    def validate(instance, schema) {
        def validator = new Jsonvalidator()
        validator.validate(instance, schema)
    }
}
