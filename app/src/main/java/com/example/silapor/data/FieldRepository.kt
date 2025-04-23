package com.example.silapor.data

import com.example.silapor.model.DummyFieldData
import com.example.silapor.model.Field

class FieldRepository private constructor() {
    fun getFieldByCityAndSport(cityId: Int, sportType: String): List<Field> {
        return DummyFieldData.fields.filter { it.cityId == cityId && it.sportType == sportType}
    }

    companion object {
        @Volatile
        private var instance: FieldRepository? = null

        fun getInstance(): FieldRepository =
            instance ?: synchronized(this) {
                instance ?: FieldRepository().also { instance = it }
            }
    }
}