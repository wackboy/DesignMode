package singletonMode

import kotlin.concurrent.Volatile

class DCLModeKt {

    @Volatile
    private var instance: DCLModeKt? = null

    private fun DCLModeKt() {}

    fun getInstance(): DCLModeKt? {
        if (instance == null) {
            synchronized(DCLModeKt::class.java) {
                if (instance == null) {
                    instance = singletonMode.DCLModeKt()
                }
            }
        }
        return instance
    }


}