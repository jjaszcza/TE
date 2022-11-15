function add(p1 = 0, p2 = 0) {
    return p1 + p2;
}

function countEven() {
    const args = Array.from(arguments);
    let count = 0;
    for (const a of args) {
        if (a % 2 === 0) {
            count++;

        }
    }
    return count;
}

console.log(add());
console.log(add(5));
console.log(add("a", "B"));

console.log(countEven(1, 2, 3, 4, 6, 8));