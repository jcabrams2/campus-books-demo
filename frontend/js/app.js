import {
    createHeader
} from "/js/Header.js"

import {
    createFooter
} from "/js/Footer.js"
import {
    allCampusJson
} from "/js/sampleAllCampus.js"

import {
    displayHomeView
} from "/js/displayHomeView.js"

document.querySelector(".container").append(createHeader());
document.querySelector(".container").append(displayHomeView(allCampusJson))
document.querySelector(".container").append(createFooter());
