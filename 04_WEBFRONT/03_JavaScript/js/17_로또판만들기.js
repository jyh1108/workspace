const lottoBoard = document.getElementById("lottoBoard");
const createBtn = document.getElementById("createBtn");
createBtn.addEventListener("click", () => {
    lottoBoard.innerHTML = ""; //무한생성 방지

    for (let i = 1; i <= 45; i++) {
        const arr = document.createElement("div");
        arr.classList.add("number");
        arr.innerText = i;

        //innerDiv가 클릭 되었을 때 배경색 변경/제거
        // + 6개넘으면 클릭 불가
        arr.addEventListener("click", e => {
            if (e.target.classList.contains("active")) {
                e.target.classList.remove("active");
            } else {
                
                //active 클래스를 가진 요소가 6게 이상인 경우
                if(document.getElementsByClassName("active").length>=6){
                    alert("6개 까지만 선택할 수 있습니다.")
                    return;
                }
                // active 클래스가 없으면 추가
                e.target.classList.add("active");

            }
        });

        lottoBoard.append(arr);
    }
})