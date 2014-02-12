import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_mywebsite_layoutssimple_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/simple.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'NAME':("ROBOTS"),'CONTENT':("INDEX, FOLLOW")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',13,['default':("Grails")],-1)
})
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',16,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("description"),'content':("""This is Daniel Adenew Website.
		Daniel Adenew is a software engineer ,programmer and web developer specializing in JAVA,C#,ASP.NET MVC,.NET,PHP,VB6,Python and NLP, Grails and Groovy Technology. """)],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',17,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("content-type"),'content':("text/html;charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',19,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("keywords"),'content':("Web Design , Web Deeveloper , Web Development, Software Engineer ,AAU, Software Developer , Software Development , Software Engnieer , Ethiopia, Addis Ababa , Java Programmer , Developer , Stackoverflow , linkedin , MVC 3 , ASP.NET , Security Consult , Amharic Syntax Parser , RMI JAVA BANK , Joomla , Free Hosting , Distributed Grails")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',20,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("author"),'content':("Daniel Adenew")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',21,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',22,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
expressionOut.print(resource(dir: 'css', file: 'style.css'))
printHtmlPart(3)
expressionOut.print(resource(dir: 'css', file: 'lessthen800.css'))
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'lessthen600.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'css', file: 'lessthen480.css'))
printHtmlPart(6)
expressionOut.print(resource(dir: 'images', file: 'favicon1.ico'))
printHtmlPart(7)
expressionOut.print(resource(dir: 'images', file: 'favicon1.ico'))
printHtmlPart(8)
expressionOut.print(resource(dir: 'css', file: 'custom-style.css'))
printHtmlPart(9)
expressionOut.print(resource(dir: 'css', file: 'prettyPhoto.css'))
printHtmlPart(10)
expressionOut.print(resource(dir: 'css', file: 'tipsy.css'))
printHtmlPart(11)
expressionOut.print(resource(dir: 'css', file: 'slider-nivo.css'))
printHtmlPart(12)
expressionOut.print(resource(dir: 'css', file: 'slider-nivo.css'))
printHtmlPart(12)
expressionOut.print(resource(dir: 'css', file: 'slider-nivo.css'))
printHtmlPart(12)
expressionOut.print(resource(dir: 'css', file: 'slider-elastic.css'))
printHtmlPart(13)
expressionOut.print(resource(dir: 'css', file: 'slider-cycle.css'))
printHtmlPart(13)
expressionOut.print(resource(dir: 'css', file: 'slider-thumbnails.css'))
printHtmlPart(13)
expressionOut.print(resource(dir: 'css', file: 'slider-elegant.css'))
printHtmlPart(13)
expressionOut.print(resource(dir: 'css', file: 'slider-nivo.css'))
printHtmlPart(14)
invokeTag('layoutHead','g',91,[:],-1)
printHtmlPart(1)
invokeTag('javascript','g',92,['library':("simple")],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',93,[:],-1)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',94,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(15)
expressionOut.print(resource(dir: 'images', file: 'logo.png'))
printHtmlPart(16)
expressionOut.print(createLink(uri:'/'))
printHtmlPart(17)
createClosureForHtmlPart(18, 2)
invokeTag('link','g',153,['controller':("portfolio")],2)
printHtmlPart(19)
createClosureForHtmlPart(20, 2)
invokeTag('link','g',156,['controller':("portfolio")],2)
printHtmlPart(21)
createClosureForHtmlPart(22, 2)
invokeTag('link','g',161,['controller':("people")],2)
printHtmlPart(23)
createClosureForHtmlPart(24, 2)
invokeTag('link','g',163,['controller':("faq")],2)
printHtmlPart(25)
createClosureForHtmlPart(26, 2)
invokeTag('link','g',183,['controller':("contact")],2)
printHtmlPart(27)
invokeTag('layoutBody','g',190,[:],-1)
printHtmlPart(28)
invokeTag('layoutResources','r',191,[:],-1)
printHtmlPart(29)
expressionOut.print(resource(dir: 'js', file: 'AC_RunActiveContent.js'))
printHtmlPart(30)
expressionOut.print(resource(file: 'tagClouds763641a7e0b8eb21ad08e0db31d8cf621389268140.xml'))
printHtmlPart(31)
})
invokeTag('captureBody','sitemesh',392,['class':("home image-sphere-style responsive")],1)
printHtmlPart(32)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1392130729085L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
