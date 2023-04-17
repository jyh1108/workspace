const container = document.getElementById("container");
const createBtn = document.getElementById("createBtn");

createBtn.addEventListener("click", () => {

    const arr = []; // 빈배열 
    
    while(arr.length < 6){ //arr에 저장된 값이 6개 미만인 경우 반복
        const random = Math.floor(Math.random()* 45 + 1);

        // arr 요소중 중복되는 값제거
        // == arr 요소 중 중복되는 값이 있으면 push를 안하곘다
        // == arr 요소 중 중복되는 값이 없으면 push를 하곘다

        //배열명.indexOF(값) : 값이 일치하는 요소의 index 반환
                                // 없으면 -1 반환
        if(arr.indexOf(random) == -1) arr.push(random); //배열 마지막 요소로 추가 

        arr.sort((a,b) => a-b); //a-b 뺴서 값이 정수면 자리바꾸기 음수면 그대로


    }
    for(let i=0; i<arr.length; i++){
        container.children[i].innerText =arr[i];
    }
})