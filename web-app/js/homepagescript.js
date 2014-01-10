 $(document).ready(function($){   
    alert('Welcome , Thankyou for Visting my Page!');
     var 	slider_nivo_fx = 'random',
             slider_nivo_speed = 500,
             slider_nivo_timeout = 5000,
             slider_nivo_directionNav = true,
             slider_nivo_directionNavHide = true,
             slider_nivo_controlNav = false; 
     // end editing    
     
     $('#slider.nivo').nivoSlider({
         effect           : slider_nivo_fx,
         animSpeed        : slider_nivo_speed,
         pauseTime        : slider_nivo_timeout,
         directionNav     : slider_nivo_directionNav,
         directionNavHide : slider_nivo_directionNavHide,
         controlNav       : slider_nivo_controlNav
     });
});   