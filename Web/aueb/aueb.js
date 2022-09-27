window.onload = function() {

    const slider = document.querySelector('.slide')
    const toggleBtn = document.querySelector('.nav-toggle')
    const menuToggle = document.querySelector('.menu-toggle')
    const main = document.querySelector('.main')
    const signup = document.querySelector('.signup')
    const footer = document.querySelector('.footer')

    toggleBtn.addEventListener('click', function() {
        slider.classList.toggle('hidden')
        menuToggle.classList.toggle('show')
        main.classList.toggle('hidden')
        signup.classList.toggle('hidden')
        footer.classList.toggle('hidden')

    })
    
}