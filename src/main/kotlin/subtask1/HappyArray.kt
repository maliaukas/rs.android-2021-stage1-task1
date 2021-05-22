package subtask1

class HappyArray {
    fun convertToHappy(sadArray: IntArray): IntArray {
        var sadArrayCopy = sadArray
        while (true) {
            val sadIndices = getSadIndices(sadArrayCopy)
            if (sadIndices.isEmpty())
                return sadArrayCopy

            sadArrayCopy = sadArrayCopy.filterIndexed { index, _ ->
                !sadIndices.contains(index)
            }.toIntArray()
        }
    }

    private fun getSadIndices(array: IntArray): IntArray {
        return array.mapIndexed { index, element ->
            if (index > 0 && index < array.size - 1) {
                if (element > array[index - 1] + array[index + 1]) {
                    return@mapIndexed index
                } else {
                    return@mapIndexed -1
                }
            } else {
                return@mapIndexed -1
            }
        }.filter { it != -1 }.toIntArray()
    }
}
