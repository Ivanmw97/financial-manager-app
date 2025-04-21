package com.ivandev.financialmanagerapp.shared.data.local.transaction

import androidx.room.TypeConverter
import com.ivandev.financialmanagerapp.shared.data.model.TransactionType
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class Converters {

    @TypeConverter
    fun fromUUID(uuid: UUID): String = uuid.toString()

    @TypeConverter
    fun toUUID(uuid: String): UUID = UUID.fromString(uuid)

    @TypeConverter
    fun fromTransactionType(type: TransactionType): String = type.name

    @TypeConverter
    fun toTransactionType(type: String): TransactionType = TransactionType.valueOf(type)

    @TypeConverter
    fun fromLocalDateTime(dateTime: LocalDateTime): String =
        dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)

    @TypeConverter
    fun toLocalDateTime(dateTime: String): LocalDateTime =
        LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME)
}
