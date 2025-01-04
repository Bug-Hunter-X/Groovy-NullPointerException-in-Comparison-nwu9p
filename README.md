# Groovy NullPointerException in Comparison

This example demonstrates a common issue in Groovy where implicit null handling can lead to unexpected `NullPointerExceptions`. The `myMethod` function intends to return the larger of two numbers but throws an exception if either `a` or `b` is null.

## Problem
The naive comparison `a > b` will throw a `NullPointerException` if `a` is null because Groovy doesn't automatically handle nulls in comparisons like some other languages. 

## Solution
Explicitly check for null values before the comparison to prevent the exception.