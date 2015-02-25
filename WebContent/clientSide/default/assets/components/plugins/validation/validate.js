/* <script type="text/javascript"> */
$(document)
		.ready(
				function() {
					// Generate a simple captcha
					/*
					 * function randomNumber(min, max) { return
					 * Math.floor(Math.random() * (max - min + 1) + min); };
					 */
					/*
					 * $('#captchaOperation').html([randomNumber(1, 100), '+',
					 * randomNumber(1, 200), '='].join(' '));
					 */

					$('#defaultForm')
							.bootstrapValidator(
									{
										message : 'This value is not valid',
										fields : {

											email : {
												validators : {
													notEmpty : {
														message : 'The email address is required and can\'t be empty'
													},
													emailAddress : {
														message : 'The input is not a valid email address'
													}
												}
											},
											password : {
												validators : {
													notEmpty : {
														message : 'The password is required and can\'t be empty'
													},
													identical : {
														field : 'confirmPassword',
														message : 'The password and its confirm are not the same'
													},
													different : {
														field : 'username',
														message : 'The password can\'t be the same as username'
													}
												}
											},

										}
									});
				});
/* </script> */