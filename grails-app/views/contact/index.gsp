<%@ page import="com.mywebsite.daniel.Contact" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="simple">
		<g:set var="entityName" value="${message(code: 'contactMe.label', default: 'Daniel Adenew\'s Website | Contact Me')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
		<script src="AC_RunActiveContent.js" language="javascript"></script>
		<r:layoutResources/>	
	</head>
	<body class="image-sphere-style responsive">
       

                <!-- START MAP -->
                <div class="header-map hide-if-no-js">
                    <script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?sensor=true"></script>
                    <script type="text/javascript">
                        jQuery(document).ready(function ($) {
                            var position = new google.maps.LatLng(9.012152,38.763567); // <-- Edit here with the latitude and longitude of your map
                            var settings = {
                              zoom: 13,
                              center: position,
                              mapTypeControl: true,
                              mapTypeControlOptions: {style: google.maps.MapTypeControlStyle.DROPDOWN_MENU},
                              navigationControl: true,
                              navigationControlOptions: {style: google.maps.NavigationControlStyle.SMALL},
                              mapTypeId: google.maps.MapTypeId.ROADMAP                    };
                            var map = new google.maps.Map(document.getElementById("map"), settings);
                            
                            var marker = new google.maps.Marker({
                                    position: position,
                                    map: map
                            });
                        });
                        
                         var header_map = {"tab_open":"View map","tab_close":"Close map"};
                    </script>
                    <div id="map">
                        <div id="map"></div>
                    </div>
                    <div id="ds-h" class="shadow">
                        <div class="ds h1 o1"></div>
                        <div class="ds h2 o2"></div>
                        <div class="ds h3 o3"></div>
                        <div class="ds h4 o4"></div>
                        <div class="ds h5 o5"></div>
                    </div>
                    <a href="#" class="tab-label closed">View Map</a>
                </div>    
                <!-- END MAP -->
        
                <!-- START CONTENT -->
                <div id="content" class="layout-sidebar-right group">
                
                    <!-- START PRIMARY -->
                    <div id="primary" class="hentry group wrapper-content" role="main">
                    
                        <h2>Contact</h2>
                    
                        <form class="contact-form" method="post" action="sendmail.php" enctype="multipart/form-data">

                            <!-- The feedback message is here -->
                        	<div class="usermessagea"></div>
                        	
                        	<fieldset>
                        
                        		<ul>
                        
                                    <!-- NAME FIELD -->
                        			<li class="text-field">
                        				<label for="name-main">
                        					<span class="label">What's your <span class="highlight-text">name</span>?</span>
                        				</label>
                        				
                        				<input type="text" name="name" id="name-form" class="required" value="" />                   
                        				<div class="msg-error"></div>
                        			</li>            
                                    <!-- END NAME FIELD -->
                                    
                                    <!-- EMAIL FIELD -->
                        			<li class="text-field">
                        				<label for="email-main">
                        					<span class="label">What's your <span class="highlight-text">e-mail</span>?</span> 
                        				</label>
                        
                        				<input type="text" name="email" id="email-form" class="required email-validate" value="" />
                        				<div class="msg-error"></div>
                        			</li>   
                                    <!-- END EMAIL FIELD -->
                                    
                                    <!-- MESSAGE FIELD -->
                        			<li class="textarea-field">
                        				<label for="message-main">
                        					<span class="label">How can I <span class="highlight-text">help</span> you?</span>
                        				</label>
                        				
                        				<textarea name="message" id="message-form" rows="8" cols="30" class="required"></textarea>
                        				<div class="msg-error"></div>
                        			</li>      
                                    <!-- END MESSAGE FIELD -->
                                    
                                    <!-- SUBMIT FIELD -->
                        			<li class="submit-button">
                        				<input type="hidden" name="action" value="sendmail" id="action" />
                        				<input type="submit" name="sendmail" value="send message" class="sendmail alignleft" />			
                                    </li>
                        		</ul>
                        
                        	</fieldset>
                        </form>
                        
                        <script type="text/javascript">
                            // specif here the message for each field of contact form, by ID of field
                        	var error_messages = {
                        		name: "It's required a valid name.",
                        		email: "Write a valid email.",
                        		message: "Insert the message."
                        	};
                        </script>
                        
                    </div>
                    <!-- END CONTENT -->
                    
                    <!-- START SIDEBAR -->
                    <div id="sidebar" class="group">
                    
                        <div class="widget-first widget text-image">
                            <h3>Customer support</h3>
                            <div class="text-image" style="text-align:left"><img src="images/callus3.gif" alt="Customer support" /></div>
                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing blandit enim libero,</p>
                        </div>
                        
                        <div class="widget-last widget text-image">
                            <div class="text-image" style="text-align:left"><img src="images/arsk9hjn11.jpg" alt="" /></div>
                        </div>
                        
                    </div>
                    <!-- END SIDEBAR -->     
                    
                </div>
                <!-- END CONTENT -->
       
		</body>
		</html>