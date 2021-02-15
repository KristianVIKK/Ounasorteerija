let apples = [ 29, 70, 85, 77, 55, 44, 33, 98, 90, 47, 22, 44, 55, 37, 65];

let small = [];
let medium = [];
let big = [];

function lisaKasti(apples) {
    for (let i=0; i < apples.length; i++) {
        apple = apples[i];
        if (apple <= 50) {
            small.push(apple);
        } else if (apple >= 71) {
            big.push(apple);
        } else {
            medium.push(apple);
        }
}
}

//Hiljem konsoolis väljakutsudes näitab numbreid väiksemast suuremani
lisaKasti(apples.sort());

console.log('Small apples: ', small);
console.log('Medium apples: ', medium);
console.log('Big apples: ', big);