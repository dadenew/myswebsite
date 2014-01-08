import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_mywebiste_layoutssimple_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/simple.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',10,['default':("Grails")],-1)
})
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
expressionOut.print(resource(dir: 'css', file: 'style.css'))
printHtmlPart(3)
expressionOut.print(resource(dir: 'css', file: 'lessthen800.css'))
printHtmlPart(4)
expressionOut.print(resource(dir: 'css', file: 'lessthen600.css'))
printHtmlPart(5)
expressionOut.print(resource(dir: 'css', file: 'lessthen480.css'))
printHtmlPart(6)
expressionOut.print(resource(dir: 'images', file: 'favicon.ico'))
printHtmlPart(7)
expressionOut.print(resource(dir: 'images', file: 'favicon.ico'))
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
printHtmlPart(12)
expressionOut.print(resource(dir: 'css', file: 'slider-cycle.css'))
printHtmlPart(13)
expressionOut.print(resource(dir: 'css', file: 'slider-thumbnails.css'))
printHtmlPart(12)
expressionOut.print(resource(dir: 'css', file: 'slider-elegant.css'))
printHtmlPart(12)
expressionOut.print(resource(dir: 'css', file: 'slider-nivo.css'))
printHtmlPart(14)
invokeTag('layoutHead','g',48,[:],-1)
printHtmlPart(1)
invokeTag('javascript','g',49,['library':("simple")],-1)
printHtmlPart(15)
invokeTag('layoutResources','r',50,[:],-1)
printHtmlPart(16)
})
invokeTag('captureHead','sitemesh',51,[:],1)
printHtmlPart(16)
createTagBody(1, {->
printHtmlPart(17)
invokeTag('layoutBody','g',56,[:],-1)
printHtmlPart(1)
invokeTag('layoutResources','r',57,[:],-1)
printHtmlPart(18)
})
invokeTag('captureBody','sitemesh',154,['class':("home image-sphere-style responsive")],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1389199684785L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
