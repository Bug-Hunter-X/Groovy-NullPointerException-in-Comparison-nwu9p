def myMethod(a, b) {
  if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 3) // prints 5
println myMethod(2, 7) // prints 7

//Unexpected behavior
println myMethod(null, 3) // throws NullPointerException