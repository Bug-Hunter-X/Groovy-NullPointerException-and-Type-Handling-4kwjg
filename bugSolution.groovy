```groovy
def myMethod(param) {
  if (param == null) {
    println "Parameter is null. Using default value."
    param = [] // Or provide a suitable default value
  }
  if (!(param instanceof List)){
    println "Wrong parameter type. Using default value."
    param = [] // Or handle the unexpected type appropriately
  }
  // ...rest of your method using the list param
  param.each { println it }
}

myMethod(null)
myMethod([:])
myMethod(10)
```