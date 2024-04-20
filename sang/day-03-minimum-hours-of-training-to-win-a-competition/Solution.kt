class Solution {
    fun minNumberOfHours(initialEnergy: Int, initialExperience: Int, energy: IntArray, experience: IntArray): Int {
        /*
        5 > 1,  3 > 2   -> 4, 5
        4 !> 4, 5!> 6   -> 5, 7 (1h + 2h)
        5 > 4,  7 > 6   -> 1, 13
        1 !> 3, 13 > 3  -> 4, 13 (3h)
        4 > 3,  13 > 3  -> 1, 16
        1 !> 2, 16 > 1  -> 3, 16 (2h)
        3 > 2,  16 > 1  -> 1, 17
        */

        var result = 0
        val size = energy.size
        var currentEnergy = initialEnergy
        var currentExp = initialExperience

        println("energy: $currentEnergy, exp: $currentExp")
        for (i in 0 until size) {
            // If win
            if (currentEnergy > energy[i] && currentExp > experience[i]) {
                currentEnergy -= energy[i]
                currentExp += experience[i]
                println("Win: energy: $currentEnergy, exp: $currentExp")
                continue
            }

            // If lose -> need training
            if (currentEnergy <= energy[i]) {
                // + 1 to make the energy > the oponent's energy
                val trainingHour = (energy[i] - currentEnergy + 1)
                println("energy: $currentEnergy <= ${energy[i]} -> train $trainingHour hours")
                currentEnergy += trainingHour
                result += trainingHour
            }
            if (currentExp <= experience[i]) {
                val trainingHour = (experience[i] - currentExp + 1)
                println("exp: $currentExp < ${experience[i]} -> train $trainingHour hours")
                currentExp += trainingHour
                result += trainingHour
            }
            currentEnergy -= energy[i]
            currentExp += experience[i]
            println("energy: $currentEnergy, exp: $currentExp")
        }
        return result
    }
}