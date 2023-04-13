// window.setTimeout(함수, 지연시간(ms));
document.getElementById("testBtn").addEventListener("click", () => {
  console.log("0초");

  window.setTimeout(()=>{
    console.log("1초")
  },1000);


window.setTimeout(()=>{
  console.log("2초")
},2000);

// setTimeout() 같은 시간 관련 함수들은
// 여러 번 작성된 경우 앞에 코드가 실핼되길 기다리지 않음.
// -> 비동기로 시작
});

//window.setInterval(함수, 지연시간(ms));
const loadingTime = document.getElementById("loadingTime");
window.setInterval(()=>{
  loadingTime.innerText = Number(loadingTime.innerText)+1;

}, 1000);

//시계만들기
const clock = document.getElementById("clock");


//현재 시간을 #clock에 출력
function currentTime(){
  const now = new Date(); //햔재시간을 저장한 date 객체 생성

  // 시/분/초 저장
  let hour = now.getHours();
  let min = now.getMinutes();
  let sec = now.getSeconds();

  //12: 23 : 20 
  // let str = hour + ":" + min + ":" + sec;


  //10미만 두자리가 아닐경우 0추가 
  if(hour <10) hour = "0" + hour;
  if(min <10) min = "0" + min;
  if(sec <10) sec = "0" + sec;
  //백틱(`)을 이용한 문자열 조합
  let str = `${hour} : ${min} : ${sec}`;

  clock.innerText = str;
}
currentTime();
//setIntervar을 이용해여 currentTime 함수를 1초마다 수행
let time = setInterval(currentTime, 1000);

//window.clearInterval(setIntervar이 저장된 변수)
document.getElementById("stop").addEventListener("click", () =>{
clearInterval(time);
});