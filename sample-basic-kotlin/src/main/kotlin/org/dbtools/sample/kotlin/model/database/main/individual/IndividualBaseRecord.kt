/*
 * IndividualBaseRecord.kt
 *
 * GENERATED FILE - DO NOT EDIT
 * CHECKSTYLE:OFF
 * 
 */



package org.dbtools.sample.kotlin.model.database.main.individual

import org.dbtools.android.domain.AndroidBaseRecord
import org.dbtools.android.domain.database.statement.StatementWrapper
import org.dbtools.sample.kotlin.model.database.main.individualtype.IndividualType
import org.dbtools.android.domain.database.contentvalues.DBToolsContentValues
import android.database.Cursor


@Suppress("LeakingThis", "unused", "RemoveEmptySecondaryConstructorBody")
@SuppressWarnings("all")
abstract class IndividualBaseRecord : AndroidBaseRecord {

     open var id: Long = 0
     open var individualType: IndividualType = IndividualType.HEAD
     open var firstName: String = ""
     open var lastName: String = ""
     open var sampleDateTime: java.util.Date? = java.util.Date()
     open var birthDate: java.util.Date? = java.util.Date()
     open var lastModified: java.util.Date? = java.util.Date()
     open var number: Int? = 0
     open var phone: String? = ""
     open var email: String? = ""
     open var data: ByteArray? = null
     open var amount1: Float? = 0.0f
     open var amount2: Double? = 0.0
     open var enabled: Boolean? = false
     open var spouseIndividualId: Long? = 0

    constructor(record: Individual) {
        this.individualType = record.individualType
        this.firstName = record.firstName
        this.lastName = record.lastName
        this.sampleDateTime = record.sampleDateTime
        this.birthDate = record.birthDate
        this.lastModified = record.lastModified
        this.number = record.number
        this.phone = record.phone
        this.email = record.email
        this.data = record.data
        this.amount1 = record.amount1
        this.amount2 = record.amount2
        this.enabled = record.enabled
        this.spouseIndividualId = record.spouseIndividualId
    }

    constructor() {
    }

    override fun getIdColumnName() : String {
        return IndividualConst.C_ID
    }

    override fun getPrimaryKeyId() : Long {
        return id
    }

    override fun setPrimaryKeyId(id: Long) {
        this.id = id
    }

    override fun getAllColumns() : Array<String> {
        return IndividualConst.ALL_COLUMNS.clone()
    }

    fun getAllColumnsFull() : Array<String> {
        return IndividualConst.ALL_COLUMNS_FULL.clone()
    }

    override fun getContentValues(values: DBToolsContentValues<*>) {
        values.put(IndividualConst.C_INDIVIDUAL_TYPE, individualType.ordinal.toLong())
        values.put(IndividualConst.C_FIRST_NAME, firstName)
        values.put(IndividualConst.C_LAST_NAME, lastName)
        values.put(IndividualConst.C_SAMPLE_DATE_TIME, org.dbtools.android.domain.date.DBToolsDateFormatter.dateToDBString(sampleDateTime))
        values.put(IndividualConst.C_BIRTH_DATE, org.dbtools.android.domain.date.DBToolsDateFormatter.dateToDBString(birthDate))
        values.put(IndividualConst.C_LAST_MODIFIED, org.dbtools.android.domain.date.DBToolsDateFormatter.dateToLong(lastModified))
        values.put(IndividualConst.C_NUMBER, number?.toLong())
        values.put(IndividualConst.C_PHONE, phone)
        values.put(IndividualConst.C_EMAIL, email)
        values.put(IndividualConst.C_DATA, data)
        values.put(IndividualConst.C_AMOUNT1, amount1?.toDouble())
        values.put(IndividualConst.C_AMOUNT2, amount2)
        values.put(IndividualConst.C_ENABLED, if (enabled ?: false) 1L else 0L)
        values.put(IndividualConst.C_SPOUSE_INDIVIDUAL_ID, spouseIndividualId)
    }

    override fun getValues() : Array<Any?> {
        return arrayOf(
            id,
            individualType.ordinal.toLong(),
            firstName,
            lastName,
            org.dbtools.android.domain.date.DBToolsDateFormatter.dateToDBString(sampleDateTime),
            org.dbtools.android.domain.date.DBToolsDateFormatter.dateToDBString(birthDate),
            org.dbtools.android.domain.date.DBToolsDateFormatter.dateToLong(lastModified),
            number?.toLong(),
            phone,
            email,
            data,
            amount1?.toDouble(),
            amount2,
            if (enabled ?: false) 1L else 0L,
            spouseIndividualId)
    }

    open fun copy() : Individual {
        val copy = Individual()
        copy.id = id
        copy.individualType = individualType
        copy.firstName = firstName
        copy.lastName = lastName
        copy.sampleDateTime = if (sampleDateTime != null) java.util.Date((sampleDateTime as java.util.Date).getTime()) else null 
        copy.birthDate = if (birthDate != null) java.util.Date((birthDate as java.util.Date).getTime()) else null 
        copy.lastModified = if (lastModified != null) java.util.Date((lastModified as java.util.Date).getTime()) else null 
        copy.number = number
        copy.phone = phone
        copy.email = email
        copy.data = data
        copy.amount1 = amount1
        copy.amount2 = amount2
        copy.enabled = enabled
        copy.spouseIndividualId = spouseIndividualId
        return copy
    }

    override fun bindInsertStatement(statement: StatementWrapper) {
        statement.bindLong(1, individualType.ordinal.toLong())
        statement.bindString(2, firstName)
        statement.bindString(3, lastName)
        if (sampleDateTime != null) {
            statement.bindString(4, org.dbtools.android.domain.date.DBToolsDateFormatter.dateToDBString(sampleDateTime)!!)
        } else {
            statement.bindNull(4)
        }
        if (birthDate != null) {
            statement.bindString(5, org.dbtools.android.domain.date.DBToolsDateFormatter.dateToDBString(birthDate)!!)
        } else {
            statement.bindNull(5)
        }
        if (lastModified != null) {
            statement.bindLong(6, org.dbtools.android.domain.date.DBToolsDateFormatter.dateToLong(lastModified)!!)
        } else {
            statement.bindNull(6)
        }
        if (number != null) {
            statement.bindLong(7, number?.toLong()!!)
        } else {
            statement.bindNull(7)
        }
        if (phone != null) {
            statement.bindString(8, phone!!)
        } else {
            statement.bindNull(8)
        }
        if (email != null) {
            statement.bindString(9, email!!)
        } else {
            statement.bindNull(9)
        }
        if (data != null) {
            statement.bindBlob(10, data!!)
        } else {
            statement.bindNull(10)
        }
        if (amount1 != null) {
            statement.bindDouble(11, amount1?.toDouble()!!)
        } else {
            statement.bindNull(11)
        }
        if (amount2 != null) {
            statement.bindDouble(12, amount2!!)
        } else {
            statement.bindNull(12)
        }
        if (enabled != null) {
            statement.bindLong(13, if (enabled ?: false) 1L else 0L!!)
        } else {
            statement.bindNull(13)
        }
        if (spouseIndividualId != null) {
            statement.bindLong(14, spouseIndividualId!!)
        } else {
            statement.bindNull(14)
        }
    }

    override fun bindUpdateStatement(statement: StatementWrapper) {
        statement.bindLong(1, individualType.ordinal.toLong())
        statement.bindString(2, firstName)
        statement.bindString(3, lastName)
        if (sampleDateTime != null) {
            statement.bindString(4, org.dbtools.android.domain.date.DBToolsDateFormatter.dateToDBString(sampleDateTime)!!)
        } else {
            statement.bindNull(4)
        }
        if (birthDate != null) {
            statement.bindString(5, org.dbtools.android.domain.date.DBToolsDateFormatter.dateToDBString(birthDate)!!)
        } else {
            statement.bindNull(5)
        }
        if (lastModified != null) {
            statement.bindLong(6, org.dbtools.android.domain.date.DBToolsDateFormatter.dateToLong(lastModified)!!)
        } else {
            statement.bindNull(6)
        }
        if (number != null) {
            statement.bindLong(7, number?.toLong()!!)
        } else {
            statement.bindNull(7)
        }
        if (phone != null) {
            statement.bindString(8, phone!!)
        } else {
            statement.bindNull(8)
        }
        if (email != null) {
            statement.bindString(9, email!!)
        } else {
            statement.bindNull(9)
        }
        if (data != null) {
            statement.bindBlob(10, data!!)
        } else {
            statement.bindNull(10)
        }
        if (amount1 != null) {
            statement.bindDouble(11, amount1?.toDouble()!!)
        } else {
            statement.bindNull(11)
        }
        if (amount2 != null) {
            statement.bindDouble(12, amount2!!)
        } else {
            statement.bindNull(12)
        }
        if (enabled != null) {
            statement.bindLong(13, if (enabled ?: false) 1L else 0L!!)
        } else {
            statement.bindNull(13)
        }
        if (spouseIndividualId != null) {
            statement.bindLong(14, spouseIndividualId!!)
        } else {
            statement.bindNull(14)
        }
        statement.bindLong(15, id)
    }

    override fun setContent(values: DBToolsContentValues<*>) {
        individualType = IndividualType.values()[values.getAsInteger(IndividualConst.C_INDIVIDUAL_TYPE)]
        firstName = values.getAsString(IndividualConst.C_FIRST_NAME)
        lastName = values.getAsString(IndividualConst.C_LAST_NAME)
        sampleDateTime = org.dbtools.android.domain.date.DBToolsDateFormatter.dbStringToDate(values.getAsString(IndividualConst.C_SAMPLE_DATE_TIME))
        birthDate = org.dbtools.android.domain.date.DBToolsDateFormatter.dbStringToDate(values.getAsString(IndividualConst.C_BIRTH_DATE))
        lastModified = java.util.Date(values.getAsLong(IndividualConst.C_LAST_MODIFIED))
        number = values.getAsInteger(IndividualConst.C_NUMBER)
        phone = values.getAsString(IndividualConst.C_PHONE)
        email = values.getAsString(IndividualConst.C_EMAIL)
        data = values.getAsByteArray(IndividualConst.C_DATA)
        amount1 = values.getAsFloat(IndividualConst.C_AMOUNT1)
        amount2 = values.getAsDouble(IndividualConst.C_AMOUNT2)
        enabled = values.getAsBoolean(IndividualConst.C_ENABLED)
        spouseIndividualId = values.getAsLong(IndividualConst.C_SPOUSE_INDIVIDUAL_ID)
    }

    override fun setContent(cursor: Cursor) {
        id = cursor.getLong(cursor.getColumnIndexOrThrow(IndividualConst.C_ID))
        individualType = IndividualType.values()[cursor.getInt(cursor.getColumnIndexOrThrow(IndividualConst.C_INDIVIDUAL_TYPE))]
        firstName = cursor.getString(cursor.getColumnIndexOrThrow(IndividualConst.C_FIRST_NAME))
        lastName = cursor.getString(cursor.getColumnIndexOrThrow(IndividualConst.C_LAST_NAME))
        sampleDateTime = org.dbtools.android.domain.date.DBToolsDateFormatter.dbStringToDate(cursor.getString(cursor.getColumnIndexOrThrow(IndividualConst.C_SAMPLE_DATE_TIME)))
        birthDate = org.dbtools.android.domain.date.DBToolsDateFormatter.dbStringToDate(cursor.getString(cursor.getColumnIndexOrThrow(IndividualConst.C_BIRTH_DATE)))
        lastModified = if (!cursor.isNull(cursor.getColumnIndexOrThrow(IndividualConst.C_LAST_MODIFIED))) java.util.Date(cursor.getLong(cursor.getColumnIndexOrThrow(IndividualConst.C_LAST_MODIFIED))) else null
        number = if (!cursor.isNull(cursor.getColumnIndexOrThrow(IndividualConst.C_NUMBER))) cursor.getInt(cursor.getColumnIndexOrThrow(IndividualConst.C_NUMBER)) else null
        phone = if (!cursor.isNull(cursor.getColumnIndexOrThrow(IndividualConst.C_PHONE))) cursor.getString(cursor.getColumnIndexOrThrow(IndividualConst.C_PHONE)) else null
        email = if (!cursor.isNull(cursor.getColumnIndexOrThrow(IndividualConst.C_EMAIL))) cursor.getString(cursor.getColumnIndexOrThrow(IndividualConst.C_EMAIL)) else null
        data = cursor.getBlob(cursor.getColumnIndexOrThrow(IndividualConst.C_DATA))
        amount1 = if (!cursor.isNull(cursor.getColumnIndexOrThrow(IndividualConst.C_AMOUNT1))) cursor.getFloat(cursor.getColumnIndexOrThrow(IndividualConst.C_AMOUNT1)) else null
        amount2 = if (!cursor.isNull(cursor.getColumnIndexOrThrow(IndividualConst.C_AMOUNT2))) cursor.getDouble(cursor.getColumnIndexOrThrow(IndividualConst.C_AMOUNT2)) else null
        enabled = if (!cursor.isNull(cursor.getColumnIndexOrThrow(IndividualConst.C_ENABLED))) (if (cursor.getInt(cursor.getColumnIndexOrThrow(IndividualConst.C_ENABLED)) != 0) true else false) else null
        spouseIndividualId = if (!cursor.isNull(cursor.getColumnIndexOrThrow(IndividualConst.C_SPOUSE_INDIVIDUAL_ID))) cursor.getLong(cursor.getColumnIndexOrThrow(IndividualConst.C_SPOUSE_INDIVIDUAL_ID)) else null
    }

    override fun isNewRecord() : Boolean {
        return primaryKeyId <= 0
    }


}