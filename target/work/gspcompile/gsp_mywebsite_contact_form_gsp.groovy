import com.mywebsite.daniel.Contact
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_mywebsite_contact_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/contact/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: contactInstance, field: 'email', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("contact.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['type':("email"),'name':("email"),'required':(""),'value':(contactInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: contactInstance, field: 'fullname', 'error'))
printHtmlPart(4)
invokeTag('message','g',15,['code':("contact.fullname.label"),'default':("Fullname")],-1)
printHtmlPart(2)
invokeTag('textField','g',18,['name':("fullname"),'maxlength':("30"),'required':(""),'value':(contactInstance?.fullname)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: contactInstance, field: 'subject', 'error'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("contact.subject.label"),'default':("Subject")],-1)
printHtmlPart(6)
invokeTag('textField','g',26,['name':("subject"),'value':(contactInstance?.subject)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: contactInstance, field: 'message', 'error'))
printHtmlPart(7)
invokeTag('message','g',31,['code':("contact.message.label"),'default':("Message")],-1)
printHtmlPart(2)
invokeTag('textField','g',34,['name':("message"),'required':(""),'value':(contactInstance?.message)],-1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1389337465851L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
