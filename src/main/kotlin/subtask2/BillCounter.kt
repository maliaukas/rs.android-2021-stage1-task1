package subtask2

class BillCounter {
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        // val delta = b - bill.filterIndexed { index, _ -> index != k }.sum() / 2
        // or

        var sumExceptIndexK = 0
        for (i in bill.indices) {
            if (i != k)
                sumExceptIndexK += bill[i]
        }

        val anotherDelta = b - sumExceptIndexK / 2

        return if (anotherDelta == 0)
            "bon appetit"
        else
            anotherDelta.toString()
    }
}
