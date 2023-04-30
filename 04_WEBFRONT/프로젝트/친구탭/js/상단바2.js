// 검색어 누적창 구현

// 검색 input 태그
const search = document.getElementById("query");
// 자동완성 목록
const suggestion_pannel = document.querySelector(".suggestions_pannel");
// 검색 버튼
const searchBtn = document.getElementById("searchBtn");

// 자동완성 데이터 초기 설정
let s_arr = new Array();
let s_arr1 = new Array();
let s_arr2 = new Array();

s_arr1.name = "테스트";
s_arr1.count = 1;

s_arr2.push(s_arr1);

s_arr2.name = "테스트2";
s_arr2.count = 1;

s_arr.push(s_arr2);
s_arr.push(s_arr1);


// input 태그 이벤트
search.addEventListener('keyup', () => {

    if(window.event.keyCode == 13){ // 13 == enter key 

        window.event.preventDefault();
        searchBtn.click();
    }
    suggestion_pannel.innerHTML = '';


    let input_value = search.value;

    let suggestions = s_arr.filter( function(exam) {
        return exam.name.toLowerCase().startsWith(input_value);
    }); 

    suggestions.forEach(function(suggested){
        let div = document.createElement("div");
        div.innerHTML = suggested.name;
        suggestion_pannel.appendChild(div);

        div.onclick= () => {
            search.value = div.innerHTML;
            suggestion_pannel.innerHTML='';
        }
    }); 
    if(input_value == ''){
        suggestion_pannel.innerHTML='';
    }

});


// 검색어 입력 시 
searchBtn.addEventListener('click', () => {
    // 현재 입력된 검색어
    let input_value = search.value.trim();

    if(input_value.length == 0){
        alert("검색어를 입력해주세요.");
    } else {
        // 현재까지 검색한 것 중 일치하는게 있는지 확인
        for (i=0; i<s_arr.length; i++){
            if(s_arr[i].name == input_value){
                s_arr[i].count += 1;
                break;
            }
        if(i == s_arr.length -1){
            let s_suggest = new Object();
            s_suggest.name = input_value;
            s_suggest.count = 1;
            s_arr.push(s_suggest);
            }

        }

    }
    search.value = "";
    suggestion_pannel.innerHTML = "";

})



// 드롭다운 아이콘 구현

var dropdowns = document.getElementById("bellDropdown");

function bell(){
    document.getElementById("bellDropdown").classList.toggle("show");
}

window.onclick = function(e){
    if (e.target.matches('.dropBtn1')) {
        var dropdowns = document.getElementById("bellDropdown");
        var i;
        for (i = 0; i < dropdowns.length; i++) {
            var openDropdown = dropdowns[i];
            if (openDropdown.classList.contains('show')) {
                openDropdown.classList.remove('show');
            }
        }
    }
}

function my(){
    document.getElementById("myDropdown").classList.toggle("show");
}

window.onclick = function(e){
    if (!e.target.matches('.dropBtn2')) {
        var dropdowns = document.getElementById("myDropdown");
        var i;
        for (i = 0; i < dropdowns.length; i++) {
            var openDropdown = dropdowns[i];
            if (openDropdown.classList.contains('show')) {
                openDropdown.classList.remove('show');
            }
        }
    }
}

