




function submitAction(url){
			$('form').attr('action', url);

			$('form').submit();
		}



$(document).ready(function(){
    $('.slider').bxSlider({
     auto: true,
     speed:2000
    });
  });


//    $(document).ready(function(){
//      $('.slider').bxSlider({
//       auto: ture,
//       mode: "fade",
//       speed: 1000
//      });
//    });