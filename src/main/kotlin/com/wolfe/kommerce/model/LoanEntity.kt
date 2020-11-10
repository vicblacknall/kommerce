package com.wolfe.kommerce.model

import java.time.LocalDate
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "loan")
data class LoanEntity(@Id
                      var id: Long,
                      var approvalDate: LocalDate?,
                      var approvalFiscalYear: Int?,
                      var asOfDate: LocalDate?,
                      var bankCity: String?,
                      var bankName: String?,
                      var bankState: String?,
                      var bankStreet: String?,
                      var bankZip: String?,
                      var borrCity: String?,
                      var borrName: String?,
                      var borrState: String?,
                      var borrStreet: String?,
                      var borrZip: String?,
                      var businessType: String?,
                      var chargeOffDate: LocalDate?,
                      var congressionalDistrict: Int?,
                      var deliveryMethod: String?,
                      var firstDisbursementDate: LocalDate?,
                      var franchiseCode: String?,
                      var franchiseName: String?,
                      var grossApproval: Long?,
                      var grossChargeOffAmount: Long?,
                      var initialinterestrate: Double?,
                      var jobsSupported: Int?,
                      var loanStatus: String?,
                      var naicsCode: String?,
                      var naicsDescription: String?,
                      var paidInFullDate: LocalDate?,
                      var program: String?,
                      var projectCounty: String?,
                      var projectState: String?,
                      var revolverStatus: String?,
                      var sbaDistrictOffice: String?,
                      var sbaguaranteedapproval: Long?,
                      var terminMonths: Int?,
                      var subpgmdesc: String?)

