function sendOTP(){
    const email=document.getElementById('email');
    const otpverify=document.getElementByIdClassName('otpverify')[0];

    let otp_val = Math.floor(Math.random() * 10000);

    let emailbody = `<h2> Your OTP is </h2>${otp_val}`;
    Email.send({
    SecureToken : "a5b4eec7-beb6-454a-b0a1-f80a30b556fc",
    To : email.value,
    From : "madhurgupta492006@gmail.com",
    Subject : "Email OTP using JavaScript",
    Body : emailbody ,
}).then(
      
        message => {
            if(message === "OK"){
               alert("OTP sent to your email"+ email.value);

               otpverify.style.display = "flex";
               const otp_inp = document.getElementById('otp_inp');
               const otp_btn = document.getElementById('otp-btn');

               otp_btn.addEventListener('click', () =>{
                   if(otp_inp.value == otp_val){
                      alert("Email Address Verified...");
                    }
                   else{
                    alert("Invalid OTP");
                    }
                })

            } 
        }
 );

}