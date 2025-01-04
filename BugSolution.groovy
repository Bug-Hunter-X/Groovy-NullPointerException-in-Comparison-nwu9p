def myMethod(a, b) {
  if (a == null || b == null) {
    return null // Or handle nulls appropriately based on your logic
  } else if (a > b) {
    return a
  } else {
    return b
  }
}

println myMethod(5, 3) // prints 5
println myMethod(2, 7) // prints 7
println myMethod(null, 3) // prints null
println myMethod(5, null) // prints null