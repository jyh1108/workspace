//기본 함수
function clickCount(btn){
  //클릭할 때 마다 1씩 증가 
  // 단, 20을 초과하면 다시 0으로 초기화
  btn.innerText = Number(btn.innerText) +1;

  if(btn.innerText > 20){
    btn.innerText = 0;
  }
}

//익명 함수
const t2 = document.getElementById("target2");
const b2 = document.getElementById("btn2");

const colorList = ['rad', 'orange', 'yelloww',]
b2.addEventListener("click", function(){
  t2.style.color = 'red';
})

//즉시 실행 함수는 정의가 끝나면 바로 실행

//2)변수명 중복 문제 해결
const str = "전역변수";

(function(){
  const str = "지역변수";
  console.log(str);// 지역변수
})();

console.log(str)//전역변수


//2. 매개변수 1개
// 익명 함수 : funtion.



function printConsole(fn){
  //매개변수로 함수를 받아와 수행 결과를 콘솔에 출력
  console.log("--------------------------");
  console.log( fn(2) );
  console.log("--------------------------");
}


//화살표 함수 this 문제
const button6 = document.querySelector("#button6");

//클릭된 요소의 배경을 검정색으로 변경
button6.addEventListener("click", function(e){
  e.target.style.backgroundColor = "black";
});

button6.addEventListener('click', (e) => {
  e.target.style.color = "white";
});

//클릭된 요소의 폰트 크기를 25px로 증가(익명, e 사용 x)
button6.addEventListener("click",function(){
  // 이벤트 헨들러로 지정된 익명 함수의 this == 이벤트가 발생한 요소
  this.style.fontSize = "25px";
});

//클릭된 요소의 테두리를 3px 실선 pink로 변경 (화살표,e사용 x ,  this사용)
button6.addEventListener("click", () => {
  // 이벤트 헨들러로 지정된 익명 함수의 this == 이벤트가 발생한 요소
  console.log(this);
  //화살표 함수에 this를 작성하면
  // 이벤트가 발생한 요소가 아닌
  // 창 자체를 나타내는 window 객체가 반환된다.
  this.style.border = "3px solid pink";
});