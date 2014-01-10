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
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'NAME':("ROBOTS"),'CONTENT':("INDEX, FOLLOW")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',11,['default':("Grails")],-1)
})
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("description"),'content':("""This is Daniel Adenew Website.
		Daniel Adenew is a software engineer ,programmer and web developer specializing in JAVA,C#,ASP.NET MVC,.NET,PHP,VB6,Python and NLP, Grails and Groovy Technology. """)],-1)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("content-type"),'content':("text/html;charset=UTF-8")],-1)
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'style.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'css', file: 'lessthen800.css'))
printHtmlPart(6)
expressionOut.print(resource(dir: 'css', file: 'lessthen600.css'))
printHtmlPart(7)
expressionOut.print(resource(dir: 'css', file: 'lessthen480.css'))
printHtmlPart(8)
expressionOut.print(resource(dir: 'images', file: 'favicon1.ico'))
printHtmlPart(9)
expressionOut.print(resource(dir: 'images', file: 'favicon1.ico'))
printHtmlPart(10)
expressionOut.print(resource(dir: 'css', file: 'custom-style.css'))
printHtmlPart(11)
expressionOut.print(resource(dir: 'css', file: 'prettyPhoto.css'))
printHtmlPart(12)
expressionOut.print(resource(dir: 'css', file: 'tipsy.css'))
printHtmlPart(13)
expressionOut.print(resource(dir: 'css', file: 'slider-nivo.css'))
printHtmlPart(14)
expressionOut.print(resource(dir: 'css', file: 'slider-nivo.css'))
printHtmlPart(14)
expressionOut.print(resource(dir: 'css', file: 'slider-nivo.css'))
printHtmlPart(14)
expressionOut.print(resource(dir: 'css', file: 'slider-elastic.css'))
printHtmlPart(14)
expressionOut.print(resource(dir: 'css', file: 'slider-cycle.css'))
printHtmlPart(15)
expressionOut.print(resource(dir: 'css', file: 'slider-thumbnails.css'))
printHtmlPart(14)
expressionOut.print(resource(dir: 'css', file: 'slider-elegant.css'))
printHtmlPart(14)
expressionOut.print(resource(dir: 'css', file: 'slider-nivo.css'))
printHtmlPart(16)
invokeTag('layoutHead','g',51,[:],-1)
printHtmlPart(2)
invokeTag('javascript','g',52,['library':("simple")],-1)
printHtmlPart(17)
invokeTag('layoutResources','r',53,[:],-1)
printHtmlPart(18)
})
invokeTag('captureHead','sitemesh',54,[:],1)
printHtmlPart(18)
createTagBody(1, {->
printHtmlPart(19)
expressionOut.print(resource(dir: 'images', file: 'logo.png'))
printHtmlPart(20)
createClosureForHtmlPart(21, 2)
invokeTag('link','g',145,['controller':("contact")],2)
printHtmlPart(22)
invokeTag('layoutBody','g',152,[:],-1)
printHtmlPart(2)
invokeTag('layoutResources','r',153,[:],-1)
printHtmlPart(23)
expressionOut.print(resource(dir: 'js', file: 'AC_RunActiveContent.js'))
printHtmlPart(24)
expressionOut.print(resource(file: 'tagClouds763641a7e0b8eb21ad08e0db31d8cf621389268140.xml'))
printHtmlPart(25)
})
invokeTag('captureBody','sitemesh',304,['class':("home image-sphere-style responsive")],1)
printHtmlPart(26)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1389365833850L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
