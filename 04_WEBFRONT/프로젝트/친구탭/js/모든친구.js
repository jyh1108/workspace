const frtopdiv = document.getElementsByClassName("frtopdiv")[0];
const pulsnav = document.getElementsByClassName("pulsnav")[0];

frtopdiv.onmouseover = function (){
  pulsnav.style.backgroundColor ="#EBEDF0";
}
frtopdiv.onmouseout = function(){
  pulsnav.style.backgroundColor ="#ffffff";
}