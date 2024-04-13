class MyHashSet() {
    private val hashSet = mutableListOf<Int>()

    fun add(key: Int) {
        if (contains(key)) {
            return
        }
        hashSet.add(key)
    }

    fun remove(key: Int) {
        hashSet.remove(key)
    }

    fun contains(key: Int): Boolean {
        return hashSet.contains(key)
    }

}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
