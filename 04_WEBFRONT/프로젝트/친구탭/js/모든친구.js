const frtopdiv = document.getElementsByClassName("frtopdiv")[0];
const pulsnav = document.getElementsByClassName("pulsnav")[0];
const frmenu = document.getElementById("frmenu");

frtopdiv.onmouseover = function (){
  pulsnav.style.backgroundColor ="#EBEDF0";
}
frtopdiv.onmouseout = function(){
  pulsnav.style.backgroundColor ="#ffffff";
}

pulsnav.addEventListener("click",()=>{
  frmenu.style.display= "block";

  // if(frmenu.style.display= "block"){
  //   frmenu.style.display= "none";
  // }
})