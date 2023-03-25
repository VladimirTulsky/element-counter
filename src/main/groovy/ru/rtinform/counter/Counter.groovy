package ru.rtinform.counter

static def transform(array) {
    Map result = new HashMap<>()
    Arrays.stream(array)
            .forEach { element -> result.put(element, result.getOrDefault(element, 0) + 1) }
    return result
}