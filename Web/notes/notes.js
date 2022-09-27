
// ΜΕΤΑΒΛΗΤΕΣ ΕΦΑΡΜΟΓΗΣ
let btnPlus = document.querySelector(".footer button")
let firstLi = document.querySelector(".main li")
let text = document.querySelector(".footer input")
let btnx = document.querySelector(".main button")

// Onclick Event footer button
btnPlus.onclick = function() {

    let footerInput = document.querySelector(".footer input").value

    // Create elements
    let li = document.createElement('li')
    let div = document.createElement('div')
    let input = document.createElement('input')
    let label = document.createElement('label')
    let btn = document.createElement('button')

    // hierarchy position elements
    li.appendChild(div)
    li.appendChild(btn)
    div.appendChild(input)
    div.appendChild(label)

    // Styling elements
    div.className = "item"
    input.type= "checkbox"
    input.style.width = "30px"
    input.style.height = "30px"
    input.style.marginRight = "10px"
    btn.style.width = "35px"
    btn.style.height = "35px"
    btn.innerHTML = 'x'
    label.style.fontSize = "10px"
    label.innerHTML = footerInput

    // Event functions
    btn.onclick = function() {
        li.style.display = "none"
    }

    input.onchange = function() {
        if (input.checked === true){
            label.style.textDecoration = "line-through"
        } else {
            label.style.textDecoration = "none"
        }
        
    }

    // Position Elements
    firstLi.after(li)

}

// Onclick event main button
btnx.onclick = function() {
    document.querySelector("li").style.display = "none"
}

















