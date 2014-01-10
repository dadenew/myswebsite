package com.mywebsite.daniel

import org.springframework.beans.factory.annotation.Required;

class Contact {
     
	String fullname
	String email
	String subject
	String message
	static mapping = {
		//message type:'textarea'
	}
    static constraints = {
		
		email email:true,blank:false
		fullname nullable:false,blank:false,size:4..30
		subject nullable:true
		message blank:false,nullable:false,size:2..250
    }
}
