const insertBtn = document.querySelector("#insertBtn");
if (insertBtn != null) {
    insertBtn.addEventListener("click", () => {
        // JS BOM중 location

        //location.htrf = "주소"
        // 해당주소 요청 (GET 방식)

        location.href = `/board2/${location.pathname.split("/")[2]}/insert`;
        //   /board2/1/insert
    })
}
const boardSearch = document.querySelector("#boardSearch");
const searchKey = document.querySelector("#searchKey");
const searchQuery = document.querySelector("#searchQuery");

const option = document.querySelectorAll("searchQuery > option");


//검색창에 이전 검색 기록을 남겨놓기

(() => {
    const params = new URL(location.href).searchParams;

    const key = params.get("key");
    const query = params.get("query"); //검색어

    if (key != null) {
        searchQuery.value = query;
        // option태그를 하나씩 순차 접근해서 value가 key랑 같으면
        // select속성 추가
        for (let op of options) {
            if (op.value == key) {
                op.selected = true;
            }

        }
    }

})();

//검색어 입력 없이 제출된 경우
boardSearch.addEventListener("submit", e => {

    if(searchQuery.value.trim().length == 0){// 검색어 미입력 시 
        e.preventDefault(); // form 기본 이벤트 제거

        location.href = location.pathname; // 해당 게시판 1페이지로 이동

        // location.pathname :쿼리스트링을 제외한 실제 주소


    }

})