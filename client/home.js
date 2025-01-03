let imgSlider = document.querySelectorAll('.slider-container .slider-box');
let btnNext = document.querySelector('#next');
let btnPrevious = document.querySelector('#previous');
let btnNav = document.querySelectorAll('.btn-nav-box .btn-nav');
let imgCounter = imgSlider.length;
let imgActive = 0;
/*Active Slider function*/
function showSlider() {
    let oldImg = document.querySelector('.slider-container .slider-box.active');
    let oldBtnNav = document.querySelector('.btn-nav-box .btn-nav.active');
    oldImg.classList.remove('active');
    oldBtnNav.classList.remove('active');
    imgSlider[imgActive].classList.add('active');
    btnNav[imgActive].classList.add('active');
}
/*Next slider function*/
function nextSlide() {
    imgActive++;
    if (imgActive >= imgCounter) {
        imgActive = 0;
    }
    showSlider();
}
/*Previous slider function*/
function previousSlide() {
    imgActive--;
    if (imgActive < 0) {
        imgActive = imgCounter - 1;
    }
    showSlider();
}
btnNext.addEventListener('click', nextSlide);
btnPrevious.addEventListener('click', previousSlide);
btnNav.forEach((btn, index) => {
    btn.addEventListener('click', () => {
        imgActive = index;
        showSlider();
    })
})
/*Next slider auto*/
let autoSlide = setInterval(nextSlide, 10000);



























