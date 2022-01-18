
var communication="";
 function getCommunication()
 {
  communication = document.getElementById("communicaton").value;
  communication=  communication.slice(-1);
  $('#comm').text(communication+"/5");
 // document.getElementById('comm').value=communication;
 }
 
 var BasicOfWebDevelopement="";
 function getBasicOfWebDevelopement(){
	 BasicOfWebDevelopement = document.getElementById("BasicOfWebDevelopement").value;
	 BasicOfWebDevelopement=   BasicOfWebDevelopement.slice(-1);
  $('#bowd').text( BasicOfWebDevelopement+"/5");
 }

 var Oops="";
 function getOops(){
	 Oops = document.getElementById("Oops").value;
	 Oops= Oops.slice(-1);
  $('#oop').text(Oops+"/5");
 
 }
 
 var ProgremmingLanguageFramework="";
 function getProgremmingLanguageFramework(){
	 ProgremmingLanguageFramework = document.getElementById("ProgremmingLanguageFramework").value;
	 ProgremmingLanguageFramework= ProgremmingLanguageFramework.slice(-1);
  $('#prog').text(ProgremmingLanguageFramework+"/5");
 
 }
 
 var VersionControl="";
 function getVersionControl(){
	 VersionControl= document.getElementById("VersionControl").value;
	 VersionControl=VersionControl.slice(-1);
  $('#ver').text(VersionControl+"/5");
 
 }
 
 var Database="";
 function getDatabase(){
	 Database= document.getElementById("Database").value;
	 Database= Database.slice(-1);
  $('#data').text(Database+"/5");
 
 }
 
 
 function myFunction() {
	  var communicaton = document.getElementsByName('communicaton')[0].value;
	  var BasicOfWebDevelopement = document.getElementsByName('BasicOfWebDevelopement')[0].value;
	  var Oops = document.getElementsByName('Oops')[0].value;
	  var ProgremmingLanguageFramework = document.getElementsByName('ProgremmingLanguageFramework')[0].value;
	  var Database = document.getElementsByName('Database')[0].value;
	  var VersionControl = document.getElementsByName('VersionControl')[0].value;
	  var add=(communicaton.slice(-1)/5)+(BasicOfWebDevelopement.slice(-1)/5)+(Oops.slice(-1)/5)+(ProgremmingLanguageFramework.slice(-1)/5)+(Database.slice(-1)/5)+(VersionControl.slice(-1)/5)
	 // alert(add)
	  $('#result').text(add);
	}
 
 
 function myCopy() {
	 
	 var communicaton = document.getElementsByName('communicaton')[0].value;
	  var BasicOfWebDevelopement = document.getElementsByName('BasicOfWebDevelopement')[0].value;
	  var Oops = document.getElementsByName('Oops')[0].value;
	  var ProgremmingLanguageFramework = document.getElementsByName('ProgremmingLanguageFramework')[0].value;
	  var Database = document.getElementsByName('Database')[0].value;
	  var VersionControl = document.getElementsByName('VersionControl')[0].value;
	  var add=(communicaton.slice(-1)/5)+(BasicOfWebDevelopement.slice(-1)/5)+(Oops.slice(-1)/5)+(ProgremmingLanguageFramework.slice(-1)/5)+(Database.slice(-1)/5)+(VersionControl.slice(-1)/5)
	  var output = document.getElementById("output");

output.value =
      "1. communication :"
      + communicaton.slice(-1)/5+ 
      " _\n 2. basic of web devlopment :" 
        +BasicOfWebDevelopement.slice(-1)/5+
       " _\n 3. oops :" 
       + Oops.slice(-1)/5+
      "_\n 4. Programming Langauge/framework:" 
         +ProgremmingLanguageFramework.slice(-1)/5+
         "_\n 5.Database : "
         +Database.slice(-1)/5+
         "_\n 6.VersionControl : "
         +VersionControl.slice(-1)/5+
         "\n--------------- \n"
         +"The result :"
         +add
         ;
      
     
     
      output.select();
      document.execCommand("copy");
	  /* Select text area by id*/
     // var Text = document.getElementById("communicaton");

      /* Select the text inside text area. */
     // Text.select();

      /* Copy selected text into clipboard */
     // navigator.clipboard.writeText(Text.value);

      /* Set the copied text as text for 
      div with id clipboard */
     // document.getElementById("clipboard")
       //   .innerHTML = Text.value;
	}
 
 function getSelectValue() {
	var	selectedValue = document.getElementById("exp").value;
     
	if(selectedValue==''){
		$("div.container").hide();
	}else{
		$("div.container").show();
	}
	
	}