const toggleBtn = document.querySelector('.navbar_toogleBtn');
const menu = document.querySelector('.navbar_menu');
const icons = document.querySelector('.navbar_icons');


// 함수 호출 요청.api가 잘 나와있어 제이쿼리 사용 안해도 됨
toogleBtn.addEventListener('click',()=>{
    menu.classList.toogleBtn('ative');
    icons.classList.toogleBtn('ative');
});