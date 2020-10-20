package programmer.zaman.now.kotlin.restful.model

import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class CreateProductRequest(

        @NotBlank
        val id: String?,

        @NotBlank
        val name: String?,

        @NotNull
        @Min(value = 1)
        val price: Long?,

        @NotNull
        @Min(value = 0)
        val quantity: Int?

)