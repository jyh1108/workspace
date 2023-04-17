document.getElementById("content").addEventListener("keyup", ()=>{
    const span = document.getElementById("count");
    span.innerText=content.value.length;

    if(content.value.length>100){
        count.classList.add("error");
    }else{
        count.classList.remove("error");
    }

    // 요소.classList.toggle('클래스명')
    // -요소에 클래스가 있으면 추가 (true 반환)
    // -요소에 클래스가 있으면 제거 (false 반환)
})