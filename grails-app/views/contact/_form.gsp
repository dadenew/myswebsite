<%@ page import="com.mywebsite.daniel.Contact" %>



<div class="fieldcontain ${hasErrors(bean: contactInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="contact.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="email" name="email" required="" value="${contactInstance?.email}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: contactInstance, field: 'fullname', 'error')} required">
	<label for="fullname">
		<g:message code="contact.fullname.label" default="Fullname" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="fullname" maxlength="30" required="" value="${contactInstance?.fullname}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: contactInstance, field: 'subject', 'error')} ">
	<label for="subject">
		<g:message code="contact.subject.label" default="Subject" />
		
	</label>
	<g:textField name="subject" value="${contactInstance?.subject}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: contactInstance, field: 'message', 'error')} required">
	<label for="message">
		<g:message code="contact.message.label" default="Message" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="message" required="" value="${contactInstance?.message}"/>
</div>

