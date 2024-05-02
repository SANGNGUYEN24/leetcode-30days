class Solution {
    fun accountBalanceAfterPurchase(purchaseAmount: Int): Int {
        val roundedAmount = ((purchaseAmount + 5) / 10) * 10
        return 100 - roundedAmount
    }
}